package com.github.workstationascode.wac

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WACTest {
    @Test
    fun test_greeting() {
        val actual = greeting(arrayOf("a", "b"))
        assertThat(actual).isEqualTo("wac first step with arguments: a, b")
    }
}
