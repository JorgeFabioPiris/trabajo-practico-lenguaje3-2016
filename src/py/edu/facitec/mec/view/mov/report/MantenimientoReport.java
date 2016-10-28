/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.view.mov.report;

/**
 *
 * @author Jorge Fabio
 */
public class MantenimientoReport {
    private String movimiento;
    private String fecha;
    private String codigo;
    private String nombres;
    private String total;
    private String condicion;

    public MantenimientoReport(String movimiento, String fecha, String codigo, String nombres, String total, String condicion) {
        this.movimiento = movimiento;
        this.fecha = fecha;
        this.codigo = codigo;
        this.nombres = nombres;
        this.total = total;
        this.condicion = condicion;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
    

}
