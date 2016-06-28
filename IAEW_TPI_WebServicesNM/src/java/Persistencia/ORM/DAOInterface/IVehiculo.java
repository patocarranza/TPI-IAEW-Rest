/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.ORM.DAOInterface;

import Persistencia.ORM.Util.IGenericDAO;
import java.util.List;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.VehiculoEntity;

/**
 *
 * @author ang_2
 */
public interface IVehiculo extends IGenericDAO<VehiculoEntity, Integer> {

    public List<VehiculoEntity> listar();

}
