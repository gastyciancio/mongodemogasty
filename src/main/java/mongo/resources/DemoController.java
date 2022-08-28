/**
 * Este paquete contiene las clases que definen la api rest de la aplicación.
 */
package mongo.resources;

import javax.inject.Inject;

import mongo.dtos.AccidentRequestDTO;
import mongo.dtos.UserRequestDTO;
import mongo.model.Accident;
import mongo.services.IAccidentService;
import mongo.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase presenta los diferentes "endpoints" de la api rest.
 * 
 * @author Javier Bazzocco
 *
 */
@RestController
public class DemoController {

	/**
	 * Es el servicio relacionado con los usuarios.
	 */
	@Inject
	private IUserService usersService;

	@Inject
	private IAccidentService accidentsService;

	/**
	 * Endpoint para crear usuarios.
	 * 
	 * @param anUserRequestDTO dto que contiene la información del usuario a crear.
	 * 
	 */
	@PostMapping("/api/users")
	public void createUser(@RequestBody UserRequestDTO anUserRequestDTO) {
		this.getUsersService().addUser(anUserRequestDTO.name, anUserRequestDTO.username, anUserRequestDTO.password);
	}

	/**
	 * Endpoint para agregar un nuevo número de teléfono.
	 * 
	 * @param anId    es el identificador del usuario.
	 * @param aNumber es el número del teléfono.
	 */
	@PostMapping("/api/users/{id}/{number}")
	public void addPhone(@PathVariable("id") String anId, @PathVariable("number") String aNumber) {
		this.getUsersService().addPhone(anId, aNumber);
	}

	/**
	 * Getter.
	 * 
	 * @return el servicio relacionado con los usuarios.
	 */
	public IUserService getUsersService() {
		return this.usersService;
	}
	public IAccidentService getAccidentsService() {
		return this.accidentsService;
	}

	@GetMapping("/api/accidents_between")
	public List<Accident> getAccidentsBetween(@RequestBody AccidentRequestDTO anAccidentRequestDTO) {
		 return this.getAccidentsService().getBetween(anAccidentRequestDTO.start_date, anAccidentRequestDTO.end_date);
	}

}
