package com.udacity.project4.locationreminders.data.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "reminders")
data class ReminderDTO(
    @ColumnInfo(name = "Title") var title: String?,
    @ColumnInfo(name = "Description") var description: String?,
    @ColumnInfo(name = "Location") var location: String?,
    @ColumnInfo(name = "Latitude") var latitude: Double?,
    @ColumnInfo(name = "Longitude") var longitude: Double?,
    @PrimaryKey @ColumnInfo(name = "EntryId") val id: String = UUID.randomUUID().toString()
)
