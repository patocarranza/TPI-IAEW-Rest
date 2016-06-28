/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOImplementacion;

import Modelo.Vendedor;
import Persistencia.ORM.Util.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import Persistencia.ORM.DAOInterface.IVendedor;

/**
 *
 * @author ang_2
 */
public class VendedorDAO extends GenericDAO<Vendedor, Integer> implements IVendedor {

    private static final Logger LOG = Logger.getLogger(VendedorDAO.class);

    @Override
    public List<Vendedor> listar() {
        Session session = getHibernateTemplate();
        List<Vendedor> objetos = new ArrayList<>();
        try {
            String sql = "from Vendedor  ";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Vendedor.", e);
        }
        return objetos;
    }

}
