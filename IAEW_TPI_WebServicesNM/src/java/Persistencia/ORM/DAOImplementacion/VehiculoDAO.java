/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOImplementacion;

import Persistencia.ORM.Util.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import Persistencia.ORM.DAOInterface.ICiudad;
import Persistencia.ORM.DAOInterface.IVehiculo;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.CiudadEntity;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.VehiculoEntity;

/**
 *
 * @author ang_2
 */
public class VehiculoDAO extends GenericDAO<VehiculoEntity, Integer> implements IVehiculo {

    private static final Logger LOG = Logger.getLogger(VehiculoDAO.class);

    @Override
    public List<VehiculoEntity> listar() {
        Session session = getHibernateTemplate();
        List<VehiculoEntity> objetos = new ArrayList<>();
        try {
            String sql = "from VehiculoEntity";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las VehiculoEntity.", e);
        }
        return objetos;
    }

}