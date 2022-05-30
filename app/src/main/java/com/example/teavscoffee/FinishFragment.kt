package com.example.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.teavscoffee.databinding.FragmentFinishBinding

class FinishFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_intro, container, false)

        (activity as AppCompatActivity).supportActionBar?.title = "Selesai yee"

        val binding : FragmentFinishBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_finish, container, false)

        var args = FinishFragmentArgs.fromBundle(arguments!!)
        binding.explianText.text = args.result

        return binding.root
    }
}

