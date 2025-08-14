
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Chart;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Database;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Drawing;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Presentation;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Spreadsheet;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Text;


/**
 * <p>Java class for office-body-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="office-body-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-body-content"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "office-body-content", propOrder = {
    "officeBodyContent"
})
public class OfficeBodyContent {

    @XmlElementRef(name = "office-body-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class)
    protected JAXBElement<?> officeBodyContent;

    /**
     * Gets the value of the officeBodyContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Spreadsheet }{@code >}
     *     {@link JAXBElement }{@code <}{@link Presentation }{@code >}
     *     {@link JAXBElement }{@code <}{@link Chart }{@code >}
     *     {@link JAXBElement }{@code <}{@link Text }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficeImageContentMain }{@code >}
     *     {@link JAXBElement }{@code <}{@link Database }{@code >}
     *     {@link JAXBElement }{@code <}{@link Drawing }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getOfficeBodyContent() {
        return officeBodyContent;
    }

    /**
     * Sets the value of the officeBodyContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Spreadsheet }{@code >}
     *     {@link JAXBElement }{@code <}{@link Presentation }{@code >}
     *     {@link JAXBElement }{@code <}{@link Chart }{@code >}
     *     {@link JAXBElement }{@code <}{@link Text }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficeImageContentMain }{@code >}
     *     {@link JAXBElement }{@code <}{@link Database }{@code >}
     *     {@link JAXBElement }{@code <}{@link Drawing }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setOfficeBodyContent(JAXBElement<?> value) {
        this.officeBodyContent = value;
    }

}
