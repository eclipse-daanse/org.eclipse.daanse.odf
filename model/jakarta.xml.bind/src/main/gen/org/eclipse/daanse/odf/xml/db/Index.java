
package org.eclipse.daanse.odf.xml.db;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}index-columns" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-index-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indexColumns"
})
@XmlRootElement(name = "index")
public class Index {

    @XmlElement(name = "index-columns", required = true)
    protected List<IndexColumns> indexColumns;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    protected String name;
    @XmlAttribute(name = "catalog-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String catalogName;
    @XmlAttribute(name = "is-unique", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean isUnique;
    @XmlAttribute(name = "is-clustered", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean isClustered;

    /**
     * Gets the value of the indexColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the indexColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexColumns }
     * 
     * 
     */
    public List<IndexColumns> getIndexColumns() {
        if (indexColumns == null) {
            indexColumns = new ArrayList<IndexColumns>();
        }
        return this.indexColumns;
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
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the isUnique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsUnique() {
        return isUnique;
    }

    /**
     * Sets the value of the isUnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnique(Boolean value) {
        this.isUnique = value;
    }

    /**
     * Gets the value of the isClustered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsClustered() {
        return isClustered;
    }

    /**
     * Sets the value of the isClustered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClustered(Boolean value) {
        this.isClustered = value;
    }

}
