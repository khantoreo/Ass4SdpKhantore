package subsystem;

public class DeliveryService {
    public void assignCourier() {
        System.out.println("[Жеткізу] Бос курьер тағайындалды.");
    }

    public void deliverTo(String address) {
        System.out.println("[Жеткізу] Тапсырыс мына мекенжайға жолға шықты: " + address);
    }
}