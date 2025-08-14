
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}soft-page-break" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table-row"/&gt;
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
    "softPageBreakAndTableRow"
})
@XmlRootElement(name = "table-rows")
public class TableRows {

    @XmlElements({
        @XmlElement(name = "soft-page-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true, type = SoftPageBreak.class),
        @XmlElement(name = "table-row", required = true, type = TableRow.class)
    })
    protected List<Object> softPageBreakAndTableRow;

    /**
     * Gets the value of the softPageBreakAndTableRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the softPageBreakAndTableRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftPageBreakAndTableRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftPageBreak }
     * {@link TableRow }
     * 
     * 
     */
    public List<Object> getSoftPageBreakAndTableRow() {
        if (softPageBreakAndTableRow == null) {
            softPageBreakAndTableRow = new ArrayList<Object>();
        }
        return this.softPageBreakAndTableRow;
    }

}
