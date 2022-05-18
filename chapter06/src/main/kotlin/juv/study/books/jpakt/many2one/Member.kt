package juv.study.books.jpakt.many2one

import javax.persistence.*

@Entity(name = "Many2OneMember")
@Table(name = "mto_members")
class Member(
    @Id
    @GeneratedValue
    val memberId: Long? = null,

    val userName: String
) {

    @ManyToOne
    @JoinColumn(name = "teamId")
    var team: Team? = null
        set(value) {
            field?.members?.remove(this)
            field = value
            field?.members?.add(this)
        }
}