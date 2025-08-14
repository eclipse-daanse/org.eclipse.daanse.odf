
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-field-data-style-name-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-field-fixed-attlist"/&gt;
 *       &lt;attribute name="name" use="required" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}value"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}date-value"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}time-value"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}boolean-value"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}string-value"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "user-defined")
public class UserDefined {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String name;
    @XmlAttribute(name = "value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Double value;
    @XmlAttribute(name = "date-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String dateValue;
    @XmlAttribute(name = "time-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Duration timeValue;
    @XmlAttribute(name = "boolean-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Boolean booleanValue;
    @XmlAttribute(name = "string-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String stringValue;
    @XmlAttribute(name = "data-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String dataStyleName;
    @XmlAttribute(name = "fixed", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean fixed;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateValue(String value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the timeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeValue() {
        return timeValue;
    }

    /**
     * Sets the value of the timeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeValue(Duration value) {
        this.timeValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the dataStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataStyleName() {
        return dataStyleName;
    }

    /**
     * Sets the value of the dataStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataStyleName(String value) {
        this.dataStyleName = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

}
