
package org.eclipse.daanse.odf.xml.anim;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-basic-timing-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}anim-audio-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Audio {

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
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "audio-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    protected Double audioLevel;

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
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the audioLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAudioLevel() {
        return audioLevel;
    }

    /**
     * Sets the value of the audioLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAudioLevel(Double value) {
        this.audioLevel = value;
    }

}
