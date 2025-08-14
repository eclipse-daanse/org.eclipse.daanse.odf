
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-time-attlist"/&gt;
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
@XmlRootElement(name = "time")
public class Time {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "time-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String timeValue;
    @XmlAttribute(name = "time-adjust", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Duration timeAdjust;
    @XmlAttribute(name = "fixed", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean fixed;
    @XmlAttribute(name = "data-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String dataStyleName;

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
     * Gets the value of the timeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeValue() {
        return timeValue;
    }

    /**
     * Sets the value of the timeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeValue(String value) {
        this.timeValue = value;
    }

    /**
     * Gets the value of the timeAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeAdjust() {
        return timeAdjust;
    }

    /**
     * Sets the value of the timeAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeAdjust(Duration value) {
        this.timeAdjust = value;
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

}
