
package org.eclipse.daanse.odf.xml.db;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-delimiter-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "delimiter")
public class Delimiter {

    @XmlAttribute(name = "field", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String field;
    @XmlAttribute(name = "string", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String string;
    @XmlAttribute(name = "decimal", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String decimal;
    @XmlAttribute(name = "thousand", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String thousand;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the decimal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimal() {
        return decimal;
    }

    /**
     * Sets the value of the decimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimal(String value) {
        this.decimal = value;
    }

    /**
     * Gets the value of the thousand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThousand() {
        return thousand;
    }

    /**
     * Sets the value of the thousand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThousand(String value) {
        this.thousand = value;
    }

}
