package oop_00000108084_NicholasWijaya.Week08

// name adalah Non-Null (Wajib), email dan phone adalah Nullable (opsional)
class UserProfile(
    val name: String,
    val email: String?,
    val phone: String? = null // Default argument null
)