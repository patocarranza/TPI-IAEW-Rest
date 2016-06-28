/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOInterface;

import Persistencia.ORM.Util.IGenericDAO;
import java.util.List;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ReservaEntity;

/**
 *
 * @author ang_2
 */
public interface IReserva extends IGenericDAO<ReservaEntity, Integer> {

    public List<ReservaEntity> listar();

}