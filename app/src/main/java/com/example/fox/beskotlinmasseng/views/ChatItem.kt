package com.example.fox.beskotlinmasseng.views

import com.example.fox.beskotlinmasseng.R
import com.example.fox.beskotlinmasseng.model.User
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.chat_from_row.view.*
import kotlinx.android.synthetic.main.chat_to_row.view.*

class ChatFromItem(val text: String, val user: User) : Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.message_from_chat.text = text

        val uri = user.profileImageUrl
        Picasso.get().load(uri).into(viewHolder.itemView.imageview_photo_from_chat)
    }

    override fun getLayout(): Int {
        return R.layout.chat_from_row
    }

}


class ChatToItem(val text: String, val user: User) : Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.message_to_chat.text = text

        val uri = user.profileImageUrl
        Picasso.get().load(uri).into(viewHolder.itemView.imageview_photo_to_chat)

    }

    override fun getLayout(): Int {
        return R.layout.chat_to_row
    }

}