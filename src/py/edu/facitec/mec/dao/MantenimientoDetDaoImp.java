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
import py.edu.facitec.mec.model.MantenimientoDetalle;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author Jorge Fabio
 */
public class MantenimientoDetDaoImp implements MantenimientoDetDao{
    
    @Override
    public void guardar(MantenimientoDetalle mantDet){
        String sql = "INSERT INTO public.mantenimiento_detalles"
                + "(mantemiento_codigo, servicio_codigo, cantidad, precio, subtotal) "
                + "VALUES ("+mantDet.getMant_codigo()+", "+mantDet.getServ_codigo()+", "+mantDet.getCantidad()+", "
                + ""+mantDet.getPrecio()+", "+mantDet.getSubtotal()+");";
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(MantenimientoDetalle.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        //cerrar conexion
        ConexionManager.desconectar();
    }

    @Override
    public boolean modificar(MantenimientoDetalle mantDet) {
        
        String sql = "UPDATE public.mantenimiento_detalles "
                + "SET mantemiento_codigo="+mantDet.getMant_codigo()+", servicio_codigo="+mantDet.getServ_codigo()+", "
                + "cantidad="+mantDet.getCantidad()+", precio="+mantDet.getPrecio()+", subtotal="+mantDet.getSubtotal()+" "
                + "WHERE codigo="+mantDet.getCodigo()+";";
        
        boolean resultado = false;
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            resultado = ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);
            
        } catch (SQLException ex) {
            
            Logger.getLogger(MantenimientoDetalle.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);
            
        }

        //cerrar conexion
        ConexionManager.desconectar();
        
        return resultado;

    }

    @Override
    public MantenimientoDetalle recuperarPorCodigo(int codigo) {
        
        String sql = "SELECT servicio_codigo, cantidad, precio, subtotal "
                + "FROM public.mantenimiento_detalles "
                + "WHERE mantemiento_codigo="+codigo+";";
        
        //abrir una conexion
        ConexionManager.conectar();
        
        MantenimientoDetalle mantDet = null;
        
        ResultSet rs;
        
        try {
            //ejecutar sql
            
            rs = ConexionManager.st.executeQuery(sql);
            System.out.println("Ejecutando: "+sql);
            
            if (rs.next()) {
                mantDet = new MantenimientoDetalle();
                mantDet.setServ_codigo(rs.getInt("servicio_codigo"));
                mantDet.setCantidad(rs.getDouble("cantidad"));
                mantDet.setPrecio(rs.getDouble("precio"));
                mantDet.setSubtotal(rs.getDouble("subtotal"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDetalle.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar SQL: "+ex);

        }
        //cerrar conexion
        ConexionManager.desconectar();
        return mantDet;
    }

    @Override
    public void eliminar(int codigo) {
        String sql = "DELETE FROM public.mantenimiento_detalles WHERE codigo = "+codigo+";";
        
        System.out.println("SQL = "+sql);
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(MantenimientoDetalle.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        //cerrar conexion
        ConexionManager.desconectar();
    }

    @Override
    public List<MantenimientoDetalle> recuperarPorFiltro(int codigo) {
        
        String sql = "SELECT servicio_codigo, cantidad, precio, subtotal "
                + "FROM public.mantenimiento_detalles "
                + "WHERE mantemiento_codigo="+codigo+";";
        
        //abrir una conexion
        ConexionManager.conectar();
        
        List<MantenimientoDetalle> lista = new ArrayList<>();
        
        MantenimientoDetalle mantDet = null;
        
        ResultSet rs;
        
        try {
            //ejecutar sql
            
            rs = ConexionManager.st.executeQuery(sql);
            System.out.println("Ejecutando: "+sql);
            
            while (rs.next()) {
                mantDet = new MantenimientoDetalle();
                mantDet.setServ_codigo(rs.getInt("servicio_codigo"));
                mantDet.setCantidad(rs.getDouble("cantidad"));
                mantDet.setPrecio(rs.getDouble("precio"));
                mantDet.setSubtotal(rs.getDouble("subtotal"));
                lista.add(mantDet);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDetalle.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar SQL: "+ex);

        }
        //cerrar conexion
        ConexionManager.desconectar();
        return lista;
    
    }

    

}