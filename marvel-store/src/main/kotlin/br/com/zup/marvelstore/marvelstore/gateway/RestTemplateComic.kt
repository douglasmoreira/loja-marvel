package br.com.zup.marvelstore.marvelstore.gateway

import br.com.zup.marvelstore.marvelstore.gateway.entityjson.ComicRootGateway
import org.apache.commons.codec.digest.DigestUtils
import org.springframework.web.client.RestTemplate

class RestTemplateComic {

    private lateinit var timestamp: String

    fun getDataAPIMarvel(): ComicRootGateway? {
        val comicResourceUrlString = "https://gateway.marvel.com:443/v1/public/comics?ts="+generateTimestamp()+"&apikey=5576cb1772688f0b79b587abcb380449&hash="+generateHash()

        return RestTemplate().getForObject(comicResourceUrlString, ComicRootGateway::class.java)
    }

    private fun generateTimestamp(): String {
        timestamp = System.currentTimeMillis().toString()
        return timestamp
    }

    private fun generateHash(): String {
        val marveKey = System.getenv("MARVEL_KEY")
        val key = timestamp + marveKey
        return DigestUtils.md5Hex(key)
    }
}