
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}subtotal-field" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-subtotal-rule-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subtotalField"
})
@XmlRootElement(name = "subtotal-rule")
public class SubtotalRule {

    @XmlElement(name = "subtotal-field")
    protected List<SubtotalField> subtotalField;
    @XmlAttribute(name = "group-by-field-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected BigInteger groupByFieldNumber;

    /**
     * Gets the value of the subtotalField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subtotalField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtotalField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubtotalField }
     * 
     * 
     */
    public List<SubtotalField> getSubtotalField() {
        if (subtotalField == null) {
            subtotalField = new ArrayList<SubtotalField>();
        }
        return this.subtotalField;
    }

    /**
     * Gets the value of the groupByFieldNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupByFieldNumber() {
        return groupByFieldNumber;
    }

    /**
     * Sets the value of the groupByFieldNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupByFieldNumber(BigInteger value) {
        this.groupByFieldNumber = value;
    }

}
