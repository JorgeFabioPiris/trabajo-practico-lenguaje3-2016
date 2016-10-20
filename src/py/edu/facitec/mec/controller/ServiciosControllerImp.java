/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ServiciosDao;
import py.edu.facitec.mec.dao.ServiciosDaoImp;
import py.edu.facitec.mec.model.Servicios;

/**
 *
 * @author Jorge Fabio
 */
public class ServiciosControllerImp implements ServiciosController{
    
    ServiciosDao servDao = new ServiciosDaoImp();

    @Override
    public void insertar(Servicios serv) {
        servDao.insertar(serv);
    }

    @Override
    public void modificar(Servicios serv) {
        servDao.modificar(serv);
    }

    @Override
    public Servicios recuperarPorCodigo(int codigo) {
        return servDao.recuperarPorCodigo(codigo);
    }

    @Override
    public List<Servicios> recuperarPorFiltro(String filtro) {
        return servDao.recuperarPorFiltro(filtro);
    }

    @Override
    public void eliminar(int codigo) {
        servDao.eliminar(codigo);
    }
}
