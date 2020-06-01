package br.com.zup.marvelstore.marvelstore.repository

import br.com.zup.marvelstore.marvelstore.entity.Comic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ComicRepository: JpaRepository<Comic, Long> {
}