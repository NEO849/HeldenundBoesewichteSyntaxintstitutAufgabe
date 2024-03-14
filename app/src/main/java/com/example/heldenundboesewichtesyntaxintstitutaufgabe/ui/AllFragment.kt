package com.example.heldenundboesewichtesyntaxintstitutaufgabe.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.heldenundboesewichtesyntaxintstitutaufgabe.R
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ich benötige Zugriff auf den NavController
        val navController = findNavController()

        // OnCLickListener auf alle Character
        binding.showAllCharactersBTN.setOnClickListener {
            navController.navigate(R.id.action_allFragment_to_hereosFragment)
        }
        // OnCLickListener auf helden Character
        binding.showHereosBTN.setOnClickListener {
            navController.navigate(R.id.action_allFragment_to_villainsFragment)
        }
    }
}