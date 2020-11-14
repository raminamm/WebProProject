package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Category;
import com.mycompany.webproject.entity.Orderdetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-12T17:57:54")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-12T21:56:28")
>>>>>>> master
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-14T12:58:19")
>>>>>>> Stashed changes
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> productId;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile ListAttribute<Product, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile SingularAttribute<Product, String> productDescription;

}