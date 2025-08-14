
package org.eclipse.daanse.odf.xml.number;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}number-scientific-number-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-decimal-places-attlist"/&gt;
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
public class ScientificNumber {

    @XmlAttribute(name = "min-exponent-digits", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minExponentDigits;
    @XmlAttribute(name = "exponent-interval", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger exponentInterval;
    @XmlAttribute(name = "forced-exponent-sign", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Boolean forcedExponentSign;
    @XmlAttribute(name = "decimal-places", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "min-decimal-places", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minDecimalPlaces;
    @XmlAttribute(name = "min-integer-digits", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minIntegerDigits;
    @XmlAttribute(name = "grouping", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Boolean grouping;

    /**
     * Gets the value of the minExponentDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinExponentDigits() {
        return minExponentDigits;
    }

    /**
     * Sets the value of the minExponentDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinExponentDigits(BigInteger value) {
        this.minExponentDigits = value;
    }

    /**
     * Gets the value of the exponentInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExponentInterval() {
        return exponentInterval;
    }

    /**
     * Sets the value of the exponentInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExponentInterval(BigInteger value) {
        this.exponentInterval = value;
    }

    /**
     * Gets the value of the forcedExponentSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForcedExponentSign() {
        return forcedExponentSign;
    }

    /**
     * Sets the value of the forcedExponentSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcedExponentSign(Boolean value) {
        this.forcedExponentSign = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the minDecimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDecimalPlaces() {
        return minDecimalPlaces;
    }

    /**
     * Sets the value of the minDecimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDecimalPlaces(BigInteger value) {
        this.minDecimalPlaces = value;
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
