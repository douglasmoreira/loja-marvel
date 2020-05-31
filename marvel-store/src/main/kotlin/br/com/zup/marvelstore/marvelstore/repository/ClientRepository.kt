package br.com.zup.marvelstore.marvelstore.repository

import br.com.zup.marvelstore.marvelstore.entity.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : JpaRepository<Client, String>{
}