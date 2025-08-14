
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-member" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataPilotMember"
})
@XmlRootElement(name = "data-pilot-members")
public class DataPilotMembers {

    @XmlElement(name = "data-pilot-member")
    protected List<DataPilotMember> dataPilotMember;

    /**
     * Gets the value of the dataPilotMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataPilotMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPilotMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPilotMember }
     * 
     * 
     */
    public List<DataPilotMember> getDataPilotMember() {
        if (dataPilotMember == null) {
            dataPilotMember = new ArrayList<DataPilotMember>();
        }
        return this.dataPilotMember;
    }

}
