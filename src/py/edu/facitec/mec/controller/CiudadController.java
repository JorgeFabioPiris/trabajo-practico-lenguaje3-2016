/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.Vector;
import py.edu.facitec.mec.model.Ciudad;

/**
 *
 * @author Jorge Fabio
 */
public interface CiudadController {
    void registrar(Ciudad ciudad);
    boolean modificar(Ciudad ciudad);
    Ciudad buscarCiudadPorCodigo(int codigo);
    Vector<Ciudad> cargarComboBox();
    void eliminar(int codigo);
}
