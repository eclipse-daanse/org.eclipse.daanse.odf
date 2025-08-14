
package org.eclipse.daanse.odf.xml.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}cell-content-change"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}insertion"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}deletion"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}movement"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-tracked-changes-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cellContentChangeOrInsertionOrDeletion"
})
@XmlRootElement(name = "tracked-changes")
public class TrackedChanges {

    @XmlElements({
        @XmlElement(name = "cell-content-change", type = CellContentChange.class),
        @XmlElement(name = "insertion", type = Insertion.class),
        @XmlElement(name = "deletion", type = Deletion.class),
        @XmlElement(name = "movement", type = Movement.class)
    })
    protected List<Object> cellContentChangeOrInsertionOrDeletion;
    @XmlAttribute(name = "track-changes", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean trackChanges;

    /**
     * Gets the value of the cellContentChangeOrInsertionOrDeletion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cellContentChangeOrInsertionOrDeletion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellContentChangeOrInsertionOrDeletion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellContentChange }
     * {@link Insertion }
     * {@link Deletion }
     * {@link Movement }
     * 
     * 
     */
    public List<Object> getCellContentChangeOrInsertionOrDeletion() {
        if (cellContentChangeOrInsertionOrDeletion == null) {
            cellContentChangeOrInsertionOrDeletion = new ArrayList<Object>();
        }
        return this.cellContentChangeOrInsertionOrDeletion;
    }

    /**
     * Gets the value of the trackChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTrackChanges() {
        return trackChanges;
    }

    /**
     * Sets the value of the trackChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackChanges(Boolean value) {
        this.trackChanges = value;
    }

}
