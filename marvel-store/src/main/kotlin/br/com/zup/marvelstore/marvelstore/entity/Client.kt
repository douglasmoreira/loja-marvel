package br.com.zup.marvelstore.marvelstore.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Client(
        @Column
        var name: String,
        @Column
        var age: Int,
        @Id
        @Column
        var cpf: String,
        @Column
        var email: String,
        @Column
        var phone: String,
        @Column
        var address: String) {
}