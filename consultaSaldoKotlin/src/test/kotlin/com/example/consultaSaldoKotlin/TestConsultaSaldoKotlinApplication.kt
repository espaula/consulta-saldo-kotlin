package com.example.consultaSaldoKotlin

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<ConsultaSaldoKotlinApplication>().with(TestcontainersConfiguration::class).run(*args)
}
