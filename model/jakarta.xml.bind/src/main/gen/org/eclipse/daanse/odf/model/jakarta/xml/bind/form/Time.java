
package org.eclipse.daanse.odf.model.jakarta.xml.bind.form;

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.CommonFormControlContent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-form-control-content"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}form-time-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-linked-cell"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-repeat"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-spin-button"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-numeric-control-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-delay-for-repeat"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Time
    extends CommonFormControlContent
{

    @XmlAttribute(name = "value", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", required = true)
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "max-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", required = true)
    protected XMLGregorianCalendar maxValue;
    @XmlAttribute(name = "min-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", required = true)
    protected XMLGregorianCalendar minValue;
    @XmlAttribute(name = "current-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", required = true)
    protected XMLGregorianCalendar currentValue;
    @XmlAttribute(name = "linked-cell", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String linkedCell;
    @XmlAttribute(name = "repeat", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean repeat;
    @XmlAttribute(name = "spin-button", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean spinButton;
    @XmlAttribute(name = "disabled", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean disabled;
    @XmlAttribute(name = "data-field", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String dataField;
    @XmlAttribute(name = "readonly", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean readonly;
    @XmlAttribute(name = "convert-empty-to-null", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean convertEmptyToNull;
    @XmlAttribute(name = "max-length", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected BigInteger maxLength;
    @XmlAttribute(name = "printable", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean printable;
    @XmlAttribute(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String title;
    @XmlAttribute(name = "tab-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected BigInteger tabIndex;
    @XmlAttribute(name = "tab-stop", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean tabStop;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formId;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String name;
    @XmlAttribute(name = "control-implementation", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected QName controlImplementation;
    @XmlAttribute(name = "bind", namespace = "http://www.w3.org/2002/xforms")
    protected String bind;
    @XmlAttribute(name = "delay-for-repeat", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Duration delayForRepeat;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxValue(XMLGregorianCalendar value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinValue(XMLGregorianCalendar value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentValue(XMLGregorianCalendar value) {
        this.currentValue = value;
    }

    /**
     * Gets the value of the linkedCell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedCell() {
        return linkedCell;
    }

    /**
     * Sets the value of the linkedCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedCell(String value) {
        this.linkedCell = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeat(Boolean value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the spinButton property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSpinButton() {
        return spinButton;
    }

    /**
     * Sets the value of the spinButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpinButton(Boolean value) {
        this.spinButton = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the dataField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataField() {
        return dataField;
    }

    /**
     * Sets the value of the dataField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataField(String value) {
        this.dataField = value;
    }

    /**
     * Gets the value of the readonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReadonly() {
        return readonly;
    }

    /**
     * Sets the value of the readonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadonly(Boolean value) {
        this.readonly = value;
    }

    /**
     * Gets the value of the convertEmptyToNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getConvertEmptyToNull() {
        return convertEmptyToNull;
    }

    /**
     * Sets the value of the convertEmptyToNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertEmptyToNull(Boolean value) {
        this.convertEmptyToNull = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLength(BigInteger value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the printable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrintable() {
        return printable;
    }

    /**
     * Sets the value of the printable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintable(Boolean value) {
        this.printable = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the tabIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTabIndex() {
        return tabIndex;
    }

    /**
     * Sets the value of the tabIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTabIndex(BigInteger value) {
        this.tabIndex = value;
    }

    /**
     * Gets the value of the tabStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTabStop() {
        return tabStop;
    }

    /**
     * Sets the value of the tabStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTabStop(Boolean value) {
        this.tabStop = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
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

    /**
     * Gets the value of the controlImplementation property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getControlImplementation() {
        return controlImplementation;
    }

    /**
     * Sets the value of the controlImplementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setControlImplementation(QName value) {
        this.controlImplementation = value;
    }

    /**
     * Gets the value of the bind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBind() {
        return bind;
    }

    /**
     * Sets the value of the bind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBind(String value) {
        this.bind = value;
    }

    /**
     * Gets the value of the delayForRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelayForRepeat() {
        return delayForRepeat;
    }

    /**
     * Sets the value of the delayForRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelayForRepeat(Duration value) {
        this.delayForRepeat = value;
    }

}
