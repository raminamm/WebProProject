package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.entity.OrderDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-10-28T20:09:19")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile ListAttribute<Orders, OrderDetail> orderDetailList;
    public static volatile SingularAttribute<Orders, Long> amount;
    public static volatile SingularAttribute<Orders, Integer> orderId;
    public static volatile SingularAttribute<Orders, Date> created;
    public static volatile SingularAttribute<Orders, Customers> email;

}