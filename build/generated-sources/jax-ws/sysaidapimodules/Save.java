
package sysaidapimodules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for save complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="save">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="apiSysObj" type="{http://api.ilient.com/}apiSysaidObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save", propOrder = {
    "sessionId",
    "apiSysObj"
})
public class Save {

    protected long sessionId;
    protected ApiSysaidObject apiSysObj;

    /**
     * Gets the value of the sessionId property.
     * 
     */
    public long getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     */
    public void setSessionId(long value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the apiSysObj property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSysaidObject }
     *     
     */
    public ApiSysaidObject getApiSysObj() {
        return apiSysObj;
    }

    /**
     * Sets the value of the apiSysObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSysaidObject }
     *     
     */
    public void setApiSysObj(ApiSysaidObject value) {
        this.apiSysObj = value;
    }

}
