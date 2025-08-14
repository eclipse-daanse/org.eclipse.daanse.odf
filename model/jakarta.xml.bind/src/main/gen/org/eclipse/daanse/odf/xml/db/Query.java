
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}order-statement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}filter-statement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}columns" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}update-table" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-query-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-db-object-name"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-db-table-style-name"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-db-object-title"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-db-object-description"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderStatement",
    "filterStatement",
    "columns",
    "updateTable"
})
@XmlRootElement(name = "query")
public class Query {

    @XmlElement(name = "order-statement")
    protected OrderStatement orderStatement;
    @XmlElement(name = "filter-statement")
    protected FilterStatement filterStatement;
    protected Columns columns;
    @XmlElement(name = "update-table")
    protected UpdateTable updateTable;
    @XmlAttribute(name = "command", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    protected String command;
    @XmlAttribute(name = "escape-processing", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean escapeProcessing;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    protected String name;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String styleName;
    @XmlAttribute(name = "default-row-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String defaultRowStyleName;
    @XmlAttribute(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String title;
    @XmlAttribute(name = "description", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String description;

    /**
     * Gets the value of the orderStatement property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatement }
     *     
     */
    public OrderStatement getOrderStatement() {
        return orderStatement;
    }

    /**
     * Sets the value of the orderStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatement }
     *     
     */
    public void setOrderStatement(OrderStatement value) {
        this.orderStatement = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStatement }
     *     
     */
    public FilterStatement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStatement }
     *     
     */
    public void setFilterStatement(FilterStatement value) {
        this.filterStatement = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link Columns }
     *     
     */
    public Columns getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Columns }
     *     
     */
    public void setColumns(Columns value) {
        this.columns = value;
    }

    /**
     * Gets the value of the updateTable property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTable }
     *     
     */
    public UpdateTable getUpdateTable() {
        return updateTable;
    }

    /**
     * Sets the value of the updateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTable }
     *     
     */
    public void setUpdateTable(UpdateTable value) {
        this.updateTable = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the escapeProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEscapeProcessing() {
        return escapeProcessing;
    }

    /**
     * Sets the value of the escapeProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscapeProcessing(Boolean value) {
        this.escapeProcessing = value;
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
     * Gets the value of the defaultRowStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRowStyleName() {
        return defaultRowStyleName;
    }

    /**
     * Sets the value of the defaultRowStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRowStyleName(String value) {
        this.defaultRowStyleName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
