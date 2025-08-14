
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-group" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-data-pilot-groups-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataPilotGroup"
})
@XmlRootElement(name = "data-pilot-groups")
public class DataPilotGroups {

    @XmlElement(name = "data-pilot-group", required = true)
    protected List<DataPilotGroup> dataPilotGroup;
    @XmlAttribute(name = "source-field-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String sourceFieldName;
    @XmlAttribute(name = "date-start", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected List<String> dateStart;
    @XmlAttribute(name = "start", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String start;
    @XmlAttribute(name = "date-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected List<String> dateEnd;
    @XmlAttribute(name = "end", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String end;
    @XmlAttribute(name = "step", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Double step;
    @XmlAttribute(name = "grouped-by", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String groupedBy;

    /**
     * Gets the value of the dataPilotGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataPilotGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPilotGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPilotGroup }
     * 
     * 
     */
    public List<DataPilotGroup> getDataPilotGroup() {
        if (dataPilotGroup == null) {
            dataPilotGroup = new ArrayList<DataPilotGroup>();
        }
        return this.dataPilotGroup;
    }

    /**
     * Gets the value of the sourceFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFieldName() {
        return sourceFieldName;
    }

    /**
     * Sets the value of the sourceFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFieldName(String value) {
        this.sourceFieldName = value;
    }

    /**
     * Gets the value of the dateStart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dateStart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDateStart() {
        if (dateStart == null) {
            dateStart = new ArrayList<String>();
        }
        return this.dateStart;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dateEnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateEnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDateEnd() {
        if (dateEnd == null) {
            dateEnd = new ArrayList<String>();
        }
        return this.dateEnd;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStep(Double value) {
        this.step = value;
    }

    /**
     * Gets the value of the groupedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupedBy() {
        return groupedBy;
    }

    /**
     * Sets the value of the groupedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupedBy(String value) {
        this.groupedBy = value;
    }

}
