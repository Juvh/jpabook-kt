package juv.study.books.jpakt.compositekey.identify.embeddedid

import javax.persistence.*

@Entity(name = "IdentifyEmbeddedGrandChild")
@Table(name = "identify_embedded_grand_children")
class GrandChild(
    @EmbeddedId
    val id: GrandChildId,

    val name: String,

    @MapsId("childId")
    @JoinColumns(
        value = [JoinColumn(name = "parentId", referencedColumnName = "parentId"),
            JoinColumn(name = "childId", referencedColumnName = "childId")]
    )
    @ManyToOne
    val child: Child? = null
)