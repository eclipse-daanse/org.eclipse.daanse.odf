
package org.eclipse.daanse.odf.xml.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}filter-condition"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}filter-and"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}filter-or"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-filter-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterCondition",
    "filterAnd",
    "filterOr"
})
@XmlRootElement(name = "filter")
public class Filter {

    @XmlElement(name = "filter-condition")
    protected FilterCondition filterCondition;
    @XmlElement(name = "filter-and")
    protected FilterAnd filterAnd;
    @XmlElement(name = "filter-or")
    protected FilterOr filterOr;
    @XmlAttribute(name = "target-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String targetRangeAddress;
    @XmlAttribute(name = "condition-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conditionSource;
    @XmlAttribute(name = "condition-source-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String conditionSourceRangeAddress;
    @XmlAttribute(name = "display-duplicates", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean displayDuplicates;

    /**
     * Gets the value of the filterCondition property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCondition }
     *     
     */
    public FilterCondition getFilterCondition() {
        return filterCondition;
    }

    /**
     * Sets the value of the filterCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCondition }
     *     
     */
    public void setFilterCondition(FilterCondition value) {
        this.filterCondition = value;
    }

    /**
     * Gets the value of the filterAnd property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAnd }
     *     
     */
    public FilterAnd getFilterAnd() {
        return filterAnd;
    }

    /**
     * Sets the value of the filterAnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAnd }
     *     
     */
    public void setFilterAnd(FilterAnd value) {
        this.filterAnd = value;
    }

    /**
     * Gets the value of the filterOr property.
     * 
     * @return
     *     possible object is
     *     {@link FilterOr }
     *     
     */
    public FilterOr getFilterOr() {
        return filterOr;
    }

    /**
     * Sets the value of the filterOr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOr }
     *     
     */
    public void setFilterOr(FilterOr value) {
        this.filterOr = value;
    }

    /**
     * Gets the value of the targetRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRangeAddress() {
        return targetRangeAddress;
    }

    /**
     * Sets the value of the targetRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRangeAddress(String value) {
        this.targetRangeAddress = value;
    }

    /**
     * Gets the value of the conditionSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionSource() {
        return conditionSource;
    }

    /**
     * Sets the value of the conditionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionSource(String value) {
        this.conditionSource = value;
    }

    /**
     * Gets the value of the conditionSourceRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionSourceRangeAddress() {
        return conditionSourceRangeAddress;
    }

    /**
     * Sets the value of the conditionSourceRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionSourceRangeAddress(String value) {
        this.conditionSourceRangeAddress = value;
    }

    /**
     * Gets the value of the displayDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayDuplicates() {
        return displayDuplicates;
    }

    /**
     * Sets the value of the displayDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayDuplicates(Boolean value) {
        this.displayDuplicates = value;
    }

}
