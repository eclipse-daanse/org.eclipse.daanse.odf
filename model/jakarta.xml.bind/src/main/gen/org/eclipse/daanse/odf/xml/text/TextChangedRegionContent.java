
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for text-changed-region-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="text-changed-region-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-changed-region-content"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "text-changed-region-content", propOrder = {
    "textChangedRegionContent"
})
@XmlSeeAlso({
    ChangedRegion.class
})
public class TextChangedRegionContent {

    @XmlElementRef(name = "text-changed-region-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class)
    protected JAXBElement<?> textChangedRegionContent;

    /**
     * Gets the value of the textChangedRegionContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Deletion }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link Insertion }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getTextChangedRegionContent() {
        return textChangedRegionContent;
    }

    /**
     * Sets the value of the textChangedRegionContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Deletion }{@code >}
     *     {@link JAXBElement }{@code <}{@link FormatChange }{@code >}
     *     {@link JAXBElement }{@code <}{@link Insertion }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setTextChangedRegionContent(JAXBElement<?> value) {
        this.textChangedRegionContent = value;
    }

}
