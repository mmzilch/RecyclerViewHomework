package com.example.recyclerviewhomework2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework2.R
import com.example.recyclerviewhomework2.model.AnimeCharacter
import kotlinx.android.synthetic.main.item_character.view.*

class AnimeCharacterAdapter(var animeCharacterList: ArrayList<AnimeCharacter>) :
        RecyclerView.Adapter<AnimeCharacterAdapter.AnimeCharacterViewHolder>() {
        inner class AnimeCharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            fun bindPost(animeCharacter: AnimeCharacter) {
                itemView.tvName.text=animeCharacter.characterName
                itemView.tvCode.text=animeCharacter.code
                itemView.tvGender.text=animeCharacter.gender
                itemView.tvAge.text=animeCharacter.age
                itemView.profileImage.setImageResource(animeCharacter.profile)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeCharacterViewHolder {
            var view = LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
            return AnimeCharacterViewHolder(view)
        }

        override fun getItemCount(): Int {
            return animeCharacterList.size
        }

        override fun onBindViewHolder(holder: AnimeCharacterViewHolder, position: Int) {
            holder.bindPost(animeCharacterList[position])
        }
    }
