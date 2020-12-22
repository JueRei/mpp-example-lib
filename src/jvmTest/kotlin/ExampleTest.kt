package de.rdvsb.mppexamplelib

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


internal class ExampleJvmTest {
	private val example = Example()

	@Test
	fun getPlatform() {
		println("jvmTest getPlatform")
		assertTrue(example.platform.startsWith("Platform JVM"))
	}
}

internal class NativeJvmTest {
	private val native = Native()

	@Test
	fun getIsNative() {
		println("jvmTest getIsNative")
		assertFalse(native.isNative)
	}
}