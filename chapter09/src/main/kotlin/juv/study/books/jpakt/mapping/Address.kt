package juv.study.books.jpakt.mapping

import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class Address(
    var city: String,
    var street: String,

    @Embedded
    var zipcode: Zipcode
) {

}
