package fastcampus.aop_part4_chapter01.service

import fastcampus.aop_part4_chapter01.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/60763da1-4f12-4499-aad4-d395ecc058e9")
    fun listVideos(): Call<VideoDto>

}