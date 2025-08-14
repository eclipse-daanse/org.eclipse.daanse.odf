
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}change-track-table-cell"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}id"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeTrackTableCell"
})
@XmlRootElement(name = "previous")
public class Previous {

    @XmlElement(name = "change-track-table-cell", required = true)
    protected ChangeTrackTableCell changeTrackTableCell;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String id;

    /**
     * Gets the value of the changeTrackTableCell property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeTrackTableCell }
     *     
     */
    public ChangeTrackTableCell getChangeTrackTableCell() {
        return changeTrackTableCell;
    }

    /**
     * Sets the value of the changeTrackTableCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeTrackTableCell }
     *     
     */
    public void setChangeTrackTableCell(ChangeTrackTableCell value) {
        this.changeTrackTableCell = value;
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
