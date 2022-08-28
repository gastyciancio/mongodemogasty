/**
 * Este paquete contiene las implementaciones de los repositorios personalizados.
 */
package mongo.repositories.impl;

import mongo.model.Accident;
import mongo.repositories.CustomAccidentRepository;
import mongo.repositories.CustomUserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase implementa los mecanismos personalizados de recuperación de
 * información.
 *
 */
public class CustomAccidentRepositoryImpl implements CustomAccidentRepository {

    /**
     * Recupera accidentes entre dos fechas
     *
     * @param aStartDate es el inicio del rango a buscar
     * @param anEndDate es el fin del rango a buscar
     * @return los accidentes o null.
     */

    @Override
    public List<Accident> findAccidentsBetween(String aStartDate, String anEndDate) {
        // ESTO ES PARA PROBAR, DESPUES HAY QUE HACER LA CONSULTA REAL
        ArrayList<Accident> a = new ArrayList<>();
        a.add(new Accident("hola", "hola", "hola", "hola", "hola", "hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola", "hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola"));
        a.add(new Accident("hola", "hola", "hola", "hola", "hola", "hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola", "hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola","hola"));
        return a;
    }
}
