
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-conditional-text-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "conditional-text")
public class ConditionalText {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "condition", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String condition;
    @XmlAttribute(name = "string-value-if-true", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String stringValueIfTrue;
    @XmlAttribute(name = "string-value-if-false", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String stringValueIfFalse;
    @XmlAttribute(name = "current-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean currentValue;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

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
     * Gets the value of the stringValueIfTrue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValueIfTrue() {
        return stringValueIfTrue;
    }

    /**
     * Sets the value of the stringValueIfTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValueIfTrue(String value) {
        this.stringValueIfTrue = value;
    }

    /**
     * Gets the value of the stringValueIfFalse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValueIfFalse() {
        return stringValueIfFalse;
    }

    /**
     * Sets the value of the stringValueIfFalse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValueIfFalse(String value) {
        this.stringValueIfFalse = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentValue(Boolean value) {
        this.currentValue = value;
    }

}
