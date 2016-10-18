/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Jorge Fabio
 */
public interface ClienteDao {
    void guardar(Cliente cliente);
    boolean modificar(Cliente cliente);
    Cliente buscarPorCodigo(int codigo);
    List<Cliente> buscarPorFiltro(String filtro);
    void eliminar(int codigo);
}
