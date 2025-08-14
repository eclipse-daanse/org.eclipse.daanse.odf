
package org.eclipse.daanse.odf.xml.draw;

import java.math.BigInteger;
import java.util.ArrayList;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.office.EventListeners;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.P;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}glue-point" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-text"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-measure-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-caption-id-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-shape-with-text-and-styles-attlist"/&gt;
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
    "eventListeners",
    "gluePoint",
    "pOrList"
})
@XmlRootElement(name = "measure")
public class Measure {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String title;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String desc;
    @XmlElement(name = "event-listeners", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected EventListeners eventListeners;
    @XmlElement(name = "glue-point")
    protected java.util.List<GluePoint> gluePoint;
    @XmlElements({
        @XmlElement(name = "p", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = P.class),
        @XmlElement(name = "list", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.xml.text.List.class)
    })
    protected java.util.List<java.lang.Object> pOrList;
    @XmlAttribute(name = "x1", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String x1;
    @XmlAttribute(name = "y1", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y1;
    @XmlAttribute(name = "x2", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String x2;
    @XmlAttribute(name = "y2", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y2;
    @XmlAttribute(name = "caption-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlIDREF
    protected java.lang.Object captionId;
    @XmlAttribute(name = "text-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String textStyleName;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idAttribute;
    @XmlAttribute(name = "z-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger zIndex;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String textName;
    @XmlAttribute(name = "layer", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String layer;
    @XmlAttribute(name = "end-cell-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String endCellAddress;
    @XmlAttribute(name = "end-x", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String endX;
    @XmlAttribute(name = "end-y", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String endY;
    @XmlAttribute(name = "table-background", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean tableBackground;
    @XmlAttribute(name = "anchor-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String anchorType;
    @XmlAttribute(name = "anchor-page-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger anchorPageNumber;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String drawStyleName;
    @XmlAttribute(name = "class-names", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected java.util.List<String> drawClassNames;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String presentationStyleName;
    @XmlAttribute(name = "class-names", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected java.util.List<String> presentationClassNames;
    @XmlAttribute(name = "transform", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String transform;

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
     * Gets the value of the gluePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gluePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGluePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GluePoint }
     * 
     * 
     */
    public java.util.List<GluePoint> getGluePoint() {
        if (gluePoint == null) {
            gluePoint = new ArrayList<GluePoint>();
        }
        return this.gluePoint;
    }

    /**
     * Gets the value of the pOrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pOrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link org.eclipse.daanse.odf.xml.text.List }
     * 
     * 
     */
    public java.util.List<java.lang.Object> getPOrList() {
        if (pOrList == null) {
            pOrList = new ArrayList<java.lang.Object>();
        }
        return this.pOrList;
    }

    /**
     * Gets the value of the x1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX1(String value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the y1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY1() {
        return y1;
    }

    /**
     * Sets the value of the y1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY1(String value) {
        this.y1 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2(String value) {
        this.x2 = value;
    }

    /**
     * Gets the value of the y2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY2() {
        return y2;
    }

    /**
     * Sets the value of the y2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY2(String value) {
        this.y2 = value;
    }

    /**
     * Gets the value of the captionId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getCaptionId() {
        return captionId;
    }

    /**
     * Sets the value of the captionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setCaptionId(java.lang.Object value) {
        this.captionId = value;
    }

    /**
     * Gets the value of the textStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextStyleName() {
        return textStyleName;
    }

    /**
     * Sets the value of the textStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextStyleName(String value) {
        this.textStyleName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAttribute() {
        return idAttribute;
    }

    /**
     * Sets the value of the idAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAttribute(String value) {
        this.idAttribute = value;
    }

    /**
     * Gets the value of the zIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZIndex() {
        return zIndex;
    }

    /**
     * Sets the value of the zIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZIndex(BigInteger value) {
        this.zIndex = value;
    }

    /**
     * Gets the value of the textName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextName() {
        return textName;
    }

    /**
     * Sets the value of the textName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextName(String value) {
        this.textName = value;
    }

    /**
     * Gets the value of the layer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayer(String value) {
        this.layer = value;
    }

    /**
     * Gets the value of the endCellAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCellAddress() {
        return endCellAddress;
    }

    /**
     * Sets the value of the endCellAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCellAddress(String value) {
        this.endCellAddress = value;
    }

    /**
     * Gets the value of the endX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndX() {
        return endX;
    }

    /**
     * Sets the value of the endX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndX(String value) {
        this.endX = value;
    }

    /**
     * Gets the value of the endY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndY() {
        return endY;
    }

    /**
     * Sets the value of the endY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndY(String value) {
        this.endY = value;
    }

    /**
     * Gets the value of the tableBackground property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTableBackground() {
        return tableBackground;
    }

    /**
     * Sets the value of the tableBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTableBackground(Boolean value) {
        this.tableBackground = value;
    }

    /**
     * Gets the value of the anchorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorType() {
        return anchorType;
    }

    /**
     * Sets the value of the anchorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorType(String value) {
        this.anchorType = value;
    }

    /**
     * Gets the value of the anchorPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnchorPageNumber() {
        return anchorPageNumber;
    }

    /**
     * Sets the value of the anchorPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnchorPageNumber(BigInteger value) {
        this.anchorPageNumber = value;
    }

    /**
     * Gets the value of the drawStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawStyleName() {
        return drawStyleName;
    }

    /**
     * Sets the value of the drawStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawStyleName(String value) {
        this.drawStyleName = value;
    }

    /**
     * Gets the value of the drawClassNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the drawClassNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawClassNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public java.util.List<String> getDrawClassNames() {
        if (drawClassNames == null) {
            drawClassNames = new ArrayList<String>();
        }
        return this.drawClassNames;
    }

    /**
     * Gets the value of the presentationStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationStyleName() {
        return presentationStyleName;
    }

    /**
     * Sets the value of the presentationStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationStyleName(String value) {
        this.presentationStyleName = value;
    }

    /**
     * Gets the value of the presentationClassNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the presentationClassNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationClassNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public java.util.List<String> getPresentationClassNames() {
        if (presentationClassNames == null) {
            presentationClassNames = new ArrayList<String>();
        }
        return this.presentationClassNames;
    }

    /**
     * Gets the value of the transform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransform(String value) {
        this.transform = value;
    }

}
