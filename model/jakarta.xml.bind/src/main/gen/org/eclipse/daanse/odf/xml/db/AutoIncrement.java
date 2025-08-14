
package org.eclipse.daanse.odf.xml.db;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}db-auto-increment-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "auto-increment")
public class AutoIncrement {

    @XmlAttribute(name = "additional-column-statement", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String additionalColumnStatement;
    @XmlAttribute(name = "row-retrieving-statement", namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0")
    protected String rowRetrievingStatement;

    /**
     * Gets the value of the additionalColumnStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalColumnStatement() {
        return additionalColumnStatement;
    }

    /**
     * Sets the value of the additionalColumnStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalColumnStatement(String value) {
        this.additionalColumnStatement = value;
    }

    /**
     * Gets the value of the rowRetrievingStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowRetrievingStatement() {
        return rowRetrievingStatement;
    }

    /**
     * Sets the value of the rowRetrievingStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowRetrievingStatement(String value) {
        this.rowRetrievingStatement = value;
    }

}
