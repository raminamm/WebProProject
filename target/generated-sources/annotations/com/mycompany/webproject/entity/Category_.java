package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-15T16:33:13")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> textDescription;
    public static volatile SingularAttribute<Category, String> category;
    public static volatile ListAttribute<Category, Product> productList;

}