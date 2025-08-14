
package org.eclipse.daanse.odf.xml.draw;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-stroke-dash-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "stroke-dash")
public class StrokeDash {

    @XmlAttribute(name = "display-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String displayName;
    @XmlAttribute(name = "dots1", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger dots1;
    @XmlAttribute(name = "dots1-length", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String dots1Length;
    @XmlAttribute(name = "dots2", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger dots2;
    @XmlAttribute(name = "dots2-length", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String dots2Length;
    @XmlAttribute(name = "distance", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String distance;
    @XmlAttribute(name = "style", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the dots1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDots1() {
        return dots1;
    }

    /**
     * Sets the value of the dots1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDots1(BigInteger value) {
        this.dots1 = value;
    }

    /**
     * Gets the value of the dots1Length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDots1Length() {
        return dots1Length;
    }

    /**
     * Sets the value of the dots1Length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDots1Length(String value) {
        this.dots1Length = value;
    }

    /**
     * Gets the value of the dots2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDots2() {
        return dots2;
    }

    /**
     * Sets the value of the dots2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDots2(BigInteger value) {
        this.dots2 = value;
    }

    /**
     * Gets the value of the dots2Length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDots2Length() {
        return dots2Length;
    }

    /**
     * Sets the value of the dots2Length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDots2Length(String value) {
        this.dots2Length = value;
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
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
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

}
