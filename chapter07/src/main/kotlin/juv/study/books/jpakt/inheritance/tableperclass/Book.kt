package juv.study.books.jpakt.inheritance.tableperclass

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table

@Entity(name = "TablePerClassBook")
@Table(name = "table_per_class_books")
class Book (
    name: String,
    price: Int,
    val author: String
) : Item(name = name, price = price) {
}