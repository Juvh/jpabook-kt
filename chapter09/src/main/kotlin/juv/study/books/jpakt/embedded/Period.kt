package juv.study.books.jpakt.embedded

import java.util.*
import javax.persistence.Embeddable

@Embeddable
class Period(
    var startDate: Date? = null,
    var endDate: Date? = null
) {

}
