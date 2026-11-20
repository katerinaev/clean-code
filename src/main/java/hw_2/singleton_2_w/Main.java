package hw_2.singleton_2_w;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("Successful connection to DB");
        logger.warn("Outdated method is used");
        logger.error("Error connection to DB");
    }
}
