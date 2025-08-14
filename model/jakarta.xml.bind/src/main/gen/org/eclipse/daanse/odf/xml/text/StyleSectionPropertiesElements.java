
package org.eclipse.daanse.odf.xml.text;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.style.BackgroundImage;
import org.eclipse.daanse.odf.xml.style.Columns;


/**
 * <p>Java class for style-section-properties-elements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-section-properties-elements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-background-image"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-columns"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}notes-configuration"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-section-properties-elements", propOrder = {
    "backgroundImageOrColumnsOrNotesConfiguration"
})
@XmlSeeAlso({
    StyleSectionPropertiesContentStrict.class
})
public class StyleSectionPropertiesElements {

    @XmlElements({
        @XmlElement(name = "background-image", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = BackgroundImage.class),
        @XmlElement(name = "columns", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = Columns.class),
        @XmlElement(name = "notes-configuration", type = TextNotesConfigurationContent.class)
    })
    protected List<Object> backgroundImageOrColumnsOrNotesConfiguration;

    /**
     * Gets the value of the backgroundImageOrColumnsOrNotesConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the backgroundImageOrColumnsOrNotesConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackgroundImageOrColumnsOrNotesConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackgroundImage }
     * {@link Columns }
     * {@link TextNotesConfigurationContent }
     * 
     * 
     */
    public List<Object> getBackgroundImageOrColumnsOrNotesConfiguration() {
        if (backgroundImageOrColumnsOrNotesConfiguration == null) {
            backgroundImageOrColumnsOrNotesConfiguration = new ArrayList<Object>();
        }
        return this.backgroundImageOrColumnsOrNotesConfiguration;
    }

}
