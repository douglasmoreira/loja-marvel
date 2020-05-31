package br.com.zup.marvelstore.marvelstore.controller

import br.com.zup.marvelstore.marvelstore.entity.Client
import br.com.zup.marvelstore.marvelstore.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")
class ClientController {

    @Autowired
    val clientService = ClientService()

    @PostMapping
    fun post(@RequestBody client:  Client): Client {
        return clientService.create(client)
    }

    @PutMapping
    fun put(@RequestBody client:  Client): Client {
        return clientService.update(client)
    }

    @GetMapping
    fun get(): MutableList<Client> {
        return clientService.get()

    }

    @DeleteMapping("/{cpf}")
    fun delete(@PathVariable cpf:  String): String {
        return clientService.delete(cpf)
    }
}