
package org.eclipse.daanse.odf.xml.db;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-login-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "login")
public class Login {

    @XmlAttribute(name = "user-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String userName;
    @XmlAttribute(name = "use-system-user", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean useSystemUser;
    @XmlAttribute(name = "is-password-required", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean isPasswordRequired;
    @XmlAttribute(name = "login-timeout", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected BigInteger loginTimeout;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the useSystemUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseSystemUser() {
        return useSystemUser;
    }

    /**
     * Sets the value of the useSystemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSystemUser(Boolean value) {
        this.useSystemUser = value;
    }

    /**
     * Gets the value of the isPasswordRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsPasswordRequired() {
        return isPasswordRequired;
    }

    /**
     * Sets the value of the isPasswordRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPasswordRequired(Boolean value) {
        this.isPasswordRequired = value;
    }

    /**
     * Gets the value of the loginTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoginTimeout() {
        return loginTimeout;
    }

    /**
     * Sets the value of the loginTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoginTimeout(BigInteger value) {
        this.loginTimeout = value;
    }

}
