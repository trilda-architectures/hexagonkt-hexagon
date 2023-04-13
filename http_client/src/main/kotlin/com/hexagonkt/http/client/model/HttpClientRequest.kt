package com.hexagonkt.http.client.model

import com.hexagonkt.http.*
import com.hexagonkt.http.model.*
import com.hexagonkt.http.model.HttpMethod.GET
import com.hexagonkt.http.model.HttpProtocol.HTTP

data class HttpClientRequest(
    override val method: HttpMethod = GET,
    override val protocol: HttpProtocol = HTTP,
    override val host: String = "localhost",
    override val port: Int = 80,
    override val path: String = "",
    override val queryParameters: QueryParameters = QueryParameters(),
    override val headers: Headers = Headers(),
    override val body: Any = "",
    override val parts: List<HttpPart> = emptyList(),
    override val formParameters: FormParameters = FormParameters(),
    override val cookies: List<Cookie> = emptyList(),
    override val contentType: ContentType? = null,
    override val accept: List<ContentType> = emptyList(),
    override val authorization: Authorization? = null,
) : HttpRequest {

    init {
        checkHeaders(headers)
    }
}