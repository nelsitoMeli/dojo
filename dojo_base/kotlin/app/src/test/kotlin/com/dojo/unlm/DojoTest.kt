package com.dojo.unlm

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

/**
 * Tests for the dojo.
 */
class DojoTest : Spek({

    given("a B object") {
        on("comparing to other B object") {
            it("is equal"){
                assertEquals(B(), B())
            }
        }
    }

})