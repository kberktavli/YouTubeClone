package com.example.youtubeclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone.databinding.CardViewBinding
import com.example.youtubeclone.models.ContentModels

class ContentAdapter(var mContext : Context, var contentList : List<ContentModels>) : RecyclerView.Adapter<ContentAdapter.ContentViewHolder>() {


    inner class ContentViewHolder(val design : CardViewBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val binding = CardViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        val content = contentList.get(position)
        val d = holder.design

        d.videoTitle.text = content.video_title
        d.thumbnail.setImageResource(
            mContext.resources.getIdentifier(content.thumbnail,"drawable",mContext.packageName)
        )
        d.date.text = content.date
        d.viewCount.text = content.view_count
        d.userProfileImage.setImageResource(
            mContext.resources.getIdentifier(content.user_profile_image,"drawable",mContext.packageName))
        d.channelName.text= content.channel_name
    }




    override fun getItemCount(): Int {
        return contentList.size
    }
}