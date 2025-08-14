
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.P;


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
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:meta:1.0}date-string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:meta:1.0}creator-initials" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}p"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}list"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-position-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-shape-with-text-and-styles-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-annotation-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-size-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-caption-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creator",
    "date",
    "dateString",
    "creatorInitials",
    "pOrList"
})
@XmlRootElement(name = "annotation")
public class Annotation {

    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected String creator;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "date-string", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected String dateString;
    @XmlElement(name = "creator-initials", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected String creatorInitials;
    @XmlElements({
        @XmlElement(name = "p", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = P.class),
        @XmlElement(name = "list", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List.class)
    })
    protected java.util.List<Object> pOrList;
    @XmlAttribute(name = "x", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String x;
    @XmlAttribute(name = "y", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y;
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
    protected java.util.List<String> drawClassNames;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String presentationStyleName;
    @XmlAttribute(name = "class-names", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected java.util.List<String> presentationClassNames;
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
    @XmlAttribute(name = "display", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Boolean display;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String name;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String width;
    @XmlAttribute(name = "caption-point-x", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String captionPointX;
    @XmlAttribute(name = "caption-point-y", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String captionPointY;
    @XmlAttribute(name = "corner-radius", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String cornerRadius;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateString() {
        return dateString;
    }

    /**
     * Sets the value of the dateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateString(String value) {
        this.dateString = value;
    }

    /**
     * Gets the value of the creatorInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorInitials() {
        return creatorInitials;
    }

    /**
     * Sets the value of the creatorInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorInitials(String value) {
        this.creatorInitials = value;
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
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List }
     * 
     * 
     */
    public java.util.List<Object> getPOrList() {
        if (pOrList == null) {
            pOrList = new ArrayList<Object>();
        }
        return this.pOrList;
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
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplay(Boolean value) {
        this.display = value;
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
     * Gets the value of the captionPointX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionPointX() {
        return captionPointX;
    }

    /**
     * Sets the value of the captionPointX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionPointX(String value) {
        this.captionPointX = value;
    }

    /**
     * Gets the value of the captionPointY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionPointY() {
        return captionPointY;
    }

    /**
     * Sets the value of the captionPointY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionPointY(String value) {
        this.captionPointY = value;
    }

    /**
     * Gets the value of the cornerRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCornerRadius() {
        return cornerRadius;
    }

    /**
     * Sets the value of the cornerRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCornerRadius(String value) {
        this.cornerRadius = value;
    }

}
