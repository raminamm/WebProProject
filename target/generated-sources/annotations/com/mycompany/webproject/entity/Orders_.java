package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Customers;
import com.mycompany.webproject.entity.Discount;
import com.mycompany.webproject.entity.Orderdetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-15T16:33:13")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Long> amount;
    public static volatile SingularAttribute<Orders, String> address;
    public static volatile SingularAttribute<Orders, String> orderid;
    public static volatile SingularAttribute<Orders, Date> created;
    public static volatile ListAttribute<Orders, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Orders, Discount> discountId;
    public static volatile SingularAttribute<Orders, Customers> email;

}