
package org.eclipse.daanse.odf.xml.style;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}column-sep" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}column" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-columns-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "columnSep",
    "column"
})
@XmlRootElement(name = "columns")
public class Columns {

    @XmlElement(name = "column-sep")
    protected ColumnSep columnSep;
    protected List<Column> column;
    @XmlAttribute(name = "column-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected BigInteger columnCount;
    @XmlAttribute(name = "column-gap", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String columnGap;

    /**
     * Gets the value of the columnSep property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSep }
     *     
     */
    public ColumnSep getColumnSep() {
        return columnSep;
    }

    /**
     * Sets the value of the columnSep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSep }
     *     
     */
    public void setColumnSep(ColumnSep value) {
        this.columnSep = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Column }
     * 
     * 
     */
    public List<Column> getColumn() {
        if (column == null) {
            column = new ArrayList<Column>();
        }
        return this.column;
    }

    /**
     * Gets the value of the columnCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnCount() {
        return columnCount;
    }

    /**
     * Sets the value of the columnCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnCount(BigInteger value) {
        this.columnCount = value;
    }

    /**
     * Gets the value of the columnGap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnGap() {
        return columnGap;
    }

    /**
     * Sets the value of the columnGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnGap(String value) {
        this.columnGap = value;
    }

}
