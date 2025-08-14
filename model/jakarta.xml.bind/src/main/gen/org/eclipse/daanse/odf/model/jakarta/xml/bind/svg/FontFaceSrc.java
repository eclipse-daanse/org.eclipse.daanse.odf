
package org.eclipse.daanse.odf.model.jakarta.xml.bind.svg;

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
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}font-face-uri"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}font-face-name"/&gt;
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
    "fontFaceUriOrFontFaceName"
})
@XmlRootElement(name = "font-face-src")
public class FontFaceSrc {

    @XmlElements({
        @XmlElement(name = "font-face-uri", type = FontFaceUri.class),
        @XmlElement(name = "font-face-name", type = FontFaceName.class)
    })
    protected List<Object> fontFaceUriOrFontFaceName;

    /**
     * Gets the value of the fontFaceUriOrFontFaceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fontFaceUriOrFontFaceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFontFaceUriOrFontFaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FontFaceUri }
     * {@link FontFaceName }
     * 
     * 
     */
    public List<Object> getFontFaceUriOrFontFaceName() {
        if (fontFaceUriOrFontFaceName == null) {
            fontFaceUriOrFontFaceName = new ArrayList<Object>();
        }
        return this.fontFaceUriOrFontFaceName;
    }

}
