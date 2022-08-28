/**
 * Este paquete contiene las implementaciones de los servicios.
 */
package mongo.services.impl;

import javax.inject.Inject;

import mongo.dtos.AccidentDTO;
import mongo.dtos.DTOFactory;
import mongo.dtos.UserDTO;
import mongo.model.Accident;
import mongo.repositories.AccidentRepository;
import mongo.repositories.UserRepository;
import mongo.services.IAccidentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mongo.model.Phone;
import mongo.model.User;
import mongo.services.IUserService;

import java.util.List;

/**
 * Esta clase contiene la implementación de los servicios relacionados con los
 * accidentes.
 *
 */
@Service
@Transactional
public class AccidentServiceImpl implements IAccidentService {

    /**
     * Es el objeto encargado de crear los DTOs.
     */
    @Inject
    private DTOFactory dtoFactory;

    /**
     * Es el repositorio ligado a los accidentes.
     */
    @Inject
    private AccidentRepository accidentRepository;


    /**
     * Getter.
     *
     * @return el repositorio de accidentes.
     */
    public AccidentRepository getAccidentRepository() {
        return this.accidentRepository;
    }

    /**
     * Getter.
     *
     * @return el objeto que debe utilizarse para crear los DTOs.
     */
    public DTOFactory getDtoFactory() {
        return this.dtoFactory;
    }

    @Override
    public List<Accident> getBetween(String start_date, String end_date) {
        return this.getAccidentRepository().findAccidentsBetween(start_date,end_date);

    }




}
