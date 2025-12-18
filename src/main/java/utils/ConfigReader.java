package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");

            properties  = new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException("failed to load config.properties");
        }
    }

    public static String get(String key){
        return properties.getProperty(key);
    }

}
