/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOInterface;

import Modelo.Vendedor;
import Persistencia.ORM.Util.IGenericDAO;
import java.util.List;

/**
 *
 * @author ang_2
 */
public interface IVendedor extends IGenericDAO<Vendedor, Integer> {

    public List<Vendedor> listar();

}
