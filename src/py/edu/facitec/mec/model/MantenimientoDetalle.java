/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

/**
 *
 * @author Rosalino Cabral
 */
public class MantenimientoDetalle {
    private int codigo;
    private int mant_codigo;
    private int serv_codigo;
    private Double cantidad;
    private Double precio;
    private Double subtotal;

    public MantenimientoDetalle() {
        this.codigo = 0;
        this.mant_codigo = 0;
        this.serv_codigo = 0;
        this.cantidad = 0d;
        this.precio = 0d;
        this.subtotal = 0d;
    }

    public MantenimientoDetalle(int mant_codigo, int serv_codigo, Double cantidad, Double precio, Double subtotal) {
        this.mant_codigo = mant_codigo;
        this.serv_codigo = serv_codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public MantenimientoDetalle(int codigo, int mant_codigo, int serv_codigo, Double cantidad, Double precio, Double subtotal) {
        this.codigo = codigo;
        this.mant_codigo = mant_codigo;
        this.serv_codigo = serv_codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMant_codigo() {
        return mant_codigo;
    }

    public void setMant_codigo(int mant_codigo) {
        this.mant_codigo = mant_codigo;
    }

    public int getServ_codigo() {
        return serv_codigo;
    }

    public void setServ_codigo(int serv_codigo) {
        this.serv_codigo = serv_codigo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
}
