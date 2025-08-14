
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-table-of-content-children" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-table-of-content-entry-template-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textTableOfContentChildren"
})
@XmlRootElement(name = "table-of-content-entry-template")
public class TableOfContentEntryTemplate {

    @XmlElementRef(name = "text-table-of-content-children", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> textTableOfContentChildren;
    @XmlAttribute(name = "outline-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected BigInteger outlineLevel;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String styleName;

    /**
     * Gets the value of the textTableOfContentChildren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textTableOfContentChildren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextTableOfContentChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IndexEntryTabStop }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexEntryPageNumber }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexEntryLinkEnd }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexEntrySpan }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexEntryChapter }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexEntryText }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexEntryLinkStart }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTextTableOfContentChildren() {
        if (textTableOfContentChildren == null) {
            textTableOfContentChildren = new ArrayList<JAXBElement<?>>();
        }
        return this.textTableOfContentChildren;
    }

    /**
     * Gets the value of the outlineLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutlineLevel() {
        return outlineLevel;
    }

    /**
     * Sets the value of the outlineLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutlineLevel(BigInteger value) {
        this.outlineLevel = value;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

}
