
package org.eclipse.daanse.odf.xml.number;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0}embedded-text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}number-number-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-number-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-decimal-places-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "embeddedText"
})
public class Number {

    @XmlElement(name = "embedded-text")
    protected List<EmbeddedText> embeddedText;
    @XmlAttribute(name = "decimal-replacement", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected String decimalReplacement;
    @XmlAttribute(name = "display-factor", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Double displayFactor;
    @XmlAttribute(name = "min-integer-digits", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minIntegerDigits;
    @XmlAttribute(name = "grouping", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Boolean grouping;
    @XmlAttribute(name = "decimal-places", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "min-decimal-places", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected BigInteger minDecimalPlaces;

    /**
     * Gets the value of the embeddedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the embeddedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbeddedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmbeddedText }
     * 
     * 
     */
    public List<EmbeddedText> getEmbeddedText() {
        if (embeddedText == null) {
            embeddedText = new ArrayList<EmbeddedText>();
        }
        return this.embeddedText;
    }

    /**
     * Gets the value of the decimalReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalReplacement() {
        return decimalReplacement;
    }

    /**
     * Sets the value of the decimalReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalReplacement(String value) {
        this.decimalReplacement = value;
    }

    /**
     * Gets the value of the displayFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisplayFactor() {
        return displayFactor;
    }

    /**
     * Sets the value of the displayFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisplayFactor(Double value) {
        this.displayFactor = value;
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

}
