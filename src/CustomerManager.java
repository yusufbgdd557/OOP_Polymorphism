public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;

    }

    public void addCustomer(){
        this.logger.log("Adding first customer...");
    }

}
