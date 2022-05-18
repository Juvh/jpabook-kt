package juv.study.books.jpakt.many2many.jointable

import javax.persistence.*

@Entity(name = "M2mJtProduct")
@Table(name = "m2m_jt_products")
class Product(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val name: String
) {

    @ManyToMany(mappedBy = "products")
    var members: MutableList<Member> = mutableListOf()
}