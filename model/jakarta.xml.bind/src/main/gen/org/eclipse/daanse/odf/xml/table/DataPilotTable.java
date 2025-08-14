
package org.eclipse.daanse.odf.xml.table;

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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}database-source-sql"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}database-source-query"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}database-source-table"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}source-service"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}source-cell-range"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-field" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-data-pilot-table-attlist"/&gt;
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
    "sourceService",
    "sourceCellRange",
    "dataPilotField"
})
@XmlRootElement(name = "data-pilot-table")
public class DataPilotTable {

    @XmlElement(name = "database-source-sql")
    protected DatabaseSourceSql databaseSourceSql;
    @XmlElement(name = "database-source-query")
    protected DatabaseSourceQuery databaseSourceQuery;
    @XmlElement(name = "database-source-table")
    protected DatabaseSourceTable databaseSourceTable;
    @XmlElement(name = "source-service")
    protected SourceService sourceService;
    @XmlElement(name = "source-cell-range")
    protected SourceCellRange sourceCellRange;
    @XmlElement(name = "data-pilot-field", required = true)
    protected List<DataPilotField> dataPilotField;
    @XmlAttribute(name = "application-data", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String applicationData;
    @XmlAttribute(name = "grand-total", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String grandTotal;
    @XmlAttribute(name = "ignore-empty-rows", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean ignoreEmptyRows;
    @XmlAttribute(name = "identify-categories", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean identifyCategories;
    @XmlAttribute(name = "target-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String targetRangeAddress;
    @XmlAttribute(name = "buttons", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String buttons;
    @XmlAttribute(name = "show-filter-button", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean showFilterButton;
    @XmlAttribute(name = "drill-down-on-double-click", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean drillDownOnDoubleClick;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String name;

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
     * Gets the value of the sourceService property.
     * 
     * @return
     *     possible object is
     *     {@link SourceService }
     *     
     */
    public SourceService getSourceService() {
        return sourceService;
    }

    /**
     * Sets the value of the sourceService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceService }
     *     
     */
    public void setSourceService(SourceService value) {
        this.sourceService = value;
    }

    /**
     * Gets the value of the sourceCellRange property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCellRange }
     *     
     */
    public SourceCellRange getSourceCellRange() {
        return sourceCellRange;
    }

    /**
     * Sets the value of the sourceCellRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCellRange }
     *     
     */
    public void setSourceCellRange(SourceCellRange value) {
        this.sourceCellRange = value;
    }

    /**
     * Gets the value of the dataPilotField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataPilotField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPilotField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPilotField }
     * 
     * 
     */
    public List<DataPilotField> getDataPilotField() {
        if (dataPilotField == null) {
            dataPilotField = new ArrayList<DataPilotField>();
        }
        return this.dataPilotField;
    }

    /**
     * Gets the value of the applicationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationData() {
        return applicationData;
    }

    /**
     * Sets the value of the applicationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationData(String value) {
        this.applicationData = value;
    }

    /**
     * Gets the value of the grandTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandTotal() {
        return grandTotal;
    }

    /**
     * Sets the value of the grandTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandTotal(String value) {
        this.grandTotal = value;
    }

    /**
     * Gets the value of the ignoreEmptyRows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreEmptyRows() {
        return ignoreEmptyRows;
    }

    /**
     * Sets the value of the ignoreEmptyRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreEmptyRows(Boolean value) {
        this.ignoreEmptyRows = value;
    }

    /**
     * Gets the value of the identifyCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIdentifyCategories() {
        return identifyCategories;
    }

    /**
     * Sets the value of the identifyCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifyCategories(Boolean value) {
        this.identifyCategories = value;
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
     * Gets the value of the buttons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtons() {
        return buttons;
    }

    /**
     * Sets the value of the buttons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtons(String value) {
        this.buttons = value;
    }

    /**
     * Gets the value of the showFilterButton property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowFilterButton() {
        return showFilterButton;
    }

    /**
     * Sets the value of the showFilterButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowFilterButton(Boolean value) {
        this.showFilterButton = value;
    }

    /**
     * Gets the value of the drillDownOnDoubleClick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDrillDownOnDoubleClick() {
        return drillDownOnDoubleClick;
    }

    /**
     * Sets the value of the drillDownOnDoubleClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrillDownOnDoubleClick(Boolean value) {
        this.drillDownOnDoubleClick = value;
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

}
