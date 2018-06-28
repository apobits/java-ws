/**
 * 
 */
package web.learning.consumer;

import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import web.learning.client.TestWs;
import web.learning.client.TestWsService;

/**
 * @author apobits@gmail.com
 *
 */
public class TestWSConsumer {

    /**
     * @param args
     */
    public static void main(String[] args) {

	TestWs testWSPort = new TestWsService().getTestWsPort();
	Binding binding = ((BindingProvider) testWSPort).getBinding();
	List<Handler> handlers = binding.getHandlerChain();
	handlers.add(new SOAPHandler2());
	binding.setHandlerChain(handlers);

	System.out.println(testWSPort.getGreeting("Albin"));
    }

}
