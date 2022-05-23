package juv.study.books.jpakt.compositekey.identify.idclass

import NoArg

@NoArg
data class GrandChildId(
    val child: ChildId,
    val id: String
) : java.io.Serializable
