package juv.study.books.jpakt.inheritance.joined

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table

@Entity(name = "JoinedBook")
@Table(name = "joined_books")
@DiscriminatorValue(value = "B")
@PrimaryKeyJoinColumn(name = "bookId")
class Book (
    name: String,
    price: Int,
    val author: String
) : Item(name = name, price = price) {
}