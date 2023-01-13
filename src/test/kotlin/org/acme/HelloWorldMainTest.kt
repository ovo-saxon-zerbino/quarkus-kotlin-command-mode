package org.acme

import io.quarkus.test.junit.main.Launch
import io.quarkus.test.junit.main.LaunchResult
import io.quarkus.test.junit.main.QuarkusMainLauncher
import io.quarkus.test.junit.main.QuarkusMainTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


@QuarkusMainTest
class HelloTest {
    @Test
    @Launch("World")
    fun testLaunchCommand(result: LaunchResult) {
        Assertions.assertTrue(result.output.contains("Hello World"))
    }

    @Test
    fun testManualLaunch(launcher: QuarkusMainLauncher) {
        val result = launcher.launch("Everyone")
        Assertions.assertEquals(0, result.exitCode())
        Assertions.assertTrue(result.output.contains("Hello Everyone"))
    }
}