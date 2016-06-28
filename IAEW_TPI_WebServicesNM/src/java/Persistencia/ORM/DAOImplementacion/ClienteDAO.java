/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOImplementacion;

import Modelo.Cliente;
import Persistencia.ORM.DAOInterface.ICliente;
import Persistencia.ORM.Util.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author ang_2
 */
public class ClienteDAO extends GenericDAO<Cliente, Integer> implements ICliente {

    private static final Logger LOG = Logger.getLogger(ClienteDAO.class);

    @Override
    public List<Cliente> listar() {
        Session session = getHibernateTemplate();
        List<Cliente> objetos = new ArrayList<>();
        try {
            String sql = "from Cliente  ";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Cliente.", e);
        }
        return objetos;
    }

}
