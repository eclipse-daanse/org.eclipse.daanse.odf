
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import java.math.BigInteger;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-level" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-field-reference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}data-pilot-groups" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-data-pilot-field-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataPilotLevel",
    "dataPilotFieldReference",
    "dataPilotGroups"
})
@XmlRootElement(name = "data-pilot-field")
public class DataPilotField {

    @XmlElement(name = "data-pilot-level")
    protected DataPilotLevel dataPilotLevel;
    @XmlElement(name = "data-pilot-field-reference")
    protected DataPilotFieldReference dataPilotFieldReference;
    @XmlElement(name = "data-pilot-groups")
    protected DataPilotGroups dataPilotGroups;
    @XmlAttribute(name = "source-field-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String sourceFieldName;
    @XmlAttribute(name = "selected-page", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String selectedPage;
    @XmlAttribute(name = "is-data-layout-field", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String isDataLayoutField;
    @XmlAttribute(name = "used-hierarchy", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger usedHierarchy;
    @XmlAttribute(name = "function", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String function;
    @XmlAttribute(name = "orientation", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;

    /**
     * Gets the value of the dataPilotLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotLevel }
     *     
     */
    public DataPilotLevel getDataPilotLevel() {
        return dataPilotLevel;
    }

    /**
     * Sets the value of the dataPilotLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotLevel }
     *     
     */
    public void setDataPilotLevel(DataPilotLevel value) {
        this.dataPilotLevel = value;
    }

    /**
     * Gets the value of the dataPilotFieldReference property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotFieldReference }
     *     
     */
    public DataPilotFieldReference getDataPilotFieldReference() {
        return dataPilotFieldReference;
    }

    /**
     * Sets the value of the dataPilotFieldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotFieldReference }
     *     
     */
    public void setDataPilotFieldReference(DataPilotFieldReference value) {
        this.dataPilotFieldReference = value;
    }

    /**
     * Gets the value of the dataPilotGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotGroups }
     *     
     */
    public DataPilotGroups getDataPilotGroups() {
        return dataPilotGroups;
    }

    /**
     * Sets the value of the dataPilotGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotGroups }
     *     
     */
    public void setDataPilotGroups(DataPilotGroups value) {
        this.dataPilotGroups = value;
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
     * Gets the value of the selectedPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedPage() {
        return selectedPage;
    }

    /**
     * Sets the value of the selectedPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedPage(String value) {
        this.selectedPage = value;
    }

    /**
     * Gets the value of the isDataLayoutField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDataLayoutField() {
        return isDataLayoutField;
    }

    /**
     * Sets the value of the isDataLayoutField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDataLayoutField(String value) {
        this.isDataLayoutField = value;
    }

    /**
     * Gets the value of the usedHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedHierarchy() {
        return usedHierarchy;
    }

    /**
     * Sets the value of the usedHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedHierarchy(BigInteger value) {
        this.usedHierarchy = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

}
