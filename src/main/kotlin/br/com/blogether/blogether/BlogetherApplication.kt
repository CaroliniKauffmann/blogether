package br.com.blogether.blogether

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogetherApplication

fun main(args: Array<String>) {
	runApplication<BlogetherApplication>(*args)
}
