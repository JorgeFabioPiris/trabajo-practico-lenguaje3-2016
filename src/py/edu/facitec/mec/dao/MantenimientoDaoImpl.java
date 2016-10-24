/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Mantenimiento;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author Jorge Fabio
 */
public class MantenimientoDaoImpl implements MantenimientoDao{
    
    @Override
    public void guardar(Mantenimiento mant){
        String sql = "INSERT INTO public.mantenimiento"
                + "(fecha, cliente_codigo, condicion, importe_total, observacion, situacion) "
                + "VALUES ('"+mant.getFecha()+"', "+mant.getCliente_codigo()+", '"+mant.getCondicion()+"',"
                + " "+mant.getImporte_total()+", '"+mant.getObservacion()+"', '"+mant.getSituacion()+"');";
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(MantenimientoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        //cerrar conexion
        ConexionManager.desconectar();
    }

    @Override
    public Mantenimiento recuperarPorCodigo(int codigo) {
        
        String sql = "SELECT fecha, cliente_codigo, condicion, importe_total, observacion, situacion "
                + "FROM public.mantenimiento "
                + "WHERE codigo="+codigo+";";
        
        //abrir una conexion
        ConexionManager.conectar();
        
        Mantenimiento mant = null;
        
        ResultSet rs;
        
        try {
            //ejecutar sql
            
            rs = ConexionManager.st.executeQuery(sql);
            System.out.println("Ejecutando: "+sql);
            
            if (rs.next()) {
                mant = new Mantenimiento();
                mant.setFecha(rs.getDate("fecha"));
                mant.setCliente_codigo(rs.getInt("cliente_codigo"));
                mant.setCondicion(rs.getString("condicion"));
                mant.setImporte_total(rs.getDouble("importe_total"));
                mant.setObservacion(rs.getString("observacion"));
                mant.setSituacion(rs.getString("situacion"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar SQL: "+ex);

        }
        //cerrar conexion
        ConexionManager.desconectar();
        return mant;
    }

    @Override
    public void anular(int codigo) {
        String sql = "UPDATE public.mantenimiento SET situacion='Anulado' WHERE codigo="+codigo+";";
        
        System.out.println("SQL = "+sql);
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(MantenimientoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        //cerrar conexion
        ConexionManager.desconectar();
    }
    
    @Override
    public int obtenerMaximo() {
        int max = 0;
        String sql = "SELECT MAX (codigo) as codigo FROM public.mantenimiento";
        ConexionManager.conectar();
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            if (rs.next()) {
                max = rs.getInt("codigo");
            }
            System.out.println("Ejecutando: "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDetDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ex);
        }
        
        
        return max+1;
    }

}