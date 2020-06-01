package br.com.zup.marvelstore.marvelstore.gateway

import br.com.zup.marvelstore.marvelstore.entity.Comic
import br.com.zup.marvelstore.marvelstore.gateway.entityjson.ComicResultGateway

class ConverterComicGatewayToComic {
    fun toComic(comicResultGateway: ComicResultGateway): Comic {
        var comic= Comic()
        comic.description = comicResultGateway.description
        comic.ean = comicResultGateway.ean
        comic.idOrigin = comicResultGateway.id
        comic.title = comicResultGateway.title
        comic.isbn = comicResultGateway.isbn
        return comic
    }
}