package br.com.zup.marvelstore.marvelstore.gateway.entityjson

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ComicDataGateway(var offset: Int,
                            var limit: Int,
                            var total: Int,
                            var count: Int,
                            @JsonProperty(value = "results")
                            var resultGateway: List<ComicResultGateway> ) {
}