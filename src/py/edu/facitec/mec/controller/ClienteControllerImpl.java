/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ClienteDao;
import py.edu.facitec.mec.dao.ClienteDaoImpl;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Jorge Fabio
 */
public class ClienteControllerImpl implements ClienteController{

    private ClienteDao clienteDao;

    public ClienteControllerImpl() {
        this.clienteDao = new ClienteDaoImpl();
    
    }
    
    @Override
    public void registrar(Cliente cliente) {
        clienteDao.guardar(cliente);
    }

    @Override
    public boolean modificar(Cliente cliente) {
        return clienteDao.modificar(cliente);
    }

    @Override
    public Cliente recuperarPorCodigo(int codigo) {
        return clienteDao.recuperarPorCodigo(codigo);
    }

    @Override
    public List<Cliente> recuperarPorFiltro(String busqueda) {
        return clienteDao.recuperarPorFiltro(busqueda);
    }

    @Override
    public void eliminarCliente(int codigo) {
        clienteDao.eliminar(codigo);
    }
}
