package br.com.zup.marvelstore.marvelstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarvelStoreApplication

fun main(args: Array<String>) {
    runApplication<MarvelStoreApplication>(*args)
}
