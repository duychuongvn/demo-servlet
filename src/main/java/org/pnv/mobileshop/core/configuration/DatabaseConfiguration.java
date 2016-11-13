package org.pnv.mobileshop.core.configuration;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by huynhduychuong on Nov 13, 2016.
 *
 */
public class DatabaseConfiguration {
    private static final String DATABASE_RESOURCE = "database.properties";
    private static final String KEY_CONNECTION_URL = "database.url";
    private static final String KEY_DRIVER_NAME = "driverName";
    private static final String KEY_USERNAME = "database.username";
    private static final String KEY_PASSWORD = "database.password";
    private String connectionUrl;
    private String driverName;
    private String username;
    private String password;

    private DatabaseConfiguration() {
        Properties prop = new Properties();
        try {
            prop.load(DatabaseConfiguration.class.getClassLoader().getResourceAsStream(DATABASE_RESOURCE));
        } catch (IOException e) {
          
        }
        this.connectionUrl = prop.getProperty(KEY_CONNECTION_URL);
        this.driverName = prop.getProperty(KEY_DRIVER_NAME);
        this.username = prop.getProperty(KEY_USERNAME);
        this.password = prop.getProperty(KEY_PASSWORD);
    }

    public static DatabaseConfiguration getInstance() {
        return DatabaseConfigurationHelper.INSTANCE;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static class DatabaseConfigurationHelper {
        private static DatabaseConfiguration INSTANCE = new DatabaseConfiguration();
    }
}
