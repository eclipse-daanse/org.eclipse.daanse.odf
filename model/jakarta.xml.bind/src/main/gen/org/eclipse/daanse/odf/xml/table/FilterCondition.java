
package org.eclipse.daanse.odf.xml.table;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}filter-set-item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-filter-condition-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterSetItem"
})
@XmlRootElement(name = "filter-condition")
public class FilterCondition {

    @XmlElement(name = "filter-set-item")
    protected List<FilterSetItem> filterSetItem;
    @XmlAttribute(name = "field-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected BigInteger fieldNumber;
    @XmlAttribute(name = "value", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String value;
    @XmlAttribute(name = "operator", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String operator;
    @XmlAttribute(name = "case-sensitive", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String caseSensitive;
    @XmlAttribute(name = "data-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataType;

    /**
     * Gets the value of the filterSetItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the filterSetItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterSetItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterSetItem }
     * 
     * 
     */
    public List<FilterSetItem> getFilterSetItem() {
        if (filterSetItem == null) {
            filterSetItem = new ArrayList<FilterSetItem>();
        }
        return this.filterSetItem;
    }

    /**
     * Gets the value of the fieldNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFieldNumber() {
        return fieldNumber;
    }

    /**
     * Sets the value of the fieldNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFieldNumber(BigInteger value) {
        this.fieldNumber = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseSensitive(String value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

}
