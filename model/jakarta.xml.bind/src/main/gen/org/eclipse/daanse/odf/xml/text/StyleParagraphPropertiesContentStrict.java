
package org.eclipse.daanse.odf.xml.text;

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
 * <p>Java class for style-paragraph-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-paragraph-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-paragraph-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-paragraph-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-paragraph-properties-content-strict")
public class StyleParagraphPropertiesContentStrict
    extends StyleParagraphPropertiesElements
{

    @XmlAttribute(name = "contextual-spacing", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean contextualSpacing;
    @XmlAttribute(name = "line-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String lineHeight;
    @XmlAttribute(name = "line-height-at-least", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String lineHeightAtLeast;
    @XmlAttribute(name = "line-spacing", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String lineSpacing;
    @XmlAttribute(name = "font-independent-line-spacing", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean fontIndependentLineSpacing;
    @XmlAttribute(name = "text-align-last", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textAlignLast;
    @XmlAttribute(name = "justify-single-word", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean justifySingleWord;
    @XmlAttribute(name = "keep-together", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepTogether;
    @XmlAttribute(name = "widows", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected BigInteger widows;
    @XmlAttribute(name = "orphans", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected BigInteger orphans;
    @XmlAttribute(name = "tab-stop-distance", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String tabStopDistance;
    @XmlAttribute(name = "hyphenation-keep", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hyphenationKeep;
    @XmlAttribute(name = "hyphenation-ladder-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String hyphenationLadderCount;
    @XmlAttribute(name = "register-true", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean registerTrue;
    @XmlAttribute(name = "auto-text-indent", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean autoTextIndent;
    @XmlAttribute(name = "join-border", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean joinBorder;
    @XmlAttribute(name = "number-lines", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean numberLines;
    @XmlAttribute(name = "line-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger lineNumber;
    @XmlAttribute(name = "text-autospace", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textAutospace;
    @XmlAttribute(name = "punctuation-wrap", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String punctuationWrap;
    @XmlAttribute(name = "line-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineBreak;
    @XmlAttribute(name = "writing-mode-automatic", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean writingModeAutomatic;
    @XmlAttribute(name = "snap-to-layout-grid", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean snapToLayoutGrid;
    @XmlAttribute(name = "text-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textAlign;
    @XmlAttribute(name = "background-transparency", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String backgroundTransparency;
    @XmlAttribute(name = "margin", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String margin;
    @XmlAttribute(name = "break-before", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String breakBefore;
    @XmlAttribute(name = "break-after", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String breakAfter;
    @XmlAttribute(name = "keep-with-next", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepWithNext;
    @XmlAttribute(name = "shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String shadow;
    @XmlAttribute(name = "vertical-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verticalAlign;
    @XmlAttribute(name = "background-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String backgroundColor;
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
    @XmlAttribute(name = "page-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String pageNumber;
    @XmlAttribute(name = "margin-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginTop;
    @XmlAttribute(name = "margin-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginBottom;
    @XmlAttribute(name = "margin-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginRight;
    @XmlAttribute(name = "margin-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String marginLeft;
    @XmlAttribute(name = "writing-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String writingMode;
    @XmlAttribute(name = "text-indent", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String textIndent;
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

    /**
     * Gets the value of the contextualSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContextualSpacing() {
        return contextualSpacing;
    }

    /**
     * Sets the value of the contextualSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContextualSpacing(Boolean value) {
        this.contextualSpacing = value;
    }

    /**
     * Gets the value of the lineHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineHeight() {
        return lineHeight;
    }

    /**
     * Sets the value of the lineHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineHeight(String value) {
        this.lineHeight = value;
    }

    /**
     * Gets the value of the lineHeightAtLeast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineHeightAtLeast() {
        return lineHeightAtLeast;
    }

    /**
     * Sets the value of the lineHeightAtLeast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineHeightAtLeast(String value) {
        this.lineHeightAtLeast = value;
    }

    /**
     * Gets the value of the lineSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSpacing() {
        return lineSpacing;
    }

    /**
     * Sets the value of the lineSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSpacing(String value) {
        this.lineSpacing = value;
    }

    /**
     * Gets the value of the fontIndependentLineSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFontIndependentLineSpacing() {
        return fontIndependentLineSpacing;
    }

    /**
     * Sets the value of the fontIndependentLineSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFontIndependentLineSpacing(Boolean value) {
        this.fontIndependentLineSpacing = value;
    }

    /**
     * Gets the value of the textAlignLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAlignLast() {
        return textAlignLast;
    }

    /**
     * Sets the value of the textAlignLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAlignLast(String value) {
        this.textAlignLast = value;
    }

    /**
     * Gets the value of the justifySingleWord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getJustifySingleWord() {
        return justifySingleWord;
    }

    /**
     * Sets the value of the justifySingleWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJustifySingleWord(Boolean value) {
        this.justifySingleWord = value;
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
     * Gets the value of the widows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidows() {
        return widows;
    }

    /**
     * Sets the value of the widows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidows(BigInteger value) {
        this.widows = value;
    }

    /**
     * Gets the value of the orphans property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrphans() {
        return orphans;
    }

    /**
     * Sets the value of the orphans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrphans(BigInteger value) {
        this.orphans = value;
    }

    /**
     * Gets the value of the tabStopDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabStopDistance() {
        return tabStopDistance;
    }

    /**
     * Sets the value of the tabStopDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabStopDistance(String value) {
        this.tabStopDistance = value;
    }

    /**
     * Gets the value of the hyphenationKeep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyphenationKeep() {
        return hyphenationKeep;
    }

    /**
     * Sets the value of the hyphenationKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyphenationKeep(String value) {
        this.hyphenationKeep = value;
    }

    /**
     * Gets the value of the hyphenationLadderCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyphenationLadderCount() {
        return hyphenationLadderCount;
    }

    /**
     * Sets the value of the hyphenationLadderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyphenationLadderCount(String value) {
        this.hyphenationLadderCount = value;
    }

    /**
     * Gets the value of the registerTrue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRegisterTrue() {
        return registerTrue;
    }

    /**
     * Sets the value of the registerTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegisterTrue(Boolean value) {
        this.registerTrue = value;
    }

    /**
     * Gets the value of the autoTextIndent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoTextIndent() {
        return autoTextIndent;
    }

    /**
     * Sets the value of the autoTextIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoTextIndent(Boolean value) {
        this.autoTextIndent = value;
    }

    /**
     * Gets the value of the joinBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getJoinBorder() {
        return joinBorder;
    }

    /**
     * Sets the value of the joinBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJoinBorder(Boolean value) {
        this.joinBorder = value;
    }

    /**
     * Gets the value of the numberLines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNumberLines() {
        return numberLines;
    }

    /**
     * Sets the value of the numberLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberLines(Boolean value) {
        this.numberLines = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the textAutospace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAutospace() {
        return textAutospace;
    }

    /**
     * Sets the value of the textAutospace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAutospace(String value) {
        this.textAutospace = value;
    }

    /**
     * Gets the value of the punctuationWrap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunctuationWrap() {
        return punctuationWrap;
    }

    /**
     * Sets the value of the punctuationWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunctuationWrap(String value) {
        this.punctuationWrap = value;
    }

    /**
     * Gets the value of the lineBreak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineBreak() {
        return lineBreak;
    }

    /**
     * Sets the value of the lineBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineBreak(String value) {
        this.lineBreak = value;
    }

    /**
     * Gets the value of the writingModeAutomatic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWritingModeAutomatic() {
        return writingModeAutomatic;
    }

    /**
     * Sets the value of the writingModeAutomatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritingModeAutomatic(Boolean value) {
        this.writingModeAutomatic = value;
    }

    /**
     * Gets the value of the snapToLayoutGrid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSnapToLayoutGrid() {
        return snapToLayoutGrid;
    }

    /**
     * Sets the value of the snapToLayoutGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapToLayoutGrid(Boolean value) {
        this.snapToLayoutGrid = value;
    }

    /**
     * Gets the value of the textAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAlign() {
        return textAlign;
    }

    /**
     * Sets the value of the textAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAlign(String value) {
        this.textAlign = value;
    }

    /**
     * Gets the value of the backgroundTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundTransparency() {
        return backgroundTransparency;
    }

    /**
     * Sets the value of the backgroundTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundTransparency(String value) {
        this.backgroundTransparency = value;
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
     * Gets the value of the keepWithNext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepWithNext() {
        return keepWithNext;
    }

    /**
     * Sets the value of the keepWithNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepWithNext(String value) {
        this.keepWithNext = value;
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
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
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
     * Gets the value of the textIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextIndent() {
        return textIndent;
    }

    /**
     * Sets the value of the textIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextIndent(String value) {
        this.textIndent = value;
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

}
