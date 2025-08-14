
package org.eclipse.daanse.odf.model.jakarta.xml.bind.manifest;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}start-key-generation-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "start-key-generation")
public class StartKeyGeneration {

    @XmlAttribute(name = "start-key-generation-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected String startKeyGenerationName;
    @XmlAttribute(name = "key-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0")
    protected BigInteger keySize;

    /**
     * Gets the value of the startKeyGenerationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartKeyGenerationName() {
        return startKeyGenerationName;
    }

    /**
     * Sets the value of the startKeyGenerationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartKeyGenerationName(String value) {
        this.startKeyGenerationName = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeySize(BigInteger value) {
        this.keySize = value;
    }

}
