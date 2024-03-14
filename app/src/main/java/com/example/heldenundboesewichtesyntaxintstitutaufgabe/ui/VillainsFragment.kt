package com.example.heldenundboesewichtesyntaxintstitutaufgabe.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.heldenundboesewichtesyntaxintstitutaufgabe.R
import com.example.heldenundboesewichtesyntaxintstitutaufgabe.databinding.FragmentVillainsBinding

class VillainsFragment : Fragment() {

    private lateinit var binding: FragmentVillainsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment.
        binding = FragmentVillainsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ich benötige Zugriff auf den NavController
        val navController = findNavController()

        // OnCLickListener auf alle Character
        binding.showAllCharactersBTN.setOnClickListener {
            navController.navigate(R.id.action_villainsFragment_to_allFragment)
        }
        binding.showAllCharactersBTN.setOnClickListener {
            navController.navigate(R.id.action_villainsFragment_to_hereosFragment)
        }
    }
}