package com.example.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.teavscoffee.databinding.FragmentEboutBinding


class EboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_ebout, container, false)

        val binding : FragmentEboutBinding = DataBindingUtil.inflate(
                                            inflater, R.layout.fragment_ebout, container, false)

        return binding.root
    }

}