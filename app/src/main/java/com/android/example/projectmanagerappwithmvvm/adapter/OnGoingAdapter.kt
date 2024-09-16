package com.android.example.projectmanagerappwithmvvm.adapter

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.android.example.projectmanagerappwithmvvm.R
import com.android.example.projectmanagerappwithmvvm.domain.OnGoingDomain
import com.bumptech.glide.Glide

class OnGoingAdapter(private val items: List<OnGoingDomain>) :
    RecyclerView.Adapter<OnGoingAdapter.OnGoingViewHolder>() {
    class OnGoingViewHolder(itemView: View) : ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.rowTxtTitle)
        val date: TextView = itemView.findViewById(R.id.rowTxtDate)
        val progressBarPercent: TextView = itemView.findViewById(R.id.rowTxtPercent)
        val progressTxt: TextView = itemView.findViewById(R.id.rowTxtProgress)
        val progressBar: ProgressBar = itemView.findViewById(R.id.rowProgressBar)
        val pic: ImageView = itemView.findViewById(R.id.rowImage)
        val layout: ConstraintLayout = itemView.findViewById(R.id.rowLayout)

        fun bindData(item: OnGoingDomain) {
            title.text = item.title
            date.text = item.date
            progressBarPercent.text = "${item.progressPercent}%"

            val drawableResourceId = itemView.context.resources.getIdentifier(
                item.picPath, "drawable", itemView.context.packageName
            )

            Glide.with(itemView.context).load(drawableResourceId).into(pic)

            progressBar.progress = item.progressPercent

            layout.setOnClickListener {
                Toast.makeText(itemView.context, "deneme", Toast.LENGTH_SHORT).show()
            }

        }

        fun setTextColor(colorRes: Int) {
            title.setTextColor(itemView.context.getColor(colorRes))
            date.setTextColor(itemView.context.getColor(colorRes))
            progressTxt.setTextColor(itemView.context.getColor(colorRes))
            progressBarPercent.setTextColor(itemView.context.getColor(colorRes))
            pic.setColorFilter(
                ContextCompat.getColor(itemView.context, colorRes),
                PorterDuff.Mode.SRC_IN
            )
            progressBar.progressTintList =
                ColorStateList.valueOf(ContextCompat.getColor(itemView.context, colorRes))
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnGoingViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing, parent, false)
        return OnGoingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: OnGoingViewHolder, position: Int) {
        holder.bindData(items[position])

        with(holder) {
            if (position == 0) {
                layout.setBackgroundResource(R.drawable.background_dark)
                setTextColor(R.color.white)
            } else {
                layout.setBackgroundResource(R.drawable.background_light_purple)
                setTextColor(R.color.dark_purple)
            }
        }

    }

}