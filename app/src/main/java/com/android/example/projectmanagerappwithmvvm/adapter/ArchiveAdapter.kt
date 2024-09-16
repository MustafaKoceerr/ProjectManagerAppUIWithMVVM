package com.android.example.projectmanagerappwithmvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.example.projectmanagerappwithmvvm.R

class ArchiveAdapter(private val archiveList: MutableList<String>) :
    RecyclerView.Adapter<ArchiveAdapter.ArchiveViewHolder>() {
    class ArchiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.txtTitleArchive)
//        val image :ImageView= itemView.findViewById(R.id.imgFolder)

        fun bindData(item: String) {
            title.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArchiveViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_archive, parent, false)
        return ArchiveViewHolder(view)
    }

    override fun getItemCount() = archiveList.size

    override fun onBindViewHolder(holder: ArchiveViewHolder, position: Int) {
        with(holder) {
            bindData(archiveList[position])
        }
    }

}