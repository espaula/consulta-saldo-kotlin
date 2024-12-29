package com.example.consultaSaldoKotlin.service


import com.example.consultaSaldoKotlin.model.SaldoResponse
import org.springframework.stereotype.Service

@Service
class SaldoService {
    fun getSaldo(accountId: String): SaldoResponse {
        // Mock de dados simulados
        val mockData = mapOf(
            "123" to 1500.00,
            "456" to 3000.00,
            "789" to 750.50
        )
        val balance = mockData[accountId] ?: throw IllegalArgumentException("Conta não encontrada.")
        return SaldoResponse(accountId, balance)
    }
}
