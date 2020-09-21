/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "product_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductDetail.findAll", query = "SELECT p FROM ProductDetail p"),
    @NamedQuery(name = "ProductDetail.findByProductDetailId", query = "SELECT p FROM ProductDetail p WHERE p.productDetailId = :productDetailId"),
    @NamedQuery(name = "ProductDetail.findByColour", query = "SELECT p FROM ProductDetail p WHERE p.colour = :colour"),
    @NamedQuery(name = "ProductDetail.findBySize", query = "SELECT p FROM ProductDetail p WHERE p.size = :size"),
    @NamedQuery(name = "ProductDetail.findByQuantity", query = "SELECT p FROM ProductDetail p WHERE p.quantity = :quantity")})
public class ProductDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "product_detail_id")
    private String productDetailId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "colour")
    private String colour;
    @Size(max = 10)
    @Column(name = "size")
    private String size;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne(optional = false)
    private Product productId;

    public ProductDetail() {
    }

    public ProductDetail(String productDetailId) {
        this.productDetailId = productDetailId;
    }

    public ProductDetail(String productDetailId, String colour, int quantity) {
        this.productDetailId = productDetailId;
        this.colour = colour;
        this.quantity = quantity;
    }

    public String getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(String productDetailId) {
        this.productDetailId = productDetailId;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productDetailId != null ? productDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDetail)) {
            return false;
        }
        ProductDetail other = (ProductDetail) object;
        if ((this.productDetailId == null && other.productDetailId != null) || (this.productDetailId != null && !this.productDetailId.equals(other.productDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webproject.entity.ProductDetail[ productDetailId=" + productDetailId + " ]";
    }
    
}
