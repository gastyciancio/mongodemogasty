/**
 * Este paquete contiene todas las implementaciones de los repositorios.
 */
package mongo.repositories;

import mongo.model.Accident;

import java.util.List;

/**
 * Esta interface define el comportamiento extra que debe cumplir un repositorio
 * de accidentes.
 *
 */
public interface CustomAccidentRepository {

    /**
     * Recupera accidentes entre dos fechas
     *
     * @param aStartDate es el inicio del rango a buscar
     * @param anEndDate es el fin del rango a buscar
     * @return los accidentes o null.
     */
    public List<Accident> findAccidentsBetween(String aStartDate, String anEndDate);


}
