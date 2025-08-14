
package org.eclipse.daanse.odf.xml.presentation;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
import org.eclipse.daanse.odf.xml.office.Forms;


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
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-forms"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}shape" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}presentation-notes-attlist"/&gt;
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
    "forms",
    "shape"
})
@XmlRootElement(name = "notes")
public class Notes {

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
    @XmlAttribute(name = "page-layout-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String pageLayoutName;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String styleName;
    @XmlAttribute(name = "use-header-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String useHeaderName;
    @XmlAttribute(name = "use-footer-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String useFooterName;
    @XmlAttribute(name = "use-date-time-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String useDateTimeName;

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
