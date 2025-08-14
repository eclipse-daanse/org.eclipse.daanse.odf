
package org.eclipse.daanse.odf.model.jakarta.xml.bind.svg;

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
 *       &lt;attribute name="offset" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;union memberTypes=" {urn:oasis:names:tc:opendocument:xmlns:text:1.0}double {urn:oasis:names:tc:opendocument:xmlns:text:1.0}percent"&gt;
 *           &lt;/union&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="stop-color" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}color" /&gt;
 *       &lt;attribute name="stop-opacity" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "stop")
public class Stop {

    @XmlAttribute(name = "offset", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String offset;
    @XmlAttribute(name = "stop-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String stopColor;
    @XmlAttribute(name = "stop-opacity", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected Double stopOpacity;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the stopColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopColor() {
        return stopColor;
    }

    /**
     * Sets the value of the stopColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopColor(String value) {
        this.stopColor = value;
    }

    /**
     * Gets the value of the stopOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStopOpacity() {
        return stopOpacity;
    }

    /**
     * Sets the value of the stopOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStopOpacity(Double value) {
        this.stopOpacity = value;
    }

}
