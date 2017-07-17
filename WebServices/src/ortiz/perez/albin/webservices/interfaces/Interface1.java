package ortiz.perez.albin.webservices.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Interface1 extends Interface2 {

	@WebMethod
	void sayHello3();

}
