package br.com.zup.marvelstore.marvelstore.repository

import br.com.zup.marvelstore.marvelstore.entity.Client
import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ClientRepositoryTest {

    @Autowired
    lateinit var repositoryClient: ClientRepository

    @Test
    fun createClient() {
        var client = Client("douglas", 26, "9876543210x","douglas@zup.com","9-87654-3210", "Rua: Antonio Moreira")

        client = repositoryClient.save(client)

        //não está funcionando
        Assertions.assertThat(client.name.equals("douglasm"))
        Assertions.assertThat(client.age == 26)
        Assertions.assertThat(client.cpf == "9876543210x")
        Assertions.assertThat(client.email == "douglas@zup.com")
        Assertions.assertThat(client.phone == "9-87654-3210")
        Assertions.assertThat(client.address == "Rua: Antonio Moreira")
    }
}