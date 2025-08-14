
package org.eclipse.daanse.odf.xml.form;

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.CommonFormControlContent;
import org.eclipse.daanse.odf.xml.text.Types;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-form-control-content"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}form-button-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Button
    extends CommonFormControlContent
{

    @XmlAttribute(name = "default-button", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean defaultButton;
    @XmlAttribute(name = "toggle", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean toggle;
    @XmlAttribute(name = "focus-on-click", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean focusOnClick;
    @XmlAttribute(name = "xforms-submission", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String xformsSubmission;
    @XmlAttribute(name = "bind", namespace = "http://www.w3.org/2002/xforms")
    protected String bind;
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
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "button-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Types buttonType;
    @XmlAttribute(name = "image-data", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String imageData;
    @XmlAttribute(name = "disabled", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean disabled;
    @XmlAttribute(name = "label", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String label;
    @XmlAttribute(name = "printable", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean printable;
    @XmlAttribute(name = "target-frame", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String targetFrame;
    @XmlAttribute(name = "image-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imagePosition;
    @XmlAttribute(name = "image-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imageAlign;
    @XmlAttribute(name = "tab-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected BigInteger tabIndex;
    @XmlAttribute(name = "tab-stop", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean tabStop;
    @XmlAttribute(name = "delay-for-repeat", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Duration delayForRepeat;
    @XmlAttribute(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String title;
    @XmlAttribute(name = "repeat", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean repeat;
    @XmlAttribute(name = "value", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", required = true)
    protected String value;

    /**
     * Gets the value of the defaultButton property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDefaultButton() {
        return defaultButton;
    }

    /**
     * Sets the value of the defaultButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultButton(Boolean value) {
        this.defaultButton = value;
    }

    /**
     * Gets the value of the toggle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getToggle() {
        return toggle;
    }

    /**
     * Sets the value of the toggle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToggle(Boolean value) {
        this.toggle = value;
    }

    /**
     * Gets the value of the focusOnClick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFocusOnClick() {
        return focusOnClick;
    }

    /**
     * Sets the value of the focusOnClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocusOnClick(Boolean value) {
        this.focusOnClick = value;
    }

    /**
     * Gets the value of the xformsSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXformsSubmission() {
        return xformsSubmission;
    }

    /**
     * Sets the value of the xformsSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXformsSubmission(String value) {
        this.xformsSubmission = value;
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
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the buttonType property.
     * 
     * @return
     *     possible object is
     *     {@link Types }
     *     
     */
    public Types getButtonType() {
        return buttonType;
    }

    /**
     * Sets the value of the buttonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Types }
     *     
     */
    public void setButtonType(Types value) {
        this.buttonType = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageData(String value) {
        this.imageData = value;
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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Gets the value of the targetFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFrame() {
        return targetFrame;
    }

    /**
     * Sets the value of the targetFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFrame(String value) {
        this.targetFrame = value;
    }

    /**
     * Gets the value of the imagePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePosition() {
        return imagePosition;
    }

    /**
     * Sets the value of the imagePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePosition(String value) {
        this.imagePosition = value;
    }

    /**
     * Gets the value of the imageAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageAlign() {
        return imageAlign;
    }

    /**
     * Sets the value of the imageAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageAlign(String value) {
        this.imageAlign = value;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
