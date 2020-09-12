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

/**
 *
 * @author GLA-Notebook
 */
@Embeddable
public class OrderDetailPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "orders_order_id")
    private int ordersOrderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_product_id")
    private int productProductId;

    public OrderDetailPK() {
    }

    public OrderDetailPK(int ordersOrderId, int productProductId) {
        this.ordersOrderId = ordersOrderId;
        this.productProductId = productProductId;
    }

    public int getOrdersOrderId() {
        return ordersOrderId;
    }

    public void setOrdersOrderId(int ordersOrderId) {
        this.ordersOrderId = ordersOrderId;
    }

    public int getProductProductId() {
        return productProductId;
    }

    public void setProductProductId(int productProductId) {
        this.productProductId = productProductId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ordersOrderId;
        hash += (int) productProductId;
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
        if (this.productProductId != other.productProductId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webproject.entity.OrderDetailPK[ ordersOrderId=" + ordersOrderId + ", productProductId=" + productProductId + " ]";
    }
    
}
