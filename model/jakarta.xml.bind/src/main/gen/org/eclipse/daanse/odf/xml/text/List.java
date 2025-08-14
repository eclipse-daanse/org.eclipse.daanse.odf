
package org.eclipse.daanse.odf.xml.text;

import java.util.ArrayList;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}list-header" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}list-item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-list-attr"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listHeader",
    "listItem"
})
@XmlRootElement(name = "list")
public class List {

    @XmlElement(name = "list-header")
    protected ListHeader listHeader;
    @XmlElement(name = "list-item")
    protected java.util.List<ListItem> listItem;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String styleName;
    @XmlAttribute(name = "continue-numbering", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean continueNumbering;
    @XmlAttribute(name = "continue-list", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlIDREF
    protected Object continueList;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the listHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ListHeader }
     *     
     */
    public ListHeader getListHeader() {
        return listHeader;
    }

    /**
     * Sets the value of the listHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListHeader }
     *     
     */
    public void setListHeader(ListHeader value) {
        this.listHeader = value;
    }

    /**
     * Gets the value of the listItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListItem }
     * 
     * 
     */
    public java.util.List<ListItem> getListItem() {
        if (listItem == null) {
            listItem = new ArrayList<ListItem>();
        }
        return this.listItem;
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

    /**
     * Gets the value of the continueNumbering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContinueNumbering() {
        return continueNumbering;
    }

    /**
     * Sets the value of the continueNumbering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinueNumbering(Boolean value) {
        this.continueNumbering = value;
    }

    /**
     * Gets the value of the continueList property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContinueList() {
        return continueList;
    }

    /**
     * Sets the value of the continueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContinueList(Object value) {
        this.continueList = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
