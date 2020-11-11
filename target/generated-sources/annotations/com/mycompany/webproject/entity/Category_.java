package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-11T00:06:03")
=======
@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-10T23:13:16")
>>>>>>> Stashed changes
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> textDescription;
    public static volatile SingularAttribute<Category, String> category;
    public static volatile ListAttribute<Category, Product> productList;

}