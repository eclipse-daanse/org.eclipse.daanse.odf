
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-scenario-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "scenario")
public class Scenario {

    @XmlAttribute(name = "scenario-ranges", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String scenarioRanges;
    @XmlAttribute(name = "is-active", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected Boolean isActive;
    @XmlAttribute(name = "display-border", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean displayBorder;
    @XmlAttribute(name = "border-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String borderColor;
    @XmlAttribute(name = "copy-back", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean copyBack;
    @XmlAttribute(name = "copy-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean copyStyles;
    @XmlAttribute(name = "copy-formulas", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean copyFormulas;
    @XmlAttribute(name = "comment", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String comment;
    @XmlAttribute(name = "protected", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean _protected;

    /**
     * Gets the value of the scenarioRanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScenarioRanges() {
        return scenarioRanges;
    }

    /**
     * Sets the value of the scenarioRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScenarioRanges(String value) {
        this.scenarioRanges = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the displayBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayBorder() {
        return displayBorder;
    }

    /**
     * Sets the value of the displayBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayBorder(Boolean value) {
        this.displayBorder = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the copyBack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCopyBack() {
        return copyBack;
    }

    /**
     * Sets the value of the copyBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyBack(Boolean value) {
        this.copyBack = value;
    }

    /**
     * Gets the value of the copyStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCopyStyles() {
        return copyStyles;
    }

    /**
     * Sets the value of the copyStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyStyles(Boolean value) {
        this.copyStyles = value;
    }

    /**
     * Gets the value of the copyFormulas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCopyFormulas() {
        return copyFormulas;
    }

    /**
     * Sets the value of the copyFormulas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyFormulas(Boolean value) {
        this.copyFormulas = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtected(Boolean value) {
        this._protected = value;
    }

}
