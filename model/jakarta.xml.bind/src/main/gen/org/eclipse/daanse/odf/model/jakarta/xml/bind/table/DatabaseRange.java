
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}database-source-sql"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}database-source-query"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}database-source-table"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}filter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}sort" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}subtotal-rules" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-database-range-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "databaseSourceSql",
    "databaseSourceQuery",
    "databaseSourceTable",
    "filter",
    "sort",
    "subtotalRules"
})
@XmlRootElement(name = "database-range")
public class DatabaseRange {

    @XmlElement(name = "database-source-sql")
    protected DatabaseSourceSql databaseSourceSql;
    @XmlElement(name = "database-source-query")
    protected DatabaseSourceQuery databaseSourceQuery;
    @XmlElement(name = "database-source-table")
    protected DatabaseSourceTable databaseSourceTable;
    protected Filter filter;
    protected Sort sort;
    @XmlElement(name = "subtotal-rules")
    protected SubtotalRules subtotalRules;
    @XmlAttribute(name = "is-selection", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean isSelection;
    @XmlAttribute(name = "on-update-keep-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean onUpdateKeepStyles;
    @XmlAttribute(name = "on-update-keep-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean onUpdateKeepSize;
    @XmlAttribute(name = "has-persistent-data", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean hasPersistentData;
    @XmlAttribute(name = "contains-header", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean containsHeader;
    @XmlAttribute(name = "display-filter-buttons", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean displayFilterButtons;
    @XmlAttribute(name = "target-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String targetRangeAddress;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String name;
    @XmlAttribute(name = "orientation", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "refresh-delay", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected Boolean refreshDelay;

    /**
     * Gets the value of the databaseSourceSql property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseSourceSql }
     *     
     */
    public DatabaseSourceSql getDatabaseSourceSql() {
        return databaseSourceSql;
    }

    /**
     * Sets the value of the databaseSourceSql property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseSourceSql }
     *     
     */
    public void setDatabaseSourceSql(DatabaseSourceSql value) {
        this.databaseSourceSql = value;
    }

    /**
     * Gets the value of the databaseSourceQuery property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseSourceQuery }
     *     
     */
    public DatabaseSourceQuery getDatabaseSourceQuery() {
        return databaseSourceQuery;
    }

    /**
     * Sets the value of the databaseSourceQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseSourceQuery }
     *     
     */
    public void setDatabaseSourceQuery(DatabaseSourceQuery value) {
        this.databaseSourceQuery = value;
    }

    /**
     * Gets the value of the databaseSourceTable property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseSourceTable }
     *     
     */
    public DatabaseSourceTable getDatabaseSourceTable() {
        return databaseSourceTable;
    }

    /**
     * Sets the value of the databaseSourceTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseSourceTable }
     *     
     */
    public void setDatabaseSourceTable(DatabaseSourceTable value) {
        this.databaseSourceTable = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link Sort }
     *     
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sort }
     *     
     */
    public void setSort(Sort value) {
        this.sort = value;
    }

    /**
     * Gets the value of the subtotalRules property.
     * 
     * @return
     *     possible object is
     *     {@link SubtotalRules }
     *     
     */
    public SubtotalRules getSubtotalRules() {
        return subtotalRules;
    }

    /**
     * Sets the value of the subtotalRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtotalRules }
     *     
     */
    public void setSubtotalRules(SubtotalRules value) {
        this.subtotalRules = value;
    }

    /**
     * Gets the value of the isSelection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsSelection() {
        return isSelection;
    }

    /**
     * Sets the value of the isSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelection(Boolean value) {
        this.isSelection = value;
    }

    /**
     * Gets the value of the onUpdateKeepStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOnUpdateKeepStyles() {
        return onUpdateKeepStyles;
    }

    /**
     * Sets the value of the onUpdateKeepStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnUpdateKeepStyles(Boolean value) {
        this.onUpdateKeepStyles = value;
    }

    /**
     * Gets the value of the onUpdateKeepSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOnUpdateKeepSize() {
        return onUpdateKeepSize;
    }

    /**
     * Sets the value of the onUpdateKeepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnUpdateKeepSize(Boolean value) {
        this.onUpdateKeepSize = value;
    }

    /**
     * Gets the value of the hasPersistentData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHasPersistentData() {
        return hasPersistentData;
    }

    /**
     * Sets the value of the hasPersistentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPersistentData(Boolean value) {
        this.hasPersistentData = value;
    }

    /**
     * Gets the value of the containsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContainsHeader() {
        return containsHeader;
    }

    /**
     * Sets the value of the containsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsHeader(Boolean value) {
        this.containsHeader = value;
    }

    /**
     * Gets the value of the displayFilterButtons property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayFilterButtons() {
        return displayFilterButtons;
    }

    /**
     * Sets the value of the displayFilterButtons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayFilterButtons(Boolean value) {
        this.displayFilterButtons = value;
    }

    /**
     * Gets the value of the targetRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRangeAddress() {
        return targetRangeAddress;
    }

    /**
     * Sets the value of the targetRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRangeAddress(String value) {
        this.targetRangeAddress = value;
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
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the refreshDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRefreshDelay() {
        return refreshDelay;
    }

    /**
     * Sets the value of the refreshDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshDelay(Boolean value) {
        this.refreshDelay = value;
    }

}
