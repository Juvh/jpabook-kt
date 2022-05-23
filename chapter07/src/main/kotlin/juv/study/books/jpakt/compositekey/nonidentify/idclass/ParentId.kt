package juv.study.books.jpakt.compositekey.nonidentify.idclass

import NoArg

@NoArg
data class ParentId(
    val id1: String,
    val id2: String
) : java.io.Serializable {
}
