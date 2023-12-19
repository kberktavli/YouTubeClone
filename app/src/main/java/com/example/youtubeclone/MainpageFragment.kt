package com.example.youtubeclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.youtubeclone.adapter.ContentAdapter
import com.example.youtubeclone.databinding.FragmentMainpageBinding
import com.example.youtubeclone.models.ContentModels

class MainpageFragment : Fragment() {
    private lateinit var binding : FragmentMainpageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainpageBinding.inflate(inflater,container,false)


        binding.RV.layoutManager = LinearLayoutManager(requireContext())

        val contentList = ArrayList<ContentModels>()

        val c1 = ContentModels(1,"thesopranos","hbo","The Sopranos","HBO","173K views","8 years ago")
        val c2 = ContentModels(2,"succession","hbo","Succession","HBO","5M views","3 years ago")
        val c3 = ContentModels(3,"successiontheme","hbo","Succession Theme","HBO","3.7M views","3 years ago")
        val c4 = ContentModels(4,"studyenvironment","paulosantos","Library Sounds | Study Ambience | 2 hours ","Study With Me","987K views","6 months ago")
        val c5 = ContentModels(5,"erik","paulosantos","Erik Satie - Gnossienne No.1 (Extended)"," Paul Santos","7.8M views","4 years ago")
        val c6 = ContentModels(6,"godfather","thebeautyof","Test","The Beauty of","5.6M views","11 years ago")
        val c7 = ContentModels(7,"ohavideo","ohadiyorumvideo","Test","Oha Diyorum!","173K views","1 month ago")

        contentList.add(c1)
        contentList.add(c2)
        contentList.add(c3)
        contentList.add(c4)
        contentList.add(c5)
        contentList.add(c6)
        contentList.add(c7)

        val contentAdapter =ContentAdapter(requireContext(),contentList)
        binding.RV.adapter =contentAdapter





        return binding.root
    }
}