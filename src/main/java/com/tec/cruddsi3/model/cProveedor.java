package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class cProveedor {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private int id_proveedor;
    
    @Column(name = "razon_social", length = 50)
    private String razon_social;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "telefono", length = 9)
    private String telefono;

    @Column(name = "departamento", length = 200)
    private String departamento;
    
    @Column(name = "vendedor", length = 200)
    private String vendedor;

    @Column(name = "telefono_vendedor", length = 9)
    private String telefono_vendedor;

    @Column(name = "dia_visita", length = 200)
    private String dia_visita;

    public cProveedor() {
    }

    public cProveedor(int id_proveedor, String razon_social, String direccion, String telefono, String departamento,
            String vendedor, String telefono_vendedor, String dia_visita) {
        this.id_proveedor = id_proveedor;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamento = departamento;
        this.vendedor = vendedor;
        this.telefono_vendedor = telefono_vendedor;
        this.dia_visita = dia_visita;
    }

    public cProveedor(String razon_social, String direccion, String telefono, String departamento, String vendedor,
            String telefono_vendedor, String dia_visita) {
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamento = departamento;
        this.vendedor = vendedor;
        this.telefono_vendedor = telefono_vendedor;
        this.dia_visita = dia_visita;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getTelefono_vendedor() {
        return telefono_vendedor;
    }

    public void setTelefono_vendedor(String telefono_vendedor) {
        this.telefono_vendedor = telefono_vendedor;
    }

    public String getDia_visita() {
        return dia_visita;
    }

    public void setDia_visita(String dia_visita) {
        this.dia_visita = dia_visita;
    }

    
    
}
