
package org.eclipse.daanse.odf.xml.db;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}connection-data"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}driver-settings" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}application-connection-settings" minOccurs="0"/&gt;
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
    "connectionData",
    "driverSettings",
    "applicationConnectionSettings"
})
@XmlRootElement(name = "data-source")
public class DataSource {

    @XmlElement(name = "connection-data", required = true)
    protected ConnectionData connectionData;
    @XmlElement(name = "driver-settings")
    protected DriverSettings driverSettings;
    @XmlElement(name = "application-connection-settings")
    protected ApplicationConnectionSettings applicationConnectionSettings;

    /**
     * Gets the value of the connectionData property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionData }
     *     
     */
    public ConnectionData getConnectionData() {
        return connectionData;
    }

    /**
     * Sets the value of the connectionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionData }
     *     
     */
    public void setConnectionData(ConnectionData value) {
        this.connectionData = value;
    }

    /**
     * Gets the value of the driverSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DriverSettings }
     *     
     */
    public DriverSettings getDriverSettings() {
        return driverSettings;
    }

    /**
     * Sets the value of the driverSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverSettings }
     *     
     */
    public void setDriverSettings(DriverSettings value) {
        this.driverSettings = value;
    }

    /**
     * Gets the value of the applicationConnectionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationConnectionSettings }
     *     
     */
    public ApplicationConnectionSettings getApplicationConnectionSettings() {
        return applicationConnectionSettings;
    }

    /**
     * Sets the value of the applicationConnectionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationConnectionSettings }
     *     
     */
    public void setApplicationConnectionSettings(ApplicationConnectionSettings value) {
        this.applicationConnectionSettings = value;
    }

}
