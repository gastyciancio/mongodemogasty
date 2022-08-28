/**
 * Este paquete contiene todas las clases e interfaces que componen la capa de servicios.
 */

package mongo.services;
import mongo.dtos.AccidentDTO;
import mongo.model.Accident;

import java.util.List;

/**
 * Esta interface define el comportamiento esperado por los servicios
 * relacionados con los usuarios.
 *
 */

public interface IAccidentService {


    /**
     * Devuelve una lista de accidentes ocurridos entre dos fechas.
     *

     * @param start_date es el comienzo del rango de busqueda.
     * @param end_date  es el fin del rango de busqueda.
     * @return una lista de AccidentDTO, que representan un accidente
     */
    public List<Accident> getBetween(String start_date, String end_date);

}




