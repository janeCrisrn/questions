package br.ufrn.ceres.bsi.questions.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Endereco extends BaseEntity implements Serializable {
 
 private static final long serialVersionUID = 1L;

 @Column(length = 50)
 private String city;
 
 @Column(length = 50)
 private String country;
 
 @Column(length = 50)
 private String street;
 
 @Column(length = 50)
 private String suburb;
    
 public Endereco(){
  
 }

 public String getCity() {
  return city;
 }

 
 public void setCity(String city) {
  this.city = city;
 }

 public String getCountry() {
  return country;
 }


 public void setCountry(String country) {
  this.country = country;
 }

 public String getStreet() {
  return street;
 }


 public void setStreet(String street) {
  this.street = street;
 }

 
 public String getSuburb() {
  return suburb;
 }


 public void setSuburb(String suburb) {
  this.suburb = suburb;
 }
 }