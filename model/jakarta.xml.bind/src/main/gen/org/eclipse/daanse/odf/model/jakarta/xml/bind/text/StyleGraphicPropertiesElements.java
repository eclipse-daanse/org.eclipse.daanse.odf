
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
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.Columns;


/**
 * <p>Java class for style-graphic-properties-elements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-graphic-properties-elements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}list-style"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-background-image"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-columns"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-graphic-properties-elements", propOrder = {
    "listStyleOrBackgroundImageOrColumns"
})
@XmlSeeAlso({
    StyleGraphicPropertiesContentStrict.class
})
public class StyleGraphicPropertiesElements {

    @XmlElements({
        @XmlElement(name = "list-style", type = ListStyle.class),
        @XmlElement(name = "background-image", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = BackgroundImage.class),
        @XmlElement(name = "columns", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = Columns.class)
    })
    protected List<Object> listStyleOrBackgroundImageOrColumns;

    /**
     * Gets the value of the listStyleOrBackgroundImageOrColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listStyleOrBackgroundImageOrColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListStyleOrBackgroundImageOrColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListStyle }
     * {@link BackgroundImage }
     * {@link Columns }
     * 
     * 
     */
    public List<Object> getListStyleOrBackgroundImageOrColumns() {
        if (listStyleOrBackgroundImageOrColumns == null) {
            listStyleOrBackgroundImageOrColumns = new ArrayList<Object>();
        }
        return this.listStyleOrBackgroundImageOrColumns;
    }

}
