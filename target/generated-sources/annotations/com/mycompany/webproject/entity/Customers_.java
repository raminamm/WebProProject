package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Orders;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-03T15:47:37")
=======
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-04T18:33:36")
>>>>>>> Stashed changes
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> firstname;
    public static volatile SingularAttribute<Customers, String> password;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, String> sex;
    public static volatile SingularAttribute<Customers, Date> dateOfBirth;
    public static volatile SingularAttribute<Customers, String> email;
    public static volatile SingularAttribute<Customers, String> phoneNo;
    public static volatile ListAttribute<Customers, Orders> ordersList;
    public static volatile SingularAttribute<Customers, String> lastname;

}