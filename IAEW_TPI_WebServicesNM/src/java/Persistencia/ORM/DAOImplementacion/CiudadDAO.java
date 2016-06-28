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
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.CiudadEntity;

/**
 *
 * @author ang_2
 */
public class CiudadDAO extends GenericDAO<CiudadEntity, Integer> implements ICiudad {

    private static final Logger LOG = Logger.getLogger(CiudadDAO.class);

    @Override
    public List<CiudadEntity> listar() {
        Session session = getHibernateTemplate();
        List<CiudadEntity> objetos = new ArrayList<>();
        try {
            String sql = "from CiudadEntity order by nombre";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las ciudades.", e);
        }
        return objetos;
    }

}
