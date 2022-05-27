package juv.study.books.jpakt.mapping

import javax.persistence.Embeddable
import javax.persistence.ManyToOne

@Embeddable
class PhoneNumber(
    var areaCode: String,
    var localNumber: String,
    @ManyToOne
    var provider: PhoneServiceProvider
) {

}
