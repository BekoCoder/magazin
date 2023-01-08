package service;

import model.Debt;
import model.Product;
import model.User;

import java.util.UUID;

public class DebtService {
    public Debt debts[];
    public int index = 0;

    public DebtService(int size) {
        this.debts = new Debt[size];
    }

    public boolean addDebt(UUID userId, UUID productId, int quantity) {
        Debt debt = new Debt(productId, userId, quantity);
        this.debts[index++] = debt;
        return true;
    }

    public void getDebtList(ProductService productService, UserService userService) {
        for (Debt debt : debts) {
            if (debt != null){
                Product product = productService.getProductName(debt.productId);
                User user = userService.getUserName(debt.userId);
                System.out.println("name = " + user.name);
                System.out.println("product name = " + product.name);
                System.out.println("quantity = " + debt.quantity);
                System.out.println("debt = " + product.amount * debt.quantity);
            }
        }
    }


}