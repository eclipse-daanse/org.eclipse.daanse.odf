
package org.eclipse.daanse.odf.model.jakarta.xml.bind.style;

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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-map-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "map")
public class Map {

    @XmlAttribute(name = "condition", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String condition;
    @XmlAttribute(name = "apply-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String applyStyleName;
    @XmlAttribute(name = "base-cell-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String baseCellAddress;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the applyStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyStyleName() {
        return applyStyleName;
    }

    /**
     * Sets the value of the applyStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyStyleName(String value) {
        this.applyStyleName = value;
    }

    /**
     * Gets the value of the baseCellAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCellAddress() {
        return baseCellAddress;
    }

    /**
     * Sets the value of the baseCellAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCellAddress(String value) {
        this.baseCellAddress = value;
    }

}
