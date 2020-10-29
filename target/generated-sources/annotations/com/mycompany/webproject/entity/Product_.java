package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2563-10-29T16:41:53")
=======
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-10-29T20:59:05")
>>>>>>> Stashed changes
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> productId;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile SingularAttribute<Product, String> productDescription;
    public static volatile ListAttribute<Product, Orders> ordersList;

}