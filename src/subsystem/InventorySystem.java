package subsystem;

public class InventorySystem {
    public boolean checkIngredients(String rollName) {
        System.out.println("[Қойма] '" + rollName + "' үшін ингредиенттер тексерілуде...");
        return true;
    }

    public void deductIngredients(String rollName) {
        System.out.println("[Қойма] Ингредиенттер қоймадан шегерілді.");
    }
}