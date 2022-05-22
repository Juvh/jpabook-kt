package juv.study.books.jpakt.mappedsuper

import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "MappedSuperMember")
@Table(name = "mapped_super_members")
@AttributeOverride(name = "id", column = Column(name = "memberId"))
class Member(
    name: String,
    var email: String
) : BaseEntity(name = name) {
}