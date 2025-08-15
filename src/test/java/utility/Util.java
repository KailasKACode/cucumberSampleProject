package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Util {

	public static String getEnv(String key) throws IOException {
		String value = null;
		FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return value = prop.getProperty(key);
	}

}
