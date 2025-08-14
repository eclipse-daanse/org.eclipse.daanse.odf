
package org.eclipse.daanse.odf.xml.text;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-id"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-alphabetical-index-mark-attrs"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "alphabetical-index-mark-start")
public class AlphabeticalIndexMarkStart {

    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String id;
    @XmlAttribute(name = "key1", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String key1;
    @XmlAttribute(name = "key2", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String key2;
    @XmlAttribute(name = "string-value-phonetic", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String stringValuePhonetic;
    @XmlAttribute(name = "key1-phonetic", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String key1Phonetic;
    @XmlAttribute(name = "key2-phonetic", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String key2Phonetic;
    @XmlAttribute(name = "main-entry", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean mainEntry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the key1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey1() {
        return key1;
    }

    /**
     * Sets the value of the key1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey1(String value) {
        this.key1 = value;
    }

    /**
     * Gets the value of the key2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey2() {
        return key2;
    }

    /**
     * Sets the value of the key2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey2(String value) {
        this.key2 = value;
    }

    /**
     * Gets the value of the stringValuePhonetic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValuePhonetic() {
        return stringValuePhonetic;
    }

    /**
     * Sets the value of the stringValuePhonetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValuePhonetic(String value) {
        this.stringValuePhonetic = value;
    }

    /**
     * Gets the value of the key1Phonetic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey1Phonetic() {
        return key1Phonetic;
    }

    /**
     * Sets the value of the key1Phonetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey1Phonetic(String value) {
        this.key1Phonetic = value;
    }

    /**
     * Gets the value of the key2Phonetic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey2Phonetic() {
        return key2Phonetic;
    }

    /**
     * Sets the value of the key2Phonetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey2Phonetic(String value) {
        this.key2Phonetic = value;
    }

    /**
     * Gets the value of the mainEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMainEntry() {
        return mainEntry;
    }

    /**
     * Sets the value of the mainEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainEntry(Boolean value) {
        this.mainEntry = value;
    }

}
