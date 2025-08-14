
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-table-range-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "source-range-address")
public class SourceRangeAddress {

    @XmlAttribute(name = "column", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger column;
    @XmlAttribute(name = "row", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger row;
    @XmlAttribute(name = "table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger table;
    @XmlAttribute(name = "start-column", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger startColumn;
    @XmlAttribute(name = "start-row", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger startRow;
    @XmlAttribute(name = "start-table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger startTable;
    @XmlAttribute(name = "end-column", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger endColumn;
    @XmlAttribute(name = "end-row", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger endRow;
    @XmlAttribute(name = "end-table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger endTable;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumn(BigInteger value) {
        this.column = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRow(BigInteger value) {
        this.row = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTable(BigInteger value) {
        this.table = value;
    }

    /**
     * Gets the value of the startColumn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartColumn() {
        return startColumn;
    }

    /**
     * Sets the value of the startColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartColumn(BigInteger value) {
        this.startColumn = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRow(BigInteger value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the startTable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartTable() {
        return startTable;
    }

    /**
     * Sets the value of the startTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartTable(BigInteger value) {
        this.startTable = value;
    }

    /**
     * Gets the value of the endColumn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndColumn() {
        return endColumn;
    }

    /**
     * Sets the value of the endColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndColumn(BigInteger value) {
        this.endColumn = value;
    }

    /**
     * Gets the value of the endRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndRow() {
        return endRow;
    }

    /**
     * Sets the value of the endRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndRow(BigInteger value) {
        this.endRow = value;
    }

    /**
     * Gets the value of the endTable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndTable() {
        return endTable;
    }

    /**
     * Sets the value of the endTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndTable(BigInteger value) {
        this.endTable = value;
    }

}
