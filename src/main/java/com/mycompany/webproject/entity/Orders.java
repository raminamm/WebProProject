/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GLA-Notebook
 */
@Entity
@Table(name = "orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrderId", query = "SELECT o FROM Orders o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "Orders.findByCreated", query = "SELECT o FROM Orders o WHERE o.created = :created"),
    @NamedQuery(name = "Orders.findByAmount", query = "SELECT o FROM Orders o WHERE o.amount = :amount")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    @Temporal(TemporalType.DATE)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount")
    private long amount;
    @JoinColumn(name = "customers_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Customers customersId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orders")
    private Collection<OrderDetail> orderDetailCollection;

    public Orders() {
    }

    public Orders(Integer orderId) {
        this.orderId = orderId;
    }

    public Orders(Integer orderId, Date created, long amount) {
        this.orderId = orderId;
        this.created = created;
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Customers getCustomersId() {
        return customersId;
    }

    public void setCustomersId(Customers customersId) {
        this.customersId = customersId;
    }

    @XmlTransient
    public Collection<OrderDetail> getOrderDetailCollection() {
        return orderDetailCollection;
    }

    public void setOrderDetailCollection(Collection<OrderDetail> orderDetailCollection) {
        this.orderDetailCollection = orderDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webproject.entity.Orders[ orderId=" + orderId + " ]";
    }
    
}
