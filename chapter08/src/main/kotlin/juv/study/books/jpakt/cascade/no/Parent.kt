package juv.study.books.jpakt.cascade.no

import javax.persistence.*

@Entity(name = "NoCascadeParent")
@Table(name = "nocascade_parents")
class Parent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val parentId: Long? = null
) {

    @OneToMany(mappedBy = "parent")
    var children: MutableList<Child> = mutableListOf()
}