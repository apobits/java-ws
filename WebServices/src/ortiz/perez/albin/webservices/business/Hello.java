/**
 * 
 */
package ortiz.perez.albin.webservices.business;

import java.io.File;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.tigo.xmlns.responseheader.v3.GeneralResponseType;
import com.tigo.xmlns.responseheader.v3.ObjectFactory;
import com.tigo.xmlns.responseheader.v3.ResponseHeader;
import com.tigo.xmlns.responseheader.v3.ResponseHeader2;

/**
 * @author Administrador
 *
 */

// @WebService(endpointInterface =
// "ortiz.perez.albin.webservices.interfaces.Interface1")
@WebService
public class Hello extends HelloSuper {

	@WebMethod
	public String sayHello(String name) {
		return "Hello " + name + " !!!";
	}

	public Object sayHello1(@WebParam(name = "name1") String name1) throws GetUserDetailsFault, JAXBException {

		if (false) {
			return "Hello " + name1 + " !!!";
		} else {
			// JAXBContext context =
			// JAXBContext.newInstance(ResponseHeader2.class,
			// GeneralResponseType.class);
			ObjectFactory objectFactory = new ObjectFactory();
			com.tigo.xmlns.responseheader.v3.ResponseHeader responseHeader = new ResponseHeader();
			com.tigo.xmlns.responseheader.v3.GeneralResponseType generalResponseType =new GeneralResponseType();
			generalResponseType.setCode(objectFactory.createGeneralResponseTypeCode("01"));
			generalResponseType.setCorrelationID(objectFactory.createGeneralResponseTypeCorrelationID("02"));
			generalResponseType.setDescription(objectFactory.createGeneralResponseTypeDescription("03"));
			generalResponseType.setStatus(objectFactory.createGeneralResponseTypeStatus("Okay"));
			generalResponseType.setCodeType(objectFactory.createGeneralResponseTypeCodeType("04"));
			responseHeader.setGeneralResponse(generalResponseType);
			// Marshaller u = context.createMarshaller();
			// Unmarshaller un = context.createUnmarshaller();
			// u.marshal(responseHeader, new
			// File("C:\\Users\\Administrador\\Desktop\\dam\\test.xml"));
			throw new GetUserDetailsFault("Error2", responseHeader);
		}
	}

	// public void sayHello3() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// public void sayHello4() {
	//
	// }

}
