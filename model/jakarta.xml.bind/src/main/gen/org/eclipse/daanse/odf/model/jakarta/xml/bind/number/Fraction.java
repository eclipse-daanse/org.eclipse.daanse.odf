
package org.eclipse.daanse.odf.model.jakarta.xml.bind.number;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}number-fraction-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-number-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Fraction {

    @XmlAttribute(name = "min-numerator-digits", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minNumeratorDigits;
    @XmlAttribute(name = "min-denominator-digits", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minDenominatorDigits;
    @XmlAttribute(name = "denominator-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger denominatorValue;
    @XmlAttribute(name = "max-denominator-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger maxDenominatorValue;
    @XmlAttribute(name = "min-integer-digits", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minIntegerDigits;
    @XmlAttribute(name = "grouping", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Boolean grouping;

    /**
     * Gets the value of the minNumeratorDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumeratorDigits() {
        return minNumeratorDigits;
    }

    /**
     * Sets the value of the minNumeratorDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumeratorDigits(BigInteger value) {
        this.minNumeratorDigits = value;
    }

    /**
     * Gets the value of the minDenominatorDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDenominatorDigits() {
        return minDenominatorDigits;
    }

    /**
     * Sets the value of the minDenominatorDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDenominatorDigits(BigInteger value) {
        this.minDenominatorDigits = value;
    }

    /**
     * Gets the value of the denominatorValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenominatorValue() {
        return denominatorValue;
    }

    /**
     * Sets the value of the denominatorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenominatorValue(BigInteger value) {
        this.denominatorValue = value;
    }

    /**
     * Gets the value of the maxDenominatorValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDenominatorValue() {
        return maxDenominatorValue;
    }

    /**
     * Sets the value of the maxDenominatorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDenominatorValue(BigInteger value) {
        this.maxDenominatorValue = value;
    }

    /**
     * Gets the value of the minIntegerDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinIntegerDigits() {
        return minIntegerDigits;
    }

    /**
     * Sets the value of the minIntegerDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinIntegerDigits(BigInteger value) {
        this.minIntegerDigits = value;
    }

    /**
     * Gets the value of the grouping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGrouping() {
        return grouping;
    }

    /**
     * Sets the value of the grouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrouping(Boolean value) {
        this.grouping = value;
    }

}
