package model;

import java.util.UUID;

public class User {
    public UUID id;
    public String name;
//    public double amount;
//    public int quantity;

     public User(){
         this.id=UUID.randomUUID();
     }
    public User(String name){
         this();
         this.name=name;
    }


//    @Override
////    public String toString() {
////        return "User{" +
////                "id=" + id +
////                ", name='" + name + '\'' +
////                ", amount=" + amount +
////                ", quantity=" + quantity +
////                '}';
////    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
