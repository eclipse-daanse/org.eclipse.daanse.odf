
package org.eclipse.daanse.odf.model.jakarta.xml.bind.number;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}number-month-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-calendar-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "month")
public class Month {

    @XmlAttribute(name = "textual", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Boolean textual;
    @XmlAttribute(name = "possessive-form", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Boolean possessiveForm;
    @XmlAttribute(name = "style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "calendar", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected String calendar;

    /**
     * Gets the value of the textual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTextual() {
        return textual;
    }

    /**
     * Sets the value of the textual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextual(Boolean value) {
        this.textual = value;
    }

    /**
     * Gets the value of the possessiveForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPossessiveForm() {
        return possessiveForm;
    }

    /**
     * Sets the value of the possessiveForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossessiveForm(Boolean value) {
        this.possessiveForm = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendar(String value) {
        this.calendar = value;
    }

}
