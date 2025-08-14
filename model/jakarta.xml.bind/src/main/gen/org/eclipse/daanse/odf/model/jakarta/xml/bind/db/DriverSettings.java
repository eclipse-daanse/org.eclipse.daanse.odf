
package org.eclipse.daanse.odf.model.jakarta.xml.bind.db;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}auto-increment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}delimiter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}character-set" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}table-settings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-driver-settings-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autoIncrement",
    "delimiter",
    "characterSet",
    "tableSettings"
})
@XmlRootElement(name = "driver-settings")
public class DriverSettings {

    @XmlElement(name = "auto-increment")
    protected AutoIncrement autoIncrement;
    protected Delimiter delimiter;
    @XmlElement(name = "character-set")
    protected CharacterSet characterSet;
    @XmlElement(name = "table-settings")
    protected TableSettings tableSettings;
    @XmlAttribute(name = "system-driver-settings", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String systemDriverSettings;
    @XmlAttribute(name = "base-dn", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String baseDn;
    @XmlAttribute(name = "parameter-name-substitution", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean parameterNameSubstitution;
    @XmlAttribute(name = "show-deleted", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean showDeleted;
    @XmlAttribute(name = "is-first-row-header-line", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean isFirstRowHeaderLine;

    /**
     * Gets the value of the autoIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link AutoIncrement }
     *     
     */
    public AutoIncrement getAutoIncrement() {
        return autoIncrement;
    }

    /**
     * Sets the value of the autoIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoIncrement }
     *     
     */
    public void setAutoIncrement(AutoIncrement value) {
        this.autoIncrement = value;
    }

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
     * Gets the value of the tableSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TableSettings }
     *     
     */
    public TableSettings getTableSettings() {
        return tableSettings;
    }

    /**
     * Sets the value of the tableSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableSettings }
     *     
     */
    public void setTableSettings(TableSettings value) {
        this.tableSettings = value;
    }

    /**
     * Gets the value of the systemDriverSettings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDriverSettings() {
        return systemDriverSettings;
    }

    /**
     * Sets the value of the systemDriverSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDriverSettings(String value) {
        this.systemDriverSettings = value;
    }

    /**
     * Gets the value of the baseDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDn() {
        return baseDn;
    }

    /**
     * Sets the value of the baseDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDn(String value) {
        this.baseDn = value;
    }

    /**
     * Gets the value of the parameterNameSubstitution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getParameterNameSubstitution() {
        return parameterNameSubstitution;
    }

    /**
     * Sets the value of the parameterNameSubstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParameterNameSubstitution(Boolean value) {
        this.parameterNameSubstitution = value;
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
