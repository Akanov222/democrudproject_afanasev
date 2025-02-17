package config;

import java.io.InputStream;
import java.util.Properties;

public class Config {
    public static final String DB_URL = "db.url";
    public static final String DB_LOGIN = "db.login";
    public static final String DB_PASSWORD = "db.password";
    public static final String DB_LIMIT = "db.limit";
    public static final String CR_URL = "cr.url";
    private static Properties properties = new Properties();

    public Config() {
    }

    public static synchronized String getProperty(String name) {
        if (properties.isEmpty()) {
            try {
                InputStream is = Config.class.getClassLoader().getResourceAsStream("dao.properties");

                try {
                    properties.load(is);
                } catch (Throwable var5) {
                    if (is != null) {
                        try {
                            is.close();
                        } catch (Throwable var4) {
                            var5.addSuppressed(var4);
                        }
                    }

                    throw var5;
                }

                if (is != null) {
                    is.close();
                }
            } catch (Exception var6) {
                Exception e = var6;
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        return properties.getProperty(name);
    }
}
