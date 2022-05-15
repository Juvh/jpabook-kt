package juv.study.books.jpakt

import java.util.Date
import javax.persistence.*

@Entity
@Table(
    name = "members",
    uniqueConstraints = [UniqueConstraint(name = "name_age_unique", columnNames = ["name", "age"])]
)
class Member(
    @Id
    @Column(name = "id")
    private val id: Long?,

    @Column(name = "name", nullable = false, length = 10)
    private var userName: String,

    private var age: Int? = null,

    @Enumerated(EnumType.STRING)
    private var roleType: RoleType,

    @Temporal(TemporalType.TIMESTAMP)
    private var createdAt: Date,

    @Temporal(TemporalType.TIMESTAMP)
    private var lastModifiedAt: Date,

    @Lob
    private var description: String
)