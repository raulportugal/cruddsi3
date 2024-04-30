package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class cCustomer {
@Column(name = "id_customer")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idCustomer;
@Column(name = "dni_ruc", length = 11)
private String dniRuc;
@Column(name = "razon_social", length = 200)
private String razonSocial;
@Column(name = "direccion", length = 250)
private String direccion;
@Column(name = "telefono", length = 11)
private String telefono;

public cCustomer() {
}

public cCustomer(int idCustomer, String dniRuc, String razonSocial, String direccion, String telefono) {
    this.idCustomer = idCustomer;
    this.dniRuc = dniRuc;
    this.razonSocial = razonSocial;
    this.direccion = direccion;
    this.telefono = telefono;
}

public cCustomer(String dniRuc, String razonSocial, String direccion, String telefono) {
    this.dniRuc = dniRuc;
    this.razonSocial = razonSocial;
    this.direccion = direccion;
    this.telefono = telefono;
}

public int getIdCustomer() {
    return idCustomer;
}

public void setIdCustomer(int idCustomer) {
    this.idCustomer = idCustomer;
}

public String getDniRuc() {
    return dniRuc;
}

public void setDniRuc(String dniRuc) {
    this.dniRuc = dniRuc;
}

public String getRazonSocial() {
    return razonSocial;
}

public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}



}
