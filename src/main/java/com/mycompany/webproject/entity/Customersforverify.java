/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author glajaja
 */
@Entity
@Table(name = "customersforverify")
@NamedQueries({
    @NamedQuery(name = "Customersforverify.findAll", query = "SELECT c FROM Customersforverify c"),
    @NamedQuery(name = "Customersforverify.findByEmail", query = "SELECT c FROM Customersforverify c WHERE c.email = :email"),
    @NamedQuery(name = "Customersforverify.findByFirstname", query = "SELECT c FROM Customersforverify c WHERE c.firstname = :firstname"),
    @NamedQuery(name = "Customersforverify.findByLastname", query = "SELECT c FROM Customersforverify c WHERE c.lastname = :lastname"),
    @NamedQuery(name = "Customersforverify.findByPhoneNo", query = "SELECT c FROM Customersforverify c WHERE c.phoneNo = :phoneNo"),
    @NamedQuery(name = "Customersforverify.findByDateOfBirth", query = "SELECT c FROM Customersforverify c WHERE c.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "Customersforverify.findBySex", query = "SELECT c FROM Customersforverify c WHERE c.sex = :sex"),
    @NamedQuery(name = "Customersforverify.findByPassword", query = "SELECT c FROM Customersforverify c WHERE c.password = :password"),
    @NamedQuery(name = "Customersforverify.findByAddress", query = "SELECT c FROM Customersforverify c WHERE c.address = :address"),
    @NamedQuery(name = "Customersforverify.findByVerifykey", query = "SELECT c FROM Customersforverify c WHERE c.verifykey = :verifykey")})
public class Customersforverify implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Size(max = 10)
    @Column(name = "sex")
    private String sex;
    @Size(max = 100)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "verifykey")
    private String verifykey;

    public Customersforverify() {
    }

    public Customersforverify(String email) {
        this.email = email;
    }

    public Customersforverify(String email, String firstname, String lastname, String phoneNo, String address, String verifykey) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNo = phoneNo;
        this.address = address;
        this.verifykey = verifykey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVerifykey() {
        return verifykey;
    }

    public void setVerifykey(String verifykey) {
        this.verifykey = verifykey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customersforverify)) {
            return false;
        }
        Customersforverify other = (Customersforverify) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webproject.entity.Customersforverify[ email=" + email + " ]";
    }
    
}
