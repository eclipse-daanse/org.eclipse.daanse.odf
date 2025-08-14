
package org.eclipse.daanse.odf.xml.draw;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-contour-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-points-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-size-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-viewbox-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "contour-polygon")
public class ContourPolygon {

    @XmlAttribute(name = "recreate-on-edit", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected Boolean recreateOnEdit;
    @XmlAttribute(name = "points", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String points;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String width;
    @XmlAttribute(name = "viewBox", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected List<String> viewBox;

    /**
     * Gets the value of the recreateOnEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRecreateOnEdit() {
        return recreateOnEdit;
    }

    /**
     * Sets the value of the recreateOnEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecreateOnEdit(Boolean value) {
        this.recreateOnEdit = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoints(String value) {
        this.points = value;
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
     * Gets the value of the viewBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the viewBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getViewBox() {
        if (viewBox == null) {
            viewBox = new ArrayList<String>();
        }
        return this.viewBox;
    }

}
