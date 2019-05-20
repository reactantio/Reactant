package net.swamphut.swampium.extra.command.io

interface StdOutConsumer {
    fun onOut(output: String)

    companion object {
        val VOID = object : StdOutConsumer {
            override fun onOut(output: String) = Unit
        }
    }
}
