package juv.study.books.jpakt.practice

import java.time.LocalDateTime
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity(
    val createdAt: LocalDateTime,
    var modifiedAt: LocalDateTime
) {
    constructor(createdAt: LocalDateTime) : this(createdAt = createdAt, modifiedAt = createdAt)
}