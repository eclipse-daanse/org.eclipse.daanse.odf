
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}cell-content-deletion"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}change-deletion"/&gt;
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
    "cellContentDeletionOrChangeDeletion"
})
@XmlRootElement(name = "deletions")
public class Deletions {

    @XmlElements({
        @XmlElement(name = "cell-content-deletion", type = CellContentDeletion.class),
        @XmlElement(name = "change-deletion", type = ChangeDeletion.class)
    })
    protected List<Object> cellContentDeletionOrChangeDeletion;

    /**
     * Gets the value of the cellContentDeletionOrChangeDeletion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cellContentDeletionOrChangeDeletion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellContentDeletionOrChangeDeletion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellContentDeletion }
     * {@link ChangeDeletion }
     * 
     * 
     */
    public List<Object> getCellContentDeletionOrChangeDeletion() {
        if (cellContentDeletionOrChangeDeletion == null) {
            cellContentDeletionOrChangeDeletion = new ArrayList<Object>();
        }
        return this.cellContentDeletionOrChangeDeletion;
    }

}
