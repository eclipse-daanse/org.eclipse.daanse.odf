
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.presentation.Sound;


/**
 * <p>Java class for style-drawing-page-properties-elements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-drawing-page-properties-elements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:presentation:1.0}sound" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-drawing-page-properties-elements", propOrder = {
    "sound"
})
@XmlSeeAlso({
    StyleDrawingPagePropertiesContentStrict.class
})
public class StyleDrawingPagePropertiesElements {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Sound sound;

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

}
