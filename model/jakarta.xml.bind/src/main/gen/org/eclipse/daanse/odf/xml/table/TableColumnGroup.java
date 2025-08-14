
package org.eclipse.daanse.odf.xml.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-columns-and-groups"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-column-group-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableColumnGroupOrTableHeaderColumnsAndTableColumn"
})
@XmlRootElement(name = "table-column-group")
public class TableColumnGroup {

    @XmlElements({
        @XmlElement(name = "table-column-group", type = TableColumnGroup.class),
        @XmlElement(name = "table-header-columns", type = TableHeaderColumns.class),
        @XmlElement(name = "table-column", type = TableColumn.class)
    })
    protected List<Object> tableColumnGroupOrTableHeaderColumnsAndTableColumn;
    @XmlAttribute(name = "display", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean display;

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
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplay(Boolean value) {
        this.display = value;
    }

}
