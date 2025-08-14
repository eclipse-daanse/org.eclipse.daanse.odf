
package org.eclipse.daanse.odf.xml.presentation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.PresentationSpeeds;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}presentation-play-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Play {

    @XmlAttribute(name = "shape-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlIDREF
    protected Object shapeId;
    @XmlAttribute(name = "speed", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationSpeeds speed;

    /**
     * Gets the value of the shapeId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShapeId() {
        return shapeId;
    }

    /**
     * Sets the value of the shapeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShapeId(Object value) {
        this.shapeId = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationSpeeds }
     *     
     */
    public PresentationSpeeds getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationSpeeds }
     *     
     */
    public void setSpeed(PresentationSpeeds value) {
        this.speed = value;
    }

}
