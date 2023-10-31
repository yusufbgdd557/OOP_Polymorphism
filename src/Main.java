public class Main {
    public static void main(String[] args) {

//        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
//        customerManager.addCustomer();
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger()};
//        for (BaseLogger baseLogger : loggers) {
//            baseLogger.log("Bütün loglamalar yapıldı");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.addCustomer();

    }
}
