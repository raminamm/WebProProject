package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Orders;
import com.mycompany.webproject.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-08T21:30:55")
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, String> orderdetailid;
    public static volatile SingularAttribute<Orderdetail, Integer> quantity;
    public static volatile SingularAttribute<Orderdetail, Product> productId;
    public static volatile SingularAttribute<Orderdetail, Orders> orderid;
    public static volatile SingularAttribute<Orderdetail, Integer> price;

}