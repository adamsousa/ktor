/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.sessions

import kotlin.reflect.*

/**
 * Specifies a provider for a session with the specific [name] and [type]
 *
 * @param transport specifies the [SessionTransport] for this provider
 * @param tracker specifies the [SessionTracker] for this provider
 * @property name session name
 * @property type session instance type
 */
class SessionProvider(
    val name: String,
    val type: KClass<*>,
    val transport: SessionTransport,
    val tracker: SessionTracker
) {
    override fun toString(): String {
        return "SessionProvider(name = $name, type = $type, transport = $transport, tracker = $tracker)"
    }
}
