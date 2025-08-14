
package org.eclipse.daanse.odf.xml.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.style.FontFace;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}font-face" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fontFace"
})
@XmlRootElement(name = "font-face-decls")
public class FontFaceDecls {

    @XmlElement(name = "font-face", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<FontFace> fontFace;

    /**
     * Gets the value of the fontFace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fontFace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFontFace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FontFace }
     * 
     * 
     */
    public List<FontFace> getFontFace() {
        if (fontFace == null) {
            fontFace = new ArrayList<FontFace>();
        }
        return this.fontFace;
    }

}
