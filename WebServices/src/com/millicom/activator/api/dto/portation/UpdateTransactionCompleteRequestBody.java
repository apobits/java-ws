//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.08.20 at 07:44:46 PM COT 
//


package com.millicom.activator.api.dto.portation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Updatedate" type="{http://soap.jaxws.ea.htc.com/}Updatedate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updatedate"
})
@XmlRootElement(name = "UpdateTransactionCompleteRequestBody")
public class UpdateTransactionCompleteRequestBody {

    @XmlElement(name = "Updatedate", required = true)
    protected Updatedate updatedate;

    /**
     * Gets the value of the updatedate property.
     * 
     * @return
     *     possible object is
     *     {@link Updatedate }
     *     
     */
    public Updatedate getUpdatedate() {
        return updatedate;
    }

    /**
     * Sets the value of the updatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Updatedate }
     *     
     */
    public void setUpdatedate(Updatedate value) {
        this.updatedate = value;
    }

}