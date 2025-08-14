
package org.eclipse.daanse.odf.model.jakarta.xml.bind.presentation;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}presentation-animation-elements" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "presentationAnimationElements"
})
@XmlRootElement(name = "animation-group")
public class AnimationGroup {

    @XmlElementRef(name = "presentation-animation-elements", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> presentationAnimationElements;

    /**
     * Gets the value of the presentationAnimationElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the presentationAnimationElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationAnimationElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Dim }{@code >}
     * {@link JAXBElement }{@code <}{@link HideShape }{@code >}
     * {@link JAXBElement }{@code <}{@link ShowText }{@code >}
     * {@link JAXBElement }{@code <}{@link HideText }{@code >}
     * {@link JAXBElement }{@code <}{@link ShowShape }{@code >}
     * {@link JAXBElement }{@code <}{@link Play }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPresentationAnimationElements() {
        if (presentationAnimationElements == null) {
            presentationAnimationElements = new ArrayList<JAXBElement<?>>();
        }
        return this.presentationAnimationElements;
    }

}
