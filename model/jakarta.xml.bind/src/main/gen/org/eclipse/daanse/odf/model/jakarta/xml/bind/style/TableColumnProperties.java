
package org.eclipse.daanse.odf.model.jakarta.xml.bind.style;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-table-column-properties-content-strict"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "table-column-properties")
public class TableColumnProperties {

    @XmlAttribute(name = "column-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String columnWidth;
    @XmlAttribute(name = "rel-column-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String relColumnWidth;
    @XmlAttribute(name = "use-optimal-column-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean useOptimalColumnWidth;
    @XmlAttribute(name = "break-before", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String breakBefore;
    @XmlAttribute(name = "break-after", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String breakAfter;

    /**
     * Gets the value of the columnWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnWidth() {
        return columnWidth;
    }

    /**
     * Sets the value of the columnWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnWidth(String value) {
        this.columnWidth = value;
    }

    /**
     * Gets the value of the relColumnWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelColumnWidth() {
        return relColumnWidth;
    }

    /**
     * Sets the value of the relColumnWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelColumnWidth(String value) {
        this.relColumnWidth = value;
    }

    /**
     * Gets the value of the useOptimalColumnWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseOptimalColumnWidth() {
        return useOptimalColumnWidth;
    }

    /**
     * Sets the value of the useOptimalColumnWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOptimalColumnWidth(Boolean value) {
        this.useOptimalColumnWidth = value;
    }

    /**
     * Gets the value of the breakBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakBefore() {
        return breakBefore;
    }

    /**
     * Sets the value of the breakBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakBefore(String value) {
        this.breakBefore = value;
    }

    /**
     * Gets the value of the breakAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakAfter() {
        return breakAfter;
    }

    /**
     * Sets the value of the breakAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakAfter(String value) {
        this.breakAfter = value;
    }

}
