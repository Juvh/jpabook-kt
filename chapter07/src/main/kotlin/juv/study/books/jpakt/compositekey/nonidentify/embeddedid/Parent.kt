package juv.study.books.jpakt.compositekey.nonidentify.embeddedid

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "NoIdentifyEmbeddedIdParent")
@Table(name = "no_identify_embedded_id_parents")
class Parent(
    @EmbeddedId
    val id: ParentId,

    val name: String
) {
}