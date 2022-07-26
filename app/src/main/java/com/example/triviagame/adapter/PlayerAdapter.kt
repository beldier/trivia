package com.example.triviagame.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.triviagame.data.Player
import com.example.triviagame.databinding.PlayerItemBinding

class PlayerAdapter: RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    var data  = listOf<Player>()
    class PlayerViewHolder(val binding2: PlayerItemBinding) : RecyclerView.ViewHolder(binding2.root)

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val item  = data[position]
        holder.binding2.text1.text = item.name
        holder.binding2.text2.text = item.score.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = PlayerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PlayerViewHolder(view)
    }


    override fun getItemCount() = data.size
}