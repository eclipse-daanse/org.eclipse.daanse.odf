
package org.eclipse.daanse.odf.model.jakarta.xml.bind.anim;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:animation:1.0}param" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-target-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-anim-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}anim-command-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-begin-end-timing-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "param"
})
public class Command {

    protected List<Param> param;
    @XmlAttribute(name = "targetElement", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    @XmlIDREF
    protected Object targetElement;
    @XmlAttribute(name = "sub-item", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0")
    protected String subItem;
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
    @XmlAttribute(name = "command", namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", required = true)
    protected String command;
    @XmlAttribute(name = "begin", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String begin;
    @XmlAttribute(name = "end", namespace = "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0")
    protected String end;

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Param }
     * 
     * 
     */
    public List<Param> getParam() {
        if (param == null) {
            param = new ArrayList<Param>();
        }
        return this.param;
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
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
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

}
