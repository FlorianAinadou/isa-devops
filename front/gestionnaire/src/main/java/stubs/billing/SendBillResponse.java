
package stubs.billing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendBillResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendBillResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cart_contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendBillResponse", propOrder = {
    "cartContents"
})
public class SendBillResponse {

    @XmlElement(name = "cart_contents")
    protected String cartContents;

    /**
     * Gets the value of the cartContents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartContents() {
        return cartContents;
    }

    /**
     * Sets the value of the cartContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartContents(String value) {
        this.cartContents = value;
    }

}
