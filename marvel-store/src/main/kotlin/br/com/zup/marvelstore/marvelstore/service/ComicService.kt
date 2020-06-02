package br.com.zup.marvelstore.marvelstore.service

import br.com.zup.marvelstore.marvelstore.gateway.ConverterComicGatewayToComic
import br.com.zup.marvelstore.marvelstore.gateway.RestTemplateComic
import br.com.zup.marvelstore.marvelstore.gateway.entityjson.ComicResultGateway
import br.com.zup.marvelstore.marvelstore.repository.ComicRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ComicService {

    var restTemplateComic = RestTemplateComic()
    var converterComicGatewayToComic = ConverterComicGatewayToComic()

    @Autowired
    lateinit var comicRepository: ComicRepository

    fun get(): List<ComicResultGateway>? {

        val comicRootGateway = restTemplateComic.getDataAPIMarvel()

        var comicResultGateway: List<ComicResultGateway>? = null
        if (comicRootGateway != null) {
            comicResultGateway =comicRootGateway.dataGateway.resultGateway
        }
        if (comicResultGateway != null) {
            for (comicResult in comicResultGateway){
                comicRepository.save(converterComicGatewayToComic.toComic(comicResult))
            }
        }
        return comicResultGateway
    }

}