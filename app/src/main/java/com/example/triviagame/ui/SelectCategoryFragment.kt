package com.example.triviagame.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.triviagame.R
import com.example.triviagame.adapter.CategoryAdapter
import com.example.triviagame.data.Category
import com.example.triviagame.data.Player
import com.example.triviagame.databinding.FragmentSelectCategoryBinding


class SelectCategoryFragment : Fragment() {
    private lateinit var binding:FragmentSelectCategoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectCategoryBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
    }

    private fun setRecycler(){
        val adapter = CategoryAdapter()
        binding.recycler.adapter = adapter
        adapter.data = generateCategories()
        adapter.notifyDataSetChanged()
    }
    private fun generateCategories():List<Player>{
        var list = mutableListOf<Player>()
        list.add(Player("Android",10))
        list.add(Player("Javascript",9))
        list.add(Player("Python",7))
        val add = list.add(Player("React", 6))
        return list.toList()
    }
}