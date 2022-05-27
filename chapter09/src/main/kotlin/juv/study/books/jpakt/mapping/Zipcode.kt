package juv.study.books.jpakt.mapping

import javax.persistence.Embeddable

@Embeddable
class Zipcode(
    var zip: String,
    var plusFour: String
) {

}
