package com.millicom.activator.api.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import com.millicom.activator.api.dto.portation.UpdateTransactionCompleteRequest;
import com.millicom.activator.api.dto.portation.UpdateTransactionCompleteResult;
import com.millicom.activator.api.dto.portation.UpdateTransactionCompleteResultOperation;

/**
 * The Class PortationActivationService.
 */
@com.sun.xml.internal.ws.developer.SchemaValidation
@WebService(wsdlLocation = "resources/updateTransactionComplete.wsdl", serviceName = "UpdateTransactionServiceWS", portName = "UpdateTransactionCompleteServicePort", targetNamespace = "http://soap.jaxws.ea.htc.com/", name = "UpdateTransactionServiceWS")
@HandlerChain(file = "handler-chain.xml")
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.BARE)
public class PortationActivationService {

	/**
	 * Change status.
	 *
	 * @param body the body
	 * @return the change status portation response
	 */
	@WebMethod(action = "Updatedate")
	@WebResult(partName = "UpdateTransactionCompleteResult")
	public UpdateTransactionCompleteResult notifyPortation(
			@WebParam(partName = "UpdateTransactionCompleteRequest", targetNamespace = "http://soap.jaxws.ea.htc.com/") UpdateTransactionCompleteRequest body) {
		UpdateTransactionCompleteResult result = new UpdateTransactionCompleteResult();
		UpdateTransactionCompleteResultOperation resultOperation = new UpdateTransactionCompleteResultOperation();
		result.setUpdateTransactionCompleteResponse(resultOperation);

		return result;
	}
}
