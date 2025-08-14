
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for style-drawing-page-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-drawing-page-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-drawing-page-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-graphic-fill-properties-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-drawing-page-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-drawing-page-properties-content-strict")
public class StyleDrawingPagePropertiesContentStrict
    extends StyleDrawingPagePropertiesElements
{

    @XmlAttribute(name = "fill", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fill;
    @XmlAttribute(name = "fill-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillColor;
    @XmlAttribute(name = "secondary-fill-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String secondaryFillColor;
    @XmlAttribute(name = "fill-gradient-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillGradientName;
    @XmlAttribute(name = "gradient-step-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger gradientStepCount;
    @XmlAttribute(name = "fill-hatch-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillHatchName;
    @XmlAttribute(name = "fill-hatch-solid", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean fillHatchSolid;
    @XmlAttribute(name = "fill-image-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageName;
    @XmlAttribute(name = "repeat", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String repeat;
    @XmlAttribute(name = "fill-image-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageWidth;
    @XmlAttribute(name = "fill-image-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageHeight;
    @XmlAttribute(name = "fill-image-ref-point-x", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageRefPointX;
    @XmlAttribute(name = "fill-image-ref-point-y", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageRefPointY;
    @XmlAttribute(name = "fill-image-ref-point", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillImageRefPoint;
    @XmlAttribute(name = "tile-repeat-offset", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> tileRepeatOffset;
    @XmlAttribute(name = "opacity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String opacity;
    @XmlAttribute(name = "opacity-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String opacityName;
    @XmlAttribute(name = "fill-rule", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillRule;
    @XmlAttribute(name = "transition-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transitionType;
    @XmlAttribute(name = "transition-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transitionStyle;
    @XmlAttribute(name = "transition-speed", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationSpeeds transitionSpeed;
    @XmlAttribute(name = "type", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String type;
    @XmlAttribute(name = "subtype", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String subtype;
    @XmlAttribute(name = "direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String direction;
    @XmlAttribute(name = "fadeColor", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String fadeColor;
    @XmlAttribute(name = "duration", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Duration duration;
    @XmlAttribute(name = "visibility", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "background-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String backgroundSize;
    @XmlAttribute(name = "background-objects-visible", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean backgroundObjectsVisible;
    @XmlAttribute(name = "background-visible", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean backgroundVisible;
    @XmlAttribute(name = "display-header", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean displayHeader;
    @XmlAttribute(name = "display-footer", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean displayFooter;
    @XmlAttribute(name = "display-page-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean displayPageNumber;
    @XmlAttribute(name = "display-date-time", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean displayDateTime;

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the fillColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Sets the value of the fillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillColor(String value) {
        this.fillColor = value;
    }

    /**
     * Gets the value of the secondaryFillColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryFillColor() {
        return secondaryFillColor;
    }

    /**
     * Sets the value of the secondaryFillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryFillColor(String value) {
        this.secondaryFillColor = value;
    }

    /**
     * Gets the value of the fillGradientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillGradientName() {
        return fillGradientName;
    }

    /**
     * Sets the value of the fillGradientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillGradientName(String value) {
        this.fillGradientName = value;
    }

    /**
     * Gets the value of the gradientStepCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGradientStepCount() {
        return gradientStepCount;
    }

    /**
     * Sets the value of the gradientStepCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGradientStepCount(BigInteger value) {
        this.gradientStepCount = value;
    }

    /**
     * Gets the value of the fillHatchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillHatchName() {
        return fillHatchName;
    }

    /**
     * Sets the value of the fillHatchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillHatchName(String value) {
        this.fillHatchName = value;
    }

    /**
     * Gets the value of the fillHatchSolid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFillHatchSolid() {
        return fillHatchSolid;
    }

    /**
     * Sets the value of the fillHatchSolid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFillHatchSolid(Boolean value) {
        this.fillHatchSolid = value;
    }

    /**
     * Gets the value of the fillImageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageName() {
        return fillImageName;
    }

    /**
     * Sets the value of the fillImageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageName(String value) {
        this.fillImageName = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeat(String value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the fillImageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageWidth() {
        return fillImageWidth;
    }

    /**
     * Sets the value of the fillImageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageWidth(String value) {
        this.fillImageWidth = value;
    }

    /**
     * Gets the value of the fillImageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageHeight() {
        return fillImageHeight;
    }

    /**
     * Sets the value of the fillImageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageHeight(String value) {
        this.fillImageHeight = value;
    }

    /**
     * Gets the value of the fillImageRefPointX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageRefPointX() {
        return fillImageRefPointX;
    }

    /**
     * Sets the value of the fillImageRefPointX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageRefPointX(String value) {
        this.fillImageRefPointX = value;
    }

    /**
     * Gets the value of the fillImageRefPointY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageRefPointY() {
        return fillImageRefPointY;
    }

    /**
     * Sets the value of the fillImageRefPointY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageRefPointY(String value) {
        this.fillImageRefPointY = value;
    }

    /**
     * Gets the value of the fillImageRefPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageRefPoint() {
        return fillImageRefPoint;
    }

    /**
     * Sets the value of the fillImageRefPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageRefPoint(String value) {
        this.fillImageRefPoint = value;
    }

    /**
     * Gets the value of the tileRepeatOffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tileRepeatOffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTileRepeatOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTileRepeatOffset() {
        if (tileRepeatOffset == null) {
            tileRepeatOffset = new ArrayList<String>();
        }
        return this.tileRepeatOffset;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacity(String value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the opacityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacityName() {
        return opacityName;
    }

    /**
     * Sets the value of the opacityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacityName(String value) {
        this.opacityName = value;
    }

    /**
     * Gets the value of the fillRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillRule() {
        return fillRule;
    }

    /**
     * Sets the value of the fillRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillRule(String value) {
        this.fillRule = value;
    }

    /**
     * Gets the value of the transitionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionType() {
        return transitionType;
    }

    /**
     * Sets the value of the transitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionType(String value) {
        this.transitionType = value;
    }

    /**
     * Gets the value of the transitionStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionStyle() {
        return transitionStyle;
    }

    /**
     * Sets the value of the transitionStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionStyle(String value) {
        this.transitionStyle = value;
    }

    /**
     * Gets the value of the transitionSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationSpeeds }
     *     
     */
    public PresentationSpeeds getTransitionSpeed() {
        return transitionSpeed;
    }

    /**
     * Sets the value of the transitionSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationSpeeds }
     *     
     */
    public void setTransitionSpeed(PresentationSpeeds value) {
        this.transitionSpeed = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype(String value) {
        this.subtype = value;
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
     * Gets the value of the fadeColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFadeColor() {
        return fadeColor;
    }

    /**
     * Sets the value of the fadeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFadeColor(String value) {
        this.fadeColor = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the backgroundSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundSize() {
        return backgroundSize;
    }

    /**
     * Sets the value of the backgroundSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundSize(String value) {
        this.backgroundSize = value;
    }

    /**
     * Gets the value of the backgroundObjectsVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBackgroundObjectsVisible() {
        return backgroundObjectsVisible;
    }

    /**
     * Sets the value of the backgroundObjectsVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackgroundObjectsVisible(Boolean value) {
        this.backgroundObjectsVisible = value;
    }

    /**
     * Gets the value of the backgroundVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBackgroundVisible() {
        return backgroundVisible;
    }

    /**
     * Sets the value of the backgroundVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackgroundVisible(Boolean value) {
        this.backgroundVisible = value;
    }

    /**
     * Gets the value of the displayHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayHeader() {
        return displayHeader;
    }

    /**
     * Sets the value of the displayHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayHeader(Boolean value) {
        this.displayHeader = value;
    }

    /**
     * Gets the value of the displayFooter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayFooter() {
        return displayFooter;
    }

    /**
     * Sets the value of the displayFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayFooter(Boolean value) {
        this.displayFooter = value;
    }

    /**
     * Gets the value of the displayPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayPageNumber() {
        return displayPageNumber;
    }

    /**
     * Sets the value of the displayPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayPageNumber(Boolean value) {
        this.displayPageNumber = value;
    }

    /**
     * Gets the value of the displayDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayDateTime() {
        return displayDateTime;
    }

    /**
     * Sets the value of the displayDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayDateTime(Boolean value) {
        this.displayDateTime = value;
    }

}
