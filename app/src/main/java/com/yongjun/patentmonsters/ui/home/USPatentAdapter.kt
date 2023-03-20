package com.yongjun.patentmonsters.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yongjun.patentmonsters.R
import com.yongjun.patentmonsters.model.USGrantedPatent

class USPatentAdapter(private val context: Context): RecyclerView.Adapter<USPatentAdapter.ViewHolder>() {
    var data = listOf<USGrantedPatent>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_us_grant, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val txtNumber: TextView = itemView.findViewById(R.id.tv_number)
        private val txtRound: TextView = itemView.findViewById(R.id.tv_round)

        fun bind(model: USGrantedPatent) {
            txtNumber.text = model.inventionTitle
            txtRound.text = model.abstractText.first()
        }
    }
}
