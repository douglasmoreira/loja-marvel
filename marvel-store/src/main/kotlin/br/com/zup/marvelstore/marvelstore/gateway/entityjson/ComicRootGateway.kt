package br.com.zup.marvelstore.marvelstore.gateway.entityjson

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ComicRootGateway(var statusString: String?,
                            var copyrigth: String?,
                            var attributionText: String,
                            var attributionHTML: String,
                            @JsonProperty(value = "data")
                            var dataGateway: ComicDataGateway) {

}