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
public class Servicio {
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private Double valor_unitario;
    private boolean estado;

    public Servicio() {
        this.codigo = 0;
        this.nombre = "";
        this.descripcion = "";
        this.valor_unitario = 0d;
        this.estado = false;
    }

    public Servicio(String nombre, String descripcion, Double valor_unitario, boolean estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor_unitario = valor_unitario;
        this.estado = estado;
    }

    public Servicio(int codigo, String nombre, String descripcion, Double valor_unitario, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor_unitario = valor_unitario;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
