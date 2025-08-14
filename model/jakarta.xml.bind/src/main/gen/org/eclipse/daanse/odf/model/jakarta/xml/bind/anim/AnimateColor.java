
package org.eclipse.daanse.odf.model.jakarta.xml.bind.anim;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-values-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-spline-mode-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-spline-anim-value-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-add-accum-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}anim-animate-color-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-timing-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-named-target-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-target-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class AnimateColor {

    @XmlAttribute(name = "values", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String values;
    @XmlAttribute(name = "formula", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    protected String formula;
    @XmlAttribute(name = "from", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String from;
    @XmlAttribute(name = "by", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String by;
    @XmlAttribute(name = "to", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String to;
    @XmlAttribute(name = "calcMode", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String calcMode;
    @XmlAttribute(name = "keyTimes", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String keyTimes;
    @XmlAttribute(name = "keySplines", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String keySplines;
    @XmlAttribute(name = "accumulate", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accumulate;
    @XmlAttribute(name = "additive", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String additive;
    @XmlAttribute(name = "color-interpolation", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorInterpolation;
    @XmlAttribute(name = "color-interpolation-direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorInterpolationDirection;
    @XmlAttribute(name = "accelerate", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected BigDecimal accelerate;
    @XmlAttribute(name = "decelerate", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected BigDecimal decelerate;
    @XmlAttribute(name = "autoReverse", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected Boolean autoReverse;
    @XmlAttribute(name = "repeatDur", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String repeatDur;
    @XmlAttribute(name = "repeatCount", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String repeatCount;
    @XmlAttribute(name = "restart", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String restart;
    @XmlAttribute(name = "begin", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String begin;
    @XmlAttribute(name = "end", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String end;
    @XmlAttribute(name = "fillDefault", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillDefault;
    @XmlAttribute(name = "restartDefault", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String restartDefault;
    @XmlAttribute(name = "fill", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fill;
    @XmlAttribute(name = "dur", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String dur;
    @XmlAttribute(name = "attributeName", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0", required = true)
    protected String attributeName;
    @XmlAttribute(name = "targetElement", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlIDREF
    protected Object targetElement;
    @XmlAttribute(name = "sub-item", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    protected String subItem;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValues(String value) {
        this.values = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBy(String value) {
        this.by = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the calcMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcMode() {
        return calcMode;
    }

    /**
     * Sets the value of the calcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcMode(String value) {
        this.calcMode = value;
    }

    /**
     * Gets the value of the keyTimes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyTimes() {
        return keyTimes;
    }

    /**
     * Sets the value of the keyTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyTimes(String value) {
        this.keyTimes = value;
    }

    /**
     * Gets the value of the keySplines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySplines() {
        return keySplines;
    }

    /**
     * Sets the value of the keySplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySplines(String value) {
        this.keySplines = value;
    }

    /**
     * Gets the value of the accumulate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulate() {
        return accumulate;
    }

    /**
     * Sets the value of the accumulate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulate(String value) {
        this.accumulate = value;
    }

    /**
     * Gets the value of the additive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditive() {
        return additive;
    }

    /**
     * Sets the value of the additive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditive(String value) {
        this.additive = value;
    }

    /**
     * Gets the value of the colorInterpolation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorInterpolation() {
        return colorInterpolation;
    }

    /**
     * Sets the value of the colorInterpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorInterpolation(String value) {
        this.colorInterpolation = value;
    }

    /**
     * Gets the value of the colorInterpolationDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorInterpolationDirection() {
        return colorInterpolationDirection;
    }

    /**
     * Sets the value of the colorInterpolationDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorInterpolationDirection(String value) {
        this.colorInterpolationDirection = value;
    }

    /**
     * Gets the value of the accelerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccelerate() {
        return accelerate;
    }

    /**
     * Sets the value of the accelerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccelerate(BigDecimal value) {
        this.accelerate = value;
    }

    /**
     * Gets the value of the decelerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecelerate() {
        return decelerate;
    }

    /**
     * Sets the value of the decelerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecelerate(BigDecimal value) {
        this.decelerate = value;
    }

    /**
     * Gets the value of the autoReverse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoReverse() {
        return autoReverse;
    }

    /**
     * Sets the value of the autoReverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoReverse(Boolean value) {
        this.autoReverse = value;
    }

    /**
     * Gets the value of the repeatDur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatDur() {
        return repeatDur;
    }

    /**
     * Sets the value of the repeatDur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatDur(String value) {
        this.repeatDur = value;
    }

    /**
     * Gets the value of the repeatCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatCount() {
        return repeatCount;
    }

    /**
     * Sets the value of the repeatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatCount(String value) {
        this.repeatCount = value;
    }

    /**
     * Gets the value of the restart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestart() {
        return restart;
    }

    /**
     * Sets the value of the restart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestart(String value) {
        this.restart = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(String value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the fillDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillDefault() {
        return fillDefault;
    }

    /**
     * Sets the value of the fillDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillDefault(String value) {
        this.fillDefault = value;
    }

    /**
     * Gets the value of the restartDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestartDefault() {
        return restartDefault;
    }

    /**
     * Sets the value of the restartDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestartDefault(String value) {
        this.restartDefault = value;
    }

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
     * Gets the value of the dur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDur() {
        return dur;
    }

    /**
     * Sets the value of the dur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDur(String value) {
        this.dur = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the targetElement property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTargetElement() {
        return targetElement;
    }

    /**
     * Sets the value of the targetElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTargetElement(Object value) {
        this.targetElement = value;
    }

    /**
     * Gets the value of the subItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubItem() {
        return subItem;
    }

    /**
     * Sets the value of the subItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubItem(String value) {
        this.subItem = value;
    }

}
