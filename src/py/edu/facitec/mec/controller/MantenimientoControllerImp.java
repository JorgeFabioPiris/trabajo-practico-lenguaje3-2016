/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.Date;
import java.util.List;
import py.edu.facitec.mec.dao.MantenimientoDao;
import py.edu.facitec.mec.dao.MantenimientoDaoImpl;
import py.edu.facitec.mec.model.Mantenimiento;

/**
 *
 * @author Jorge Fabio
 */
public class MantenimientoControllerImp implements MantenimientoController{

    private MantenimientoDao mantDao;

    public MantenimientoControllerImp() {
        this.mantDao = new MantenimientoDaoImpl();
    
    }
    
    @Override
    public void registrar(Mantenimiento mant) {
        mantDao.guardar(mant);
    }

    @Override
    public Mantenimiento recuperarPorCodigo(int codigo) {
        return mantDao.recuperarPorCodigo(codigo);
    }

    @Override
    public void anular(int codigo) {
        mantDao.anular(codigo);
    }

    @Override
    public int obtenerMaximo() {
        return mantDao.obtenerMaximo();
    }

    @Override
    public List<Mantenimiento> reporteMantenimiento(String fecha1, String fecha2, int cod1, int cod2, String orden) {
        return mantDao.reporteMantenimiento(fecha1, fecha2, cod1, cod2, orden);
    }

}
