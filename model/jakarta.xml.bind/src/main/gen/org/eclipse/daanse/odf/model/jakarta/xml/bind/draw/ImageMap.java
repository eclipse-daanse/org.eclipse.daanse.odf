
package org.eclipse.daanse.odf.model.jakarta.xml.bind.draw;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}area-rectangle"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}area-circle"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}area-polygon"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "areaRectangleOrAreaCircleOrAreaPolygon"
})
@XmlRootElement(name = "image-map")
public class ImageMap {

    @XmlElements({
        @XmlElement(name = "area-rectangle", type = AreaRectangle.class),
        @XmlElement(name = "area-circle", type = AreaCircle.class),
        @XmlElement(name = "area-polygon", type = AreaPolygon.class)
    })
    protected List<java.lang.Object> areaRectangleOrAreaCircleOrAreaPolygon;

    /**
     * Gets the value of the areaRectangleOrAreaCircleOrAreaPolygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the areaRectangleOrAreaCircleOrAreaPolygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaRectangleOrAreaCircleOrAreaPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaRectangle }
     * {@link AreaCircle }
     * {@link AreaPolygon }
     * 
     * 
     */
    public List<java.lang.Object> getAreaRectangleOrAreaCircleOrAreaPolygon() {
        if (areaRectangleOrAreaCircleOrAreaPolygon == null) {
            areaRectangleOrAreaCircleOrAreaPolygon = new ArrayList<java.lang.Object>();
        }
        return this.areaRectangleOrAreaCircleOrAreaPolygon;
    }

}
