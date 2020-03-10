package com.example.recyclerviewhomework2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.example.recyclerviewhomework2.R
import com.example.recyclerviewhomework2.adapter.AnimeCharacterAdapter
import com.example.recyclerviewhomework2.model.AnimeCharacter
import kotlinx.android.synthetic.main.fragment_list.view.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_list, container, false)
        var animeCharacterArray = ArrayList<AnimeCharacter>()
        animeCharacterArray.add(AnimeCharacter("001", R.drawable.kathy,"Kathy", "Female","25"))
        animeCharacterArray.add(AnimeCharacter("002", R.drawable.thomas, "Thomas","Male","17"))
        animeCharacterArray.add(AnimeCharacter("003", R.drawable.james, "James","Male","22"))
        animeCharacterArray.add(AnimeCharacter("004", R.drawable.kathrine, "Kathrine","Female","25"))
        animeCharacterArray.add(AnimeCharacter("005", R.drawable.scarlatt, "Scarlatt","Female","17"))
        animeCharacterArray.add(AnimeCharacter("006",R.drawable.rosy, "Rosy","Female", "22"))

        var animeCharacterAdapter = AnimeCharacterAdapter(animeCharacterArray)
        root.recyclerView.layoutManager= GridLayoutManager(context,2)
        root.recyclerView.adapter = animeCharacterAdapter

        // Inflate the layout for this fragment
        return root
    }

}
