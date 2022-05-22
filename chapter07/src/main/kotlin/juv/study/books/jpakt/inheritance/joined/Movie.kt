package juv.study.books.jpakt.inheritance.joined

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "JoinedMovie")
@Table(name = "joined_movies")
@DiscriminatorValue(value = "M")
class Movie(
    name: String,
    price: Int,
    val director: String,
    val actor: String
) : Item(name = name, price = price) {
}