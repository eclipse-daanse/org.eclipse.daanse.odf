
package org.eclipse.daanse.odf.xml.db;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}table-filter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}table-type-filter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}data-source-settings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-application-connection-settings-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableFilter",
    "tableTypeFilter",
    "dataSourceSettings"
})
@XmlRootElement(name = "application-connection-settings")
public class ApplicationConnectionSettings {

    @XmlElement(name = "table-filter")
    protected TableFilter tableFilter;
    @XmlElement(name = "table-type-filter")
    protected TableTypeFilter tableTypeFilter;
    @XmlElement(name = "data-source-settings")
    protected DataSourceSettings dataSourceSettings;
    @XmlAttribute(name = "is-table-name-length-limited", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean isTableNameLengthLimited;
    @XmlAttribute(name = "enable-sql92-check", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean enableSql92Check;
    @XmlAttribute(name = "append-table-alias-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean appendTableAliasName;
    @XmlAttribute(name = "ignore-driver-privileges", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean ignoreDriverPrivileges;
    @XmlAttribute(name = "boolean-comparison-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String booleanComparisonMode;
    @XmlAttribute(name = "use-catalog", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean useCatalog;
    @XmlAttribute(name = "max-row-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected BigInteger maxRowCount;
    @XmlAttribute(name = "suppress-version-columns", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean suppressVersionColumns;

    /**
     * Gets the value of the tableFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TableFilter }
     *     
     */
    public TableFilter getTableFilter() {
        return tableFilter;
    }

    /**
     * Sets the value of the tableFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableFilter }
     *     
     */
    public void setTableFilter(TableFilter value) {
        this.tableFilter = value;
    }

    /**
     * Gets the value of the tableTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TableTypeFilter }
     *     
     */
    public TableTypeFilter getTableTypeFilter() {
        return tableTypeFilter;
    }

    /**
     * Sets the value of the tableTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableTypeFilter }
     *     
     */
    public void setTableTypeFilter(TableTypeFilter value) {
        this.tableTypeFilter = value;
    }

    /**
     * Gets the value of the dataSourceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceSettings }
     *     
     */
    public DataSourceSettings getDataSourceSettings() {
        return dataSourceSettings;
    }

    /**
     * Sets the value of the dataSourceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceSettings }
     *     
     */
    public void setDataSourceSettings(DataSourceSettings value) {
        this.dataSourceSettings = value;
    }

    /**
     * Gets the value of the isTableNameLengthLimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsTableNameLengthLimited() {
        return isTableNameLengthLimited;
    }

    /**
     * Sets the value of the isTableNameLengthLimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTableNameLengthLimited(Boolean value) {
        this.isTableNameLengthLimited = value;
    }

    /**
     * Gets the value of the enableSql92Check property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnableSql92Check() {
        return enableSql92Check;
    }

    /**
     * Sets the value of the enableSql92Check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSql92Check(Boolean value) {
        this.enableSql92Check = value;
    }

    /**
     * Gets the value of the appendTableAliasName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAppendTableAliasName() {
        return appendTableAliasName;
    }

    /**
     * Sets the value of the appendTableAliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppendTableAliasName(Boolean value) {
        this.appendTableAliasName = value;
    }

    /**
     * Gets the value of the ignoreDriverPrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreDriverPrivileges() {
        return ignoreDriverPrivileges;
    }

    /**
     * Sets the value of the ignoreDriverPrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDriverPrivileges(Boolean value) {
        this.ignoreDriverPrivileges = value;
    }

    /**
     * Gets the value of the booleanComparisonMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanComparisonMode() {
        return booleanComparisonMode;
    }

    /**
     * Sets the value of the booleanComparisonMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanComparisonMode(String value) {
        this.booleanComparisonMode = value;
    }

    /**
     * Gets the value of the useCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseCatalog() {
        return useCatalog;
    }

    /**
     * Sets the value of the useCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCatalog(Boolean value) {
        this.useCatalog = value;
    }

    /**
     * Gets the value of the maxRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRowCount() {
        return maxRowCount;
    }

    /**
     * Sets the value of the maxRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRowCount(BigInteger value) {
        this.maxRowCount = value;
    }

    /**
     * Gets the value of the suppressVersionColumns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSuppressVersionColumns() {
        return suppressVersionColumns;
    }

    /**
     * Sets the value of the suppressVersionColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressVersionColumns(Boolean value) {
        this.suppressVersionColumns = value;
    }

}
