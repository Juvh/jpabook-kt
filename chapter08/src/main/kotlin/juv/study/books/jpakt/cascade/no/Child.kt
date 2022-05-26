package juv.study.books.jpakt.cascade.no

import javax.persistence.*

@Entity(name = "NoCascadeChild")
@Table(name = "nocascade_children")
class Child(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val childId: Long? = null,

    @ManyToOne
    val parent: Parent
) {
}