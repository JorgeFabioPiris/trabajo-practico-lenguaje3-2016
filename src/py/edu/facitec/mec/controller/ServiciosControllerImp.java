/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ServicioDaoImp;
import py.edu.facitec.mec.model.Servicio;
import py.edu.facitec.mec.dao.ServicioDao;

/**
 *
 * @author Jorge Fabio
 */
public class ServiciosControllerImp implements ServiciosController{
    
    ServicioDao servDao = new ServicioDaoImp();

    @Override
    public void insertar(Servicio serv) {
        servDao.insertar(serv);
    }

    @Override
    public void modificar(Servicio serv) {
        servDao.modificar(serv);
    }

    @Override
    public Servicio recuperarPorCodigo(int codigo) {
        return servDao.recuperarPorCodigo(codigo);
    }

    @Override
    public List<Servicio> recuperarPorFiltro(String filtro) {
        return servDao.recuperarPorFiltro(filtro);
    }

    @Override
    public void eliminar(int codigo) {
        servDao.eliminar(codigo);
    }
}
