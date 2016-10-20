/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Servicios;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author Jorge Fabio
 */
public class ServiciosDaoImp implements ServiciosDao{
    
    private String sql;
    
    @Override
    public void insertar(Servicios serv) {
        
        sql = "INSERT INTO public.servicio"
                + "(nombre, descripcion, valor_unitario, estado) "
                + "VALUES ('"+serv.getNombre()+"', '"+serv.getDescripcion()+"', "
                + ""+serv.getValor_unitario()+", "+serv.isEstado()+");";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.st.execute(sql);
            System.out.println("SQL "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
    }

    @Override
    public void modificar(Servicios serv) {
        
        sql = "UPDATE public.servicio "
                + "SET nombre='"+serv.getNombre()+"', descripcion='"+serv.getDescripcion()+"', "
                + "valor_unitario="+serv.getValor_unitario()+", estado="+serv.isEstado()+" "
                + "WHERE codigo="+serv.getCodigo()+";";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.st.execute(sql);
            System.out.println("SQL "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
    }

    @Override
    public Servicios recuperarPorCodigo(int codigo) {
        
        sql = "SELECT nombre, descripcion, valor_unitario, estado "
                + "FROM public.servicio "
                + "WHERE codigo="+codigo+";";
        
        Servicios servicio = null;
        
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            System.out.println("SQL "+sql);
            
            if (rs.next()) {
                servicio = new Servicios();
                servicio.setNombre(rs.getString("nombre"));
                servicio.setDescripcion(rs.getString("descripcion"));
                servicio.setValor_unitario(rs.getDouble("valor_unitario"));
                servicio.setEstado(rs.getBoolean("estado"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
        return servicio;
    }

    @Override
    public List<Servicios> recuperarPorFiltro(String filtro) {
        
        List<Servicios> lista = new ArrayList<>();
        
        sql = "SELECT codigo, nombre, descripcion, valor_unitario, estado FROM public.servicio;";
        
        Servicios servicio = null;
        
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            System.out.println("SQL "+sql);
            
            while(rs.next()) {
                servicio = new Servicios();
                servicio.setCodigo(rs.getInt("codigo"));
                servicio.setNombre(rs.getString("nombre"));
                servicio.setDescripcion(rs.getString("descripcion"));
                servicio.setValor_unitario(rs.getDouble("valor_unitario"));
                servicio.setEstado(rs.getBoolean("estado"));
                lista.add(servicio);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
        return lista;
    }

    @Override
    public void eliminar(int codigo) {
        sql = "DELETE FROM public.servicio WHERE codigo="+codigo+";";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.st.execute(sql);
            System.out.println("SQL "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
    }
    
}
