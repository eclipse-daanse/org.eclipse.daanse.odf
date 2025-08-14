
package org.eclipse.daanse.odf.xml.form;

import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.CommonFormControlContent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-form-control-content"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}form-generic-control-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class GenericControl
    extends CommonFormControlContent
{

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

}
