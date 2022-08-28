/**
 * Este paquete contiene todos los objetos que se utilizan para representar los pedidos enviados
 * como parte del cuerpo (body).
 */

package mongo.dtos;
/**
 * Las instancias de esta clase se utilizan para representar los datos
 * requeridos para los accidentes.
 *
 *
 */


public class AccidentRequestDTO {

    /**
     * Es el id del usuario.
     */
    public String id;

    /**
     * Es la fecha del inicio del rango para la busqueda de accidentes.
     */
    public String start_date;

    /**
     * Es la fecha del fin del rango para la busqueda de accidentes.
     */
    public String end_date;


    /**
     * Constructor.
     *
     * @param id       es el identificador del usuario.
     *
     * @param start_date es la fecha del inicio del rango para la busqueda de accidentes.
     * @param end_date es la fecha del fin del rango para la busqueda de accidentes.
     */
    public AccidentRequestDTO(String id, String start_date, String end_date) {
        super();
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
    }

}
