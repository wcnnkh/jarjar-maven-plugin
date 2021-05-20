package com.tonicsystems.jarjar;

import org.objectweb.asm.Opcodes;

public abstract class Constants {
	private Constants() {
		throw new IllegalStateException();
	}

	public static final int ASM_OPCODES = Opcodes.ASM5;
}
