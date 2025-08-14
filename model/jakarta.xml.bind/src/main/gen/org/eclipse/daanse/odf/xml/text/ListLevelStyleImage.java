
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-list-level-style-image-attr"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}list-level-properties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-list-level-style-attr"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listLevelProperties"
})
public class ListLevelStyleImage
    extends TextListLevelStyleImageAttr
{

    @XmlElement(name = "list-level-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleListLevelPropertiesContentStrict listLevelProperties;
    @XmlAttribute(name = "level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected BigInteger level;

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

}
