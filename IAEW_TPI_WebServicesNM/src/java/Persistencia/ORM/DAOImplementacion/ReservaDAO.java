/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOImplementacion;

import Modelo.Reserva;
import Persistencia.ORM.Util.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import Persistencia.ORM.DAOInterface.IReserva;

/**
 *
 * @author ang_2
 */
public class ReservaDAO extends GenericDAO<Reserva, Integer> implements IReserva {

    private static final Logger LOG = Logger.getLogger(ReservaDAO.class);

    @Override
    public List<Reserva> listar() {
        Session session = getHibernateTemplate();
        List<Reserva> objetos = new ArrayList<>();
        try {
            String sql = "from Reserva  ";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Reserva.", e);
        }
        return objetos;
    }

}
