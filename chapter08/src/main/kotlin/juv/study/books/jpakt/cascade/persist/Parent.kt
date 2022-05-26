package juv.study.books.jpakt.cascade.persist

import javax.persistence.*

@Entity(name = "PersistCascadeParent")
@Table(name = "persist_cascade_parents")
class Parent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val parentId: Long? = null
) {

    @OneToMany(mappedBy = "parent", cascade = [CascadeType.PERSIST])
    var children: MutableList<Child> = mutableListOf()
}