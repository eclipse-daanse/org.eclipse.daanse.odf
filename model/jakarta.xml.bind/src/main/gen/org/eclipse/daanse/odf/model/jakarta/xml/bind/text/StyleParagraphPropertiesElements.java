
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.BackgroundImage;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.DropCap;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.TabStops;


/**
 * <p>Java class for style-paragraph-properties-elements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-paragraph-properties-elements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-tab-stops"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-drop-cap"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-background-image"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-paragraph-properties-elements", propOrder = {
    "tabStopsOrDropCapOrBackgroundImage"
})
@XmlSeeAlso({
    StyleParagraphPropertiesContentStrict.class
})
public class StyleParagraphPropertiesElements {

    @XmlElements({
        @XmlElement(name = "tab-stops", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = TabStops.class),
        @XmlElement(name = "drop-cap", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = DropCap.class),
        @XmlElement(name = "background-image", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = BackgroundImage.class)
    })
    protected List<Object> tabStopsOrDropCapOrBackgroundImage;

    /**
     * Gets the value of the tabStopsOrDropCapOrBackgroundImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tabStopsOrDropCapOrBackgroundImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabStopsOrDropCapOrBackgroundImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabStops }
     * {@link DropCap }
     * {@link BackgroundImage }
     * 
     * 
     */
    public List<Object> getTabStopsOrDropCapOrBackgroundImage() {
        if (tabStopsOrDropCapOrBackgroundImage == null) {
            tabStopsOrDropCapOrBackgroundImage = new ArrayList<Object>();
        }
        return this.tabStopsOrDropCapOrBackgroundImage;
    }

}
