package service;
import model.Product;
import model.User;

import java.util.UUID;
public class ProductService {
    public Product[] productList;
    public int index = 0;
    public ProductService(int size) {
        this.productList = new Product[size];
    }
    public boolean addProduct(String name, Double amount, int quantity) {
        Product product1 = new Product(name, amount, quantity);
        this.productList[index++] = product1;
        return true;
    }
    public boolean deleteProduct(UUID id) {
        int index = 0;
        for (Product p : productList) {
            if (p != null) {
                if (p.id.equals(id)) {
                    productList[index] = null;
                    return true;
                }
            }
            index++;
        }
        return false;
    }
    public Product getProductName(UUID productId){
        for (Product product: productList) {
            if (product != null){
                if(product.id.equals(productId)){
                    return product;
                }
            }
        }
        return null;
    }
    public UUID getProductId(String name){
        for (Product product: productList) {
            if (product != null){
                if (product.name.equals(name)){
                    return product.id;
                }
            }
        }
        return null;
    }
}