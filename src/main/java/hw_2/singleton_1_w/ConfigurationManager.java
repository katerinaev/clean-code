package hw_2.singleton_1_w;
/*
Implement a Singleton for managing application configuration
Description
The application requires a `ConfigurationManager` class to manage application settings, such as:
Database connection parameters (e.g., database URL, username, password).
The path to a directory for file storage.
Logging settings (e.g., logging level, path to the log file).
The `ConfigurationManager` class must be implemented using the Singleton pattern,
ensuring that only one instance of this class exists within the application and provides access
to the configuration data.
*/
public class ConfigurationManager {
    private static ConfigurationManager configurationManager;

    private String dbUrl;
    private String username;
    private String password;
    private String filePath;
    private String logLevel;
    private String logFilePath;

    private ConfigurationManager() {
        this.dbUrl ="jdbc:mysql://localhost:3306/mydb";
        this.username = "admin";
        this.password = "admin";
        this.filePath = "app/files";
        this.logLevel = "INFO";
        this.logFilePath = "app/logs/app.log";
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }
}
