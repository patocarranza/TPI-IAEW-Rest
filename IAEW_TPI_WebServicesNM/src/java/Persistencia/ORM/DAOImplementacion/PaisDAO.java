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
import Persistencia.ORM.DAOInterface.IPais;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.CiudadEntity;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.PaisEntity;

/**
 *
 * @author ang_2
 */
public class PaisDAO extends GenericDAO<PaisEntity, Integer> implements IPais {

    private static final Logger LOG = Logger.getLogger(PaisDAO.class);

    @Override
    public List<PaisEntity> listar() {
        Session session = getHibernateTemplate();
        List<PaisEntity> objetos = new ArrayList<>();
        try {
            String sql = "from PaisEntity";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las PaisEntity.", e);
        }
        return objetos;
    }

}
