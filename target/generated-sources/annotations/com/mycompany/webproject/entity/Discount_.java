package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-10T14:06:23")
@StaticMetamodel(Discount.class)
public class Discount_ { 

    public static volatile SingularAttribute<Discount, Double> discount;
    public static volatile SingularAttribute<Discount, String> discountId;
    public static volatile ListAttribute<Discount, Orders> ordersList;

}