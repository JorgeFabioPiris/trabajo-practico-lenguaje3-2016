/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.Date;
import java.util.List;
import py.edu.facitec.mec.model.Mantenimiento;

/**
 *
 * @author Jorge Fabio
 */
public interface MantenimientoController {
    void registrar(Mantenimiento mantenimiento);
    Mantenimiento recuperarPorCodigo(int codigo);
    void anular(int codigo);
    int obtenerMaximo();
    public List<Mantenimiento> reporteMantenimiento(String fecha1, String fecha2, int cod1, int cod2, String orden);
}
