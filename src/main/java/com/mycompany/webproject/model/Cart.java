/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.model;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author glajaja
 */
public class Cart {
    private Map<String, LineItem> map ;
    
    public Cart() {
        map = new HashMap(32);
    }
    
    public void add(String cartid, Product product,String size,Category category) {
        add(cartid, product, 1, size,category);
    }
    
    public void add(String cartid, Product product, int quantity, String size,Category category) {
        LineItem item = map.get(cartid);
        if (item == null) {
            map.put(cartid, 
                    new LineItem(cartid, product, quantity, size, product.getPrice(),category));
        } else {
            item.setQuantity(item.getQuantity()+quantity);
        }
    }
    public void update(String cartid,int update){
        LineItem item = map.get(cartid);
        item.setQuantity(update);
    }
    
//    public void remove(Product product) {
//        remove(product.getProductId());
//    }
    
    public void remove(String cartid) {
        map.remove(cartid);
    }
    
    public int getItemCount() {
        return map.size();
    }
    
    public List<LineItem> getItems() {
        List<LineItem> lineItems = new ArrayList(map.values());
        return Collections.unmodifiableList(lineItems);
    }
    
    public double getTotalPrice() {
        double total = 0;
        for (LineItem lineItem : map.values()) {
            total = total + lineItem.getTotalPrice();
        }
        return total ;
    }
    
    public double getTotalWithpayment(){
        double total = getTotalPrice()+50.00;
        return total;
    }

    
    public double getTotalWithDiscount(double discount){
        double total = getTotalWithpayment()-discount;
        return total;
    }
    
    @Override
    public String toString() {
        return "Cart{" + "map=" + map + '}';
    }
    
    
    
    public static class LineItem {
        private String cartid;
        private Product product ;
        private int quantity ;
        private String size;
        private double price;
        private Category category;

        public LineItem(String cartid, Product product, double price, String size,Category category) {
            this(cartid, product, 1, size, price,category);
        }
        
        public LineItem(String cartid, Product product, int quantity, String size, double price,Category category) {
            this.cartid = cartid;
            this.product = product;
            this.quantity = quantity;
            this.size = size;
            this.price = price;
            this.category = category;
        }
        public double getTotalPrice() {   // EL ${pl.totalPrice}
            return quantity * price;
        }
        
        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getCartid() {
            return cartid;
        }

        public void setCartid(String cartid) {
            this.cartid = cartid;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        @Override
        public String toString() {
            return "LineItem{" + "cartid=" + cartid + ", product=" + product + ", quantity=" + quantity + ", size=" + size + ", price=" + price + ", category=" + category + '}';
        }
        
        

    }
}


