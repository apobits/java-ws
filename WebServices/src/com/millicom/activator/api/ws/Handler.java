/**
 * 
 */
package com.millicom.activator.api.ws;

import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import com.millicom.activator.api.dto.portation.Country;

/**
 * @author Administrador
 *
 */
public class Handler implements LogicalHandler<LogicalMessageContext> {

	@Override
	public void close(MessageContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean handleFault(LogicalMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMessage(LogicalMessageContext arg0) {
		String country = null;
		Boolean outboundProperty = (Boolean) arg0.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (!outboundProperty.booleanValue()) {

			try {
				DOMSource s = (DOMSource) arg0.getMessage().getPayload();
				for (int i = 0; i < s.getNode().getChildNodes().getLength(); i++) {
					if (s.getNode().getChildNodes().item(i).getNodeName()
							.equals("updateTransactionCompleteRequestHeader")) {
						for (int j = 0; j < s.getNode().getChildNodes().item(i).getChildNodes().getLength(); j++) {
							if (s.getNode().getChildNodes().item(i).getChildNodes().item(j).getNodeName()
									.equals("Country")) {
								country = s.getNode().getChildNodes().item(i).getChildNodes().item(j).getTextContent();
							}
						}
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				Country.valueOf(country);
			} catch (IllegalArgumentException e) {
				throw new RuntimeException("Invalid Country " + country + ", valid values are " + getCountries());
			}
		}

		return true;
	}

	private String getCountries() {
		StringBuilder sb = new StringBuilder();
		Country[] countries = Country.values();
		for (int i = 0; i < countries.length; i++) {
			sb.append(countries[i].name());
			if (i + 1 != countries.length) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}

}
