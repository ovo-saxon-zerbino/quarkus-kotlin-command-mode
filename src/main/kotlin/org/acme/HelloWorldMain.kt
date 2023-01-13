package org.acme

import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain

@QuarkusMain
class HelloWorldMain : QuarkusApplication {
    @Throws(Exception::class)
    override fun run(vararg args: String): Int {

        if (args.isNotEmpty()) {
            println("Hello " + args[0])
        } else {
            println("Hello World")
        }
        return 0
    }
}