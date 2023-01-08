import service.DebtService;
import service.ProductService;
import service.UserService;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        UserService userService = new UserService(10);
        ProductService productService = new ProductService(10);
        DebtService debtService = new DebtService(10);

        int stepCode = 100;
        while (stepCode != 0) {
            System.out.println("1. Add User, 2. Add Product, 3. Add Debt, 4. Get Debt List, 0.Exit");
            stepCode = scannerInt.nextInt();
            switch (stepCode) {
                case 1 -> {
                    System.out.print("enter name: ");
                    System.out.println(userService.addUser(scannerStr.nextLine()));
                }
                case 2 -> {
                    System.out.print("enter p name: ");
                    String name = scannerStr.nextLine();
                    System.out.print("enter p quantity: ");
                    int quantity = scannerInt.nextInt();
                    System.out.print("enter p amount: ");
                    double amount = scannerInt.nextDouble();
                    System.out.println(productService.addProduct(name, amount, quantity));
                }
                case 3 -> {

                    System.out.print("enter debt user : ");
                    UUID userId = userService.getUserId(scannerStr.nextLine());
                    System.out.print("enter debt product : ");
                    UUID productId = productService.getProductId(scannerStr.nextLine());
                    System.out.print("enter quantity : ");
                    int quantity = scannerInt.nextInt();
                    System.out.println(debtService.addDebt(userId, productId, quantity));
                }

                case 4 -> {
                    debtService.getDebtList(productService,userService);
                }
            }
        }

    }
}