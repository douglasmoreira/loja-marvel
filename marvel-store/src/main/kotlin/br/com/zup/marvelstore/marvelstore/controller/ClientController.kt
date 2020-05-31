package br.com.zup.marvelstore.marvelstore.controller

import br.com.zup.marvelstore.marvelstore.entity.Client
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")
class ClientController {

    @PostMapping
    fun post(@RequestBody client:  Client): Client {
        return client
    }

    @PutMapping
    fun put(@RequestBody client:  Client): Client {
        return client
    }

    @GetMapping
    fun get():  String {
        return "post success"

    }

    @DeleteMapping("/{cpf}")
    fun delete(@PathVariable cpf:  String): String {
        return cpf
    }
}