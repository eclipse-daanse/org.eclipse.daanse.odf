
package org.eclipse.daanse.odf.xml.style;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-drop-cap-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "drop-cap")
public class DropCap {

    @XmlAttribute(name = "length", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String length;
    @XmlAttribute(name = "lines", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected BigInteger lines;
    @XmlAttribute(name = "distance", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String distance;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String styleName;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLines(BigInteger value) {
        this.lines = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

}
