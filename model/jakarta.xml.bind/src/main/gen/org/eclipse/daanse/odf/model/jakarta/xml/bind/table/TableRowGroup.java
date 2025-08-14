
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.SoftPageBreak;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-rows-and-groups"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-row-group-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableRowGroupOrTableHeaderRowsAndTableRows"
})
@XmlRootElement(name = "table-row-group")
public class TableRowGroup {

    @XmlElements({
        @XmlElement(name = "table-row-group", type = TableRowGroup.class),
        @XmlElement(name = "table-header-rows", type = TableHeaderRows.class),
        @XmlElement(name = "table-rows", type = TableRows.class),
        @XmlElement(name = "soft-page-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SoftPageBreak.class),
        @XmlElement(name = "table-row", type = TableRow.class)
    })
    protected List<Object> tableRowGroupOrTableHeaderRowsAndTableRows;
    @XmlAttribute(name = "display", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean display;

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
