
package org.eclipse.daanse.odf.xml.draw;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.office.EventListeners;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}title" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}event-listeners" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-area-attlist"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}cx use="required""/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}cy use="required""/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}r use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "desc",
    "eventListeners"
})
@XmlRootElement(name = "area-circle")
public class AreaCircle {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String title;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String desc;
    @XmlElement(name = "event-listeners", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected EventListeners eventListeners;
    @XmlAttribute(name = "cx", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String cx;
    @XmlAttribute(name = "cy", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String cy;
    @XmlAttribute(name = "r", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String r;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "target-frame-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String targetFrameName;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String name;
    @XmlAttribute(name = "nohref", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nohref;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the eventListeners property.
     * 
     * @return
     *     possible object is
     *     {@link EventListeners }
     *     
     */
    public EventListeners getEventListeners() {
        return eventListeners;
    }

    /**
     * Sets the value of the eventListeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventListeners }
     *     
     */
    public void setEventListeners(EventListeners value) {
        this.eventListeners = value;
    }

    /**
     * Gets the value of the cx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCx() {
        return cx;
    }

    /**
     * Sets the value of the cx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCx(String value) {
        this.cx = value;
    }

    /**
     * Gets the value of the cy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCy() {
        return cy;
    }

    /**
     * Sets the value of the cy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCy(String value) {
        this.cy = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR(String value) {
        this.r = value;
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
     * Gets the value of the targetFrameName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFrameName() {
        return targetFrameName;
    }

    /**
     * Sets the value of the targetFrameName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFrameName(String value) {
        this.targetFrameName = value;
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

    /**
     * Gets the value of the nohref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNohref() {
        return nohref;
    }

    /**
     * Sets the value of the nohref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNohref(String value) {
        this.nohref = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

}
