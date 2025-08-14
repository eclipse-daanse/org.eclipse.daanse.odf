
package org.eclipse.daanse.odf.xml.db;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}delimiter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}character-set" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-table-setting-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "delimiter",
    "characterSet"
})
@XmlRootElement(name = "table-setting")
public class TableSetting {

    protected Delimiter delimiter;
    @XmlElement(name = "character-set")
    protected CharacterSet characterSet;
    @XmlAttribute(name = "show-deleted", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean showDeleted;
    @XmlAttribute(name = "is-first-row-header-line", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean isFirstRowHeaderLine;

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link Delimiter }
     *     
     */
    public Delimiter getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delimiter }
     *     
     */
    public void setDelimiter(Delimiter value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSet }
     *     
     */
    public CharacterSet getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSet }
     *     
     */
    public void setCharacterSet(CharacterSet value) {
        this.characterSet = value;
    }

    /**
     * Gets the value of the showDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowDeleted() {
        return showDeleted;
    }

    /**
     * Sets the value of the showDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDeleted(Boolean value) {
        this.showDeleted = value;
    }

    /**
     * Gets the value of the isFirstRowHeaderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsFirstRowHeaderLine() {
        return isFirstRowHeaderLine;
    }

    /**
     * Sets the value of the isFirstRowHeaderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFirstRowHeaderLine(Boolean value) {
        this.isFirstRowHeaderLine = value;
    }

}
