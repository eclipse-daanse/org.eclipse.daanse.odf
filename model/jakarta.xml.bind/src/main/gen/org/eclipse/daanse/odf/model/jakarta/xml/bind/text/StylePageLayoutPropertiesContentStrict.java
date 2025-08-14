
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for style-page-layout-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-page-layout-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-page-layout-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-page-layout-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-page-layout-properties-content-strict")
public class StylePageLayoutPropertiesContentStrict
    extends StylePageLayoutPropertiesElements
{

    @XmlAttribute(name = "page-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String pageWidth;
    @XmlAttribute(name = "page-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String pageHeight;
    @XmlAttribute(name = "paper-tray-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String paperTrayName;
    @XmlAttribute(name = "print-orientation", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String printOrientation;
    @XmlAttribute(name = "register-truth-ref-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String registerTruthRefStyleName;
    @XmlAttribute(name = "print", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> print;
    @XmlAttribute(name = "print-page-order", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String printPageOrder;
    @XmlAttribute(name = "first-page-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String firstPageNumber;
    @XmlAttribute(name = "scale-to", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String scaleTo;
    @XmlAttribute(name = "scale-to-pages", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected BigInteger scaleToPages;
    @XmlAttribute(name = "scale-to-X", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected BigInteger scaleToX;
    @XmlAttribute(name = "scale-to-Y", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected BigInteger scaleToY;
    @XmlAttribute(name = "table-centering", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tableCentering;
    @XmlAttribute(name = "footnote-max-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String footnoteMaxHeight;
    @XmlAttribute(name = "layout-grid-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String layoutGridMode;
    @XmlAttribute(name = "layout-grid-standard-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean layoutGridStandardMode;
    @XmlAttribute(name = "layout-grid-base-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String layoutGridBaseHeight;
    @XmlAttribute(name = "layout-grid-ruby-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String layoutGridRubyHeight;
    @XmlAttribute(name = "layout-grid-lines", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected BigInteger layoutGridLines;
    @XmlAttribute(name = "layout-grid-base-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String layoutGridBaseWidth;
    @XmlAttribute(name = "layout-grid-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String layoutGridColor;
    @XmlAttribute(name = "layout-grid-ruby-below", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean layoutGridRubyBelow;
    @XmlAttribute(name = "layout-grid-print", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean layoutGridPrint;
    @XmlAttribute(name = "layout-grid-display", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean layoutGridDisplay;
    @XmlAttribute(name = "layout-grid-snap-to", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean layoutGridSnapTo;
    @XmlAttribute(name = "border-line-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidth;
    @XmlAttribute(name = "border-line-width-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthTop;
    @XmlAttribute(name = "border-line-width-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthBottom;
    @XmlAttribute(name = "border-line-width-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthLeft;
    @XmlAttribute(name = "border-line-width-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthRight;
    @XmlAttribute(name = "num-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> numFormat;
    @XmlAttribute(name = "num-letter-sync", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean numLetterSync;
    @XmlAttribute(name = "num-prefix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numPrefix;
    @XmlAttribute(name = "num-suffix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numSuffix;
    @XmlAttribute(name = "padding", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String padding;
    @XmlAttribute(name = "padding-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingTop;
    @XmlAttribute(name = "padding-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingBottom;
    @XmlAttribute(name = "padding-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingLeft;
    @XmlAttribute(name = "padding-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingRight;
    @XmlAttribute(name = "background-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String backgroundColor;
    @XmlAttribute(name = "margin", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String margin;
    @XmlAttribute(name = "border", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String border;
    @XmlAttribute(name = "border-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderTop;
    @XmlAttribute(name = "border-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderBottom;
    @XmlAttribute(name = "border-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderLeft;
    @XmlAttribute(name = "border-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderRight;
    @XmlAttribute(name = "shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String shadow;
    @XmlAttribute(name = "writing-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String writingMode;
    @XmlAttribute(name = "margin-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginRight;
    @XmlAttribute(name = "margin-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String marginLeft;
    @XmlAttribute(name = "margin-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginTop;
    @XmlAttribute(name = "margin-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginBottom;

    /**
     * Gets the value of the pageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageWidth() {
        return pageWidth;
    }

    /**
     * Sets the value of the pageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageWidth(String value) {
        this.pageWidth = value;
    }

    /**
     * Gets the value of the pageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageHeight() {
        return pageHeight;
    }

    /**
     * Sets the value of the pageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageHeight(String value) {
        this.pageHeight = value;
    }

    /**
     * Gets the value of the paperTrayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperTrayName() {
        return paperTrayName;
    }

    /**
     * Sets the value of the paperTrayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperTrayName(String value) {
        this.paperTrayName = value;
    }

    /**
     * Gets the value of the printOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOrientation() {
        return printOrientation;
    }

    /**
     * Sets the value of the printOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOrientation(String value) {
        this.printOrientation = value;
    }

    /**
     * Gets the value of the registerTruthRefStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterTruthRefStyleName() {
        return registerTruthRefStyleName;
    }

    /**
     * Sets the value of the registerTruthRefStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterTruthRefStyleName(String value) {
        this.registerTruthRefStyleName = value;
    }

    /**
     * Gets the value of the print property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the print property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrint() {
        if (print == null) {
            print = new ArrayList<String>();
        }
        return this.print;
    }

    /**
     * Gets the value of the printPageOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintPageOrder() {
        return printPageOrder;
    }

    /**
     * Sets the value of the printPageOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintPageOrder(String value) {
        this.printPageOrder = value;
    }

    /**
     * Gets the value of the firstPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPageNumber() {
        return firstPageNumber;
    }

    /**
     * Sets the value of the firstPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPageNumber(String value) {
        this.firstPageNumber = value;
    }

    /**
     * Gets the value of the scaleTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleTo() {
        return scaleTo;
    }

    /**
     * Sets the value of the scaleTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleTo(String value) {
        this.scaleTo = value;
    }

    /**
     * Gets the value of the scaleToPages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScaleToPages() {
        return scaleToPages;
    }

    /**
     * Sets the value of the scaleToPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScaleToPages(BigInteger value) {
        this.scaleToPages = value;
    }

    /**
     * Gets the value of the scaleToX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScaleToX() {
        return scaleToX;
    }

    /**
     * Sets the value of the scaleToX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScaleToX(BigInteger value) {
        this.scaleToX = value;
    }

    /**
     * Gets the value of the scaleToY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScaleToY() {
        return scaleToY;
    }

    /**
     * Sets the value of the scaleToY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScaleToY(BigInteger value) {
        this.scaleToY = value;
    }

    /**
     * Gets the value of the tableCentering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableCentering() {
        return tableCentering;
    }

    /**
     * Sets the value of the tableCentering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableCentering(String value) {
        this.tableCentering = value;
    }

    /**
     * Gets the value of the footnoteMaxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootnoteMaxHeight() {
        return footnoteMaxHeight;
    }

    /**
     * Sets the value of the footnoteMaxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootnoteMaxHeight(String value) {
        this.footnoteMaxHeight = value;
    }

    /**
     * Gets the value of the layoutGridMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutGridMode() {
        return layoutGridMode;
    }

    /**
     * Sets the value of the layoutGridMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutGridMode(String value) {
        this.layoutGridMode = value;
    }

    /**
     * Gets the value of the layoutGridStandardMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLayoutGridStandardMode() {
        return layoutGridStandardMode;
    }

    /**
     * Sets the value of the layoutGridStandardMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoutGridStandardMode(Boolean value) {
        this.layoutGridStandardMode = value;
    }

    /**
     * Gets the value of the layoutGridBaseHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutGridBaseHeight() {
        return layoutGridBaseHeight;
    }

    /**
     * Sets the value of the layoutGridBaseHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutGridBaseHeight(String value) {
        this.layoutGridBaseHeight = value;
    }

    /**
     * Gets the value of the layoutGridRubyHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutGridRubyHeight() {
        return layoutGridRubyHeight;
    }

    /**
     * Sets the value of the layoutGridRubyHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutGridRubyHeight(String value) {
        this.layoutGridRubyHeight = value;
    }

    /**
     * Gets the value of the layoutGridLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLayoutGridLines() {
        return layoutGridLines;
    }

    /**
     * Sets the value of the layoutGridLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLayoutGridLines(BigInteger value) {
        this.layoutGridLines = value;
    }

    /**
     * Gets the value of the layoutGridBaseWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutGridBaseWidth() {
        return layoutGridBaseWidth;
    }

    /**
     * Sets the value of the layoutGridBaseWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutGridBaseWidth(String value) {
        this.layoutGridBaseWidth = value;
    }

    /**
     * Gets the value of the layoutGridColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutGridColor() {
        return layoutGridColor;
    }

    /**
     * Sets the value of the layoutGridColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutGridColor(String value) {
        this.layoutGridColor = value;
    }

    /**
     * Gets the value of the layoutGridRubyBelow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLayoutGridRubyBelow() {
        return layoutGridRubyBelow;
    }

    /**
     * Sets the value of the layoutGridRubyBelow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoutGridRubyBelow(Boolean value) {
        this.layoutGridRubyBelow = value;
    }

    /**
     * Gets the value of the layoutGridPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLayoutGridPrint() {
        return layoutGridPrint;
    }

    /**
     * Sets the value of the layoutGridPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoutGridPrint(Boolean value) {
        this.layoutGridPrint = value;
    }

    /**
     * Gets the value of the layoutGridDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLayoutGridDisplay() {
        return layoutGridDisplay;
    }

    /**
     * Sets the value of the layoutGridDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoutGridDisplay(Boolean value) {
        this.layoutGridDisplay = value;
    }

    /**
     * Gets the value of the layoutGridSnapTo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLayoutGridSnapTo() {
        return layoutGridSnapTo;
    }

    /**
     * Sets the value of the layoutGridSnapTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoutGridSnapTo(Boolean value) {
        this.layoutGridSnapTo = value;
    }

    /**
     * Gets the value of the borderLineWidth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidth() {
        if (borderLineWidth == null) {
            borderLineWidth = new ArrayList<String>();
        }
        return this.borderLineWidth;
    }

    /**
     * Gets the value of the borderLineWidthTop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthTop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthTop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthTop() {
        if (borderLineWidthTop == null) {
            borderLineWidthTop = new ArrayList<String>();
        }
        return this.borderLineWidthTop;
    }

    /**
     * Gets the value of the borderLineWidthBottom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthBottom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthBottom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthBottom() {
        if (borderLineWidthBottom == null) {
            borderLineWidthBottom = new ArrayList<String>();
        }
        return this.borderLineWidthBottom;
    }

    /**
     * Gets the value of the borderLineWidthLeft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthLeft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthLeft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthLeft() {
        if (borderLineWidthLeft == null) {
            borderLineWidthLeft = new ArrayList<String>();
        }
        return this.borderLineWidthLeft;
    }

    /**
     * Gets the value of the borderLineWidthRight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthRight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthRight() {
        if (borderLineWidthRight == null) {
            borderLineWidthRight = new ArrayList<String>();
        }
        return this.borderLineWidthRight;
    }

    /**
     * Gets the value of the numFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumFormat() {
        if (numFormat == null) {
            numFormat = new ArrayList<String>();
        }
        return this.numFormat;
    }

    /**
     * Gets the value of the numLetterSync property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNumLetterSync() {
        return numLetterSync;
    }

    /**
     * Sets the value of the numLetterSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumLetterSync(Boolean value) {
        this.numLetterSync = value;
    }

    /**
     * Gets the value of the numPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrefix() {
        return numPrefix;
    }

    /**
     * Sets the value of the numPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrefix(String value) {
        this.numPrefix = value;
    }

    /**
     * Gets the value of the numSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSuffix() {
        return numSuffix;
    }

    /**
     * Sets the value of the numSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSuffix(String value) {
        this.numSuffix = value;
    }

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Gets the value of the paddingTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingTop() {
        return paddingTop;
    }

    /**
     * Sets the value of the paddingTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingTop(String value) {
        this.paddingTop = value;
    }

    /**
     * Gets the value of the paddingBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingBottom() {
        return paddingBottom;
    }

    /**
     * Sets the value of the paddingBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingBottom(String value) {
        this.paddingBottom = value;
    }

    /**
     * Gets the value of the paddingLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingLeft() {
        return paddingLeft;
    }

    /**
     * Sets the value of the paddingLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingLeft(String value) {
        this.paddingLeft = value;
    }

    /**
     * Gets the value of the paddingRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingRight() {
        return paddingRight;
    }

    /**
     * Sets the value of the paddingRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingRight(String value) {
        this.paddingRight = value;
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

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMargin(String value) {
        this.margin = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the borderTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTop() {
        return borderTop;
    }

    /**
     * Sets the value of the borderTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTop(String value) {
        this.borderTop = value;
    }

    /**
     * Gets the value of the borderBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottom() {
        return borderBottom;
    }

    /**
     * Sets the value of the borderBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottom(String value) {
        this.borderBottom = value;
    }

    /**
     * Gets the value of the borderLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeft() {
        return borderLeft;
    }

    /**
     * Sets the value of the borderLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeft(String value) {
        this.borderLeft = value;
    }

    /**
     * Gets the value of the borderRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRight() {
        return borderRight;
    }

    /**
     * Sets the value of the borderRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRight(String value) {
        this.borderRight = value;
    }

    /**
     * Gets the value of the shadow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadow() {
        return shadow;
    }

    /**
     * Sets the value of the shadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadow(String value) {
        this.shadow = value;
    }

    /**
     * Gets the value of the writingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritingMode() {
        return writingMode;
    }

    /**
     * Sets the value of the writingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritingMode(String value) {
        this.writingMode = value;
    }

    /**
     * Gets the value of the marginRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginRight() {
        return marginRight;
    }

    /**
     * Sets the value of the marginRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginRight(String value) {
        this.marginRight = value;
    }

    /**
     * Gets the value of the marginLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginLeft() {
        return marginLeft;
    }

    /**
     * Sets the value of the marginLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginLeft(String value) {
        this.marginLeft = value;
    }

    /**
     * Gets the value of the marginTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginTop() {
        return marginTop;
    }

    /**
     * Sets the value of the marginTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginTop(String value) {
        this.marginTop = value;
    }

    /**
     * Gets the value of the marginBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginBottom() {
        return marginBottom;
    }

    /**
     * Sets the value of the marginBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginBottom(String value) {
        this.marginBottom = value;
    }

}
