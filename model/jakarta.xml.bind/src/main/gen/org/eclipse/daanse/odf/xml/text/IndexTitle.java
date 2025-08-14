
package org.eclipse.daanse.odf.xml.text;

import java.util.ArrayList;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.dr3d.Scene;
import org.eclipse.daanse.odf.xml.draw.A;
import org.eclipse.daanse.odf.xml.draw.Caption;
import org.eclipse.daanse.odf.xml.draw.Circle;
import org.eclipse.daanse.odf.xml.draw.Connector;
import org.eclipse.daanse.odf.xml.draw.Control;
import org.eclipse.daanse.odf.xml.draw.CustomShape;
import org.eclipse.daanse.odf.xml.draw.Ellipse;
import org.eclipse.daanse.odf.xml.draw.Frame;
import org.eclipse.daanse.odf.xml.draw.G;
import org.eclipse.daanse.odf.xml.draw.Line;
import org.eclipse.daanse.odf.xml.draw.Measure;
import org.eclipse.daanse.odf.xml.draw.PageThumbnail;
import org.eclipse.daanse.odf.xml.draw.Path;
import org.eclipse.daanse.odf.xml.draw.Polygon;
import org.eclipse.daanse.odf.xml.draw.Polyline;
import org.eclipse.daanse.odf.xml.draw.Rect;
import org.eclipse.daanse.odf.xml.draw.RegularPolygon;
import org.eclipse.daanse.odf.xml.table.Table;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-content-main" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-section-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indexContentMain"
})
@XmlRootElement(name = "index-title")
public class IndexTitle {

    @XmlElementRefs({
        @XmlElementRef(name = "h", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = H.class, required = false),
        @XmlElementRef(name = "p", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = P.class, required = false),
        @XmlElementRef(name = "list", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.xml.text.List.class, required = false),
        @XmlElementRef(name = "numbered-paragraph", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = NumberedParagraph.class, required = false),
        @XmlElementRef(name = "table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", type = Table.class, required = false),
        @XmlElementRef(name = "section", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Section.class, required = false),
        @XmlElementRef(name = "soft-page-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SoftPageBreak.class, required = false),
        @XmlElementRef(name = "table-of-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableOfContent.class, required = false),
        @XmlElementRef(name = "illustration-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = IllustrationIndex.class, required = false),
        @XmlElementRef(name = "table-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableIndex.class, required = false),
        @XmlElementRef(name = "object-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ObjectIndex.class, required = false),
        @XmlElementRef(name = "user-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserIndex.class, required = false),
        @XmlElementRef(name = "alphabetical-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AlphabeticalIndex.class, required = false),
        @XmlElementRef(name = "bibliography", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Bibliography.class, required = false),
        @XmlElementRef(name = "rect", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Rect.class, required = false),
        @XmlElementRef(name = "line", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Line.class, required = false),
        @XmlElementRef(name = "polyline", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polyline.class, required = false),
        @XmlElementRef(name = "polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polygon.class, required = false),
        @XmlElementRef(name = "regular-polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = RegularPolygon.class, required = false),
        @XmlElementRef(name = "path", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Path.class, required = false),
        @XmlElementRef(name = "circle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Circle.class, required = false),
        @XmlElementRef(name = "ellipse", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Ellipse.class, required = false),
        @XmlElementRef(name = "g", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = G.class, required = false),
        @XmlElementRef(name = "page-thumbnail", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = PageThumbnail.class, required = false),
        @XmlElementRef(name = "frame", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Frame.class, required = false),
        @XmlElementRef(name = "measure", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Measure.class, required = false),
        @XmlElementRef(name = "caption", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Caption.class, required = false),
        @XmlElementRef(name = "connector", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Connector.class, required = false),
        @XmlElementRef(name = "control", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Control.class, required = false),
        @XmlElementRef(name = "scene", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "custom-shape", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = CustomShape.class, required = false),
        @XmlElementRef(name = "a", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = A.class, required = false),
        @XmlElementRef(name = "change-marks", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "index-title", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = IndexTitle.class, required = false)
    })
    protected java.util.List<Object> indexContentMain;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String styleName;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String name;
    @XmlAttribute(name = "protected", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean _protected;
    @XmlAttribute(name = "protection-key", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String protectionKey;
    @XmlAttribute(name = "protection-key-digest-algorithm", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String protectionKeyDigestAlgorithm;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the indexContentMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the indexContentMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexContentMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link H }
     * {@link P }
     * {@link org.eclipse.daanse.odf.xml.text.List }
     * {@link NumberedParagraph }
     * {@link Table }
     * {@link Section }
     * {@link SoftPageBreak }
     * {@link TableOfContent }
     * {@link IllustrationIndex }
     * {@link TableIndex }
     * {@link ObjectIndex }
     * {@link UserIndex }
     * {@link AlphabeticalIndex }
     * {@link Bibliography }
     * {@link Rect }
     * {@link Line }
     * {@link Polyline }
     * {@link Polygon }
     * {@link RegularPolygon }
     * {@link Path }
     * {@link Circle }
     * {@link Ellipse }
     * {@link G }
     * {@link PageThumbnail }
     * {@link Frame }
     * {@link Measure }
     * {@link Caption }
     * {@link Connector }
     * {@link Control }
     * {@link JAXBElement }{@code <}{@link Scene }{@code >}
     * {@link CustomShape }
     * {@link A }
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link IndexTitle }
     * 
     * 
     */
    public java.util.List<Object> getIndexContentMain() {
        if (indexContentMain == null) {
            indexContentMain = new ArrayList<Object>();
        }
        return this.indexContentMain;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
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
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtected(Boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the protectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKey() {
        return protectionKey;
    }

    /**
     * Sets the value of the protectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKey(String value) {
        this.protectionKey = value;
    }

    /**
     * Gets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKeyDigestAlgorithm() {
        return protectionKeyDigestAlgorithm;
    }

    /**
     * Sets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKeyDigestAlgorithm(String value) {
        this.protectionKeyDigestAlgorithm = value;
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

}
