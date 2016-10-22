/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.MantenimientoDetDao;
import py.edu.facitec.mec.model.MantenimientoDetalle;
import py.edu.facitec.mec.dao.MantenimientoDetDao;
import py.edu.facitec.mec.dao.MantenimientoDetDaoImp;

/**
 *
 * @author Jorge Fabio
 */
public class MantenimientoDetControllerImp implements MantenimientoDetController{

    private MantenimientoDetDao movimientoDetDao;

    public MantenimientoDetControllerImp() {
        this.movimientoDetDao = new MantenimientoDetDaoImp();
    
    }
    
    @Override
    public void registrar(MantenimientoDetalle mantDet) {
        movimientoDetDao.guardar(mantDet);
    }

    @Override
    public MantenimientoDetalle recuperarPorCodigo(int codigo) {
        return movimientoDetDao.recuperarPorCodigo(codigo);
    }

    @Override
    public boolean modificar(MantenimientoDetalle mantDet) {
        return movimientoDetDao.modificar(mantDet);
    }

    @Override
    public void eliminar(int codigo) {
        movimientoDetDao.eliminar(codigo);
    }

    @Override
    public List<MantenimientoDetalle> recuperarPorFiltro(int codigo) {
        return movimientoDetDao.recuperarPorFiltro(codigo);
    }


}
