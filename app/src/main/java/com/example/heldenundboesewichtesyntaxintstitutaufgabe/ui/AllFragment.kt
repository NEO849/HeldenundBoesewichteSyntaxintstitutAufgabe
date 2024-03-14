package com.example.heldenundboesewichtesyntaxintstitutaufgabe.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.heldenundboesewichtesyntaxintstitutaufgabe.databinding.FragmentAllBinding

class AllFragment : Fragment() {

    private lateinit var binding: FragmentAllBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAllBinding.inflate(layoutInflater)
        return binding.root
    }
}