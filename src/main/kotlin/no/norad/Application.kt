package no.norad

import io.github.oshai.kotlinlogging.KotlinLogging

fun main() {
    val log = KotlinLogging.logger {}
    println("Hello World!")
    log.info { "Hello Norad!" }
}
