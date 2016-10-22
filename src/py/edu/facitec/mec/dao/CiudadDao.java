/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import java.util.Vector;
import py.edu.facitec.mec.model.Ciudad;

/**
 *
 * @author Jorge Fabio
 */
public interface CiudadDao {
    void guardar(Ciudad ciudad);
    boolean modificar(Ciudad ciudad);
    Ciudad recuperarPorCodigo(int codigo); 
    Vector<Ciudad>cargarComboBox();
    List<Ciudad>recuperarPorFiltro(String filtro);
    void eliminar(int codigo);
    
}
