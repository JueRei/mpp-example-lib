package de.rdvsb.mppexamplelib

import de.rdvsb.mppexamplelib.Example
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


internal class ExampleCommonTest {
	private val example = Example()

	@Test
	fun getPlatform() {
		println("commonTest getPlatform")
		assertTrue(example.platform.startsWith("Platform"))
	}
}

internal class NativeCommonTest {
	private val native = Native()

	@Test
	fun getIsNative() {
		println("commonTest getIsNative")
		assertTrue(native.isNative || !native.isNative)
	}
}