package com.example.fox.beskotlinmasseng.model

class ChatMessage(val id: String, val text: String, val fromId: String, val toId: String, val timetamp: Long) {
    constructor() : this("", "", "", "", -1)
}