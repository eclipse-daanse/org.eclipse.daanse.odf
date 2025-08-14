
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}sort-groups" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}subtotal-rule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-subtotal-rules-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sortGroups",
    "subtotalRule"
})
@XmlRootElement(name = "subtotal-rules")
public class SubtotalRules {

    @XmlElement(name = "sort-groups")
    protected SortGroups sortGroups;
    @XmlElement(name = "subtotal-rule")
    protected List<SubtotalRule> subtotalRule;
    @XmlAttribute(name = "bind-styles-to-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean bindStylesToContent;
    @XmlAttribute(name = "page-breaks-on-group-change", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean pageBreaksOnGroupChange;
    @XmlAttribute(name = "case-sensitive", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected Boolean caseSensitive;

    /**
     * Gets the value of the sortGroups property.
     * 
     * @return
     *     possible object is
     *     {@link SortGroups }
     *     
     */
    public SortGroups getSortGroups() {
        return sortGroups;
    }

    /**
     * Sets the value of the sortGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortGroups }
     *     
     */
    public void setSortGroups(SortGroups value) {
        this.sortGroups = value;
    }

    /**
     * Gets the value of the subtotalRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subtotalRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtotalRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubtotalRule }
     * 
     * 
     */
    public List<SubtotalRule> getSubtotalRule() {
        if (subtotalRule == null) {
            subtotalRule = new ArrayList<SubtotalRule>();
        }
        return this.subtotalRule;
    }

    /**
     * Gets the value of the bindStylesToContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBindStylesToContent() {
        return bindStylesToContent;
    }

    /**
     * Sets the value of the bindStylesToContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindStylesToContent(Boolean value) {
        this.bindStylesToContent = value;
    }

    /**
     * Gets the value of the pageBreaksOnGroupChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPageBreaksOnGroupChange() {
        return pageBreaksOnGroupChange;
    }

    /**
     * Sets the value of the pageBreaksOnGroupChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPageBreaksOnGroupChange(Boolean value) {
        this.pageBreaksOnGroupChange = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

}
