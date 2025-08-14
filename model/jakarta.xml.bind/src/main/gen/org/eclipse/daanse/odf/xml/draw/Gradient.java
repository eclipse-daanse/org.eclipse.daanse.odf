
package org.eclipse.daanse.odf.xml.draw;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.GradientStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-gradient-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-gradient-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "gradient")
public class Gradient {

    @XmlAttribute(name = "display-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String displayName;
    @XmlAttribute(name = "cx", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String cx;
    @XmlAttribute(name = "cy", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String cy;
    @XmlAttribute(name = "angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String angle;
    @XmlAttribute(name = "border", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String border;
    @XmlAttribute(name = "style", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected GradientStyle style;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "start-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String startColor;
    @XmlAttribute(name = "end-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String endColor;
    @XmlAttribute(name = "start-intensity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String startIntensity;
    @XmlAttribute(name = "end-intensity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String endIntensity;

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
     * Gets the value of the cx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCx() {
        return cx;
    }

    /**
     * Sets the value of the cx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCx(String value) {
        this.cx = value;
    }

    /**
     * Gets the value of the cy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCy() {
        return cy;
    }

    /**
     * Sets the value of the cy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCy(String value) {
        this.cy = value;
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAngle(String value) {
        this.angle = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link GradientStyle }
     *     
     */
    public GradientStyle getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradientStyle }
     *     
     */
    public void setStyle(GradientStyle value) {
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

    /**
     * Gets the value of the startColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartColor() {
        return startColor;
    }

    /**
     * Sets the value of the startColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartColor(String value) {
        this.startColor = value;
    }

    /**
     * Gets the value of the endColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndColor() {
        return endColor;
    }

    /**
     * Sets the value of the endColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndColor(String value) {
        this.endColor = value;
    }

    /**
     * Gets the value of the startIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartIntensity() {
        return startIntensity;
    }

    /**
     * Sets the value of the startIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartIntensity(String value) {
        this.startIntensity = value;
    }

    /**
     * Gets the value of the endIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIntensity() {
        return endIntensity;
    }

    /**
     * Sets the value of the endIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIntensity(String value) {
        this.endIntensity = value;
    }

}
