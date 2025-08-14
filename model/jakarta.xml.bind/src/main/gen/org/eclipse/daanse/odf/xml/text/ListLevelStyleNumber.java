
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.style.TextProperties;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}list-level-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}text-properties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-list-level-style-attr"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-list-level-style-number-attr"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listLevelProperties",
    "textProperties"
})
public class ListLevelStyleNumber {

    @XmlElement(name = "list-level-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleListLevelPropertiesContentStrict listLevelProperties;
    @XmlElement(name = "text-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected TextProperties textProperties;
    @XmlAttribute(name = "level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected BigInteger level;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String styleName;
    @XmlAttribute(name = "display-levels", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger displayLevels;
    @XmlAttribute(name = "start-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger startValue;
    @XmlAttribute(name = "num-prefix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numPrefix;
    @XmlAttribute(name = "num-suffix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numSuffix;
    @XmlAttribute(name = "num-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> numFormat;
    @XmlAttribute(name = "num-letter-sync", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean numLetterSync;

    /**
     * Gets the value of the listLevelProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleListLevelPropertiesContentStrict }
     *     
     */
    public StyleListLevelPropertiesContentStrict getListLevelProperties() {
        return listLevelProperties;
    }

    /**
     * Sets the value of the listLevelProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleListLevelPropertiesContentStrict }
     *     
     */
    public void setListLevelProperties(StyleListLevelPropertiesContentStrict value) {
        this.listLevelProperties = value;
    }

    /**
     * Gets the value of the textProperties property.
     * 
     * @return
     *     possible object is
     *     {@link TextProperties }
     *     
     */
    public TextProperties getTextProperties() {
        return textProperties;
    }

    /**
     * Sets the value of the textProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextProperties }
     *     
     */
    public void setTextProperties(TextProperties value) {
        this.textProperties = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

    /**
     * Gets the value of the displayLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayLevels() {
        return displayLevels;
    }

    /**
     * Sets the value of the displayLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayLevels(BigInteger value) {
        this.displayLevels = value;
    }

    /**
     * Gets the value of the startValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartValue() {
        return startValue;
    }

    /**
     * Sets the value of the startValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartValue(BigInteger value) {
        this.startValue = value;
    }

    /**
     * Gets the value of the numPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrefix() {
        return numPrefix;
    }

    /**
     * Sets the value of the numPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrefix(String value) {
        this.numPrefix = value;
    }

    /**
     * Gets the value of the numSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSuffix() {
        return numSuffix;
    }

    /**
     * Sets the value of the numSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSuffix(String value) {
        this.numSuffix = value;
    }

    /**
     * Gets the value of the numFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumFormat() {
        if (numFormat == null) {
            numFormat = new ArrayList<String>();
        }
        return this.numFormat;
    }

    /**
     * Gets the value of the numLetterSync property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNumLetterSync() {
        return numLetterSync;
    }

    /**
     * Sets the value of the numLetterSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumLetterSync(Boolean value) {
        this.numLetterSync = value;
    }

}
