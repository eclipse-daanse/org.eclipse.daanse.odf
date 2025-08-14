
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-subtotals" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-members" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-display-info" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-sort-info" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-layout-info" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-data-pilot-level-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataPilotSubtotals",
    "dataPilotMembers",
    "dataPilotDisplayInfo",
    "dataPilotSortInfo",
    "dataPilotLayoutInfo"
})
@XmlRootElement(name = "data-pilot-level")
public class DataPilotLevel {

    @XmlElement(name = "data-pilot-subtotals")
    protected DataPilotSubtotals dataPilotSubtotals;
    @XmlElement(name = "data-pilot-members")
    protected DataPilotMembers dataPilotMembers;
    @XmlElement(name = "data-pilot-display-info")
    protected DataPilotDisplayInfo dataPilotDisplayInfo;
    @XmlElement(name = "data-pilot-sort-info")
    protected DataPilotSortInfo dataPilotSortInfo;
    @XmlElement(name = "data-pilot-layout-info")
    protected DataPilotLayoutInfo dataPilotLayoutInfo;
    @XmlAttribute(name = "show-empty", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean showEmpty;

    /**
     * Gets the value of the dataPilotSubtotals property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotSubtotals }
     *     
     */
    public DataPilotSubtotals getDataPilotSubtotals() {
        return dataPilotSubtotals;
    }

    /**
     * Sets the value of the dataPilotSubtotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotSubtotals }
     *     
     */
    public void setDataPilotSubtotals(DataPilotSubtotals value) {
        this.dataPilotSubtotals = value;
    }

    /**
     * Gets the value of the dataPilotMembers property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotMembers }
     *     
     */
    public DataPilotMembers getDataPilotMembers() {
        return dataPilotMembers;
    }

    /**
     * Sets the value of the dataPilotMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotMembers }
     *     
     */
    public void setDataPilotMembers(DataPilotMembers value) {
        this.dataPilotMembers = value;
    }

    /**
     * Gets the value of the dataPilotDisplayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotDisplayInfo }
     *     
     */
    public DataPilotDisplayInfo getDataPilotDisplayInfo() {
        return dataPilotDisplayInfo;
    }

    /**
     * Sets the value of the dataPilotDisplayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotDisplayInfo }
     *     
     */
    public void setDataPilotDisplayInfo(DataPilotDisplayInfo value) {
        this.dataPilotDisplayInfo = value;
    }

    /**
     * Gets the value of the dataPilotSortInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotSortInfo }
     *     
     */
    public DataPilotSortInfo getDataPilotSortInfo() {
        return dataPilotSortInfo;
    }

    /**
     * Sets the value of the dataPilotSortInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotSortInfo }
     *     
     */
    public void setDataPilotSortInfo(DataPilotSortInfo value) {
        this.dataPilotSortInfo = value;
    }

    /**
     * Gets the value of the dataPilotLayoutInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotLayoutInfo }
     *     
     */
    public DataPilotLayoutInfo getDataPilotLayoutInfo() {
        return dataPilotLayoutInfo;
    }

    /**
     * Sets the value of the dataPilotLayoutInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotLayoutInfo }
     *     
     */
    public void setDataPilotLayoutInfo(DataPilotLayoutInfo value) {
        this.dataPilotLayoutInfo = value;
    }

    /**
     * Gets the value of the showEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowEmpty() {
        return showEmpty;
    }

    /**
     * Sets the value of the showEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEmpty(Boolean value) {
        this.showEmpty = value;
    }

}
