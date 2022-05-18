package juv.study.books.jpakt.one2one

import javax.persistence.*

@Entity(name = "One2OneLocker")
@Table(name = "o2o_lockers")
class Locker(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val name: String
) {
    @OneToOne(mappedBy = "locker")
    var member: Member? = null
}