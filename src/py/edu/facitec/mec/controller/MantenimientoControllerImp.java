/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

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
    public boolean modificar(Mantenimiento mant) {
        return mantDao.modificar(mant);
    }

    @Override
    public void eliminar(int codigo) {
        mantDao.eliminar(codigo);
    }

    @Override
    public int obtenerMaximo() {
        return mantDao.obtenerMaximo();
    }

}
