
package org.eclipse.daanse.odf.xml.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.office.Forms;
import org.eclipse.daanse.odf.xml.office.TextSectionSourceDde;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.SoftPageBreak;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}title" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table-source" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}dde-source" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}scenario" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-forms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}shapes" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-columns-and-groups"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-rows-and-groups"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}named-expressions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "desc",
    "tableSource",
    "ddeSource",
    "scenario",
    "forms",
    "shapes",
    "tableColumnGroupOrTableHeaderColumnsAndTableColumn",
    "tableRowGroupOrTableHeaderRowsAndTableRows",
    "namedExpressions"
})
@XmlRootElement(name = "table")
public class Table {

    protected String title;
    protected String desc;
    @XmlElement(name = "table-source")
    protected TableSource tableSource;
    @XmlElement(name = "dde-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected TextSectionSourceDde ddeSource;
    protected Scenario scenario;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Forms forms;
    protected Shapes shapes;
    @XmlElements({
        @XmlElement(name = "table-column-group", type = TableColumnGroup.class),
        @XmlElement(name = "table-header-columns", type = TableHeaderColumns.class),
        @XmlElement(name = "table-column", type = TableColumn.class)
    })
    protected List<Object> tableColumnGroupOrTableHeaderColumnsAndTableColumn;
    @XmlElements({
        @XmlElement(name = "table-row-group", type = TableRowGroup.class),
        @XmlElement(name = "table-header-rows", type = TableHeaderRows.class),
        @XmlElement(name = "table-rows", type = TableRows.class),
        @XmlElement(name = "soft-page-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SoftPageBreak.class),
        @XmlElement(name = "table-row", type = TableRow.class)
    })
    protected List<Object> tableRowGroupOrTableHeaderRowsAndTableRows;
    @XmlElement(name = "named-expressions")
    protected NamedExpressions namedExpressions;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String styleName;
    @XmlAttribute(name = "template-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String templateName;
    @XmlAttribute(name = "use-first-row-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useFirstRowStyles;
    @XmlAttribute(name = "use-last-row-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useLastRowStyles;
    @XmlAttribute(name = "use-first-column-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useFirstColumnStyles;
    @XmlAttribute(name = "use-last-column-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useLastColumnStyles;
    @XmlAttribute(name = "use-banding-rows-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useBandingRowsStyles;
    @XmlAttribute(name = "use-banding-columns-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useBandingColumnsStyles;
    @XmlAttribute(name = "protected", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean _protected;
    @XmlAttribute(name = "protection-key", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String protectionKey;
    @XmlAttribute(name = "protection-key-digest-algorithm", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String protectionKeyDigestAlgorithm;
    @XmlAttribute(name = "print", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean print;
    @XmlAttribute(name = "print-ranges", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String printRanges;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "is-sub-table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean isSubTable;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String name;

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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the tableSource property.
     * 
     * @return
     *     possible object is
     *     {@link TableSource }
     *     
     */
    public TableSource getTableSource() {
        return tableSource;
    }

    /**
     * Sets the value of the tableSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableSource }
     *     
     */
    public void setTableSource(TableSource value) {
        this.tableSource = value;
    }

    /**
     * Gets the value of the ddeSource property.
     * 
     * @return
     *     possible object is
     *     {@link TextSectionSourceDde }
     *     
     */
    public TextSectionSourceDde getDdeSource() {
        return ddeSource;
    }

    /**
     * Sets the value of the ddeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextSectionSourceDde }
     *     
     */
    public void setDdeSource(TextSectionSourceDde value) {
        this.ddeSource = value;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link Scenario }
     *     
     */
    public Scenario getScenario() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scenario }
     *     
     */
    public void setScenario(Scenario value) {
        this.scenario = value;
    }

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public void setForms(Forms value) {
        this.forms = value;
    }

    /**
     * Gets the value of the shapes property.
     * 
     * @return
     *     possible object is
     *     {@link Shapes }
     *     
     */
    public Shapes getShapes() {
        return shapes;
    }

    /**
     * Sets the value of the shapes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shapes }
     *     
     */
    public void setShapes(Shapes value) {
        this.shapes = value;
    }

    /**
     * Gets the value of the tableColumnGroupOrTableHeaderColumnsAndTableColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tableColumnGroupOrTableHeaderColumnsAndTableColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableColumnGroupOrTableHeaderColumnsAndTableColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableColumnGroup }
     * {@link TableHeaderColumns }
     * {@link TableColumn }
     * 
     * 
     */
    public List<Object> getTableColumnGroupOrTableHeaderColumnsAndTableColumn() {
        if (tableColumnGroupOrTableHeaderColumnsAndTableColumn == null) {
            tableColumnGroupOrTableHeaderColumnsAndTableColumn = new ArrayList<Object>();
        }
        return this.tableColumnGroupOrTableHeaderColumnsAndTableColumn;
    }

    /**
     * Gets the value of the tableRowGroupOrTableHeaderRowsAndTableRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tableRowGroupOrTableHeaderRowsAndTableRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRowGroupOrTableHeaderRowsAndTableRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableRowGroup }
     * {@link TableHeaderRows }
     * {@link TableRows }
     * {@link SoftPageBreak }
     * {@link TableRow }
     * 
     * 
     */
    public List<Object> getTableRowGroupOrTableHeaderRowsAndTableRows() {
        if (tableRowGroupOrTableHeaderRowsAndTableRows == null) {
            tableRowGroupOrTableHeaderRowsAndTableRows = new ArrayList<Object>();
        }
        return this.tableRowGroupOrTableHeaderRowsAndTableRows;
    }

    /**
     * Gets the value of the namedExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link NamedExpressions }
     *     
     */
    public NamedExpressions getNamedExpressions() {
        return namedExpressions;
    }

    /**
     * Sets the value of the namedExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedExpressions }
     *     
     */
    public void setNamedExpressions(NamedExpressions value) {
        this.namedExpressions = value;
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
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the useFirstRowStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseFirstRowStyles() {
        return useFirstRowStyles;
    }

    /**
     * Sets the value of the useFirstRowStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFirstRowStyles(Boolean value) {
        this.useFirstRowStyles = value;
    }

    /**
     * Gets the value of the useLastRowStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseLastRowStyles() {
        return useLastRowStyles;
    }

    /**
     * Sets the value of the useLastRowStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLastRowStyles(Boolean value) {
        this.useLastRowStyles = value;
    }

    /**
     * Gets the value of the useFirstColumnStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseFirstColumnStyles() {
        return useFirstColumnStyles;
    }

    /**
     * Sets the value of the useFirstColumnStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFirstColumnStyles(Boolean value) {
        this.useFirstColumnStyles = value;
    }

    /**
     * Gets the value of the useLastColumnStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseLastColumnStyles() {
        return useLastColumnStyles;
    }

    /**
     * Sets the value of the useLastColumnStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLastColumnStyles(Boolean value) {
        this.useLastColumnStyles = value;
    }

    /**
     * Gets the value of the useBandingRowsStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseBandingRowsStyles() {
        return useBandingRowsStyles;
    }

    /**
     * Sets the value of the useBandingRowsStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBandingRowsStyles(Boolean value) {
        this.useBandingRowsStyles = value;
    }

    /**
     * Gets the value of the useBandingColumnsStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseBandingColumnsStyles() {
        return useBandingColumnsStyles;
    }

    /**
     * Sets the value of the useBandingColumnsStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBandingColumnsStyles(Boolean value) {
        this.useBandingColumnsStyles = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtected(Boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the protectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKey() {
        return protectionKey;
    }

    /**
     * Sets the value of the protectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKey(String value) {
        this.protectionKey = value;
    }

    /**
     * Gets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKeyDigestAlgorithm() {
        return protectionKeyDigestAlgorithm;
    }

    /**
     * Sets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKeyDigestAlgorithm(String value) {
        this.protectionKeyDigestAlgorithm = value;
    }

    /**
     * Gets the value of the print property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrint() {
        return print;
    }

    /**
     * Sets the value of the print property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint(Boolean value) {
        this.print = value;
    }

    /**
     * Gets the value of the printRanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintRanges() {
        return printRanges;
    }

    /**
     * Sets the value of the printRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintRanges(String value) {
        this.printRanges = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isSubTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsSubTable() {
        return isSubTable;
    }

    /**
     * Sets the value of the isSubTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubTable(Boolean value) {
        this.isSubTable = value;
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
