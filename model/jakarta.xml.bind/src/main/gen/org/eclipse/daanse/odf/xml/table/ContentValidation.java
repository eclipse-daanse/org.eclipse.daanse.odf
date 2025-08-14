
package org.eclipse.daanse.odf.xml.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.office.EventListeners;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}help-message" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}error-message"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}error-macro"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}event-listeners"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-validation-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "helpMessage",
    "errorMessage",
    "errorMacro",
    "eventListeners"
})
@XmlRootElement(name = "content-validation")
public class ContentValidation {

    @XmlElement(name = "help-message")
    protected HelpMessage helpMessage;
    @XmlElement(name = "error-message")
    protected ErrorMessage errorMessage;
    @XmlElement(name = "error-macro")
    protected ErrorMacro errorMacro;
    @XmlElement(name = "event-listeners", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected EventListeners eventListeners;
    @XmlAttribute(name = "condition", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String condition;
    @XmlAttribute(name = "base-cell-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String baseCellAddress;
    @XmlAttribute(name = "allow-empty-cell", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean allowEmptyCell;
    @XmlAttribute(name = "display-list", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displayList;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String name;

    /**
     * Gets the value of the helpMessage property.
     * 
     * @return
     *     possible object is
     *     {@link HelpMessage }
     *     
     */
    public HelpMessage getHelpMessage() {
        return helpMessage;
    }

    /**
     * Sets the value of the helpMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelpMessage }
     *     
     */
    public void setHelpMessage(HelpMessage value) {
        this.helpMessage = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessage }
     *     
     */
    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessage }
     *     
     */
    public void setErrorMessage(ErrorMessage value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorMacro property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMacro }
     *     
     */
    public ErrorMacro getErrorMacro() {
        return errorMacro;
    }

    /**
     * Sets the value of the errorMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMacro }
     *     
     */
    public void setErrorMacro(ErrorMacro value) {
        this.errorMacro = value;
    }

    /**
     * Gets the value of the eventListeners property.
     * 
     * @return
     *     possible object is
     *     {@link EventListeners }
     *     
     */
    public EventListeners getEventListeners() {
        return eventListeners;
    }

    /**
     * Sets the value of the eventListeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventListeners }
     *     
     */
    public void setEventListeners(EventListeners value) {
        this.eventListeners = value;
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
     * Gets the value of the baseCellAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCellAddress() {
        return baseCellAddress;
    }

    /**
     * Sets the value of the baseCellAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCellAddress(String value) {
        this.baseCellAddress = value;
    }

    /**
     * Gets the value of the allowEmptyCell property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllowEmptyCell() {
        return allowEmptyCell;
    }

    /**
     * Sets the value of the allowEmptyCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowEmptyCell(Boolean value) {
        this.allowEmptyCell = value;
    }

    /**
     * Gets the value of the displayList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayList() {
        return displayList;
    }

    /**
     * Sets the value of the displayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayList(String value) {
        this.displayList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
