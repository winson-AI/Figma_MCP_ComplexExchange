package com.example.complexexchange

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform