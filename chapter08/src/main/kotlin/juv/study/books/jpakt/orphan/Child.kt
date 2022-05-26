package juv.study.books.jpakt.orphan

import javax.persistence.*

@Entity(name = "OrphanChild")
@Table(name = "orphan_children")
class Child(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val childId: Long? = null,

    @ManyToOne
    val parent: Parent
) {
}