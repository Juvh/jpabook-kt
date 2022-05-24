package juv.study.books.jpakt.compositekey.identify.embeddedid

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity(name = "IdentifyEmbeddedIdParent")
@Table(name = "identify_embedded_id_parents")
class Parent(
    @Id
    val id: String,

    val name: String
) {
}