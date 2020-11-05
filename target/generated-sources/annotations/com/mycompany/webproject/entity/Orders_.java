package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-03T15:47:37")
=======
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-04T18:33:36")
>>>>>>> Stashed changes
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Long> amount;
    public static volatile SingularAttribute<Orders, Integer> quantity;
    public static volatile SingularAttribute<Orders, Product> productId;
    public static volatile SingularAttribute<Orders, Integer> orderId;
    public static volatile SingularAttribute<Orders, Date> created;
    public static volatile SingularAttribute<Orders, Customers> email;

}