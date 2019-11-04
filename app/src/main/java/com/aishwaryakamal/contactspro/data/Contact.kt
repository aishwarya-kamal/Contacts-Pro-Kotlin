package com.aishwaryakamal.contactspro.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Contact(
    var firstName: String?,
    var lastName: String?,
    var number: String?,
    var email: String?,
    var profilePictureUrl: String?,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)