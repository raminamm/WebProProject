package com.mycompany.webproject.entity;

import com.mycompany.webproject.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-10-21T17:29:12")
@StaticMetamodel(ProductDetail.class)
public class ProductDetail_ { 

    public static volatile SingularAttribute<ProductDetail, String> colour;
    public static volatile SingularAttribute<ProductDetail, Integer> quantity;
    public static volatile SingularAttribute<ProductDetail, String> size;
    public static volatile SingularAttribute<ProductDetail, Product> productId;
    public static volatile SingularAttribute<ProductDetail, String> productDetailId;

}