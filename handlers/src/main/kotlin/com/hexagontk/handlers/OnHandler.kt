package com.hexagontk.handlers

class OnHandler<T : Any>(
    override val predicate: (Context<T>) -> Boolean = { true },
    val callback: (Context<T>) -> Context<T>,
) : Handler<T> {

    override fun process(context: Context<T>): Context<T> =
        try {
            val callbackContext = callback(context)
            callbackContext.with(handled = true).next()
        }
        catch (e: Exception) {
            context.with(exception = e).next()
        }
}
