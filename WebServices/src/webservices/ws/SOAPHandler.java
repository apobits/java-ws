package webservices.ws;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPHandler implements javax.xml.ws.handler.soap.SOAPHandler<SOAPMessageContext> {

    @Override
    public void close(MessageContext arg0) {
	// TODO Auto-generated method stub

    }

    @Override
    public boolean handleFault(SOAPMessageContext arg0) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext arg0) {
	if ((boolean) arg0.get(arg0.MESSAGE_OUTBOUND_PROPERTY)) {
	    System.out.println("outbound");
	} else {
	    System.out.println("inbound");
	}
	try {
	    arg0.getMessage().getSOAPPart().getEnvelope().getBody();
	} catch (SOAPException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return true;
    }

    @Override
    public Set<QName> getHeaders() {
	// TODO Auto-generated method stub
	return null;
    }

}
