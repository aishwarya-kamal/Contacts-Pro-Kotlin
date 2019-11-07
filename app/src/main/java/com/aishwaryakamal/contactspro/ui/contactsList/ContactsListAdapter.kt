package com.aishwaryakamal.contactspro.ui.contactsList

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aishwaryakamal.contactspro.data.Contact
import com.aishwaryakamal.contactspro.databinding.ListItemContactsBinding
import kotlinx.android.synthetic.main.list_item_contacts.view.*

class ContactsAdapter(val context: Context, val contactsClickListener: ContactsClickListener): ListAdapter<Contact, RecyclerView.ViewHolder>
    (ContactListDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactViewHolder(ListItemContactsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val contact = getItem(position)
//        (holder as ContactViewHolder).bind(contactsClickListener, contact)
//    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentContact = getItem(position)

        holder.itemView.phoneImageButton.setOnClickListener{
            val uri = "tel:" + currentContact.number
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse(uri)
            context.startActivity(intent)
        }

        holder.itemView.emailImageButton.setOnClickListener {
            val to = currentContact.email

            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf<String>(to ?: ""))

            email.type = "message/rfc822"
            context.startActivity(Intent.createChooser(email, "Choose an Email client :"))
        }

        (holder as ContactViewHolder).bind(contactsClickListener, currentContact)
    }

    class ContactViewHolder(private val binding: ListItemContactsBinding) :
        RecyclerView.ViewHolder(binding.root){


        fun bind(contactListener: ContactsClickListener, item: Contact){
            binding.apply {
                contactClickListener = contactListener
                contact = item
                executePendingBindings()
            }
        }
    }
}

//// Filter Class
//fun filter(charText: String) {
//    var charText = charText
//    charText = charText.toLowerCase(Locale.getDefault())
//    MainActivity.imageModelArrayList.clear()
//    if (charText.length == 0) {
//        MainActivity.imageModelArrayList.addAll(arraylist)
//    } else {
//        for (wp in arraylist) {
//            if (wp.getNames().toLowerCase(Locale.getDefault()).contains(charText)) {
//                MainActivity.imageModelArrayList.add(wp)
//            }
//        }
//    }
//    notifyDataSetChanged()
//}

private class ContactListDiffCallback : DiffUtil.ItemCallback<Contact>(){
    override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
        return oldItem == newItem
    }
}

class ContactsClickListener(val clickListener: (contact: Contact) -> Unit) {
    fun onClick(contact: Contact) = clickListener(contact)
}