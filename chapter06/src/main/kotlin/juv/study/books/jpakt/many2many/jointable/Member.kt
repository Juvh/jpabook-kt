package juv.study.books.jpakt.many2many.jointable

import javax.persistence.*

@Entity(name = "M2mJtMember")
@Table(name = "m2m_jt_members")
class Member(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val userName: String
) {

    @ManyToMany
    @JoinTable(
        name = "m2m_jt_member_product_mappings",
        joinColumns = [JoinColumn(name = "memberId")],
        inverseJoinColumns = [JoinColumn(name = "productId")]
    )
    var products: MutableList<Product> = mutableListOf()

    fun addProducts(product: Product) {
        if (!this.products.contains(product)) {
            this.products.add(product)
        }

        if (!product.members.contains(this)) {
            product.members.add(this)
        }
    }

}