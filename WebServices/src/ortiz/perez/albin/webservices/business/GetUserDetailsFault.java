/**
 * 
 */
package ortiz.perez.albin.webservices.business;

import javax.xml.ws.WebFault;

import com.tigo.xmlns.responseheader.v3.ResponseHeader;
import com.tigo.xmlns.responseheader.v3.ResponseHeader2;

/**
 * @author Administrador
 *
 */
@WebFault(targetNamespace = "http://xmlns.tigo.com/MFS/AuthenticationFault/V1")
public class GetUserDetailsFault extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ResponseHeader responseHeader;

	public GetUserDetailsFault(String message, Throwable t) {
		super(message, t);
	}

	public GetUserDetailsFault(String message, ResponseHeader responseHeader, Throwable t) {
		super(message, t);
		this.responseHeader = responseHeader;
	}

	public GetUserDetailsFault(String message, ResponseHeader responseHeader) {
		super(message);
		this.responseHeader = responseHeader;
	}

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

}
