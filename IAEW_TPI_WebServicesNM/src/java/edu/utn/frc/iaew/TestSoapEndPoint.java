package edu.utn.frc.iaew;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.ConsultarCiudadesRequest;
import org.tempuri.ConsultarPaises;

/**
 *
 * @author patri_000
 */
public class TestSoapEndPoint {
    
    public static void main(String[] args) {
        consultarCiudades();
    }

    private static void consultarCiudades() {        
        try {
            org.tempuri.WCFReservaVehiculos service = new org.tempuri.WCFReservaVehiculos();            
            org.tempuri.IWCFReservaVehiculos serv2 = service.getWSHttpBindingIWCFReservaVehiculos(new javax.xml.ws.soap.AddressingFeature());
            /*ConsultarCiudadesRequest req = new ConsultarCiudadesRequest();
            req.setIdPais(1);
            System.out.println(serv2.consultarCiudades(req).getCiudades());
            System.out.println(serv2.consultarPaises().getPaises());*/
            QName portQName = new QName("http://tempuri.org/", "WSHttpBinding_IWCFReservaVehiculos");
            String req = "<ConsultarCiudades  xmlns=\"http://tempuri.org/\"><consultarCiudadesRequest>ENTER VALUE</consultarCiudadesRequest></ConsultarCiudades>";
            // Call Web Service Operation
            Dispatch<Source> sourceDispatch = null;            
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
