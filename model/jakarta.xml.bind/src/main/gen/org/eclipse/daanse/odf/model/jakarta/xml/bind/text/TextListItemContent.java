
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.util.ArrayList;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for text-list-item-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="text-list-item-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}number" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}p"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}h"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}list"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}soft-page-break"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "text-list-item-content", propOrder = {
    "number",
    "pOrHOrList"
})
@XmlSeeAlso({
    ListItem.class,
    ListHeader.class
})
public class TextListItemContent {

    protected String number;
    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "h", type = H.class),
        @XmlElement(name = "list", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List.class),
        @XmlElement(name = "soft-page-break", type = SoftPageBreak.class)
    })
    protected java.util.List<Object> pOrHOrList;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the pOrHOrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pOrHOrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrHOrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link H }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List }
     * {@link SoftPageBreak }
     * 
     * 
     */
    public java.util.List<Object> getPOrHOrList() {
        if (pOrHOrList == null) {
            pOrHOrList = new ArrayList<Object>();
        }
        return this.pOrHOrList;
    }

}
