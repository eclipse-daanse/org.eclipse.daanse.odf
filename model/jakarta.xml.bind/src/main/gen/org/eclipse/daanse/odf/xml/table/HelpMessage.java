
package org.eclipse.daanse.odf.xml.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.P;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}p" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="title" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}display"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "p"
})
@XmlRootElement(name = "help-message")
public class HelpMessage {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected List<P> p;
    @XmlAttribute(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String title;
    @XmlAttribute(name = "display", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean display;

    /**
     * Gets the value of the p property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the p property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * 
     * 
     */
    public List<P> getP() {
        if (p == null) {
            p = new ArrayList<P>();
        }
        return this.p;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplay(Boolean value) {
        this.display = value;
    }

}
