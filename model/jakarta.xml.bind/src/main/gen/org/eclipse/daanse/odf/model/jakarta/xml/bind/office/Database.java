
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.db.DataSource;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.db.Forms;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.db.Queries;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.db.Reports;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.db.TableRepresentations;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.DbTableDefinitions;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}data-source"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}forms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}reports" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}queries" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}table-representations" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}schema-definition" minOccurs="0"/&gt;
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
    "dataSource",
    "forms",
    "reports",
    "queries",
    "tableRepresentations",
    "schemaDefinition"
})
public class Database {

    @XmlElement(name = "data-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", required = true)
    protected DataSource dataSource;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Forms forms;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Reports reports;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected Queries queries;
    @XmlElement(name = "table-representations", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected TableRepresentations tableRepresentations;
    @XmlElement(name = "schema-definition", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected DbTableDefinitions schemaDefinition;

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link DataSource }
     *     
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSource }
     *     
     */
    public void setDataSource(DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public void setForms(Forms value) {
        this.forms = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link Reports }
     *     
     */
    public Reports getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reports }
     *     
     */
    public void setReports(Reports value) {
        this.reports = value;
    }

    /**
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     {@link Queries }
     *     
     */
    public Queries getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Queries }
     *     
     */
    public void setQueries(Queries value) {
        this.queries = value;
    }

    /**
     * Gets the value of the tableRepresentations property.
     * 
     * @return
     *     possible object is
     *     {@link TableRepresentations }
     *     
     */
    public TableRepresentations getTableRepresentations() {
        return tableRepresentations;
    }

    /**
     * Sets the value of the tableRepresentations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableRepresentations }
     *     
     */
    public void setTableRepresentations(TableRepresentations value) {
        this.tableRepresentations = value;
    }

    /**
     * Gets the value of the schemaDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link DbTableDefinitions }
     *     
     */
    public DbTableDefinitions getSchemaDefinition() {
        return schemaDefinition;
    }

    /**
     * Sets the value of the schemaDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbTableDefinitions }
     *     
     */
    public void setSchemaDefinition(DbTableDefinitions value) {
        this.schemaDefinition = value;
    }

}
