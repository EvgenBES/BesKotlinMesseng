package com.example.fox.beskotlinmasseng.model

class User(val uid: String, val username: String, val profileImageUrl: String) {
    constructor() : this("", "", "")
}