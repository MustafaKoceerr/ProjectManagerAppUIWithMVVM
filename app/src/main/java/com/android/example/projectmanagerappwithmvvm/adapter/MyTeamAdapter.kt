package com.android.example.projectmanagerappwithmvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.android.example.projectmanagerappwithmvvm.R
import com.android.example.projectmanagerappwithmvvm.domain.TeamDomain

class MyTeamAdapter(private val myTeamList: MutableList<TeamDomain>) :
    RecyclerView.Adapter<MyTeamAdapter.MyTeamViewHolder>() {
    class MyTeamViewHolder(itemView: View) : ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.txtTitle)
        val status: TextView = itemView.findViewById(R.id.txtStatus)
//        val image: ImageView = itemView.findViewById(R.id.imageView)
//        val arrowImage: ImageView = itemView.findViewById(R.id.imageArrow)

        fun bindData(item: TeamDomain) {
            title.text = item.title
            status.text = item.status
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyTeamViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_team, parent, false)
        return MyTeamViewHolder(view)
    }

    override fun getItemCount() = myTeamList.size

    override fun onBindViewHolder(holder: MyTeamViewHolder, position: Int) {
        with(holder) {
            bindData(myTeamList[position])
        }
    }


}