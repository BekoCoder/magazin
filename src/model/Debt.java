package model;

import java.util.UUID;

public class Debt {
    public UUID productId;
    public UUID userId;
    public String date;
    public int quantity;

    public Debt(UUID productId, UUID userId, int quantity) {
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
        this.date= String.valueOf(System.currentTimeMillis());
    }
}
