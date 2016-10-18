/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import java.util.Vector;
import py.edu.facitec.mec.dao.CiudadDao;
import py.edu.facitec.mec.dao.CiudadDaoImp;
import py.edu.facitec.mec.model.Ciudad;

/**
 *
 * @author Jorge Fabio
 */
public class CiudadControllerImp implements CiudadController{

    private CiudadDao ciudadDao;

    public CiudadControllerImp() {
        this.ciudadDao = new CiudadDaoImp();
    
    }
    
    @Override
    public void registrar(Ciudad ciudad) {
        ciudadDao.guardar(ciudad);
    }

    @Override
    public Ciudad buscarCiudadPorCodigo(int codigo) {
        return ciudadDao.buscartCiudadPorCodigo(codigo);
    }

    @Override
    public boolean modificar(Ciudad ciudad) {
        return ciudadDao.modificar(ciudad);
    }

    @Override
    public void eliminar(int codigo) {
        ciudadDao.eliminar(codigo);
    }

    @Override
    public Vector<Ciudad> cargarComboBox() {
        return ciudadDao.cargarComboBox();
    }
}
