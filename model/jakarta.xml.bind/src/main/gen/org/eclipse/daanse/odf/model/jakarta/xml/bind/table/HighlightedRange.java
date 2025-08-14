
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;attribute name="cell-range-address" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}cellRangeAddress" /&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}direction"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}contains-error"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}marked-invalid"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "highlighted-range")
public class HighlightedRange {

    @XmlAttribute(name = "cell-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String cellRangeAddress;
    @XmlAttribute(name = "direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String direction;
    @XmlAttribute(name = "contains-error", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean containsError;
    @XmlAttribute(name = "marked-invalid", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean markedInvalid;

    /**
     * Gets the value of the cellRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellRangeAddress() {
        return cellRangeAddress;
    }

    /**
     * Sets the value of the cellRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellRangeAddress(String value) {
        this.cellRangeAddress = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the containsError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContainsError() {
        return containsError;
    }

    /**
     * Sets the value of the containsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsError(Boolean value) {
        this.containsError = value;
    }

    /**
     * Gets the value of the markedInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMarkedInvalid() {
        return markedInvalid;
    }

    /**
     * Sets the value of the markedInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkedInvalid(Boolean value) {
        this.markedInvalid = value;
    }

}
