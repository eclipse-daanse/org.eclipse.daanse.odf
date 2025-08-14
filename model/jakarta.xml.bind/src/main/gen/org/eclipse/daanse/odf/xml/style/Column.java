
package org.eclipse.daanse.odf.xml.style;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-column-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "column")
public class Column {

    @XmlAttribute(name = "start-indent", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String startIndent;
    @XmlAttribute(name = "end-indent", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String endIndent;
    @XmlAttribute(name = "space-before", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String spaceBefore;
    @XmlAttribute(name = "space-after", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String spaceAfter;
    @XmlAttribute(name = "rel-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String relWidth;

    /**
     * Gets the value of the startIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartIndent() {
        return startIndent;
    }

    /**
     * Sets the value of the startIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartIndent(String value) {
        this.startIndent = value;
    }

    /**
     * Gets the value of the endIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIndent() {
        return endIndent;
    }

    /**
     * Sets the value of the endIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIndent(String value) {
        this.endIndent = value;
    }

    /**
     * Gets the value of the spaceBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceBefore() {
        return spaceBefore;
    }

    /**
     * Sets the value of the spaceBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceBefore(String value) {
        this.spaceBefore = value;
    }

    /**
     * Gets the value of the spaceAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceAfter() {
        return spaceAfter;
    }

    /**
     * Sets the value of the spaceAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceAfter(String value) {
        this.spaceAfter = value;
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

}
