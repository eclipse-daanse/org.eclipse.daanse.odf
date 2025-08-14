
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.TextSectionSourceDde;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}dde-source"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table"/&gt;
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
    "ddeSource",
    "table"
})
@XmlRootElement(name = "dde-link")
public class DdeLink {

    @XmlElement(name = "dde-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    protected TextSectionSourceDde ddeSource;
    @XmlElement(required = true)
    protected Table table;

    /**
     * Gets the value of the ddeSource property.
     * 
     * @return
     *     possible object is
     *     {@link TextSectionSourceDde }
     *     
     */
    public TextSectionSourceDde getDdeSource() {
        return ddeSource;
    }

    /**
     * Sets the value of the ddeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextSectionSourceDde }
     *     
     */
    public void setDdeSource(TextSectionSourceDde value) {
        this.ddeSource = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    public void setTable(Table value) {
        this.table = value;
    }

}
