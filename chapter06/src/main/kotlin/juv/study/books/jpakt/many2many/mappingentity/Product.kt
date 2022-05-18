package juv.study.books.jpakt.many2many.mappingentity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity(name = "M2mMeProduct")
@Table(name = "m2m_me_products")
class Product(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val name: String
)