package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.OrderDetailPK;
import com.mycompany.webproject.entity.Orders;
import com.mycompany.webproject.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-10-26T14:59:18")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Product> product;
    public static volatile SingularAttribute<OrderDetail, Integer> quantity;
    public static volatile SingularAttribute<OrderDetail, Orders> orders;
    public static volatile SingularAttribute<OrderDetail, OrderDetailPK> orderDetailPK;

}