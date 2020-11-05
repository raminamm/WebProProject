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

/**
 *
 * @author glajaja
 */
@Entity
@Table(name = "productsize")
@NamedQueries({
    @NamedQuery(name = "Productsize.findAll", query = "SELECT p FROM Productsize p"),
    @NamedQuery(name = "Productsize.findBySizeid", query = "SELECT p FROM Productsize p WHERE p.sizeid = :sizeid"),
    @NamedQuery(name = "Productsize.findBySize", query = "SELECT p FROM Productsize p WHERE p.size = :size")})
public class Productsize implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sizeid")
    private String sizeid;
    @Size(max = 255)
    @Column(name = "size")
    private String size;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne
    private Product productId;

    public Productsize() {
    }

    public Productsize(String sizeid) {
        this.sizeid = sizeid;
    }

    public String getSizeid() {
        return sizeid;
    }

    public void setSizeid(String sizeid) {
        this.sizeid = sizeid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        hash += (sizeid != null ? sizeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productsize)) {
            return false;
        }
        Productsize other = (Productsize) object;
        if ((this.sizeid == null && other.sizeid != null) || (this.sizeid != null && !this.sizeid.equals(other.sizeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webproject.entity.Productsize[ sizeid=" + sizeid + " ]";
    }
    
}
