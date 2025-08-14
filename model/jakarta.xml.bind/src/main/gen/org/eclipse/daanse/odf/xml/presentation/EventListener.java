
package org.eclipse.daanse.odf.xml.presentation;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}presentation-event-listener-attlist"/&gt;
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
@XmlRootElement(name = "event-listener")
public class EventListener {

    protected Sound sound;
    @XmlAttribute(name = "event-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:script:1.0", required = true)
    protected String eventName;
    @XmlAttribute(name = "action", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String action;
    @XmlAttribute(name = "effect", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationEffects effect;
    @XmlAttribute(name = "direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationEffectDirections direction;
    @XmlAttribute(name = "speed", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected PresentationSpeeds speed;
    @XmlAttribute(name = "start-scale", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String startScale;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "verb", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected BigInteger verb;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;

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
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVerb() {
        return verb;
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVerb(BigInteger value) {
        this.verb = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

}
