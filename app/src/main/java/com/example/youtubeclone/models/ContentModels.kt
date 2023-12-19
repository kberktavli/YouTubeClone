package com.example.youtubeclone.models

import java.io.Serializable

data class ContentModels (val id : Int,
                          val thumbnail : String,
                          val user_profile_image : String,
                          val video_title : String,
                          val channel_name : String,
                          val view_count : String,
                          val date : String) : Serializable {
}