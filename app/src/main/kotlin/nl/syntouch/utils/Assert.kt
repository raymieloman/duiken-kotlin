package nl.syntouch.utils

class Assert {
    companion object {

        fun assertEquals(expected: Any, actual: Any) {
            assertTrue(expected == actual, "Expected: $expected, Actual: $actual")
            assertOK("$actual (expected: $expected => OK)")
        }

        fun assertFalse(booleanExpr: Boolean, message: String = "Expected $booleanExpr to be false") {
            if (booleanExpr) {
                throw AssertionError(message)
            }
        }

        fun assertTrue(booleanExpr: Boolean, message: String = "Expected $booleanExpr to be true") {
            if (!booleanExpr) {
                throw AssertionError(message)
            }
            assertOK()
        }

        fun assertOK(message: String = "OK") {
            println(message)
        }
    }
}
