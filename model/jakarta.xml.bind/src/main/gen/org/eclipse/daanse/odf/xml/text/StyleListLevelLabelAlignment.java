
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.style.ListLevelLabelAlignment;


/**
 * <p>Java class for style-list-level-label-alignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-list-level-label-alignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}list-level-label-alignment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-list-level-label-alignment", propOrder = {
    "listLevelLabelAlignment"
})
@XmlSeeAlso({
    StyleListLevelPropertiesElements.class
})
public class StyleListLevelLabelAlignment {

    @XmlElement(name = "list-level-label-alignment", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected ListLevelLabelAlignment listLevelLabelAlignment;

    /**
     * Gets the value of the listLevelLabelAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link ListLevelLabelAlignment }
     *     
     */
    public ListLevelLabelAlignment getListLevelLabelAlignment() {
        return listLevelLabelAlignment;
    }

    /**
     * Sets the value of the listLevelLabelAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListLevelLabelAlignment }
     *     
     */
    public void setListLevelLabelAlignment(ListLevelLabelAlignment value) {
        this.listLevelLabelAlignment = value;
    }

}
