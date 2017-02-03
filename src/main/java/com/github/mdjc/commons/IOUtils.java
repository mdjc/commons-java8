package com.github.mdjc.commons;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IOUtils {
	public static void writeAndFlush(BufferedWriter writer, String str) throws IOException {
		writer.write(str);
		writer.newLine();
		writer.flush();
	}

	public static Properties loadConfig(String filename) throws FileNotFoundException, IOException {
		try (InputStream is = new FileInputStream(filename);) {
			Properties properties = new Properties();
			properties.load(is);
			return properties;
		}
	}
}
