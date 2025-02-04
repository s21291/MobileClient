package com.example.mobileclient.model

data class Casualty(
    val firstName: String,
    val gender: Gender,
    val lastName: String,
    val status: VictimStatus,
    val victimInfoId: Int?
)

enum class VictimStatus {
    STABLE, UNSTABLE, DECEASED
}
enum class Gender{
    MALE, FEMALE, OTHER
}
