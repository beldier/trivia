package com.example.triviagame.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.triviagame.R
import com.example.triviagame.databinding.FragmentGameBinding
import com.example.triviagame.viewmodel.GameViewModel
import kotlinx.coroutines.CoroutineScope

class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    private val viewModel: GameViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false)
        binding.lifecycleOwner = this
        binding.question = viewModel.nextQuestion()
        binding.nextButton.setOnClickListener {
            var question  = viewModel.nextQuestion()
            if(question != null)
                binding.question = question
        }
        return binding.root
    }
}