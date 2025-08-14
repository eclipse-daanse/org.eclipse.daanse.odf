
package org.eclipse.daanse.odf.xml.style;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-list-level-label-alignment-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "list-level-label-alignment")
public class ListLevelLabelAlignment {

    @XmlAttribute(name = "label-followed-by", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String labelFollowedBy;
    @XmlAttribute(name = "list-tab-stop-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String listTabStopPosition;
    @XmlAttribute(name = "text-indent", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String textIndent;
    @XmlAttribute(name = "margin-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String marginLeft;

    /**
     * Gets the value of the labelFollowedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelFollowedBy() {
        return labelFollowedBy;
    }

    /**
     * Sets the value of the labelFollowedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelFollowedBy(String value) {
        this.labelFollowedBy = value;
    }

    /**
     * Gets the value of the listTabStopPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListTabStopPosition() {
        return listTabStopPosition;
    }

    /**
     * Sets the value of the listTabStopPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListTabStopPosition(String value) {
        this.listTabStopPosition = value;
    }

    /**
     * Gets the value of the textIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextIndent() {
        return textIndent;
    }

    /**
     * Sets the value of the textIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextIndent(String value) {
        this.textIndent = value;
    }

    /**
     * Gets the value of the marginLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginLeft() {
        return marginLeft;
    }

    /**
     * Sets the value of the marginLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginLeft(String value) {
        this.marginLeft = value;
    }

}
