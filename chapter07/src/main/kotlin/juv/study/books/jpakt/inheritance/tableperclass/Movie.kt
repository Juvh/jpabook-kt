package juv.study.books.jpakt.inheritance.tableperclass

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "TablePerClassMovie")
@Table(name = "table_per_class_movies")
class Movie(
    name: String,
    price: Int,
    val director: String,
    val actor: String
) : Item(name = name, price = price) {
}