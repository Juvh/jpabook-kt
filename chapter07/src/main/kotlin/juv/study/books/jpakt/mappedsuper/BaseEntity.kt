package juv.study.books.jpakt.mappedsuper

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity(
    @Id
    @GeneratedValue
    val id: Long? = null,
    var name: String
)