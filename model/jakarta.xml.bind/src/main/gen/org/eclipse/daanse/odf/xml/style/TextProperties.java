
package org.eclipse.daanse.odf.xml.style;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.FontFamilyGeneric;
import org.eclipse.daanse.odf.xml.text.FontPitch;
import org.eclipse.daanse.odf.xml.text.FontStyle;
import org.eclipse.daanse.odf.xml.text.FontVariant;
import org.eclipse.daanse.odf.xml.text.LineMode;
import org.eclipse.daanse.odf.xml.text.LineStyle;
import org.eclipse.daanse.odf.xml.text.LineType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-text-properties-content-strict"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "text-properties")
public class TextProperties {

    @XmlAttribute(name = "font-variant", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected FontVariant fontVariant;
    @XmlAttribute(name = "text-transform", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textTransform;
    @XmlAttribute(name = "color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String color;
    @XmlAttribute(name = "use-window-font-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean useWindowFontColor;
    @XmlAttribute(name = "text-outline", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean textOutline;
    @XmlAttribute(name = "text-line-through-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineType textLineThroughType;
    @XmlAttribute(name = "text-line-through-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineStyle textLineThroughStyle;
    @XmlAttribute(name = "text-line-through-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textLineThroughWidth;
    @XmlAttribute(name = "text-line-through-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textLineThroughColor;
    @XmlAttribute(name = "text-line-through-text", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textLineThroughText;
    @XmlAttribute(name = "text-line-through-text-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textLineThroughTextStyle;
    @XmlAttribute(name = "text-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> textPosition;
    @XmlAttribute(name = "font-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontName;
    @XmlAttribute(name = "font-name-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontNameAsian;
    @XmlAttribute(name = "font-name-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontNameComplex;
    @XmlAttribute(name = "font-family", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String fontFamily;
    @XmlAttribute(name = "font-family-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontFamilyAsian;
    @XmlAttribute(name = "font-family-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontFamilyComplex;
    @XmlAttribute(name = "font-family-generic", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontFamilyGeneric fontFamilyGeneric;
    @XmlAttribute(name = "font-family-generic-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontFamilyGeneric fontFamilyGenericAsian;
    @XmlAttribute(name = "font-family-generic-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontFamilyGeneric fontFamilyGenericComplex;
    @XmlAttribute(name = "font-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontStyleName;
    @XmlAttribute(name = "font-style-name-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontStyleNameAsian;
    @XmlAttribute(name = "font-style-name-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontStyleNameComplex;
    @XmlAttribute(name = "font-pitch", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontPitch fontPitch;
    @XmlAttribute(name = "font-pitch-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontPitch fontPitchAsian;
    @XmlAttribute(name = "font-pitch-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontPitch fontPitchComplex;
    @XmlAttribute(name = "font-charset", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontCharset;
    @XmlAttribute(name = "font-charset-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontCharsetAsian;
    @XmlAttribute(name = "font-charset-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontCharsetComplex;
    @XmlAttribute(name = "font-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String fontSize;
    @XmlAttribute(name = "font-size-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontSizeAsian;
    @XmlAttribute(name = "font-size-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontSizeComplex;
    @XmlAttribute(name = "font-size-rel", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontSizeRel;
    @XmlAttribute(name = "font-size-rel-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontSizeRelAsian;
    @XmlAttribute(name = "font-size-rel-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontSizeRelComplex;
    @XmlAttribute(name = "script-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scriptType;
    @XmlAttribute(name = "letter-spacing", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String letterSpacing;
    @XmlAttribute(name = "language", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "language-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String languageAsian;
    @XmlAttribute(name = "language-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String languageComplex;
    @XmlAttribute(name = "country", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "country-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryAsian;
    @XmlAttribute(name = "country-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryComplex;
    @XmlAttribute(name = "script", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String script;
    @XmlAttribute(name = "script-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scriptAsian;
    @XmlAttribute(name = "script-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scriptComplex;
    @XmlAttribute(name = "rfc-language-tag", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rfcLanguageTag;
    @XmlAttribute(name = "rfc-language-tag-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rfcLanguageTagAsian;
    @XmlAttribute(name = "rfc-language-tag-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rfcLanguageTagComplex;
    @XmlAttribute(name = "font-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected FontStyle fontStyle;
    @XmlAttribute(name = "font-style-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontStyle fontStyleAsian;
    @XmlAttribute(name = "font-style-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontStyle fontStyleComplex;
    @XmlAttribute(name = "font-relief", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontRelief;
    @XmlAttribute(name = "text-shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String textShadow;
    @XmlAttribute(name = "text-underline-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineType textUnderlineType;
    @XmlAttribute(name = "text-underline-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineStyle textUnderlineStyle;
    @XmlAttribute(name = "text-underline-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textUnderlineWidth;
    @XmlAttribute(name = "text-underline-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textUnderlineColor;
    @XmlAttribute(name = "text-overline-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineType textOverlineType;
    @XmlAttribute(name = "text-overline-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineStyle textOverlineStyle;
    @XmlAttribute(name = "text-overline-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textOverlineWidth;
    @XmlAttribute(name = "text-overline-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textOverlineColor;
    @XmlAttribute(name = "text-overline-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineMode textOverlineMode;
    @XmlAttribute(name = "font-weight", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontWeight;
    @XmlAttribute(name = "font-weight-asian", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontWeightAsian;
    @XmlAttribute(name = "font-weight-complex", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontWeightComplex;
    @XmlAttribute(name = "text-underline-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineMode textUnderlineMode;
    @XmlAttribute(name = "text-line-through-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineMode textLineThroughMode;
    @XmlAttribute(name = "letter-kerning", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean letterKerning;
    @XmlAttribute(name = "text-blinking", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean textBlinking;
    @XmlAttribute(name = "text-combine", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textCombine;
    @XmlAttribute(name = "text-combine-start-char", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textCombineStartChar;
    @XmlAttribute(name = "text-combine-end-char", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textCombineEndChar;
    @XmlAttribute(name = "text-emphasize", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> textEmphasize;
    @XmlAttribute(name = "text-scale", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textScale;
    @XmlAttribute(name = "text-rotation-angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String textRotationAngle;
    @XmlAttribute(name = "text-rotation-scale", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textRotationScale;
    @XmlAttribute(name = "hyphenate", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected Boolean hyphenate;
    @XmlAttribute(name = "hyphenation-remain-char-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected BigInteger hyphenationRemainCharCount;
    @XmlAttribute(name = "hyphenation-push-char-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected BigInteger hyphenationPushCharCount;
    @XmlAttribute(name = "display", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String display;
    @XmlAttribute(name = "condition", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String condition;
    @XmlAttribute(name = "background-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String backgroundColor;

    /**
     * Gets the value of the fontVariant property.
     * 
     * @return
     *     possible object is
     *     {@link FontVariant }
     *     
     */
    public FontVariant getFontVariant() {
        return fontVariant;
    }

    /**
     * Sets the value of the fontVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontVariant }
     *     
     */
    public void setFontVariant(FontVariant value) {
        this.fontVariant = value;
    }

    /**
     * Gets the value of the textTransform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextTransform() {
        return textTransform;
    }

    /**
     * Sets the value of the textTransform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextTransform(String value) {
        this.textTransform = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the useWindowFontColor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseWindowFontColor() {
        return useWindowFontColor;
    }

    /**
     * Sets the value of the useWindowFontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseWindowFontColor(Boolean value) {
        this.useWindowFontColor = value;
    }

    /**
     * Gets the value of the textOutline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTextOutline() {
        return textOutline;
    }

    /**
     * Sets the value of the textOutline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextOutline(Boolean value) {
        this.textOutline = value;
    }

    /**
     * Gets the value of the textLineThroughType property.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getTextLineThroughType() {
        return textLineThroughType;
    }

    /**
     * Sets the value of the textLineThroughType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setTextLineThroughType(LineType value) {
        this.textLineThroughType = value;
    }

    /**
     * Gets the value of the textLineThroughStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LineStyle }
     *     
     */
    public LineStyle getTextLineThroughStyle() {
        return textLineThroughStyle;
    }

    /**
     * Sets the value of the textLineThroughStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyle }
     *     
     */
    public void setTextLineThroughStyle(LineStyle value) {
        this.textLineThroughStyle = value;
    }

    /**
     * Gets the value of the textLineThroughWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLineThroughWidth() {
        return textLineThroughWidth;
    }

    /**
     * Sets the value of the textLineThroughWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLineThroughWidth(String value) {
        this.textLineThroughWidth = value;
    }

    /**
     * Gets the value of the textLineThroughColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLineThroughColor() {
        return textLineThroughColor;
    }

    /**
     * Sets the value of the textLineThroughColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLineThroughColor(String value) {
        this.textLineThroughColor = value;
    }

    /**
     * Gets the value of the textLineThroughText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLineThroughText() {
        return textLineThroughText;
    }

    /**
     * Sets the value of the textLineThroughText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLineThroughText(String value) {
        this.textLineThroughText = value;
    }

    /**
     * Gets the value of the textLineThroughTextStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLineThroughTextStyle() {
        return textLineThroughTextStyle;
    }

    /**
     * Sets the value of the textLineThroughTextStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLineThroughTextStyle(String value) {
        this.textLineThroughTextStyle = value;
    }

    /**
     * Gets the value of the textPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextPosition() {
        if (textPosition == null) {
            textPosition = new ArrayList<String>();
        }
        return this.textPosition;
    }

    /**
     * Gets the value of the fontName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Sets the value of the fontName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * Gets the value of the fontNameAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontNameAsian() {
        return fontNameAsian;
    }

    /**
     * Sets the value of the fontNameAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontNameAsian(String value) {
        this.fontNameAsian = value;
    }

    /**
     * Gets the value of the fontNameComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontNameComplex() {
        return fontNameComplex;
    }

    /**
     * Sets the value of the fontNameComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontNameComplex(String value) {
        this.fontNameComplex = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontFamilyAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamilyAsian() {
        return fontFamilyAsian;
    }

    /**
     * Sets the value of the fontFamilyAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamilyAsian(String value) {
        this.fontFamilyAsian = value;
    }

    /**
     * Gets the value of the fontFamilyComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamilyComplex() {
        return fontFamilyComplex;
    }

    /**
     * Sets the value of the fontFamilyComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamilyComplex(String value) {
        this.fontFamilyComplex = value;
    }

    /**
     * Gets the value of the fontFamilyGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link FontFamilyGeneric }
     *     
     */
    public FontFamilyGeneric getFontFamilyGeneric() {
        return fontFamilyGeneric;
    }

    /**
     * Sets the value of the fontFamilyGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFamilyGeneric }
     *     
     */
    public void setFontFamilyGeneric(FontFamilyGeneric value) {
        this.fontFamilyGeneric = value;
    }

    /**
     * Gets the value of the fontFamilyGenericAsian property.
     * 
     * @return
     *     possible object is
     *     {@link FontFamilyGeneric }
     *     
     */
    public FontFamilyGeneric getFontFamilyGenericAsian() {
        return fontFamilyGenericAsian;
    }

    /**
     * Sets the value of the fontFamilyGenericAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFamilyGeneric }
     *     
     */
    public void setFontFamilyGenericAsian(FontFamilyGeneric value) {
        this.fontFamilyGenericAsian = value;
    }

    /**
     * Gets the value of the fontFamilyGenericComplex property.
     * 
     * @return
     *     possible object is
     *     {@link FontFamilyGeneric }
     *     
     */
    public FontFamilyGeneric getFontFamilyGenericComplex() {
        return fontFamilyGenericComplex;
    }

    /**
     * Sets the value of the fontFamilyGenericComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFamilyGeneric }
     *     
     */
    public void setFontFamilyGenericComplex(FontFamilyGeneric value) {
        this.fontFamilyGenericComplex = value;
    }

    /**
     * Gets the value of the fontStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStyleName() {
        return fontStyleName;
    }

    /**
     * Sets the value of the fontStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStyleName(String value) {
        this.fontStyleName = value;
    }

    /**
     * Gets the value of the fontStyleNameAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStyleNameAsian() {
        return fontStyleNameAsian;
    }

    /**
     * Sets the value of the fontStyleNameAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStyleNameAsian(String value) {
        this.fontStyleNameAsian = value;
    }

    /**
     * Gets the value of the fontStyleNameComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStyleNameComplex() {
        return fontStyleNameComplex;
    }

    /**
     * Sets the value of the fontStyleNameComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStyleNameComplex(String value) {
        this.fontStyleNameComplex = value;
    }

    /**
     * Gets the value of the fontPitch property.
     * 
     * @return
     *     possible object is
     *     {@link FontPitch }
     *     
     */
    public FontPitch getFontPitch() {
        return fontPitch;
    }

    /**
     * Sets the value of the fontPitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontPitch }
     *     
     */
    public void setFontPitch(FontPitch value) {
        this.fontPitch = value;
    }

    /**
     * Gets the value of the fontPitchAsian property.
     * 
     * @return
     *     possible object is
     *     {@link FontPitch }
     *     
     */
    public FontPitch getFontPitchAsian() {
        return fontPitchAsian;
    }

    /**
     * Sets the value of the fontPitchAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontPitch }
     *     
     */
    public void setFontPitchAsian(FontPitch value) {
        this.fontPitchAsian = value;
    }

    /**
     * Gets the value of the fontPitchComplex property.
     * 
     * @return
     *     possible object is
     *     {@link FontPitch }
     *     
     */
    public FontPitch getFontPitchComplex() {
        return fontPitchComplex;
    }

    /**
     * Sets the value of the fontPitchComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontPitch }
     *     
     */
    public void setFontPitchComplex(FontPitch value) {
        this.fontPitchComplex = value;
    }

    /**
     * Gets the value of the fontCharset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontCharset() {
        return fontCharset;
    }

    /**
     * Sets the value of the fontCharset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontCharset(String value) {
        this.fontCharset = value;
    }

    /**
     * Gets the value of the fontCharsetAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontCharsetAsian() {
        return fontCharsetAsian;
    }

    /**
     * Sets the value of the fontCharsetAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontCharsetAsian(String value) {
        this.fontCharsetAsian = value;
    }

    /**
     * Gets the value of the fontCharsetComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontCharsetComplex() {
        return fontCharsetComplex;
    }

    /**
     * Sets the value of the fontCharsetComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontCharsetComplex(String value) {
        this.fontCharsetComplex = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontSizeAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSizeAsian() {
        return fontSizeAsian;
    }

    /**
     * Sets the value of the fontSizeAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSizeAsian(String value) {
        this.fontSizeAsian = value;
    }

    /**
     * Gets the value of the fontSizeComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSizeComplex() {
        return fontSizeComplex;
    }

    /**
     * Sets the value of the fontSizeComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSizeComplex(String value) {
        this.fontSizeComplex = value;
    }

    /**
     * Gets the value of the fontSizeRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSizeRel() {
        return fontSizeRel;
    }

    /**
     * Sets the value of the fontSizeRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSizeRel(String value) {
        this.fontSizeRel = value;
    }

    /**
     * Gets the value of the fontSizeRelAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSizeRelAsian() {
        return fontSizeRelAsian;
    }

    /**
     * Sets the value of the fontSizeRelAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSizeRelAsian(String value) {
        this.fontSizeRelAsian = value;
    }

    /**
     * Gets the value of the fontSizeRelComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSizeRelComplex() {
        return fontSizeRelComplex;
    }

    /**
     * Sets the value of the fontSizeRelComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSizeRelComplex(String value) {
        this.fontSizeRelComplex = value;
    }

    /**
     * Gets the value of the scriptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptType() {
        return scriptType;
    }

    /**
     * Sets the value of the scriptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptType(String value) {
        this.scriptType = value;
    }

    /**
     * Gets the value of the letterSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterSpacing() {
        return letterSpacing;
    }

    /**
     * Sets the value of the letterSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterSpacing(String value) {
        this.letterSpacing = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the languageAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageAsian() {
        return languageAsian;
    }

    /**
     * Sets the value of the languageAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageAsian(String value) {
        this.languageAsian = value;
    }

    /**
     * Gets the value of the languageComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageComplex() {
        return languageComplex;
    }

    /**
     * Sets the value of the languageComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageComplex(String value) {
        this.languageComplex = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAsian() {
        return countryAsian;
    }

    /**
     * Sets the value of the countryAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAsian(String value) {
        this.countryAsian = value;
    }

    /**
     * Gets the value of the countryComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryComplex() {
        return countryComplex;
    }

    /**
     * Sets the value of the countryComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryComplex(String value) {
        this.countryComplex = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the scriptAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptAsian() {
        return scriptAsian;
    }

    /**
     * Sets the value of the scriptAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptAsian(String value) {
        this.scriptAsian = value;
    }

    /**
     * Gets the value of the scriptComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptComplex() {
        return scriptComplex;
    }

    /**
     * Sets the value of the scriptComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptComplex(String value) {
        this.scriptComplex = value;
    }

    /**
     * Gets the value of the rfcLanguageTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcLanguageTag() {
        return rfcLanguageTag;
    }

    /**
     * Sets the value of the rfcLanguageTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcLanguageTag(String value) {
        this.rfcLanguageTag = value;
    }

    /**
     * Gets the value of the rfcLanguageTagAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcLanguageTagAsian() {
        return rfcLanguageTagAsian;
    }

    /**
     * Sets the value of the rfcLanguageTagAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcLanguageTagAsian(String value) {
        this.rfcLanguageTagAsian = value;
    }

    /**
     * Gets the value of the rfcLanguageTagComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcLanguageTagComplex() {
        return rfcLanguageTagComplex;
    }

    /**
     * Sets the value of the rfcLanguageTagComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcLanguageTagComplex(String value) {
        this.rfcLanguageTagComplex = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FontStyle }
     *     
     */
    public FontStyle getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyle }
     *     
     */
    public void setFontStyle(FontStyle value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontStyleAsian property.
     * 
     * @return
     *     possible object is
     *     {@link FontStyle }
     *     
     */
    public FontStyle getFontStyleAsian() {
        return fontStyleAsian;
    }

    /**
     * Sets the value of the fontStyleAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyle }
     *     
     */
    public void setFontStyleAsian(FontStyle value) {
        this.fontStyleAsian = value;
    }

    /**
     * Gets the value of the fontStyleComplex property.
     * 
     * @return
     *     possible object is
     *     {@link FontStyle }
     *     
     */
    public FontStyle getFontStyleComplex() {
        return fontStyleComplex;
    }

    /**
     * Sets the value of the fontStyleComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyle }
     *     
     */
    public void setFontStyleComplex(FontStyle value) {
        this.fontStyleComplex = value;
    }

    /**
     * Gets the value of the fontRelief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontRelief() {
        return fontRelief;
    }

    /**
     * Sets the value of the fontRelief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontRelief(String value) {
        this.fontRelief = value;
    }

    /**
     * Gets the value of the textShadow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextShadow() {
        return textShadow;
    }

    /**
     * Sets the value of the textShadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextShadow(String value) {
        this.textShadow = value;
    }

    /**
     * Gets the value of the textUnderlineType property.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getTextUnderlineType() {
        return textUnderlineType;
    }

    /**
     * Sets the value of the textUnderlineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setTextUnderlineType(LineType value) {
        this.textUnderlineType = value;
    }

    /**
     * Gets the value of the textUnderlineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LineStyle }
     *     
     */
    public LineStyle getTextUnderlineStyle() {
        return textUnderlineStyle;
    }

    /**
     * Sets the value of the textUnderlineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyle }
     *     
     */
    public void setTextUnderlineStyle(LineStyle value) {
        this.textUnderlineStyle = value;
    }

    /**
     * Gets the value of the textUnderlineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextUnderlineWidth() {
        return textUnderlineWidth;
    }

    /**
     * Sets the value of the textUnderlineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextUnderlineWidth(String value) {
        this.textUnderlineWidth = value;
    }

    /**
     * Gets the value of the textUnderlineColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextUnderlineColor() {
        return textUnderlineColor;
    }

    /**
     * Sets the value of the textUnderlineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextUnderlineColor(String value) {
        this.textUnderlineColor = value;
    }

    /**
     * Gets the value of the textOverlineType property.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getTextOverlineType() {
        return textOverlineType;
    }

    /**
     * Sets the value of the textOverlineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setTextOverlineType(LineType value) {
        this.textOverlineType = value;
    }

    /**
     * Gets the value of the textOverlineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LineStyle }
     *     
     */
    public LineStyle getTextOverlineStyle() {
        return textOverlineStyle;
    }

    /**
     * Sets the value of the textOverlineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyle }
     *     
     */
    public void setTextOverlineStyle(LineStyle value) {
        this.textOverlineStyle = value;
    }

    /**
     * Gets the value of the textOverlineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextOverlineWidth() {
        return textOverlineWidth;
    }

    /**
     * Sets the value of the textOverlineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextOverlineWidth(String value) {
        this.textOverlineWidth = value;
    }

    /**
     * Gets the value of the textOverlineColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextOverlineColor() {
        return textOverlineColor;
    }

    /**
     * Sets the value of the textOverlineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextOverlineColor(String value) {
        this.textOverlineColor = value;
    }

    /**
     * Gets the value of the textOverlineMode property.
     * 
     * @return
     *     possible object is
     *     {@link LineMode }
     *     
     */
    public LineMode getTextOverlineMode() {
        return textOverlineMode;
    }

    /**
     * Sets the value of the textOverlineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineMode }
     *     
     */
    public void setTextOverlineMode(LineMode value) {
        this.textOverlineMode = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontWeight(String value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the fontWeightAsian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontWeightAsian() {
        return fontWeightAsian;
    }

    /**
     * Sets the value of the fontWeightAsian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontWeightAsian(String value) {
        this.fontWeightAsian = value;
    }

    /**
     * Gets the value of the fontWeightComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontWeightComplex() {
        return fontWeightComplex;
    }

    /**
     * Sets the value of the fontWeightComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontWeightComplex(String value) {
        this.fontWeightComplex = value;
    }

    /**
     * Gets the value of the textUnderlineMode property.
     * 
     * @return
     *     possible object is
     *     {@link LineMode }
     *     
     */
    public LineMode getTextUnderlineMode() {
        return textUnderlineMode;
    }

    /**
     * Sets the value of the textUnderlineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineMode }
     *     
     */
    public void setTextUnderlineMode(LineMode value) {
        this.textUnderlineMode = value;
    }

    /**
     * Gets the value of the textLineThroughMode property.
     * 
     * @return
     *     possible object is
     *     {@link LineMode }
     *     
     */
    public LineMode getTextLineThroughMode() {
        return textLineThroughMode;
    }

    /**
     * Sets the value of the textLineThroughMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineMode }
     *     
     */
    public void setTextLineThroughMode(LineMode value) {
        this.textLineThroughMode = value;
    }

    /**
     * Gets the value of the letterKerning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLetterKerning() {
        return letterKerning;
    }

    /**
     * Sets the value of the letterKerning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterKerning(Boolean value) {
        this.letterKerning = value;
    }

    /**
     * Gets the value of the textBlinking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTextBlinking() {
        return textBlinking;
    }

    /**
     * Sets the value of the textBlinking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextBlinking(Boolean value) {
        this.textBlinking = value;
    }

    /**
     * Gets the value of the textCombine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCombine() {
        return textCombine;
    }

    /**
     * Sets the value of the textCombine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCombine(String value) {
        this.textCombine = value;
    }

    /**
     * Gets the value of the textCombineStartChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCombineStartChar() {
        return textCombineStartChar;
    }

    /**
     * Sets the value of the textCombineStartChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCombineStartChar(String value) {
        this.textCombineStartChar = value;
    }

    /**
     * Gets the value of the textCombineEndChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCombineEndChar() {
        return textCombineEndChar;
    }

    /**
     * Sets the value of the textCombineEndChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCombineEndChar(String value) {
        this.textCombineEndChar = value;
    }

    /**
     * Gets the value of the textEmphasize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textEmphasize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextEmphasize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextEmphasize() {
        if (textEmphasize == null) {
            textEmphasize = new ArrayList<String>();
        }
        return this.textEmphasize;
    }

    /**
     * Gets the value of the textScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextScale() {
        return textScale;
    }

    /**
     * Sets the value of the textScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextScale(String value) {
        this.textScale = value;
    }

    /**
     * Gets the value of the textRotationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextRotationAngle() {
        return textRotationAngle;
    }

    /**
     * Sets the value of the textRotationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextRotationAngle(String value) {
        this.textRotationAngle = value;
    }

    /**
     * Gets the value of the textRotationScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextRotationScale() {
        return textRotationScale;
    }

    /**
     * Sets the value of the textRotationScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextRotationScale(String value) {
        this.textRotationScale = value;
    }

    /**
     * Gets the value of the hyphenate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHyphenate() {
        return hyphenate;
    }

    /**
     * Sets the value of the hyphenate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHyphenate(Boolean value) {
        this.hyphenate = value;
    }

    /**
     * Gets the value of the hyphenationRemainCharCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHyphenationRemainCharCount() {
        return hyphenationRemainCharCount;
    }

    /**
     * Sets the value of the hyphenationRemainCharCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHyphenationRemainCharCount(BigInteger value) {
        this.hyphenationRemainCharCount = value;
    }

    /**
     * Gets the value of the hyphenationPushCharCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHyphenationPushCharCount() {
        return hyphenationPushCharCount;
    }

    /**
     * Sets the value of the hyphenationPushCharCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHyphenationPushCharCount(BigInteger value) {
        this.hyphenationPushCharCount = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
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
