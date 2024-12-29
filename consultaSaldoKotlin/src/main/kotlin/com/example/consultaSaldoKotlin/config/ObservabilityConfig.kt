package com.example.consultaSaldoKotlin.config

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Configuration

@Configuration
class ObservabilityConfig(
    private val meterRegistry: MeterRegistry
) {
    init {
        meterRegistry.gauge("application.startup", 1.0)
    }
}
