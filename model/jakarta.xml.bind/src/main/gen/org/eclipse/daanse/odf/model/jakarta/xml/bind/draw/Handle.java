
package org.eclipse.daanse.odf.model.jakarta.xml.bind.draw;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-handle-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "handle")
public class Handle {

    @XmlAttribute(name = "handle-mirror-vertical", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean handleMirrorVertical;
    @XmlAttribute(name = "handle-mirror-horizontal", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean handleMirrorHorizontal;
    @XmlAttribute(name = "handle-switched", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean handleSwitched;
    @XmlAttribute(name = "handle-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String handlePosition;
    @XmlAttribute(name = "handle-range-x-minimum", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String handleRangeXMinimum;
    @XmlAttribute(name = "handle-range-x-maximum", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String handleRangeXMaximum;
    @XmlAttribute(name = "handle-range-y-minimum", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String handleRangeYMinimum;
    @XmlAttribute(name = "handle-range-y-maximum", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String handleRangeYMaximum;
    @XmlAttribute(name = "handle-polar", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String handlePolar;
    @XmlAttribute(name = "handle-radius-range-minimum", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String handleRadiusRangeMinimum;
    @XmlAttribute(name = "handle-radius-range-maximum", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String handleRadiusRangeMaximum;

    /**
     * Gets the value of the handleMirrorVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHandleMirrorVertical() {
        return handleMirrorVertical;
    }

    /**
     * Sets the value of the handleMirrorVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandleMirrorVertical(Boolean value) {
        this.handleMirrorVertical = value;
    }

    /**
     * Gets the value of the handleMirrorHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHandleMirrorHorizontal() {
        return handleMirrorHorizontal;
    }

    /**
     * Sets the value of the handleMirrorHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandleMirrorHorizontal(Boolean value) {
        this.handleMirrorHorizontal = value;
    }

    /**
     * Gets the value of the handleSwitched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHandleSwitched() {
        return handleSwitched;
    }

    /**
     * Sets the value of the handleSwitched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandleSwitched(Boolean value) {
        this.handleSwitched = value;
    }

    /**
     * Gets the value of the handlePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlePosition() {
        return handlePosition;
    }

    /**
     * Sets the value of the handlePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlePosition(String value) {
        this.handlePosition = value;
    }

    /**
     * Gets the value of the handleRangeXMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleRangeXMinimum() {
        return handleRangeXMinimum;
    }

    /**
     * Sets the value of the handleRangeXMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleRangeXMinimum(String value) {
        this.handleRangeXMinimum = value;
    }

    /**
     * Gets the value of the handleRangeXMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleRangeXMaximum() {
        return handleRangeXMaximum;
    }

    /**
     * Sets the value of the handleRangeXMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleRangeXMaximum(String value) {
        this.handleRangeXMaximum = value;
    }

    /**
     * Gets the value of the handleRangeYMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleRangeYMinimum() {
        return handleRangeYMinimum;
    }

    /**
     * Sets the value of the handleRangeYMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleRangeYMinimum(String value) {
        this.handleRangeYMinimum = value;
    }

    /**
     * Gets the value of the handleRangeYMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleRangeYMaximum() {
        return handleRangeYMaximum;
    }

    /**
     * Sets the value of the handleRangeYMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleRangeYMaximum(String value) {
        this.handleRangeYMaximum = value;
    }

    /**
     * Gets the value of the handlePolar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlePolar() {
        return handlePolar;
    }

    /**
     * Sets the value of the handlePolar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlePolar(String value) {
        this.handlePolar = value;
    }

    /**
     * Gets the value of the handleRadiusRangeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleRadiusRangeMinimum() {
        return handleRadiusRangeMinimum;
    }

    /**
     * Sets the value of the handleRadiusRangeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleRadiusRangeMinimum(String value) {
        this.handleRadiusRangeMinimum = value;
    }

    /**
     * Gets the value of the handleRadiusRangeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleRadiusRangeMaximum() {
        return handleRadiusRangeMaximum;
    }

    /**
     * Sets the value of the handleRadiusRangeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleRadiusRangeMaximum(String value) {
        this.handleRadiusRangeMaximum = value;
    }

}
