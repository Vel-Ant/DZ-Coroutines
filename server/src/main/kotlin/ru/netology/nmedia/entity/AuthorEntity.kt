package ru.netology.nmedia.entity

import jakarta.persistence.*
import ru.netology.nmedia.dto.Author

@Entity
data class AuthorEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    var name: String,
    var avatar: String,
) {
    fun toDto() = Author(id, name, avatar)

    companion object {
        fun fromDto(dto: Author) = AuthorEntity(
            dto.id,
            dto.name,
            dto.avatar,
        )
    }
}