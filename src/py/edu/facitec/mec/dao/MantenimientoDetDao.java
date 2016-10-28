/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.MantenimientoDetalle;

/**
 *
 * @author Rosalino Cabral
 */
public interface MantenimientoDetDao {
    void guardar(MantenimientoDetalle mantDet);
    boolean modificar(MantenimientoDetalle mantDet);
    MantenimientoDetalle recuperarPorCodigo(int codigo); 
    void eliminar(int codigo);
    List<MantenimientoDetalle> recuperarPorFiltro(int codigo);    
}
