package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Orders;
import com.mycompany.webproject.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-11T00:06:03")
=======
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-10T23:13:16")
>>>>>>> Stashed changes
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, String> orderdetailid;
    public static volatile SingularAttribute<Orderdetail, Integer> quantity;
    public static volatile SingularAttribute<Orderdetail, String> size;
    public static volatile SingularAttribute<Orderdetail, Product> productId;
    public static volatile SingularAttribute<Orderdetail, Orders> orderid;
    public static volatile SingularAttribute<Orderdetail, Integer> price;

}