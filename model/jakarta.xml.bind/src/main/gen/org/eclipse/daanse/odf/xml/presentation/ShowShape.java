
package org.eclipse.daanse.odf.xml.presentation;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.PresentationEffectDirections;
import org.eclipse.daanse.odf.xml.text.PresentationEffects;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:presentation:1.0}sound" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-presentation-effect-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sound"
})
public class ShowShape {

    protected Sound sound;
    @XmlAttribute(name = "shape-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlIDREF
    protected Object shapeId;
    @XmlAttribute(name = "effect", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationEffects effect;
    @XmlAttribute(name = "direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationEffectDirections direction;
    @XmlAttribute(name = "speed", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationSpeeds speed;
    @XmlAttribute(name = "delay", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Duration delay;
    @XmlAttribute(name = "start-scale", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String startScale;
    @XmlAttribute(name = "path-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String pathId;

    /**
     * Gets the value of the sound property.
     * 
     * @return
     *     possible object is
     *     {@link Sound }
     *     
     */
    public Sound getSound() {
        return sound;
    }

    /**
     * Sets the value of the sound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sound }
     *     
     */
    public void setSound(Sound value) {
        this.sound = value;
    }

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
     * Gets the value of the effect property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationEffects }
     *     
     */
    public PresentationEffects getEffect() {
        return effect;
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationEffects }
     *     
     */
    public void setEffect(PresentationEffects value) {
        this.effect = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationEffectDirections }
     *     
     */
    public PresentationEffectDirections getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationEffectDirections }
     *     
     */
    public void setDirection(PresentationEffectDirections value) {
        this.direction = value;
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

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

    /**
     * Gets the value of the startScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartScale() {
        return startScale;
    }

    /**
     * Sets the value of the startScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartScale(String value) {
        this.startScale = value;
    }

    /**
     * Gets the value of the pathId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathId() {
        return pathId;
    }

    /**
     * Sets the value of the pathId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathId(String value) {
        this.pathId = value;
    }

}
