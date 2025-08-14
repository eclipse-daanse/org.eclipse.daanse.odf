
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
 * <p>Java class for style-table-cell-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-table-cell-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-table-cell-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-table-cell-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-table-cell-properties-content-strict")
public class StyleTableCellPropertiesContentStrict
    extends StyleTableCellPropertiesElements
{

    @XmlAttribute(name = "text-align-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textAlignSource;
    @XmlAttribute(name = "glyph-orientation-vertical", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String glyphOrientationVertical;
    @XmlAttribute(name = "diagonal-tl-br", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String diagonalTlBr;
    @XmlAttribute(name = "diagonal-tl-br-widths", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> diagonalTlBrWidths;
    @XmlAttribute(name = "diagonal-bl-tr", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String diagonalBlTr;
    @XmlAttribute(name = "diagonal-bl-tr-widths", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> diagonalBlTrWidths;
    @XmlAttribute(name = "wrap-option", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wrapOption;
    @XmlAttribute(name = "rotation-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rotationAlign;
    @XmlAttribute(name = "cell-protect", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> cellProtect;
    @XmlAttribute(name = "print-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean printContent;
    @XmlAttribute(name = "decimal-places", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "repeat-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean repeatContent;
    @XmlAttribute(name = "shrink-to-fit", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean shrinkToFit;
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
    @XmlAttribute(name = "writing-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String writingMode;
    @XmlAttribute(name = "shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String shadow;
    @XmlAttribute(name = "background-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String backgroundColor;
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
    @XmlAttribute(name = "rotation-angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String rotationAngle;
    @XmlAttribute(name = "vertical-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verticalAlign;
    @XmlAttribute(name = "direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String direction;
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

    /**
     * Gets the value of the textAlignSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAlignSource() {
        return textAlignSource;
    }

    /**
     * Sets the value of the textAlignSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAlignSource(String value) {
        this.textAlignSource = value;
    }

    /**
     * Gets the value of the glyphOrientationVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlyphOrientationVertical() {
        return glyphOrientationVertical;
    }

    /**
     * Sets the value of the glyphOrientationVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlyphOrientationVertical(String value) {
        this.glyphOrientationVertical = value;
    }

    /**
     * Gets the value of the diagonalTlBr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagonalTlBr() {
        return diagonalTlBr;
    }

    /**
     * Sets the value of the diagonalTlBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagonalTlBr(String value) {
        this.diagonalTlBr = value;
    }

    /**
     * Gets the value of the diagonalTlBrWidths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the diagonalTlBrWidths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagonalTlBrWidths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiagonalTlBrWidths() {
        if (diagonalTlBrWidths == null) {
            diagonalTlBrWidths = new ArrayList<String>();
        }
        return this.diagonalTlBrWidths;
    }

    /**
     * Gets the value of the diagonalBlTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagonalBlTr() {
        return diagonalBlTr;
    }

    /**
     * Sets the value of the diagonalBlTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagonalBlTr(String value) {
        this.diagonalBlTr = value;
    }

    /**
     * Gets the value of the diagonalBlTrWidths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the diagonalBlTrWidths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagonalBlTrWidths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiagonalBlTrWidths() {
        if (diagonalBlTrWidths == null) {
            diagonalBlTrWidths = new ArrayList<String>();
        }
        return this.diagonalBlTrWidths;
    }

    /**
     * Gets the value of the wrapOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapOption() {
        return wrapOption;
    }

    /**
     * Sets the value of the wrapOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapOption(String value) {
        this.wrapOption = value;
    }

    /**
     * Gets the value of the rotationAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationAlign() {
        return rotationAlign;
    }

    /**
     * Sets the value of the rotationAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationAlign(String value) {
        this.rotationAlign = value;
    }

    /**
     * Gets the value of the cellProtect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cellProtect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellProtect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCellProtect() {
        if (cellProtect == null) {
            cellProtect = new ArrayList<String>();
        }
        return this.cellProtect;
    }

    /**
     * Gets the value of the printContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrintContent() {
        return printContent;
    }

    /**
     * Sets the value of the printContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintContent(Boolean value) {
        this.printContent = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the repeatContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRepeatContent() {
        return repeatContent;
    }

    /**
     * Sets the value of the repeatContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatContent(Boolean value) {
        this.repeatContent = value;
    }

    /**
     * Gets the value of the shrinkToFit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShrinkToFit() {
        return shrinkToFit;
    }

    /**
     * Sets the value of the shrinkToFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrinkToFit(Boolean value) {
        this.shrinkToFit = value;
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
     * Gets the value of the rotationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationAngle() {
        return rotationAngle;
    }

    /**
     * Sets the value of the rotationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationAngle(String value) {
        this.rotationAngle = value;
    }

    /**
     * Gets the value of the verticalAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalAlign() {
        return verticalAlign;
    }

    /**
     * Sets the value of the verticalAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalAlign(String value) {
        this.verticalAlign = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
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

}
