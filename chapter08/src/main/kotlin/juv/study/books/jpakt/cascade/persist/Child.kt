package juv.study.books.jpakt.cascade.persist

import javax.persistence.*

@Entity(name = "PersistCascadeChild")
@Table(name = "persist_cascade_children")
class Child(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val childId: Long? = null,

    @ManyToOne
    val parent: Parent
) {
}