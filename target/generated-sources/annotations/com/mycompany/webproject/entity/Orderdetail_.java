package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Orders;
import com.mycompany.webproject.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-12T17:33:35")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-12T00:15:33")
>>>>>>> master
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, String> orderdetailid;
    public static volatile SingularAttribute<Orderdetail, Integer> quantity;
    public static volatile SingularAttribute<Orderdetail, String> size;
    public static volatile SingularAttribute<Orderdetail, Product> productId;
    public static volatile SingularAttribute<Orderdetail, Orders> orderid;
    public static volatile SingularAttribute<Orderdetail, Integer> price;

}