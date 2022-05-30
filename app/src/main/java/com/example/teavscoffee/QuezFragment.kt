package com.example.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.teavscoffee.databinding.FragmentQuezBinding


class QuezFragment : Fragment() {

    val questions = arrayOf("apa yang kamu minum saat kerja?",
                            "apa yang kamu minum saat sedang santai?",
                            "apa yang kamu minum saat sedang nonton film?")

    var tea_score   = 0
    var coffe_score = 0
    var current_q   = 0 // pertanyaan yang sedang ditanyakan


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_quez, container, false)

        (activity as AppCompatActivity).supportActionBar?.title = "Kuis"

        val binding : FragmentQuezBinding = DataBindingUtil.inflate(
                                            inflater, R.layout.fragment_quez, container, false)

        binding.quizText.text = questions[current_q]

        binding.kopiBtn.setOnClickListener{
            coffe_score++
            nextQuestion(binding)
        }

        binding.tehBtn.setOnClickListener{
            tea_score++
            nextQuestion(binding)
        }

        return binding.root
    }

    fun nextQuestion(binding: FragmentQuezBinding){
        current_q++


        if (current_q < questions.size) {
            binding.quizText.text = questions[current_q]
            Toast.makeText(context, "berhasil coffee :" + coffe_score + "/ tea :" + tea_score, Toast.LENGTH_SHORT).show()
        }
        else{
            var result = ""
            if (coffe_score >= 1 && tea_score >=1){
                result = "kamu suka dua duanya"
            }else if(coffe_score < 1){
                result = "kamu suka teh"
            }else if(tea_score < 1){
                result = "kamu suka kopi"
            }
            view!!.findNavController().navigate(QuezFragmentDirections.actionQuezFragmentToFinishFragment(result))
        }
    }

}