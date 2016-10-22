/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.util;

import py.edu.facitec.mec.dao.MantenimientoDao;
import py.edu.facitec.mec.dao.MantenimientoDaoImpl;
import py.edu.facitec.mec.dao.MantenimientoDetDao;
import py.edu.facitec.mec.dao.MantenimientoDetDaoImp;
import py.edu.facitec.mec.model.Mantenimiento;

/**
 *
 * @author Jorge Fabio
 */
public class ConexionManagerTest {
    
    public static void main(String[] args) {
        
        MantenimientoDao dao = new MantenimientoDaoImpl();
        
        int man = dao.obtenerMaximo();
        
        System.out.println("maxi "+man);
        
    }
    
}
