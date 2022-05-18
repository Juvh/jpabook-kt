package juv.study.books.jpakt.one2many

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity(name = "One2ManyMember")
@Table(name = "otm_members")
class Member(
    @Id
    @GeneratedValue
    val memberId: Long? = null,

    val userName: String
) {
}