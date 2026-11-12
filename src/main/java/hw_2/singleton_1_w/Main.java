package hw_2.singleton_1_w;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("Config1 DB URL: " + config1.getDbUrl());
        System.out.println("Config2 DB URL: " + config2.getDbUrl());

        System.out.println("Config1 Log Level: " + config1.getLogLevel());
        config2.setLogLevel("ERROR");
        System.out.println("Config1 Log Level: " + config1.getLogLevel());
    }
}
