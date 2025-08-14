
package org.eclipse.daanse.odf.model.jakarta.xml.bind.style;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.LineStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-footnote-sep-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "footnote-sep")
public class FootnoteSep {

    @XmlAttribute(name = "color", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String color;
    @XmlAttribute(name = "line-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineStyle lineStyle;
    @XmlAttribute(name = "adjustment", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String adjustment;
    @XmlAttribute(name = "distance-before-sep", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String distanceBeforeSep;
    @XmlAttribute(name = "distance-after-sep", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String distanceAfterSep;
    @XmlAttribute(name = "rel-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String relWidth;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String width;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the lineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LineStyle }
     *     
     */
    public LineStyle getLineStyle() {
        return lineStyle;
    }

    /**
     * Sets the value of the lineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyle }
     *     
     */
    public void setLineStyle(LineStyle value) {
        this.lineStyle = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustment(String value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the distanceBeforeSep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceBeforeSep() {
        return distanceBeforeSep;
    }

    /**
     * Sets the value of the distanceBeforeSep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceBeforeSep(String value) {
        this.distanceBeforeSep = value;
    }

    /**
     * Gets the value of the distanceAfterSep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceAfterSep() {
        return distanceAfterSep;
    }

    /**
     * Sets the value of the distanceAfterSep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceAfterSep(String value) {
        this.distanceAfterSep = value;
    }

    /**
     * Gets the value of the relWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelWidth() {
        return relWidth;
    }

    /**
     * Sets the value of the relWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelWidth(String value) {
        this.relWidth = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

}
