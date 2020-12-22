package de.rdvsb.mppexamplelib

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


internal class ExampleNativeTest {
	private val example = Example()

	@Test
	fun getPlatform() {
		println("nativeTest getPlatform")
		assertTrue(example.platform.startsWith("Platform JVM"))
	}
}

internal class NativeNativeTest {
	private val native = Native()

	@Test
	fun getIsNative() {
		println("nativeTest getIsNative")
		assertTrue(native.isNative)
	}
}