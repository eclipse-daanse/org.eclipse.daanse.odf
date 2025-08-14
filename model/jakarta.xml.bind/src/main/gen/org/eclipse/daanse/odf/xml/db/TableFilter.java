
package org.eclipse.daanse.odf.xml.db;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}table-include-filter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}table-exclude-filter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableIncludeFilter",
    "tableExcludeFilter"
})
@XmlRootElement(name = "table-filter")
public class TableFilter {

    @XmlElement(name = "table-include-filter")
    protected TableIncludeFilter tableIncludeFilter;
    @XmlElement(name = "table-exclude-filter")
    protected TableExcludeFilter tableExcludeFilter;

    /**
     * Gets the value of the tableIncludeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TableIncludeFilter }
     *     
     */
    public TableIncludeFilter getTableIncludeFilter() {
        return tableIncludeFilter;
    }

    /**
     * Sets the value of the tableIncludeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableIncludeFilter }
     *     
     */
    public void setTableIncludeFilter(TableIncludeFilter value) {
        this.tableIncludeFilter = value;
    }

    /**
     * Gets the value of the tableExcludeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TableExcludeFilter }
     *     
     */
    public TableExcludeFilter getTableExcludeFilter() {
        return tableExcludeFilter;
    }

    /**
     * Sets the value of the tableExcludeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableExcludeFilter }
     *     
     */
    public void setTableExcludeFilter(TableExcludeFilter value) {
        this.tableExcludeFilter = value;
    }

}
