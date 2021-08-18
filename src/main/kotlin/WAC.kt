@file:JvmName("WAC")
package com.github.workstationascode.wac

fun main(args: Array<String>) {
    println(greeting(args))
}

fun greeting(names: Array<String>) = "wac first step with arguments: " + names.joinToString(", ")
