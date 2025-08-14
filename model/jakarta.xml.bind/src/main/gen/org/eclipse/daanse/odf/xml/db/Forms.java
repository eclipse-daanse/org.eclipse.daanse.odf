
package org.eclipse.daanse.odf.xml.db;

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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}component"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}component-collection"/&gt;
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
    "componentOrComponentCollection"
})
@XmlRootElement(name = "forms")
public class Forms {

    @XmlElements({
        @XmlElement(name = "component", type = Component.class),
        @XmlElement(name = "component-collection", type = ComponentCollection.class)
    })
    protected List<Object> componentOrComponentCollection;

    /**
     * Gets the value of the componentOrComponentCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the componentOrComponentCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentOrComponentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Component }
     * {@link ComponentCollection }
     * 
     * 
     */
    public List<Object> getComponentOrComponentCollection() {
        if (componentOrComponentCollection == null) {
            componentOrComponentCollection = new ArrayList<Object>();
        }
        return this.componentOrComponentCollection;
    }

}
