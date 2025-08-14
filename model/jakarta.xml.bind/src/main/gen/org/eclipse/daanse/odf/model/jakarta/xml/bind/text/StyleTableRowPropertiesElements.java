
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.BackgroundImage;


/**
 * <p>Java class for style-table-row-properties-elements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-table-row-properties-elements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-background-image"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-table-row-properties-elements", propOrder = {
    "backgroundImage"
})
@XmlSeeAlso({
    StyleTableRowPropertiesContentStrict.class
})
public class StyleTableRowPropertiesElements {

    @XmlElement(name = "background-image", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected BackgroundImage backgroundImage;

    /**
     * Gets the value of the backgroundImage property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundImage }
     *     
     */
    public BackgroundImage getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Sets the value of the backgroundImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundImage }
     *     
     */
    public void setBackgroundImage(BackgroundImage value) {
        this.backgroundImage = value;
    }

}
