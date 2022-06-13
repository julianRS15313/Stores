package com.example.stores

import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "StoreEntity")
data class StoreEntity(@PrimaryKey(autoGenerate = true) var id:Long =0,
                       var name:String,
                       var phone:String,
                       var website: String ="",
                       var photoUrl:String,
                       var isFavorite:Boolean =false){
    //estudia si coinside el hasCode el numero calculado
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StoreEntity
        

        if (id != other.id) return false

        return true
    }

    //numero calculado  codigo generado por cada objeto
    override fun hashCode(): Int {
        return id.hashCode()
    }
}
