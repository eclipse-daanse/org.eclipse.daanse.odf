
package org.eclipse.daanse.odf.xml.table;

import java.math.BigInteger;
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
import org.eclipse.daanse.odf.xml.text.TableTableCellContent;
import org.eclipse.daanse.odf.xml.text.TableVisibilityValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table-cell"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}covered-table-cell"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-row-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableCellOrCoveredTableCell"
})
@XmlRootElement(name = "table-row")
public class TableRow {

    @XmlElements({
        @XmlElement(name = "table-cell", type = TableCell.class),
        @XmlElement(name = "covered-table-cell", type = CoveredTableCell.class)
    })
    protected List<TableTableCellContent> tableCellOrCoveredTableCell;
    @XmlAttribute(name = "number-rows-repeated", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger numberRowsRepeated;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String styleName;
    @XmlAttribute(name = "default-cell-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String defaultCellStyleName;
    @XmlAttribute(name = "visibility", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected TableVisibilityValue visibility;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the tableCellOrCoveredTableCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tableCellOrCoveredTableCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableCellOrCoveredTableCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableCell }
     * {@link CoveredTableCell }
     * 
     * 
     */
    public List<TableTableCellContent> getTableCellOrCoveredTableCell() {
        if (tableCellOrCoveredTableCell == null) {
            tableCellOrCoveredTableCell = new ArrayList<TableTableCellContent>();
        }
        return this.tableCellOrCoveredTableCell;
    }

    /**
     * Gets the value of the numberRowsRepeated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberRowsRepeated() {
        return numberRowsRepeated;
    }

    /**
     * Sets the value of the numberRowsRepeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberRowsRepeated(BigInteger value) {
        this.numberRowsRepeated = value;
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
     * Gets the value of the defaultCellStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCellStyleName() {
        return defaultCellStyleName;
    }

    /**
     * Sets the value of the defaultCellStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCellStyleName(String value) {
        this.defaultCellStyleName = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link TableVisibilityValue }
     *     
     */
    public TableVisibilityValue getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableVisibilityValue }
     *     
     */
    public void setVisibility(TableVisibilityValue value) {
        this.visibility = value;
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

}
