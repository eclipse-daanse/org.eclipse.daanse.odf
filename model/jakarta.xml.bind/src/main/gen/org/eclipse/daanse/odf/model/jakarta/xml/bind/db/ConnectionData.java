
package org.eclipse.daanse.odf.model.jakarta.xml.bind.db;

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
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}database-description"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}connection-resource"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}login" minOccurs="0"/&gt;
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
    "databaseDescription",
    "connectionResource",
    "login"
})
@XmlRootElement(name = "connection-data")
public class ConnectionData {

    @XmlElement(name = "database-description")
    protected DatabaseDescription databaseDescription;
    @XmlElement(name = "connection-resource")
    protected ConnectionResource connectionResource;
    protected Login login;

    /**
     * Gets the value of the databaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseDescription }
     *     
     */
    public DatabaseDescription getDatabaseDescription() {
        return databaseDescription;
    }

    /**
     * Sets the value of the databaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseDescription }
     *     
     */
    public void setDatabaseDescription(DatabaseDescription value) {
        this.databaseDescription = value;
    }

    /**
     * Gets the value of the connectionResource property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionResource }
     *     
     */
    public ConnectionResource getConnectionResource() {
        return connectionResource;
    }

    /**
     * Sets the value of the connectionResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionResource }
     *     
     */
    public void setConnectionResource(ConnectionResource value) {
        this.connectionResource = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link Login }
     *     
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link Login }
     *     
     */
    public void setLogin(Login value) {
        this.login = value;
    }

}
