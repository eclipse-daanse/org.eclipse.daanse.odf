
package org.eclipse.daanse.odf.xml.manifest;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}algorithm"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}start-key-generation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}key-derivation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}encryption-data-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "algorithm",
    "startKeyGeneration",
    "keyDerivation"
})
@XmlRootElement(name = "encryption-data")
public class EncryptionData {

    @XmlElement(required = true)
    protected Algorithm algorithm;
    @XmlElement(name = "start-key-generation")
    protected StartKeyGeneration startKeyGeneration;
    @XmlElement(name = "key-derivation", required = true)
    protected KeyDerivation keyDerivation;
    @XmlAttribute(name = "checksum-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected String checksumType;
    @XmlAttribute(name = "checksum", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected byte[] checksum;

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm }
     *     
     */
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm }
     *     
     */
    public void setAlgorithm(Algorithm value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the startKeyGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link StartKeyGeneration }
     *     
     */
    public StartKeyGeneration getStartKeyGeneration() {
        return startKeyGeneration;
    }

    /**
     * Sets the value of the startKeyGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartKeyGeneration }
     *     
     */
    public void setStartKeyGeneration(StartKeyGeneration value) {
        this.startKeyGeneration = value;
    }

    /**
     * Gets the value of the keyDerivation property.
     * 
     * @return
     *     possible object is
     *     {@link KeyDerivation }
     *     
     */
    public KeyDerivation getKeyDerivation() {
        return keyDerivation;
    }

    /**
     * Sets the value of the keyDerivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyDerivation }
     *     
     */
    public void setKeyDerivation(KeyDerivation value) {
        this.keyDerivation = value;
    }

    /**
     * Gets the value of the checksumType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumType() {
        return checksumType;
    }

    /**
     * Sets the value of the checksumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumType(String value) {
        this.checksumType = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChecksum(byte[] value) {
        this.checksum = value;
    }

}
