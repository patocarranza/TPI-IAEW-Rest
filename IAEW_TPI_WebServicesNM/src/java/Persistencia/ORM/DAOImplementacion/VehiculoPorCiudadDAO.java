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
import Persistencia.ORM.DAOInterface.IVehiculoPorCiudad;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.CiudadEntity;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.VehiculoPorCiudadEntity;

/**
 *
 * @author ang_2
 */
public class VehiculoPorCiudadDAO extends GenericDAO<VehiculoPorCiudadEntity, Integer> implements IVehiculoPorCiudad {

    private static final Logger LOG = Logger.getLogger(VehiculoPorCiudadDAO.class);

    @Override
    public List<VehiculoPorCiudadEntity> listar() {
        Session session = getHibernateTemplate();
        List<VehiculoPorCiudadEntity> objetos = new ArrayList<>();
        try {
            String sql = "from VehiculoPorCiudadEntity ";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las VehiculoPorCiudadEntity.", e);
        }
        return objetos;
    }

}
