/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "order_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDetail.findAll", query = "SELECT o FROM OrderDetail o"),
    @NamedQuery(name = "OrderDetail.findByOrdersOrderId", query = "SELECT o FROM OrderDetail o WHERE o.orderDetailPK.ordersOrderId = :ordersOrderId"),
    @NamedQuery(name = "OrderDetail.findByProductId", query = "SELECT o FROM OrderDetail o WHERE o.orderDetailPK.productId = :productId"),
    @NamedQuery(name = "OrderDetail.findByQuantity", query = "SELECT o FROM OrderDetail o WHERE o.quantity = :quantity")})
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderDetailPK orderDetailPK;
    @Column(name = "quantity")
    private Integer quantity;
    @JoinColumn(name = "orders_order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Orders orders;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public OrderDetail(int ordersOrderId, String productId) {
        this.orderDetailPK = new OrderDetailPK(ordersOrderId, productId);
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderDetailPK != null ? orderDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetail)) {
            return false;
        }
        OrderDetail other = (OrderDetail) object;
        if ((this.orderDetailPK == null && other.orderDetailPK != null) || (this.orderDetailPK != null && !this.orderDetailPK.equals(other.orderDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webproject.entity.OrderDetail[ orderDetailPK=" + orderDetailPK + " ]";
    }
    
}
