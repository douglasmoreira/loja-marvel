package br.com.zup.marvelstore.marvelstore.service

import br.com.zup.marvelstore.marvelstore.entity.Client
import br.com.zup.marvelstore.marvelstore.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService {

    @Autowired
    lateinit var clientRepository : ClientRepository

    fun create(client: Client): Client {
        return clientRepository.save(client)
    }

    fun update(client: Client): Client {
        return clientRepository.save(client)
    }

    fun get(): MutableList<Client> {
        return clientRepository.findAll()
    }

    fun delete(cpf: String): String {
        clientRepository.deleteById(cpf)
        return "delete success"
    }
}