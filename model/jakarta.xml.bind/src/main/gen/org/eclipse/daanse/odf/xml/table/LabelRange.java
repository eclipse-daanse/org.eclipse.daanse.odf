
package org.eclipse.daanse.odf.xml.table;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-label-range-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "label-range")
public class LabelRange {

    @XmlAttribute(name = "label-cell-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String labelCellRangeAddress;
    @XmlAttribute(name = "data-cell-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String dataCellRangeAddress;
    @XmlAttribute(name = "orientation", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;

    /**
     * Gets the value of the labelCellRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCellRangeAddress() {
        return labelCellRangeAddress;
    }

    /**
     * Sets the value of the labelCellRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCellRangeAddress(String value) {
        this.labelCellRangeAddress = value;
    }

    /**
     * Gets the value of the dataCellRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCellRangeAddress() {
        return dataCellRangeAddress;
    }

    /**
     * Sets the value of the dataCellRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCellRangeAddress(String value) {
        this.dataCellRangeAddress = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

}
