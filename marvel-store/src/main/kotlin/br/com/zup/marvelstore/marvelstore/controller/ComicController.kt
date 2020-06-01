package br.com.zup.marvelstore.marvelstore.controller

import br.com.zup.marvelstore.marvelstore.gateway.entityjson.ComicResultGateway
import br.com.zup.marvelstore.marvelstore.gateway.entityjson.ComicRootGateway
import br.com.zup.marvelstore.marvelstore.service.ComicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("synchronize/comic")
class ComicController {

    @Autowired
    var comicService = ComicService()

    @GetMapping
    fun get(): List<ComicResultGateway>? {
        return comicService.get()
    }

}