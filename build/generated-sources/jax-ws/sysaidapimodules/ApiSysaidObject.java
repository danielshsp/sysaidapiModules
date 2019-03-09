
package sysaidapimodules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSysaidObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiSysaidObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiSysaidObject")
@XmlSeeAlso({
    ApiCatalogItem.class,
    ApiCI.class,
    ApiSysAidUser.class,
    ApiServiceRequest.class,
    ApiSupplier.class,
    ApiServiceRequestActivity.class,
    ApiComputer.class,
    ApiComputerItemList.class,
    ApiTask.class,
    ApiProject.class,
    ApiSoftware.class,
    ApiCompany.class
})
public abstract class ApiSysaidObject {


}
