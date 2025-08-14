
package org.eclipse.daanse.odf.xml.anim;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.Boolean;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}animation-element" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-endsync-timing-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-timing-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}anim-iterate-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "animationElement"
})
public class Iterate {

    @XmlElementRef(name = "animation-element", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> animationElement;
    @XmlAttribute(name = "endsync", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String endsync;
    @XmlAttribute(name = "accelerate", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected BigDecimal accelerate;
    @XmlAttribute(name = "decelerate", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected BigDecimal decelerate;
    @XmlAttribute(name = "autoReverse", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected Boolean autoReverse;
    @XmlAttribute(name = "begin", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String begin;
    @XmlAttribute(name = "end", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String end;
    @XmlAttribute(name = "dur", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String dur;
    @XmlAttribute(name = "restartDefault", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String restartDefault;
    @XmlAttribute(name = "repeatDur", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String repeatDur;
    @XmlAttribute(name = "repeatCount", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String repeatCount;
    @XmlAttribute(name = "restart", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String restart;
    @XmlAttribute(name = "fill", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fill;
    @XmlAttribute(name = "fillDefault", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillDefault;
    @XmlAttribute(name = "node-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nodeType;
    @XmlAttribute(name = "preset-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String presetId;
    @XmlAttribute(name = "preset-sub-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String presetSubType;
    @XmlAttribute(name = "preset-class", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String presetClass;
    @XmlAttribute(name = "master-element", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlIDREF
    protected Object masterElement;
    @XmlAttribute(name = "group-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String groupId;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String xmlId;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String animId;
    @XmlAttribute(name = "iterate-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    protected String iterateType;
    @XmlAttribute(name = "iterate-interval", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    protected Duration iterateInterval;
    @XmlAttribute(name = "targetElement", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlIDREF
    protected Object targetElement;
    @XmlAttribute(name = "sub-item", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    protected String subItem;

    /**
     * Gets the value of the animationElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the animationElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimationElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Par }{@code >}
     * {@link JAXBElement }{@code <}{@link Command }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateMotion }{@code >}
     * {@link JAXBElement }{@code <}{@link Set }{@code >}
     * {@link JAXBElement }{@code <}{@link Animate }{@code >}
     * {@link JAXBElement }{@code <}{@link TransitionFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link Iterate }{@code >}
     * {@link JAXBElement }{@code <}{@link Audio }{@code >}
     * {@link JAXBElement }{@code <}{@link Seq }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateColor }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateTransform }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAnimationElement() {
        if (animationElement == null) {
            animationElement = new ArrayList<JAXBElement<?>>();
        }
        return this.animationElement;
    }

    /**
     * Gets the value of the endsync property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndsync() {
        return endsync;
    }

    /**
     * Sets the value of the endsync property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndsync(String value) {
        this.endsync = value;
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
     * Gets the value of the nodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeType(String value) {
        this.nodeType = value;
    }

    /**
     * Gets the value of the presetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetId() {
        return presetId;
    }

    /**
     * Sets the value of the presetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresetId(String value) {
        this.presetId = value;
    }

    /**
     * Gets the value of the presetSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetSubType() {
        return presetSubType;
    }

    /**
     * Sets the value of the presetSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresetSubType(String value) {
        this.presetSubType = value;
    }

    /**
     * Gets the value of the presetClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetClass() {
        return presetClass;
    }

    /**
     * Sets the value of the presetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresetClass(String value) {
        this.presetClass = value;
    }

    /**
     * Gets the value of the masterElement property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMasterElement() {
        return masterElement;
    }

    /**
     * Sets the value of the masterElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMasterElement(Object value) {
        this.masterElement = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the xmlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlId() {
        return xmlId;
    }

    /**
     * Sets the value of the xmlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlId(String value) {
        this.xmlId = value;
    }

    /**
     * Gets the value of the animId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimId() {
        return animId;
    }

    /**
     * Sets the value of the animId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimId(String value) {
        this.animId = value;
    }

    /**
     * Gets the value of the iterateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterateType() {
        return iterateType;
    }

    /**
     * Sets the value of the iterateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterateType(String value) {
        this.iterateType = value;
    }

    /**
     * Gets the value of the iterateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getIterateInterval() {
        return iterateInterval;
    }

    /**
     * Sets the value of the iterateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setIterateInterval(Duration value) {
        this.iterateInterval = value;
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
