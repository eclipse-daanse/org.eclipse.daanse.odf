
package org.eclipse.daanse.odf.xml.table;

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-cell-range-source-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-linked-source-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "cell-range-source")
public class CellRangeSource {

    @XmlAttribute(name = "last-column-spanned", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected BigInteger lastColumnSpanned;
    @XmlAttribute(name = "last-row-spanned", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected BigInteger lastRowSpanned;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String name;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink", required = true)
    protected String href;
    @XmlAttribute(name = "filter-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String filterName;
    @XmlAttribute(name = "filter-options", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String filterOptions;
    @XmlAttribute(name = "refresh-delay", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected Duration refreshDelay;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;

    /**
     * Gets the value of the lastColumnSpanned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastColumnSpanned() {
        return lastColumnSpanned;
    }

    /**
     * Sets the value of the lastColumnSpanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastColumnSpanned(BigInteger value) {
        this.lastColumnSpanned = value;
    }

    /**
     * Gets the value of the lastRowSpanned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastRowSpanned() {
        return lastRowSpanned;
    }

    /**
     * Sets the value of the lastRowSpanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastRowSpanned(BigInteger value) {
        this.lastRowSpanned = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

    /**
     * Gets the value of the filterOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterOptions() {
        return filterOptions;
    }

    /**
     * Sets the value of the filterOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterOptions(String value) {
        this.filterOptions = value;
    }

    /**
     * Gets the value of the refreshDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRefreshDelay() {
        return refreshDelay;
    }

    /**
     * Sets the value of the refreshDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRefreshDelay(Duration value) {
        this.refreshDelay = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
