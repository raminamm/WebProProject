/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Admin
 */
@Embeddable
public class OrderDetailPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "orders_order_id")
    private int ordersOrderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "product_id")
    private String productId;

    public OrderDetailPK() {
    }

    public OrderDetailPK(int ordersOrderId, String productId) {
        this.ordersOrderId = ordersOrderId;
        this.productId = productId;
    }

    public int getOrdersOrderId() {
        return ordersOrderId;
    }

    public void setOrdersOrderId(int ordersOrderId) {
        this.ordersOrderId = ordersOrderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ordersOrderId;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetailPK)) {
            return false;
        }
        OrderDetailPK other = (OrderDetailPK) object;
        if (this.ordersOrderId != other.ordersOrderId) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webproject.entity.OrderDetailPK[ ordersOrderId=" + ordersOrderId + ", productId=" + productId + " ]";
    }
    
}
