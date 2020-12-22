package de.rdvsb.mppexamplelib

public expect class Example() {
	// implemented in linuxX64, mingwX64Main and jvmMain
	public val platform: String
}

public expect class Native() {
	// implemented in nativeCommon and jvmMain
	public val isNative: Boolean
}