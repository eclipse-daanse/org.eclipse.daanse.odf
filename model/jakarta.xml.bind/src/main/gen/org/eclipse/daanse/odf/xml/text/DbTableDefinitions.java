
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.db.TableDefinitions;


/**
 * <p>Java class for db-table-definitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="db-table-definitions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}table-definitions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "db-table-definitions", propOrder = {
    "tableDefinitions"
})
public class DbTableDefinitions {

    @XmlElement(name = "table-definitions", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    protected TableDefinitions tableDefinitions;

    /**
     * Gets the value of the tableDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link TableDefinitions }
     *     
     */
    public TableDefinitions getTableDefinitions() {
        return tableDefinitions;
    }

    /**
     * Sets the value of the tableDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableDefinitions }
     *     
     */
    public void setTableDefinitions(TableDefinitions value) {
        this.tableDefinitions = value;
    }

}
