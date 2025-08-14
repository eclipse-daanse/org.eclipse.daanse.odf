
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for style-list-level-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-list-level-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-list-level-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-list-level-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-list-level-properties-content-strict")
public class StyleListLevelPropertiesContentStrict
    extends StyleListLevelPropertiesElements
{

    @XmlAttribute(name = "space-before", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String spaceBefore;
    @XmlAttribute(name = "min-label-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String minLabelWidth;
    @XmlAttribute(name = "min-label-distance", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String minLabelDistance;
    @XmlAttribute(name = "font-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String fontName;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String width;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String height;
    @XmlAttribute(name = "list-level-position-and-space-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String listLevelPositionAndSpaceMode;
    @XmlAttribute(name = "vertical-rel", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verticalRel;
    @XmlAttribute(name = "vertical-pos", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verticalPos;
    @XmlAttribute(name = "y", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y;
    @XmlAttribute(name = "text-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textAlign;

    /**
     * Gets the value of the spaceBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceBefore() {
        return spaceBefore;
    }

    /**
     * Sets the value of the spaceBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceBefore(String value) {
        this.spaceBefore = value;
    }

    /**
     * Gets the value of the minLabelWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinLabelWidth() {
        return minLabelWidth;
    }

    /**
     * Sets the value of the minLabelWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinLabelWidth(String value) {
        this.minLabelWidth = value;
    }

    /**
     * Gets the value of the minLabelDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinLabelDistance() {
        return minLabelDistance;
    }

    /**
     * Sets the value of the minLabelDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinLabelDistance(String value) {
        this.minLabelDistance = value;
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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the listLevelPositionAndSpaceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListLevelPositionAndSpaceMode() {
        return listLevelPositionAndSpaceMode;
    }

    /**
     * Sets the value of the listLevelPositionAndSpaceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListLevelPositionAndSpaceMode(String value) {
        this.listLevelPositionAndSpaceMode = value;
    }

    /**
     * Gets the value of the verticalRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalRel() {
        return verticalRel;
    }

    /**
     * Sets the value of the verticalRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalRel(String value) {
        this.verticalRel = value;
    }

    /**
     * Gets the value of the verticalPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalPos() {
        return verticalPos;
    }

    /**
     * Sets the value of the verticalPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalPos(String value) {
        this.verticalPos = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
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

}
