package com.example.fonekotlinmultiplatformapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform