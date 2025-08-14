
package org.eclipse.daanse.odf.xml.manifest;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}key-derivation-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "key-derivation")
public class KeyDerivation {

    @XmlAttribute(name = "key-derivation-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected String keyDerivationName;
    @XmlAttribute(name = "salt", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected byte[] salt;
    @XmlAttribute(name = "iteration-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected BigInteger iterationCount;
    @XmlAttribute(name = "key-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0")
    protected BigInteger keySize;

    /**
     * Gets the value of the keyDerivationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyDerivationName() {
        return keyDerivationName;
    }

    /**
     * Sets the value of the keyDerivationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyDerivationName(String value) {
        this.keyDerivationName = value;
    }

    /**
     * Gets the value of the salt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSalt() {
        return salt;
    }

    /**
     * Sets the value of the salt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSalt(byte[] value) {
        this.salt = value;
    }

    /**
     * Gets the value of the iterationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIterationCount() {
        return iterationCount;
    }

    /**
     * Sets the value of the iterationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIterationCount(BigInteger value) {
        this.iterationCount = value;
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
