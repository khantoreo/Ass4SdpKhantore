import facade.SushiOrderFacade;

public class Main {
    public static void main(String[] args) {
        SushiOrderFacade sushiFacade = new SushiOrderFacade();

        sushiFacade.orderSushi("Филадельфия", 3500.0, "Мәңгілік Ел, 55");
        sushiFacade.orderSushi("Калифорния", 2800.0, "Тәуелсіздік, 10");
    }
}