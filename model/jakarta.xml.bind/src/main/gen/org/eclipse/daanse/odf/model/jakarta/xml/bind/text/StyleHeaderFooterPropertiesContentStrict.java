
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for style-header-footer-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-header-footer-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-header-footer-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-header-footer-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-header-footer-properties-content-strict")
public class StyleHeaderFooterPropertiesContentStrict
    extends StyleHeaderFooterPropertiesElements
{

    @XmlAttribute(name = "dynamic-spacing", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean dynamicSpacing;
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
    @XmlAttribute(name = "background-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String backgroundColor;
    @XmlAttribute(name = "shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String shadow;
    @XmlAttribute(name = "min-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String minHeight;
    @XmlAttribute(name = "margin", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String margin;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "margin-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginRight;
    @XmlAttribute(name = "margin-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String marginLeft;
    @XmlAttribute(name = "margin-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginTop;
    @XmlAttribute(name = "margin-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginBottom;
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
     * Gets the value of the dynamicSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDynamicSpacing() {
        return dynamicSpacing;
    }

    /**
     * Sets the value of the dynamicSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicSpacing(Boolean value) {
        this.dynamicSpacing = value;
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
     * Gets the value of the minHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHeight() {
        return minHeight;
    }

    /**
     * Sets the value of the minHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHeight(String value) {
        this.minHeight = value;
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
