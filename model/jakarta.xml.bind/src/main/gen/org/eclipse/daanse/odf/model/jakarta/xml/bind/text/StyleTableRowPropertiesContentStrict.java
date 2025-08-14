
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for style-table-row-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-table-row-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-table-row-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-table-row-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-table-row-properties-content-strict")
public class StyleTableRowPropertiesContentStrict
    extends StyleTableRowPropertiesElements
{

    @XmlAttribute(name = "row-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String rowHeight;
    @XmlAttribute(name = "min-row-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String minRowHeight;
    @XmlAttribute(name = "use-optimal-row-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean useOptimalRowHeight;
    @XmlAttribute(name = "keep-together", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepTogether;
    @XmlAttribute(name = "break-before", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String breakBefore;
    @XmlAttribute(name = "break-after", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String breakAfter;
    @XmlAttribute(name = "background-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String backgroundColor;

    /**
     * Gets the value of the rowHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowHeight() {
        return rowHeight;
    }

    /**
     * Sets the value of the rowHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowHeight(String value) {
        this.rowHeight = value;
    }

    /**
     * Gets the value of the minRowHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinRowHeight() {
        return minRowHeight;
    }

    /**
     * Sets the value of the minRowHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinRowHeight(String value) {
        this.minRowHeight = value;
    }

    /**
     * Gets the value of the useOptimalRowHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseOptimalRowHeight() {
        return useOptimalRowHeight;
    }

    /**
     * Sets the value of the useOptimalRowHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOptimalRowHeight(Boolean value) {
        this.useOptimalRowHeight = value;
    }

    /**
     * Gets the value of the keepTogether property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepTogether() {
        return keepTogether;
    }

    /**
     * Sets the value of the keepTogether property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepTogether(String value) {
        this.keepTogether = value;
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

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

}
