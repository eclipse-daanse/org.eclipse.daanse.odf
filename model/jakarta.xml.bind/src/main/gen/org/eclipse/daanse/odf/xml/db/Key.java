
package org.eclipse.daanse.odf.xml.db;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}key-columns" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-key-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyColumns"
})
@XmlRootElement(name = "key")
public class Key {

    @XmlElement(name = "key-columns", required = true)
    protected List<KeyColumns> keyColumns;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String name;
    @XmlAttribute(name = "referenced-table-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String referencedTableName;
    @XmlAttribute(name = "update-rule", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String updateRule;
    @XmlAttribute(name = "delete-rule", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deleteRule;
    @XmlAttribute(name = "type", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the keyColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the keyColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyColumns }
     * 
     * 
     */
    public List<KeyColumns> getKeyColumns() {
        if (keyColumns == null) {
            keyColumns = new ArrayList<KeyColumns>();
        }
        return this.keyColumns;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the referencedTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedTableName() {
        return referencedTableName;
    }

    /**
     * Sets the value of the referencedTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedTableName(String value) {
        this.referencedTableName = value;
    }

    /**
     * Gets the value of the updateRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateRule() {
        return updateRule;
    }

    /**
     * Sets the value of the updateRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateRule(String value) {
        this.updateRule = value;
    }

    /**
     * Gets the value of the deleteRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteRule() {
        return deleteRule;
    }

    /**
     * Sets the value of the deleteRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteRule(String value) {
        this.deleteRule = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
