
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.form.ConnectionResource;


/**
 * <p>Java class for text-database-next-attlist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="text-database-next-attlist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-field-database-table"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-field-database-table"/&gt;
 *       &lt;attribute name="condition" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "text-database-next-attlist", propOrder = {
    "connectionResource"
})
public class TextDatabaseNextAttlist {

    @XmlElement(name = "connection-resource", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected ConnectionResource connectionResource;
    @XmlAttribute(name = "condition", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String condition;
    @XmlAttribute(name = "database-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String databaseName;
    @XmlAttribute(name = "table-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String tableName;
    @XmlAttribute(name = "table-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tableType;

    /**
     * Gets the value of the connectionResource property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionResource }
     *     
     */
    public ConnectionResource getConnectionResource() {
        return connectionResource;
    }

    /**
     * Sets the value of the connectionResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionResource }
     *     
     */
    public void setConnectionResource(ConnectionResource value) {
        this.connectionResource = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the tableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * Sets the value of the tableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableType(String value) {
        this.tableType = value;
    }

}
