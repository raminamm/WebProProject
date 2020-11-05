package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-03T15:47:37")
=======
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-04T18:33:36")
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