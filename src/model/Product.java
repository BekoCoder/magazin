package model;

import java.util.UUID;

public class Product {
            public UUID id;
            public String name;
            public double amount;
            public int quantity;
            public  Product(){
                this.id=UUID.randomUUID();
            }
            public Product(String name, Double amount, int quantity){
                this();
                this.name=name;
                this.amount=amount;
                this.quantity=quantity;
            }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}
