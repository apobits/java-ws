/**
 * 
 */
package webservices.ws;

import javax.jws.HandlerChain;
import javax.jws.WebService;

/**
 * @author apobits@gmail.com
 *
 */
@WebService
@HandlerChain(file = "handler-chain.xml")
public class TestWs {

    public String getGreeting(Input name) {
	return "Hello " + name;
    }

}
