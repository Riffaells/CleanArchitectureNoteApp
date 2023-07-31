package com.rugry.cleanarchitecturenoteapp.feature.domain.util

/*
* Возрастание убывание
* */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()

}