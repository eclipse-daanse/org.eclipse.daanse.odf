
package org.eclipse.daanse.odf.xml.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.form.Form;
import org.eclipse.daanse.odf.xml.text.AnyAttListOrElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:form:1.0}form"/&gt;
 *         &lt;element ref="{http://www.w3.org/2002/xforms}model"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-forms-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOrModel"
})
@XmlRootElement(name = "forms")
public class Forms {

    @XmlElements({
        @XmlElement(name = "form", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", type = Form.class),
        @XmlElement(name = "model", namespace = "http://www.w3.org/2002/xforms", type = AnyAttListOrElements.class)
    })
    protected List<Object> formOrModel;
    @XmlAttribute(name = "automatic-focus", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean automaticFocus;
    @XmlAttribute(name = "apply-design-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean applyDesignMode;

    /**
     * Gets the value of the formOrModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the formOrModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOrModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Form }
     * {@link AnyAttListOrElements }
     * 
     * 
     */
    public List<Object> getFormOrModel() {
        if (formOrModel == null) {
            formOrModel = new ArrayList<Object>();
        }
        return this.formOrModel;
    }

    /**
     * Gets the value of the automaticFocus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutomaticFocus() {
        return automaticFocus;
    }

    /**
     * Sets the value of the automaticFocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticFocus(Boolean value) {
        this.automaticFocus = value;
    }

    /**
     * Gets the value of the applyDesignMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getApplyDesignMode() {
        return applyDesignMode;
    }

    /**
     * Sets the value of the applyDesignMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyDesignMode(Boolean value) {
        this.applyDesignMode = value;
    }

}
