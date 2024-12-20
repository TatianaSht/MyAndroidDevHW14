package ru.profile.model

data class Location(
    val street: Street,
    val city: String,
    val state: String,
    val country: String,
    val postCode: Int,
    val coordinates: Coordinates,
    val timezone: Timezone
)
