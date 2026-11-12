package hw_2.singleton_2_w;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Implement a Singleton for a Logger
Description
The application requires a `Logger` class to maintain a log of events. This class should
provide centralized access to logging functionality throughout the entire application.
Examples include:
Recording event information (e.g., a successful database connection).
Logging errors (e.g., exceptions that occur during operations).
Logging warnings (e.g., when deprecated methods are used).
The `Logger` class must be implemented using the Singleton pattern, ensuring that only
one instance of the class exists within the application to handle all logging tasks.
*/
public class Logger {
    private static Logger logger;
    private PrintWriter writer;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("app1.log", true), true);
        } catch (IOException e) {
            throw new RuntimeException("Failed to open file to logging", e);
        }
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private void log(String level, String message) {
        String logEntry = String.format("%s [%s] - %s", LocalDateTime.now().format(DATE_FORMATTER),
                level, message);
        writer.println(logEntry);
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void warn(String message) {
        log("WARN", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }
}
