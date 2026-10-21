package facade;

import subsystem.DeliveryService;
import subsystem.InventorySystem;
import subsystem.KitchenSystem;
import subsystem.PaymentGateway;

public class SushiOrderFacade {
    private final InventorySystem inventory;
    private final KitchenSystem kitchen;
    private final PaymentGateway payment;
    private final DeliveryService delivery;

    public SushiOrderFacade() {
        this.inventory = new InventorySystem();
        this.kitchen = new KitchenSystem();
        this.payment = new PaymentGateway();
        this.delivery = new DeliveryService();
    }

    public void orderSushi(String rollName, double price, String address) {
        System.out.println("=== ТАПСЫРЫС ӨҢДЕУ БАСТАЛДЫ ===");
        
        if (inventory.checkIngredients(rollName)) {
            if (payment.processPayment(price)) {
                inventory.deductIngredients(rollName);
                kitchen.prepareOrder(rollName);
                kitchen.cook();
                delivery.assignCourier();
                delivery.deliverTo(address);
                System.out.println("=== ТАПСЫРЫС СӘТТІ АЯҚТАЛДЫ! ===\n");
            }
        } else {
            System.out.println("Қоймада ингредиенттер жеткіліксіз.");
        }
    }
}