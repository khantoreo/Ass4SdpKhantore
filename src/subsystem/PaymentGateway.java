package subsystem;

public class PaymentGateway {
    public boolean processPayment(double amount) {
        System.out.println("[Төлем] " + amount + " ₸ мөлшерінде төлем өңделуде...");
        System.out.println("[Төлем] Төлем сәтті өтті!");
        return true;
    }
}