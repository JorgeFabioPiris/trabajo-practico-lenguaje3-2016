/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Jorge Fabio
 */
public interface ClienteController {
    void registrar(Cliente cliente);
    boolean modificar(Cliente cliente);
    Cliente recuperarPorCodigo(int codigo);
    List<Cliente> recuperarPorFiltro(String busqueda);
    void eliminarCliente(int codigo);
}
