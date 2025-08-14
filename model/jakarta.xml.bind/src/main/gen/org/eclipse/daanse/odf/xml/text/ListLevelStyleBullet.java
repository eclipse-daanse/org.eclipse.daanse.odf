
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-list-level-style-bullet-attr"/&gt;
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
public class ListLevelStyleBullet {

    @XmlElement(name = "list-level-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleListLevelPropertiesContentStrict listLevelProperties;
    @XmlElement(name = "text-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected TextProperties textProperties;
    @XmlAttribute(name = "level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected BigInteger level;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String styleName;
    @XmlAttribute(name = "bullet-char", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String bulletChar;
    @XmlAttribute(name = "bullet-relative-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String bulletRelativeSize;
    @XmlAttribute(name = "num-prefix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numPrefix;
    @XmlAttribute(name = "num-suffix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numSuffix;

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
     * Gets the value of the bulletChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulletChar() {
        return bulletChar;
    }

    /**
     * Sets the value of the bulletChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulletChar(String value) {
        this.bulletChar = value;
    }

    /**
     * Gets the value of the bulletRelativeSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulletRelativeSize() {
        return bulletRelativeSize;
    }

    /**
     * Sets the value of the bulletRelativeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulletRelativeSize(String value) {
        this.bulletRelativeSize = value;
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

}
