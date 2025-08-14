
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.form.Button;
import org.eclipse.daanse.odf.xml.form.Checkbox;
import org.eclipse.daanse.odf.xml.form.Combobox;
import org.eclipse.daanse.odf.xml.form.Date;
import org.eclipse.daanse.odf.xml.form.File;
import org.eclipse.daanse.odf.xml.form.FixedText;
import org.eclipse.daanse.odf.xml.form.FormattedText;
import org.eclipse.daanse.odf.xml.form.Frame;
import org.eclipse.daanse.odf.xml.form.GenericControl;
import org.eclipse.daanse.odf.xml.form.Grid;
import org.eclipse.daanse.odf.xml.form.Hidden;
import org.eclipse.daanse.odf.xml.form.Image;
import org.eclipse.daanse.odf.xml.form.ImageFrame;
import org.eclipse.daanse.odf.xml.form.Listbox;
import org.eclipse.daanse.odf.xml.form.Number;
import org.eclipse.daanse.odf.xml.form.Password;
import org.eclipse.daanse.odf.xml.form.Properties;
import org.eclipse.daanse.odf.xml.form.Radio;
import org.eclipse.daanse.odf.xml.form.Text;
import org.eclipse.daanse.odf.xml.form.Textarea;
import org.eclipse.daanse.odf.xml.form.Time;
import org.eclipse.daanse.odf.xml.form.ValueRange;
import org.eclipse.daanse.odf.xml.office.EventListeners;


/**
 * <p>Java class for common-form-control-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="common-form-control-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:form:1.0}properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}event-listeners" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common-form-control-content", propOrder = {
    "properties",
    "eventListeners"
})
@XmlSeeAlso({
    Text.class,
    Textarea.class,
    FormattedText.class,
    Number.class,
    Date.class,
    Time.class,
    Combobox.class,
    Listbox.class,
    Checkbox.class,
    Password.class,
    File.class,
    FixedText.class,
    Button.class,
    Image.class,
    Radio.class,
    Frame.class,
    ImageFrame.class,
    Hidden.class,
    Grid.class,
    ValueRange.class,
    GenericControl.class
})
public class CommonFormControlContent {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Properties properties;
    @XmlElement(name = "event-listeners", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected EventListeners eventListeners;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
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

}
