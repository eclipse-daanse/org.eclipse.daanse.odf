
package org.eclipse.daanse.odf.model.jakarta.xml.bind.draw;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.EventListeners;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.Table;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.PresentationClasses;


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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}text-box"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}image"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}object"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}object-ole"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}applet"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}floating-frame"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}plugin"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}event-listeners" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}glue-point" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}image-map" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}title" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}desc" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}contour-polygon"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}contour-path"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-shape-with-text-and-styles-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-caption-id-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-rel-size-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-frame-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-position-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}presentation-shape-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textBoxOrImageOrObject",
    "eventListeners",
    "gluePoint",
    "imageMap",
    "title",
    "desc",
    "contourPolygon",
    "contourPath"
})
@XmlRootElement(name = "frame")
public class Frame {

    @XmlElements({
        @XmlElement(name = "text-box", type = TextBox.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "object", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Object.class),
        @XmlElement(name = "object-ole", type = ObjectOle.class),
        @XmlElement(name = "applet", type = Applet.class),
        @XmlElement(name = "floating-frame", type = FloatingFrame.class),
        @XmlElement(name = "plugin", type = Plugin.class),
        @XmlElement(name = "table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", type = Table.class)
    })
    protected List<java.lang.Object> textBoxOrImageOrObject;
    @XmlElement(name = "event-listeners", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected EventListeners eventListeners;
    @XmlElement(name = "glue-point")
    protected List<GluePoint> gluePoint;
    @XmlElement(name = "image-map")
    protected ImageMap imageMap;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String title;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String desc;
    @XmlElement(name = "contour-polygon")
    protected ContourPolygon contourPolygon;
    @XmlElement(name = "contour-path")
    protected ContourPath contourPath;
    @XmlAttribute(name = "text-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String textStyleName;
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
    protected List<String> drawClassNames;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String presentationStyleName;
    @XmlAttribute(name = "class-names", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected List<String> presentationClassNames;
    @XmlAttribute(name = "transform", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String transform;
    @XmlAttribute(name = "z-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger zIndex;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String textName;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idAttribute;
    @XmlAttribute(name = "caption-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlIDREF
    protected java.lang.Object captionId;
    @XmlAttribute(name = "rel-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String relHeight;
    @XmlAttribute(name = "rel-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String relWidth;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String width;
    @XmlAttribute(name = "copy-of", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String copyOf;
    @XmlAttribute(name = "x", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String x;
    @XmlAttribute(name = "y", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y;
    @XmlAttribute(name = "class", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationClasses clazz;
    @XmlAttribute(name = "placeholder", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean placeholder;
    @XmlAttribute(name = "user-transformed", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean userTransformed;

    /**
     * Gets the value of the textBoxOrImageOrObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textBoxOrImageOrObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextBoxOrImageOrObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextBox }
     * {@link Image }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Object }
     * {@link ObjectOle }
     * {@link Applet }
     * {@link FloatingFrame }
     * {@link Plugin }
     * {@link Table }
     * 
     * 
     */
    public List<java.lang.Object> getTextBoxOrImageOrObject() {
        if (textBoxOrImageOrObject == null) {
            textBoxOrImageOrObject = new ArrayList<java.lang.Object>();
        }
        return this.textBoxOrImageOrObject;
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
    public List<GluePoint> getGluePoint() {
        if (gluePoint == null) {
            gluePoint = new ArrayList<GluePoint>();
        }
        return this.gluePoint;
    }

    /**
     * Gets the value of the imageMap property.
     * 
     * @return
     *     possible object is
     *     {@link ImageMap }
     *     
     */
    public ImageMap getImageMap() {
        return imageMap;
    }

    /**
     * Sets the value of the imageMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageMap }
     *     
     */
    public void setImageMap(ImageMap value) {
        this.imageMap = value;
    }

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
     * Gets the value of the contourPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link ContourPolygon }
     *     
     */
    public ContourPolygon getContourPolygon() {
        return contourPolygon;
    }

    /**
     * Sets the value of the contourPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContourPolygon }
     *     
     */
    public void setContourPolygon(ContourPolygon value) {
        this.contourPolygon = value;
    }

    /**
     * Gets the value of the contourPath property.
     * 
     * @return
     *     possible object is
     *     {@link ContourPath }
     *     
     */
    public ContourPath getContourPath() {
        return contourPath;
    }

    /**
     * Sets the value of the contourPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContourPath }
     *     
     */
    public void setContourPath(ContourPath value) {
        this.contourPath = value;
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
    public List<String> getDrawClassNames() {
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
    public List<String> getPresentationClassNames() {
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
     * Gets the value of the relHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelHeight() {
        return relHeight;
    }

    /**
     * Sets the value of the relHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelHeight(String value) {
        this.relHeight = value;
    }

    /**
     * Gets the value of the relWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelWidth() {
        return relWidth;
    }

    /**
     * Sets the value of the relWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelWidth(String value) {
        this.relWidth = value;
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
     * Gets the value of the copyOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyOf() {
        return copyOf;
    }

    /**
     * Sets the value of the copyOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyOf(String value) {
        this.copyOf = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationClasses }
     *     
     */
    public PresentationClasses getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationClasses }
     *     
     */
    public void setClazz(PresentationClasses value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the placeholder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPlaceholder() {
        return placeholder;
    }

    /**
     * Sets the value of the placeholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlaceholder(Boolean value) {
        this.placeholder = value;
    }

    /**
     * Gets the value of the userTransformed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUserTransformed() {
        return userTransformed;
    }

    /**
     * Sets the value of the userTransformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserTransformed(Boolean value) {
        this.userTransformed = value;
    }

}
