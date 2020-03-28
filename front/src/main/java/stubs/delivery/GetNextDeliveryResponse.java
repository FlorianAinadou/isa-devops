
package stubs.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNextDeliveryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNextDeliveryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getNextDelivery" type="{http://localhost:8080}delivery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNextDeliveryResponse", propOrder = {
    "getNextDelivery"
})
public class GetNextDeliveryResponse {

    protected Delivery getNextDelivery;

    /**
     * Gets the value of the getNextDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery }
     *     
     */
    public Delivery getGetNextDelivery() {
        return getNextDelivery;
    }

    /**
     * Sets the value of the getNextDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery }
     *     
     */
    public void setGetNextDelivery(Delivery value) {
        this.getNextDelivery = value;
    }

}
