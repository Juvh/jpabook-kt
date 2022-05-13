package juv.study.books.jpakt

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "members")
class Member(
    @Id
    @Column(name = "id")
    val id: Long?,

    @Column(name = "name")
    var userName: String,
    var age: Int,
) {
    override fun toString(): String {
        return "Member(id=$id, userName='$userName', age=$age)"
    }
}