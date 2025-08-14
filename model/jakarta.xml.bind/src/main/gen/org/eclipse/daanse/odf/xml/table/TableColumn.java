
package org.eclipse.daanse.odf.xml.table;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-column-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "table-column")
public class TableColumn {

    @XmlAttribute(name = "number-columns-repeated", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger numberColumnsRepeated;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String styleName;
    @XmlAttribute(name = "visibility", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected TableVisibilityValue visibility;
    @XmlAttribute(name = "default-cell-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String defaultCellStyleName;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the numberColumnsRepeated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberColumnsRepeated() {
        return numberColumnsRepeated;
    }

    /**
     * Sets the value of the numberColumnsRepeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberColumnsRepeated(BigInteger value) {
        this.numberColumnsRepeated = value;
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
