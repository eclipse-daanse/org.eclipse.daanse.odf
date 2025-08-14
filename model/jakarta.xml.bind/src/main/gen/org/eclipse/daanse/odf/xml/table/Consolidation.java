
package org.eclipse.daanse.odf.xml.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-consolidation-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "consolidation")
public class Consolidation {

    @XmlAttribute(name = "source-cell-range-addresses", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String sourceCellRangeAddresses;
    @XmlAttribute(name = "target-cell-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String targetCellAddress;
    @XmlAttribute(name = "use-labels", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useLabels;
    @XmlAttribute(name = "link-to-source-data", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean linkToSourceData;
    @XmlAttribute(name = "function", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String function;

    /**
     * Gets the value of the sourceCellRangeAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCellRangeAddresses() {
        return sourceCellRangeAddresses;
    }

    /**
     * Sets the value of the sourceCellRangeAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCellRangeAddresses(String value) {
        this.sourceCellRangeAddresses = value;
    }

    /**
     * Gets the value of the targetCellAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCellAddress() {
        return targetCellAddress;
    }

    /**
     * Sets the value of the targetCellAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCellAddress(String value) {
        this.targetCellAddress = value;
    }

    /**
     * Gets the value of the useLabels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLabels() {
        return useLabels;
    }

    /**
     * Sets the value of the useLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLabels(String value) {
        this.useLabels = value;
    }

    /**
     * Gets the value of the linkToSourceData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLinkToSourceData() {
        return linkToSourceData;
    }

    /**
     * Sets the value of the linkToSourceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkToSourceData(Boolean value) {
        this.linkToSourceData = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

}
