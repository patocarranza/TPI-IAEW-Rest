/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOInterface;

import Modelo.Cliente;
import Persistencia.ORM.Util.IGenericDAO;
import java.util.List;

/**
 *
 * @author ang_2
 */
public interface ICliente extends IGenericDAO<Cliente, Integer> {

    public List<Cliente> listar();

}
