/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.util;

import java.util.List;
import py.edu.facitec.mec.controller.ServiciosController;
import py.edu.facitec.mec.controller.ServiciosControllerImp;
import py.edu.facitec.mec.dao.MantenimientoDao;
import py.edu.facitec.mec.dao.MantenimientoDaoImpl;
import py.edu.facitec.mec.dao.MantenimientoDetDao;
import py.edu.facitec.mec.dao.MantenimientoDetDaoImp;
import py.edu.facitec.mec.model.Mantenimiento;
import py.edu.facitec.mec.model.MantenimientoDetalle;
import py.edu.facitec.mec.model.Servicio;
import static py.edu.facitec.mec.view.mov.FormMovimiento.tfCodClie;

/**
 *
 * @author Jorge Fabio
 */
public class ConexionManagerTest {
    
    public static void main(String[] args) {
        
        MantenimientoDao cabecera = new MantenimientoDaoImpl();
        
        int mov = 1;
        Mantenimiento mant = cabecera.recuperarPorCodigo(mov);
        
        System.out.println(
                mant.getFecha()+", "+
                mant.getCliente_codigo()+", "+
                mant.getCondicion()+", "+
                mant.getImporte_total()+", "+
                mant.getObservacion()+", "+
                mant.getSituacion()
        );
        
        MantenimientoDetDao detalle = new MantenimientoDetDaoImp();
        ServiciosController serController = new ServiciosControllerImp();
        
        
        List<MantenimientoDetalle> mantDet = detalle.recuperarPorFiltro(mov);
        
        for (int i = 0; i < mantDet.size(); i++) {
        Servicio ser = serController.recuperarPorCodigo(mantDet.get(i).getServ_codigo());
        System.out.println(
                mantDet.get(i).getServ_codigo()+", "+
                ser.getNombre()+", "+
                mantDet.get(i).getCantidad()+", "+
                mantDet.get(i).getPrecio()+", "+
                mantDet.get(i).getSubtotal()
        );
            
        }
        
        
//        Object [] fila = new Object[5];
//
//        fila[0]=mantDet.getServ_codigo();
//        fila[1]=mantDet.getServ_codigo();
////        fila[1]=ser.getNombre();
//        fila[2]=mantDet.getCantidad();
//        fila[3]=mantDet.getPrecio();
//        Double can, uni, subtot;
//        can = Double.parseDouble(servCantidad.getText());
//        uni = Double.parseDouble(servUnitario.getText());
//        subtot = can*uni;
//        fila[4]=subtot;
//        
//        modelo.addRow(fila);
//
//        jTable1.setModel(modelo);
        
    }
    
}
