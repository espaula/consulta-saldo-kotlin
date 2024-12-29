package com.example.consultaSaldoKotlin.controller

import com.example.consultaSaldoKotlin.model.SaldoResponse
import com.example.consultaSaldoKotlin.service.SaldoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/saldo")
class SaldoController(
    private val saldoService: SaldoService
) {
    @GetMapping("/{accountId}")
    fun getSaldo(@PathVariable accountId: String): ResponseEntity<SaldoResponse> {
        return try {
            val saldo = saldoService.getSaldo(accountId)
            ResponseEntity.ok(saldo)
        } catch (e: IllegalArgumentException) {
            ResponseEntity.badRequest().body(null)
        }
    }
}
