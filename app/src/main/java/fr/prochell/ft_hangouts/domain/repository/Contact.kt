package fr.prochell.ft_hangouts.domain.repository

data class Contact(
    val firstName: String,
    val lastName: String?,
    val phoneNumber: Int,
    val nick: String?,
    val email: String?,
    val description: String?,
    val image: String,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}