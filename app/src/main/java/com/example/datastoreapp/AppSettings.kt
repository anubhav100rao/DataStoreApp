package com.example.datastoreapp

import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.serialization.Serializable

@Serializable
data class AppSettings(
    val language: Language = Language.ENGLISH,
    val knownLocations: PersistentList<Location> = persistentListOf()
)

@Serializable
data class Location(
    val lat: Double = 0.0,
    val lng: Double = 0.0
)

enum class Language {
    ENGLISH,
    HINDI,
    GERMAN,
    SPANISH,
    FRENCH
}