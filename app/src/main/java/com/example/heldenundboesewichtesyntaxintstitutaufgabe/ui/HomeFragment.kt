package com.example.heldenundboesewichtesyntaxintstitutaufgabe.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.heldenundboesewichtesyntaxintstitutaufgabe.R
import com.example.heldenundboesewichtesyntaxintstitutaufgabe.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ich benötige Zugriff auf den NavController
        val navController = findNavController()

        // OnCLickListener auf alle Character
        binding.showAllCharactersBTN.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_allFragment)
        }
        // OnCLickListener auf helden Character
        binding.showHereosBTN.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_hereosFragment)
        }
        // OnCLickListener auf bösewichte Character
        binding.showVillainsBTN.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_villainsFragment)
        }
    }
}