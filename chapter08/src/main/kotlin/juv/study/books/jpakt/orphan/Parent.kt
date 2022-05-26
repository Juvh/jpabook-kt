package juv.study.books.jpakt.orphan

import javax.persistence.*

@Entity(name = "OrphanParent")
@Table(name = "orphan_parents")
class Parent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val parentId: Long? = null
) {

    @OneToMany(mappedBy = "parent", cascade = [CascadeType.PERSIST], orphanRemoval = true)
    var children: MutableList<Child> = mutableListOf()
}