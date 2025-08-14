
package org.eclipse.daanse.odf.model.jakarta.xml.bind.style;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.Animate;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.AnimateColor;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.AnimateMotion;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.AnimateTransform;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.Audio;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.Command;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.Iterate;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.Par;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.Seq;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.Set;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.anim.TransitionFilter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.dr3d.Scene;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.A;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Caption;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Circle;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Connector;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Control;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.CustomShape;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Ellipse;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Frame;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.G;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.LayerSet;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Line;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Measure;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.PageThumbnail;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Path;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Polygon;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Polyline;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Rect;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.RegularPolygon;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Forms;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.presentation.Notes;


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
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}header"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}header-left" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}header-first" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}footer"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}footer-left" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}footer-first" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}layer-set" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-forms" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}shape" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}animation-element" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:presentation:1.0}notes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-master-page-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "headerLeft",
    "headerFirst",
    "footer",
    "footerLeft",
    "footerFirst",
    "layerSet",
    "forms",
    "shape",
    "animationElement",
    "notes"
})
@XmlRootElement(name = "master-page")
public class MasterPage {

    protected Header header;
    @XmlElement(name = "header-left")
    protected HeaderLeft headerLeft;
    @XmlElement(name = "header-first")
    protected HeaderFirst headerFirst;
    protected Footer footer;
    @XmlElement(name = "footer-left")
    protected FooterLeft footerLeft;
    @XmlElement(name = "footer-first")
    protected FooterFirst footerFirst;
    @XmlElement(name = "layer-set", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected LayerSet layerSet;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Forms forms;
    @XmlElements({
        @XmlElement(name = "rect", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Rect.class),
        @XmlElement(name = "line", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Line.class),
        @XmlElement(name = "polyline", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polyline.class),
        @XmlElement(name = "polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polygon.class),
        @XmlElement(name = "regular-polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = RegularPolygon.class),
        @XmlElement(name = "path", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Path.class),
        @XmlElement(name = "circle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Circle.class),
        @XmlElement(name = "ellipse", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Ellipse.class),
        @XmlElement(name = "g", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = G.class),
        @XmlElement(name = "page-thumbnail", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = PageThumbnail.class),
        @XmlElement(name = "frame", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Frame.class),
        @XmlElement(name = "measure", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Measure.class),
        @XmlElement(name = "caption", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Caption.class),
        @XmlElement(name = "connector", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Connector.class),
        @XmlElement(name = "control", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Control.class),
        @XmlElement(name = "scene", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", type = Scene.class),
        @XmlElement(name = "custom-shape", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = CustomShape.class),
        @XmlElement(name = "a", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = A.class)
    })
    protected List<Object> shape;
    @XmlElementRef(name = "animation-element", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<?> animationElement;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Notes notes;
    @XmlAttribute(name = "display-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String displayName;
    @XmlAttribute(name = "page-layout-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String pageLayoutName;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String styleName;
    @XmlAttribute(name = "next-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String nextStyleName;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the headerLeft property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderLeft }
     *     
     */
    public HeaderLeft getHeaderLeft() {
        return headerLeft;
    }

    /**
     * Sets the value of the headerLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderLeft }
     *     
     */
    public void setHeaderLeft(HeaderLeft value) {
        this.headerLeft = value;
    }

    /**
     * Gets the value of the headerFirst property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderFirst }
     *     
     */
    public HeaderFirst getHeaderFirst() {
        return headerFirst;
    }

    /**
     * Sets the value of the headerFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderFirst }
     *     
     */
    public void setHeaderFirst(HeaderFirst value) {
        this.headerFirst = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link Footer }
     *     
     */
    public Footer getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Footer }
     *     
     */
    public void setFooter(Footer value) {
        this.footer = value;
    }

    /**
     * Gets the value of the footerLeft property.
     * 
     * @return
     *     possible object is
     *     {@link FooterLeft }
     *     
     */
    public FooterLeft getFooterLeft() {
        return footerLeft;
    }

    /**
     * Sets the value of the footerLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link FooterLeft }
     *     
     */
    public void setFooterLeft(FooterLeft value) {
        this.footerLeft = value;
    }

    /**
     * Gets the value of the footerFirst property.
     * 
     * @return
     *     possible object is
     *     {@link FooterFirst }
     *     
     */
    public FooterFirst getFooterFirst() {
        return footerFirst;
    }

    /**
     * Sets the value of the footerFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FooterFirst }
     *     
     */
    public void setFooterFirst(FooterFirst value) {
        this.footerFirst = value;
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
    public List<Object> getShape() {
        if (shape == null) {
            shape = new ArrayList<Object>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the animationElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnimateColor }{@code >}
     *     {@link JAXBElement }{@code <}{@link Seq }{@code >}
     *     {@link JAXBElement }{@code <}{@link Iterate }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionFilter }{@code >}
     *     {@link JAXBElement }{@code <}{@link Animate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Command }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateMotion }{@code >}
     *     {@link JAXBElement }{@code <}{@link Par }{@code >}
     *     {@link JAXBElement }{@code <}{@link Audio }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateTransform }{@code >}
     *     {@link JAXBElement }{@code <}{@link Set }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
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
     *     {@link JAXBElement }{@code <}{@link AnimateColor }{@code >}
     *     {@link JAXBElement }{@code <}{@link Seq }{@code >}
     *     {@link JAXBElement }{@code <}{@link Iterate }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionFilter }{@code >}
     *     {@link JAXBElement }{@code <}{@link Animate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Command }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateMotion }{@code >}
     *     {@link JAXBElement }{@code <}{@link Par }{@code >}
     *     {@link JAXBElement }{@code <}{@link Audio }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnimateTransform }{@code >}
     *     {@link JAXBElement }{@code <}{@link Set }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
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
     * Gets the value of the pageLayoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLayoutName() {
        return pageLayoutName;
    }

    /**
     * Sets the value of the pageLayoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLayoutName(String value) {
        this.pageLayoutName = value;
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
