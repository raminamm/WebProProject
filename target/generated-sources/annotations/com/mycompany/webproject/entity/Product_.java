package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Orderdetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-10T14:06:23")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> productId;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile ListAttribute<Product, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile SingularAttribute<Product, String> productDescription;

}