
package org.eclipse.daanse.odf.xml.table;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}filter-and"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}filter-condition"/&gt;
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
    "filterAndOrFilterCondition"
})
@XmlRootElement(name = "filter-or")
public class FilterOr {

    @XmlElements({
        @XmlElement(name = "filter-and", type = FilterAnd.class),
        @XmlElement(name = "filter-condition", type = FilterCondition.class)
    })
    protected List<Object> filterAndOrFilterCondition;

    /**
     * Gets the value of the filterAndOrFilterCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the filterAndOrFilterCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterAndOrFilterCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterAnd }
     * {@link FilterCondition }
     * 
     * 
     */
    public List<Object> getFilterAndOrFilterCondition() {
        if (filterAndOrFilterCondition == null) {
            filterAndOrFilterCondition = new ArrayList<Object>();
        }
        return this.filterAndOrFilterCondition;
    }

}
