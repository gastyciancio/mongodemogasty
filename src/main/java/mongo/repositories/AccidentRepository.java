/**
 * Este paquete contiene todas las implementaciones de los repositorios.
 */
package mongo.repositories;

import mongo.model.Accident;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import mongo.model.User;

import java.util.List;

/**
 * Clase que representa el repositorio de accidentes.
 *
 */
@Repository
public interface AccidentRepository extends MongoRepository<User, String>, CustomAccidentRepository {
}
