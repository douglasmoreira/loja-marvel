package br.com.zup.marvelstore.marvelstore.gateway.entityjson

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ComicResultGateway(var id: Int,
                              var title: String,
                              var ean: String,
                              var isbn: String,
                              var description: String?) {
}