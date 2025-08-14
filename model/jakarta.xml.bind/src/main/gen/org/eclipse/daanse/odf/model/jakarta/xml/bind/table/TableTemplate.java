
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.RowOrCol;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}first-row" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}last-row" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}first-column" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}last-column" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}body"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}even-rows" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}odd-rows" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}even-columns" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}odd-columns" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}background" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-template-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firstRow",
    "lastRow",
    "firstColumn",
    "lastColumn",
    "body",
    "evenRows",
    "oddRows",
    "evenColumns",
    "oddColumns",
    "background"
})
@XmlRootElement(name = "table-template")
public class TableTemplate {

    @XmlElement(name = "first-row")
    protected FirstRow firstRow;
    @XmlElement(name = "last-row")
    protected LastRow lastRow;
    @XmlElement(name = "first-column")
    protected FirstColumn firstColumn;
    @XmlElement(name = "last-column")
    protected LastColumn lastColumn;
    @XmlElement(required = true)
    protected Body body;
    @XmlElement(name = "even-rows")
    protected EvenRows evenRows;
    @XmlElement(name = "odd-rows")
    protected OddRows oddRows;
    @XmlElement(name = "even-columns")
    protected EvenColumns evenColumns;
    @XmlElement(name = "odd-columns")
    protected OddColumns oddColumns;
    protected Background background;
    @XmlAttribute(name = "first-row-start-column", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected RowOrCol firstRowStartColumn;
    @XmlAttribute(name = "first-row-end-column", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected RowOrCol firstRowEndColumn;
    @XmlAttribute(name = "last-row-start-column", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected RowOrCol lastRowStartColumn;
    @XmlAttribute(name = "last-row-end-column", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected RowOrCol lastRowEndColumn;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String name;

    /**
     * Gets the value of the firstRow property.
     * 
     * @return
     *     possible object is
     *     {@link FirstRow }
     *     
     */
    public FirstRow getFirstRow() {
        return firstRow;
    }

    /**
     * Sets the value of the firstRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstRow }
     *     
     */
    public void setFirstRow(FirstRow value) {
        this.firstRow = value;
    }

    /**
     * Gets the value of the lastRow property.
     * 
     * @return
     *     possible object is
     *     {@link LastRow }
     *     
     */
    public LastRow getLastRow() {
        return lastRow;
    }

    /**
     * Sets the value of the lastRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRow }
     *     
     */
    public void setLastRow(LastRow value) {
        this.lastRow = value;
    }

    /**
     * Gets the value of the firstColumn property.
     * 
     * @return
     *     possible object is
     *     {@link FirstColumn }
     *     
     */
    public FirstColumn getFirstColumn() {
        return firstColumn;
    }

    /**
     * Sets the value of the firstColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstColumn }
     *     
     */
    public void setFirstColumn(FirstColumn value) {
        this.firstColumn = value;
    }

    /**
     * Gets the value of the lastColumn property.
     * 
     * @return
     *     possible object is
     *     {@link LastColumn }
     *     
     */
    public LastColumn getLastColumn() {
        return lastColumn;
    }

    /**
     * Sets the value of the lastColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastColumn }
     *     
     */
    public void setLastColumn(LastColumn value) {
        this.lastColumn = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Body }
     *     
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Body }
     *     
     */
    public void setBody(Body value) {
        this.body = value;
    }

    /**
     * Gets the value of the evenRows property.
     * 
     * @return
     *     possible object is
     *     {@link EvenRows }
     *     
     */
    public EvenRows getEvenRows() {
        return evenRows;
    }

    /**
     * Sets the value of the evenRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvenRows }
     *     
     */
    public void setEvenRows(EvenRows value) {
        this.evenRows = value;
    }

    /**
     * Gets the value of the oddRows property.
     * 
     * @return
     *     possible object is
     *     {@link OddRows }
     *     
     */
    public OddRows getOddRows() {
        return oddRows;
    }

    /**
     * Sets the value of the oddRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link OddRows }
     *     
     */
    public void setOddRows(OddRows value) {
        this.oddRows = value;
    }

    /**
     * Gets the value of the evenColumns property.
     * 
     * @return
     *     possible object is
     *     {@link EvenColumns }
     *     
     */
    public EvenColumns getEvenColumns() {
        return evenColumns;
    }

    /**
     * Sets the value of the evenColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvenColumns }
     *     
     */
    public void setEvenColumns(EvenColumns value) {
        this.evenColumns = value;
    }

    /**
     * Gets the value of the oddColumns property.
     * 
     * @return
     *     possible object is
     *     {@link OddColumns }
     *     
     */
    public OddColumns getOddColumns() {
        return oddColumns;
    }

    /**
     * Sets the value of the oddColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link OddColumns }
     *     
     */
    public void setOddColumns(OddColumns value) {
        this.oddColumns = value;
    }

    /**
     * Gets the value of the background property.
     * 
     * @return
     *     possible object is
     *     {@link Background }
     *     
     */
    public Background getBackground() {
        return background;
    }

    /**
     * Sets the value of the background property.
     * 
     * @param value
     *     allowed object is
     *     {@link Background }
     *     
     */
    public void setBackground(Background value) {
        this.background = value;
    }

    /**
     * Gets the value of the firstRowStartColumn property.
     * 
     * @return
     *     possible object is
     *     {@link RowOrCol }
     *     
     */
    public RowOrCol getFirstRowStartColumn() {
        return firstRowStartColumn;
    }

    /**
     * Sets the value of the firstRowStartColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowOrCol }
     *     
     */
    public void setFirstRowStartColumn(RowOrCol value) {
        this.firstRowStartColumn = value;
    }

    /**
     * Gets the value of the firstRowEndColumn property.
     * 
     * @return
     *     possible object is
     *     {@link RowOrCol }
     *     
     */
    public RowOrCol getFirstRowEndColumn() {
        return firstRowEndColumn;
    }

    /**
     * Sets the value of the firstRowEndColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowOrCol }
     *     
     */
    public void setFirstRowEndColumn(RowOrCol value) {
        this.firstRowEndColumn = value;
    }

    /**
     * Gets the value of the lastRowStartColumn property.
     * 
     * @return
     *     possible object is
     *     {@link RowOrCol }
     *     
     */
    public RowOrCol getLastRowStartColumn() {
        return lastRowStartColumn;
    }

    /**
     * Sets the value of the lastRowStartColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowOrCol }
     *     
     */
    public void setLastRowStartColumn(RowOrCol value) {
        this.lastRowStartColumn = value;
    }

    /**
     * Gets the value of the lastRowEndColumn property.
     * 
     * @return
     *     possible object is
     *     {@link RowOrCol }
     *     
     */
    public RowOrCol getLastRowEndColumn() {
        return lastRowEndColumn;
    }

    /**
     * Sets the value of the lastRowEndColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowOrCol }
     *     
     */
    public void setLastRowEndColumn(RowOrCol value) {
        this.lastRowEndColumn = value;
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
