
package org.eclipse.daanse.odf.xml.style;

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
import org.eclipse.daanse.odf.xml.text.StyleStyleContent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-style-content"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}map" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-style-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "map"
})
@XmlRootElement(name = "style")
public class Style
    extends StyleStyleContent
{

    protected List<Map> map;
    @XmlAttribute(name = "display-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String displayName;
    @XmlAttribute(name = "parent-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String parentStyleName;
    @XmlAttribute(name = "next-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String nextStyleName;
    @XmlAttribute(name = "list-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String listLevel;
    @XmlAttribute(name = "list-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String listStyleName;
    @XmlAttribute(name = "master-page-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String masterPageName;
    @XmlAttribute(name = "auto-update", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean autoUpdate;
    @XmlAttribute(name = "data-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String dataStyleName;
    @XmlAttribute(name = "percentage-data-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String percentageDataStyleName;
    @XmlAttribute(name = "class", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String clazz;
    @XmlAttribute(name = "default-outline-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String defaultOutlineLevel;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    /**
     * Gets the value of the map property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the map property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Map }
     * 
     * 
     */
    public List<Map> getMap() {
        if (map == null) {
            map = new ArrayList<Map>();
        }
        return this.map;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the parentStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentStyleName() {
        return parentStyleName;
    }

    /**
     * Sets the value of the parentStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentStyleName(String value) {
        this.parentStyleName = value;
    }

    /**
     * Gets the value of the nextStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStyleName() {
        return nextStyleName;
    }

    /**
     * Sets the value of the nextStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStyleName(String value) {
        this.nextStyleName = value;
    }

    /**
     * Gets the value of the listLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListLevel() {
        return listLevel;
    }

    /**
     * Sets the value of the listLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListLevel(String value) {
        this.listLevel = value;
    }

    /**
     * Gets the value of the listStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListStyleName() {
        return listStyleName;
    }

    /**
     * Sets the value of the listStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListStyleName(String value) {
        this.listStyleName = value;
    }

    /**
     * Gets the value of the masterPageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterPageName() {
        return masterPageName;
    }

    /**
     * Sets the value of the masterPageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterPageName(String value) {
        this.masterPageName = value;
    }

    /**
     * Gets the value of the autoUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * Sets the value of the autoUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUpdate(Boolean value) {
        this.autoUpdate = value;
    }

    /**
     * Gets the value of the dataStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataStyleName() {
        return dataStyleName;
    }

    /**
     * Sets the value of the dataStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataStyleName(String value) {
        this.dataStyleName = value;
    }

    /**
     * Gets the value of the percentageDataStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageDataStyleName() {
        return percentageDataStyleName;
    }

    /**
     * Sets the value of the percentageDataStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageDataStyleName(String value) {
        this.percentageDataStyleName = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the defaultOutlineLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOutlineLevel() {
        return defaultOutlineLevel;
    }

    /**
     * Sets the value of the defaultOutlineLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOutlineLevel(String value) {
        this.defaultOutlineLevel = value;
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
