package com.aishwaryakamal.contactspro.ui.contactsList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aishwaryakamal.contactspro.MainActivity
import com.aishwaryakamal.contactspro.data.Contact
import com.aishwaryakamal.contactspro.databinding.ListItemContactsBinding
import java.util.*

class ContactsAdapter(val contactsClickListener: ContactsClickListener): ListAdapter<Contact, RecyclerView.ViewHolder>
    (ContactListDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactViewHolder(ListItemContactsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contact = getItem(position)
        (holder as ContactViewHolder).bind(contactsClickListener, contact)
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