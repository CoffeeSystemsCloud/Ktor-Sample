package cloud.coffeesystems.sample

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import cloud.coffeesystems.sample.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
