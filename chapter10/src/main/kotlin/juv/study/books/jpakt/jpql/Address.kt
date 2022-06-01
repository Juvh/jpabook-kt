package juv.study.books.jpakt.jpql

import javax.persistence.Embeddable

@Embeddable
class Address(
    var city: String,
    var street: String,
    var zipcode: String
) {
    override fun toString(): String {
        return "Address(city='$city', street='$street', zipcode='$zipcode')"
    }
}