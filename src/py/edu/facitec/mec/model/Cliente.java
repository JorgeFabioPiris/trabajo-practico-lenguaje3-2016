/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

/**
 *
 * @author Jorge Fabio
 */
public class Cliente {
    
    //atriburos
    private int codigo;
    private String nombres;
    private String apellidos;
    private String direccion;
    
    private int ciudad_codigo;
    
    private String celular;
    private Double credito;
    private boolean estado;
    
    //constructores 
    public Cliente(){
        this.codigo = 0;
        this.nombres = "";
        this.apellidos = "";
        this.direccion = "";
        this.ciudad_codigo = 0;
        this.celular = "";
        this.credito = 0d;
        this.estado = false;
    }

    public Cliente(String nombres, String apellidos, String direccion, int ciudad_codigo, String celular, Double credito, boolean estado) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad_codigo = ciudad_codigo;
        this.celular = celular;
        this.credito = credito;
        this.estado = estado;
    }
    
    public Cliente(int codigo, String nombres, String apellidos, String direccion, int ciudad_codigo, String celular, Double credito, boolean estado) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad_codigo = ciudad_codigo;
        this.celular = celular;
        this.credito = credito;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCiudad_codigo() {
        return ciudad_codigo;
    }

    public void setCiudad_codigo(int ciudad_codigo) {
        this.ciudad_codigo = ciudad_codigo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
