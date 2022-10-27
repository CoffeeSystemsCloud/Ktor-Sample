package cloud.coffeesystems.sample.plugins

import cloud.coffeesystems.routes.customerRouting
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        customerRouting()
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
