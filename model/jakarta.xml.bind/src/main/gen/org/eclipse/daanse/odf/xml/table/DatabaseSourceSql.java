
package org.eclipse.daanse.odf.xml.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-database-source-sql-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "database-source-sql")
public class DatabaseSourceSql {

    @XmlAttribute(name = "database-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String databaseName;
    @XmlAttribute(name = "sql-statement", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String sqlStatement;
    @XmlAttribute(name = "parse-sql-statement", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean parseSqlStatement;

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
     * Gets the value of the sqlStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    /**
     * Sets the value of the sqlStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlStatement(String value) {
        this.sqlStatement = value;
    }

    /**
     * Gets the value of the parseSqlStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getParseSqlStatement() {
        return parseSqlStatement;
    }

    /**
     * Sets the value of the parseSqlStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParseSqlStatement(Boolean value) {
        this.parseSqlStatement = value;
    }

}
