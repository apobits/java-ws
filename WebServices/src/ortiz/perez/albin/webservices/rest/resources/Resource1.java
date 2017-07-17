/**
 * 
 */
package ortiz.perez.albin.webservices.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Administrador
 *
 */
@Path("apo")
public class Resource1 {
	@GET
	@Path("{name}")
	@Produces("text/plain")
	public String sayHi0(@PathParam("name") String name) {
		return "hi " + name;
	}

}
