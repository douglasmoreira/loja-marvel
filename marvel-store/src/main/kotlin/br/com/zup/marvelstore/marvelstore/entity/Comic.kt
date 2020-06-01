package br.com.zup.marvelstore.marvelstore.entity

import javax.persistence.*

@Entity
data class Comic(
        @Id
        @Column(nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  val id: Long,
        @Column(name = "id_origin")
        var idOrigin: Int,
        @Column
        var title: String,
        @Column
        var ean: String,
        @Column
        var isbn: String,
        @Column(columnDefinition = "varchar(2000)")
        var description: String?) {
    constructor() : this(-1,-1,"","","","")
}