
package org.eclipse.daanse.odf.xml.draw;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.anim.Animate;
import org.eclipse.daanse.odf.xml.anim.AnimateColor;
import org.eclipse.daanse.odf.xml.anim.AnimateMotion;
import org.eclipse.daanse.odf.xml.anim.AnimateTransform;
import org.eclipse.daanse.odf.xml.anim.Audio;
import org.eclipse.daanse.odf.xml.anim.Command;
import org.eclipse.daanse.odf.xml.anim.Iterate;
import org.eclipse.daanse.odf.xml.anim.Par;
import org.eclipse.daanse.odf.xml.anim.Seq;
import org.eclipse.daanse.odf.xml.anim.Set;
import org.eclipse.daanse.odf.xml.anim.TransitionFilter;
import org.eclipse.daanse.odf.xml.dr3d.Scene;
import org.eclipse.daanse.odf.xml.office.Forms;
import org.eclipse.daanse.odf.xml.presentation.Animations;
import org.eclipse.daanse.odf.xml.presentation.Notes;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}layer-set" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-forms" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}shape" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:presentation:1.0}animations"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}animation-element"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:presentation:1.0}notes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-page-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-presentation-header-footer-attlist"/&gt;
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
    "layerSet",
    "forms",
    "shape",
    "animations",
    "animationElement",
    "notes"
})
@XmlRootElement(name = "page")
public class Page {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String title;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String desc;
    @XmlElement(name = "layer-set")
    protected LayerSet layerSet;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Forms forms;
    @XmlElements({
        @XmlElement(name = "rect", type = Rect.class),
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "polyline", type = Polyline.class),
        @XmlElement(name = "polygon", type = Polygon.class),
        @XmlElement(name = "regular-polygon", type = RegularPolygon.class),
        @XmlElement(name = "path", type = Path.class),
        @XmlElement(name = "circle", type = Circle.class),
        @XmlElement(name = "ellipse", type = Ellipse.class),
        @XmlElement(name = "g", type = G.class),
        @XmlElement(name = "page-thumbnail", type = PageThumbnail.class),
        @XmlElement(name = "frame", type = Frame.class),
        @XmlElement(name = "measure", type = Measure.class),
        @XmlElement(name = "caption", type = Caption.class),
        @XmlElement(name = "connector", type = Connector.class),
        @XmlElement(name = "control", type = Control.class),
        @XmlElement(name = "scene", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", type = Scene.class),
        @XmlElement(name = "custom-shape", type = CustomShape.class),
        @XmlElement(name = "a", type = A.class)
    })
    protected List<java.lang.Object> shape;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Animations animations;
    @XmlElementRef(name = "animation-element", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<?> animationElement;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Notes notes;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String styleName;
    @XmlAttribute(name = "master-page-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String masterPageName;
    @XmlAttribute(name = "presentation-page-layout-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String presentationPageLayoutName;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "nav-order", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlIDREF
    protected List<java.lang.Object> navOrder;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String textName;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idAttribute;
    @XmlAttribute(name = "use-header-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String useHeaderName;
    @XmlAttribute(name = "use-footer-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String useFooterName;
    @XmlAttribute(name = "use-date-time-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String useDateTimeName;

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
     * Gets the value of the layerSet property.
     * 
     * @return
     *     possible object is
     *     {@link LayerSet }
     *     
     */
    public LayerSet getLayerSet() {
        return layerSet;
    }

    /**
     * Sets the value of the layerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayerSet }
     *     
     */
    public void setLayerSet(LayerSet value) {
        this.layerSet = value;
    }

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public void setForms(Forms value) {
        this.forms = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
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
     * {@link Scene }
     * {@link CustomShape }
     * {@link A }
     * 
     * 
     */
    public List<java.lang.Object> getShape() {
        if (shape == null) {
            shape = new ArrayList<java.lang.Object>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the animations property.
     * 
     * @return
     *     possible object is
     *     {@link Animations }
     *     
     */
    public Animations getAnimations() {
        return animations;
    }

    /**
     * Sets the value of the animations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Animations }
     *     
     */
    public void setAnimations(Animations value) {
        this.animations = value;
    }

    /**
     * Gets the value of the animationElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Par }{@code >}
     *     {@link JAXBElement }{@code <}{@link Command }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateMotion }{@code >}
     *     {@link JAXBElement }{@code <}{@link Set }{@code >}
     *     {@link JAXBElement }{@code <}{@link Animate }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionFilter }{@code >}
     *     {@link JAXBElement }{@code <}{@link Iterate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Audio }{@code >}
     *     {@link JAXBElement }{@code <}{@link Seq }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateColor }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateTransform }{@code >}
     *     {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     *     
     */
    public JAXBElement<?> getAnimationElement() {
        return animationElement;
    }

    /**
     * Sets the value of the animationElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Par }{@code >}
     *     {@link JAXBElement }{@code <}{@link Command }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateMotion }{@code >}
     *     {@link JAXBElement }{@code <}{@link Set }{@code >}
     *     {@link JAXBElement }{@code <}{@link Animate }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionFilter }{@code >}
     *     {@link JAXBElement }{@code <}{@link Iterate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Audio }{@code >}
     *     {@link JAXBElement }{@code <}{@link Seq }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateColor }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateTransform }{@code >}
     *     {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     *     
     */
    public void setAnimationElement(JAXBElement<?> value) {
        this.animationElement = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
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
     * Gets the value of the presentationPageLayoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationPageLayoutName() {
        return presentationPageLayoutName;
    }

    /**
     * Sets the value of the presentationPageLayoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationPageLayoutName(String value) {
        this.presentationPageLayoutName = value;
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
     * Gets the value of the navOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the navOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getNavOrder() {
        if (navOrder == null) {
            navOrder = new ArrayList<java.lang.Object>();
        }
        return this.navOrder;
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
     * Gets the value of the useHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseHeaderName() {
        return useHeaderName;
    }

    /**
     * Sets the value of the useHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseHeaderName(String value) {
        this.useHeaderName = value;
    }

    /**
     * Gets the value of the useFooterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseFooterName() {
        return useFooterName;
    }

    /**
     * Sets the value of the useFooterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseFooterName(String value) {
        this.useFooterName = value;
    }

    /**
     * Gets the value of the useDateTimeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDateTimeName() {
        return useDateTimeName;
    }

    /**
     * Sets the value of the useDateTimeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDateTimeName(String value) {
        this.useDateTimeName = value;
    }

}
