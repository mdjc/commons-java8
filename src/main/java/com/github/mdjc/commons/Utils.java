package com.github.mdjc.commons;

import java.io.Closeable;

public class Utils {
	public static void closeQuietly(Closeable... resources) {
		for (Closeable resource : resources) {
			try {
				if (resource != null)
					resource.close();
			} catch (Exception ignore) {
			}
		}
	}

	public static void execIgnoreException(Operation op) {
		try {
			op.execute();
		} catch (Exception ignore) {
		}
	}
}
