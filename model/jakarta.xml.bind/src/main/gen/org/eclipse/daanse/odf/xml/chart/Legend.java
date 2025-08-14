
package org.eclipse.daanse.odf.xml.chart;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.P;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}p" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}chart-legend-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "p"
})
@XmlRootElement(name = "legend")
public class Legend {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected P p;
    @XmlAttribute(name = "legend-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String legendPosition;
    @XmlAttribute(name = "legend-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String legendAlign;
    @XmlAttribute(name = "legend-expansion", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String legendExpansion;
    @XmlAttribute(name = "legend-expansion-aspect-ratio", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Double legendExpansionAspectRatio;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String styleName;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String width;
    @XmlAttribute(name = "y", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y;
    @XmlAttribute(name = "x", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String x;

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link P }
     *     
     */
    public P getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link P }
     *     
     */
    public void setP(P value) {
        this.p = value;
    }

    /**
     * Gets the value of the legendPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendPosition() {
        return legendPosition;
    }

    /**
     * Sets the value of the legendPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendPosition(String value) {
        this.legendPosition = value;
    }

    /**
     * Gets the value of the legendAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendAlign() {
        return legendAlign;
    }

    /**
     * Sets the value of the legendAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendAlign(String value) {
        this.legendAlign = value;
    }

    /**
     * Gets the value of the legendExpansion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendExpansion() {
        return legendExpansion;
    }

    /**
     * Sets the value of the legendExpansion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendExpansion(String value) {
        this.legendExpansion = value;
    }

    /**
     * Gets the value of the legendExpansionAspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLegendExpansionAspectRatio() {
        return legendExpansionAspectRatio;
    }

    /**
     * Sets the value of the legendExpansionAspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLegendExpansionAspectRatio(Double value) {
        this.legendExpansionAspectRatio = value;
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

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
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

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

}
