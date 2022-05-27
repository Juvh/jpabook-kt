package juv.study.books.jpakt.embedded

import java.util.*
import javax.persistence.*

@Entity(name = "EmbeddedTypeMember")
@Table(name = "embedded_type_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,

    /*@Temporal(TemporalType.DATE)
    var startDate: Date? = null,
    var endDate: Date? = null,

    var city: String,
    var street: String,
    var zipcode: String*/

    @Embedded
    var workPeriod: Period,
    @Embedded
    var homeAddress: Address
) {
}