package me.snipz.eco

import java.util.UUID
import java.util.concurrent.CompletableFuture

interface EconomyService {

    fun depositPlayer(player: UUID, currency: String, amount: Double): CompletableFuture<EconomyResponse>
    fun withdrawPlayer(player: UUID, currency: String, amount: Double): CompletableFuture<EconomyResponse>

    fun getBalance(player: UUID, currency: String): CompletableFuture<Double>

}