package com.example.heldenundboesewichtesyntaxintstitutaufgabe.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.heldenundboesewichtesyntaxintstitutaufgabe.databinding.FragmentHereosBinding

class HereosFragment : Fragment() {

    private lateinit var binding: FragmentHereosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHereosBinding.inflate(inflater,container,false)
        return binding.root
    }

}