
package org.eclipse.daanse.odf.xml.style;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.svg.DefinitionSrc;
import org.eclipse.daanse.odf.xml.svg.FontFaceSrc;
import org.eclipse.daanse.odf.xml.text.FontFamilyGeneric;
import org.eclipse.daanse.odf.xml.text.FontPitch;
import org.eclipse.daanse.odf.xml.text.FontStyle;
import org.eclipse.daanse.odf.xml.text.FontVariant;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}font-face-src" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}definition-src" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-font-face-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fontFaceSrc",
    "definitionSrc"
})
@XmlRootElement(name = "font-face")
public class FontFace {

    @XmlElement(name = "font-face-src", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected FontFaceSrc fontFaceSrc;
    @XmlElement(name = "definition-src", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected DefinitionSrc definitionSrc;
    @XmlAttribute(name = "font-family", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String fontFamily;
    @XmlAttribute(name = "font-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected FontStyle fontStyle;
    @XmlAttribute(name = "font-variant", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected FontVariant fontVariant;
    @XmlAttribute(name = "font-weight", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontWeight;
    @XmlAttribute(name = "font-stretch", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontStretch;
    @XmlAttribute(name = "font-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String fontSize;
    @XmlAttribute(name = "unicode-range", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String unicodeRange;
    @XmlAttribute(name = "units-per-em", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger unitsPerEm;
    @XmlAttribute(name = "panose-1", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String panose1;
    @XmlAttribute(name = "stemv", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger stemv;
    @XmlAttribute(name = "stemh", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger stemh;
    @XmlAttribute(name = "slope", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger slope;
    @XmlAttribute(name = "cap-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger capHeight;
    @XmlAttribute(name = "x-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger xHeight;
    @XmlAttribute(name = "accent-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger accentHeight;
    @XmlAttribute(name = "ascent", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger ascent;
    @XmlAttribute(name = "descent", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger descent;
    @XmlAttribute(name = "widths", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String widths;
    @XmlAttribute(name = "bbox", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String bbox;
    @XmlAttribute(name = "ideographic", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger ideographic;
    @XmlAttribute(name = "alphabetic", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger alphabetic;
    @XmlAttribute(name = "mathematical", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger mathematical;
    @XmlAttribute(name = "hanging", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger hanging;
    @XmlAttribute(name = "v-ideographic", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger vIdeographic;
    @XmlAttribute(name = "v-alphabetic", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger vAlphabetic;
    @XmlAttribute(name = "v-mathematical", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger vMathematical;
    @XmlAttribute(name = "v-hanging", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger vHanging;
    @XmlAttribute(name = "underline-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger underlinePosition;
    @XmlAttribute(name = "underline-thickness", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger underlineThickness;
    @XmlAttribute(name = "strikethrough-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger strikethroughPosition;
    @XmlAttribute(name = "strikethrough-thickness", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger strikethroughThickness;
    @XmlAttribute(name = "overline-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger overlinePosition;
    @XmlAttribute(name = "overline-thickness", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected BigInteger overlineThickness;
    @XmlAttribute(name = "font-adornments", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontAdornments;
    @XmlAttribute(name = "font-family-generic", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontFamilyGeneric fontFamilyGeneric;
    @XmlAttribute(name = "font-pitch", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FontPitch fontPitch;
    @XmlAttribute(name = "font-charset", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontCharset;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String name;

    /**
     * Gets the value of the fontFaceSrc property.
     * 
     * @return
     *     possible object is
     *     {@link FontFaceSrc }
     *     
     */
    public FontFaceSrc getFontFaceSrc() {
        return fontFaceSrc;
    }

    /**
     * Sets the value of the fontFaceSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFaceSrc }
     *     
     */
    public void setFontFaceSrc(FontFaceSrc value) {
        this.fontFaceSrc = value;
    }

    /**
     * Gets the value of the definitionSrc property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionSrc }
     *     
     */
    public DefinitionSrc getDefinitionSrc() {
        return definitionSrc;
    }

    /**
     * Sets the value of the definitionSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionSrc }
     *     
     */
    public void setDefinitionSrc(DefinitionSrc value) {
        this.definitionSrc = value;
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
     * Gets the value of the fontStretch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStretch() {
        return fontStretch;
    }

    /**
     * Sets the value of the fontStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStretch(String value) {
        this.fontStretch = value;
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
     * Gets the value of the unicodeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnicodeRange() {
        return unicodeRange;
    }

    /**
     * Sets the value of the unicodeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnicodeRange(String value) {
        this.unicodeRange = value;
    }

    /**
     * Gets the value of the unitsPerEm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitsPerEm() {
        return unitsPerEm;
    }

    /**
     * Sets the value of the unitsPerEm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitsPerEm(BigInteger value) {
        this.unitsPerEm = value;
    }

    /**
     * Gets the value of the panose1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanose1() {
        return panose1;
    }

    /**
     * Sets the value of the panose1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanose1(String value) {
        this.panose1 = value;
    }

    /**
     * Gets the value of the stemv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStemv() {
        return stemv;
    }

    /**
     * Sets the value of the stemv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStemv(BigInteger value) {
        this.stemv = value;
    }

    /**
     * Gets the value of the stemh property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStemh() {
        return stemh;
    }

    /**
     * Sets the value of the stemh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStemh(BigInteger value) {
        this.stemh = value;
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlope(BigInteger value) {
        this.slope = value;
    }

    /**
     * Gets the value of the capHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapHeight() {
        return capHeight;
    }

    /**
     * Sets the value of the capHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapHeight(BigInteger value) {
        this.capHeight = value;
    }

    /**
     * Gets the value of the xHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXHeight() {
        return xHeight;
    }

    /**
     * Sets the value of the xHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXHeight(BigInteger value) {
        this.xHeight = value;
    }

    /**
     * Gets the value of the accentHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccentHeight() {
        return accentHeight;
    }

    /**
     * Sets the value of the accentHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccentHeight(BigInteger value) {
        this.accentHeight = value;
    }

    /**
     * Gets the value of the ascent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAscent() {
        return ascent;
    }

    /**
     * Sets the value of the ascent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAscent(BigInteger value) {
        this.ascent = value;
    }

    /**
     * Gets the value of the descent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDescent() {
        return descent;
    }

    /**
     * Sets the value of the descent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDescent(BigInteger value) {
        this.descent = value;
    }

    /**
     * Gets the value of the widths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidths() {
        return widths;
    }

    /**
     * Sets the value of the widths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidths(String value) {
        this.widths = value;
    }

    /**
     * Gets the value of the bbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbox() {
        return bbox;
    }

    /**
     * Sets the value of the bbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbox(String value) {
        this.bbox = value;
    }

    /**
     * Gets the value of the ideographic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdeographic() {
        return ideographic;
    }

    /**
     * Sets the value of the ideographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdeographic(BigInteger value) {
        this.ideographic = value;
    }

    /**
     * Gets the value of the alphabetic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlphabetic() {
        return alphabetic;
    }

    /**
     * Sets the value of the alphabetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlphabetic(BigInteger value) {
        this.alphabetic = value;
    }

    /**
     * Gets the value of the mathematical property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMathematical() {
        return mathematical;
    }

    /**
     * Sets the value of the mathematical property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMathematical(BigInteger value) {
        this.mathematical = value;
    }

    /**
     * Gets the value of the hanging property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHanging() {
        return hanging;
    }

    /**
     * Sets the value of the hanging property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHanging(BigInteger value) {
        this.hanging = value;
    }

    /**
     * Gets the value of the vIdeographic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVIdeographic() {
        return vIdeographic;
    }

    /**
     * Sets the value of the vIdeographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVIdeographic(BigInteger value) {
        this.vIdeographic = value;
    }

    /**
     * Gets the value of the vAlphabetic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVAlphabetic() {
        return vAlphabetic;
    }

    /**
     * Sets the value of the vAlphabetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVAlphabetic(BigInteger value) {
        this.vAlphabetic = value;
    }

    /**
     * Gets the value of the vMathematical property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVMathematical() {
        return vMathematical;
    }

    /**
     * Sets the value of the vMathematical property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVMathematical(BigInteger value) {
        this.vMathematical = value;
    }

    /**
     * Gets the value of the vHanging property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVHanging() {
        return vHanging;
    }

    /**
     * Sets the value of the vHanging property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVHanging(BigInteger value) {
        this.vHanging = value;
    }

    /**
     * Gets the value of the underlinePosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnderlinePosition() {
        return underlinePosition;
    }

    /**
     * Sets the value of the underlinePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnderlinePosition(BigInteger value) {
        this.underlinePosition = value;
    }

    /**
     * Gets the value of the underlineThickness property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnderlineThickness() {
        return underlineThickness;
    }

    /**
     * Sets the value of the underlineThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnderlineThickness(BigInteger value) {
        this.underlineThickness = value;
    }

    /**
     * Gets the value of the strikethroughPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrikethroughPosition() {
        return strikethroughPosition;
    }

    /**
     * Sets the value of the strikethroughPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrikethroughPosition(BigInteger value) {
        this.strikethroughPosition = value;
    }

    /**
     * Gets the value of the strikethroughThickness property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrikethroughThickness() {
        return strikethroughThickness;
    }

    /**
     * Sets the value of the strikethroughThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrikethroughThickness(BigInteger value) {
        this.strikethroughThickness = value;
    }

    /**
     * Gets the value of the overlinePosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverlinePosition() {
        return overlinePosition;
    }

    /**
     * Sets the value of the overlinePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverlinePosition(BigInteger value) {
        this.overlinePosition = value;
    }

    /**
     * Gets the value of the overlineThickness property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverlineThickness() {
        return overlineThickness;
    }

    /**
     * Sets the value of the overlineThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverlineThickness(BigInteger value) {
        this.overlineThickness = value;
    }

    /**
     * Gets the value of the fontAdornments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontAdornments() {
        return fontAdornments;
    }

    /**
     * Sets the value of the fontAdornments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontAdornments(String value) {
        this.fontAdornments = value;
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

}
