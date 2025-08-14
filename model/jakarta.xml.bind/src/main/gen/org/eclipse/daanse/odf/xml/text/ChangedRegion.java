
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
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
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-changed-region-content"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-changed-region-attr"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "changed-region")
public class ChangedRegion
    extends TextChangedRegionContent
{

    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idText;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the idText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdText() {
        return idText;
    }

    /**
     * Sets the value of the idText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdText(String value) {
        this.idText = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
