
package org.eclipse.daanse.odf.model.jakarta.xml.bind.db;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.DbDataSourceSettingTypes;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}data-source-setting-value" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-data-source-setting-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataSourceSettingValue"
})
@XmlRootElement(name = "data-source-setting")
public class DataSourceSetting {

    @XmlElement(name = "data-source-setting-value", required = true)
    protected List<String> dataSourceSettingValue;
    @XmlAttribute(name = "data-source-setting-is-list", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Boolean dataSourceSettingIsList;
    @XmlAttribute(name = "data-source-setting-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    protected String dataSourceSettingName;
    @XmlAttribute(name = "data-source-setting-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    protected DbDataSourceSettingTypes dataSourceSettingType;

    /**
     * Gets the value of the dataSourceSettingValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataSourceSettingValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSourceSettingValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataSourceSettingValue() {
        if (dataSourceSettingValue == null) {
            dataSourceSettingValue = new ArrayList<String>();
        }
        return this.dataSourceSettingValue;
    }

    /**
     * Gets the value of the dataSourceSettingIsList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDataSourceSettingIsList() {
        return dataSourceSettingIsList;
    }

    /**
     * Sets the value of the dataSourceSettingIsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataSourceSettingIsList(Boolean value) {
        this.dataSourceSettingIsList = value;
    }

    /**
     * Gets the value of the dataSourceSettingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceSettingName() {
        return dataSourceSettingName;
    }

    /**
     * Sets the value of the dataSourceSettingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceSettingName(String value) {
        this.dataSourceSettingName = value;
    }

    /**
     * Gets the value of the dataSourceSettingType property.
     * 
     * @return
     *     possible object is
     *     {@link DbDataSourceSettingTypes }
     *     
     */
    public DbDataSourceSettingTypes getDataSourceSettingType() {
        return dataSourceSettingType;
    }

    /**
     * Sets the value of the dataSourceSettingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbDataSourceSettingTypes }
     *     
     */
    public void setDataSourceSettingType(DbDataSourceSettingTypes value) {
        this.dataSourceSettingType = value;
    }

}
