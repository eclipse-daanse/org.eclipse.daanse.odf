
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.RubyProperties;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.Style;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.TableColumnProperties;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.TextProperties;


/**
 * <p>Java class for style-style-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-style-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}chart-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}drawing-page-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}graphic-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}text-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}paragraph-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}section-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}ruby-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}table-cell-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}table-column-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}table-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}table-row-properties" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}family use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-style-content", propOrder = {
    "chartProperties",
    "drawingPageProperties",
    "graphicProperties",
    "textProperties",
    "paragraphProperties",
    "sectionProperties",
    "rubyProperties",
    "tableCellProperties",
    "tableColumnProperties",
    "tableProperties",
    "tableRowProperties"
})
@XmlSeeAlso({
    Style.class
})
public class StyleStyleContent {

    @XmlElement(name = "chart-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleChartPropertiesContentStrict chartProperties;
    @XmlElement(name = "drawing-page-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleDrawingPagePropertiesContentStrict drawingPageProperties;
    @XmlElement(name = "graphic-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleGraphicPropertiesContentStrict graphicProperties;
    @XmlElement(name = "text-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected TextProperties textProperties;
    @XmlElement(name = "paragraph-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleParagraphPropertiesContentStrict paragraphProperties;
    @XmlElement(name = "section-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleSectionPropertiesContentStrict sectionProperties;
    @XmlElement(name = "ruby-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected RubyProperties rubyProperties;
    @XmlElement(name = "table-cell-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleTableCellPropertiesContentStrict tableCellProperties;
    @XmlElement(name = "table-column-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected TableColumnProperties tableColumnProperties;
    @XmlElement(name = "table-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleTablePropertiesContentStrict tableProperties;
    @XmlElement(name = "table-row-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StyleTableRowPropertiesContentStrict tableRowProperties;
    @XmlAttribute(name = "family", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String family;

    /**
     * Gets the value of the chartProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleChartPropertiesContentStrict }
     *     
     */
    public StyleChartPropertiesContentStrict getChartProperties() {
        return chartProperties;
    }

    /**
     * Sets the value of the chartProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleChartPropertiesContentStrict }
     *     
     */
    public void setChartProperties(StyleChartPropertiesContentStrict value) {
        this.chartProperties = value;
    }

    /**
     * Gets the value of the drawingPageProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleDrawingPagePropertiesContentStrict }
     *     
     */
    public StyleDrawingPagePropertiesContentStrict getDrawingPageProperties() {
        return drawingPageProperties;
    }

    /**
     * Sets the value of the drawingPageProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleDrawingPagePropertiesContentStrict }
     *     
     */
    public void setDrawingPageProperties(StyleDrawingPagePropertiesContentStrict value) {
        this.drawingPageProperties = value;
    }

    /**
     * Gets the value of the graphicProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleGraphicPropertiesContentStrict }
     *     
     */
    public StyleGraphicPropertiesContentStrict getGraphicProperties() {
        return graphicProperties;
    }

    /**
     * Sets the value of the graphicProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleGraphicPropertiesContentStrict }
     *     
     */
    public void setGraphicProperties(StyleGraphicPropertiesContentStrict value) {
        this.graphicProperties = value;
    }

    /**
     * Gets the value of the textProperties property.
     * 
     * @return
     *     possible object is
     *     {@link TextProperties }
     *     
     */
    public TextProperties getTextProperties() {
        return textProperties;
    }

    /**
     * Sets the value of the textProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextProperties }
     *     
     */
    public void setTextProperties(TextProperties value) {
        this.textProperties = value;
    }

    /**
     * Gets the value of the paragraphProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleParagraphPropertiesContentStrict }
     *     
     */
    public StyleParagraphPropertiesContentStrict getParagraphProperties() {
        return paragraphProperties;
    }

    /**
     * Sets the value of the paragraphProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleParagraphPropertiesContentStrict }
     *     
     */
    public void setParagraphProperties(StyleParagraphPropertiesContentStrict value) {
        this.paragraphProperties = value;
    }

    /**
     * Gets the value of the sectionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleSectionPropertiesContentStrict }
     *     
     */
    public StyleSectionPropertiesContentStrict getSectionProperties() {
        return sectionProperties;
    }

    /**
     * Sets the value of the sectionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleSectionPropertiesContentStrict }
     *     
     */
    public void setSectionProperties(StyleSectionPropertiesContentStrict value) {
        this.sectionProperties = value;
    }

    /**
     * Gets the value of the rubyProperties property.
     * 
     * @return
     *     possible object is
     *     {@link RubyProperties }
     *     
     */
    public RubyProperties getRubyProperties() {
        return rubyProperties;
    }

    /**
     * Sets the value of the rubyProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RubyProperties }
     *     
     */
    public void setRubyProperties(RubyProperties value) {
        this.rubyProperties = value;
    }

    /**
     * Gets the value of the tableCellProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleTableCellPropertiesContentStrict }
     *     
     */
    public StyleTableCellPropertiesContentStrict getTableCellProperties() {
        return tableCellProperties;
    }

    /**
     * Sets the value of the tableCellProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleTableCellPropertiesContentStrict }
     *     
     */
    public void setTableCellProperties(StyleTableCellPropertiesContentStrict value) {
        this.tableCellProperties = value;
    }

    /**
     * Gets the value of the tableColumnProperties property.
     * 
     * @return
     *     possible object is
     *     {@link TableColumnProperties }
     *     
     */
    public TableColumnProperties getTableColumnProperties() {
        return tableColumnProperties;
    }

    /**
     * Sets the value of the tableColumnProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableColumnProperties }
     *     
     */
    public void setTableColumnProperties(TableColumnProperties value) {
        this.tableColumnProperties = value;
    }

    /**
     * Gets the value of the tableProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleTablePropertiesContentStrict }
     *     
     */
    public StyleTablePropertiesContentStrict getTableProperties() {
        return tableProperties;
    }

    /**
     * Sets the value of the tableProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleTablePropertiesContentStrict }
     *     
     */
    public void setTableProperties(StyleTablePropertiesContentStrict value) {
        this.tableProperties = value;
    }

    /**
     * Gets the value of the tableRowProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleTableRowPropertiesContentStrict }
     *     
     */
    public StyleTableRowPropertiesContentStrict getTableRowProperties() {
        return tableRowProperties;
    }

    /**
     * Sets the value of the tableRowProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleTableRowPropertiesContentStrict }
     *     
     */
    public void setTableRowProperties(StyleTableRowPropertiesContentStrict value) {
        this.tableRowProperties = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

}
