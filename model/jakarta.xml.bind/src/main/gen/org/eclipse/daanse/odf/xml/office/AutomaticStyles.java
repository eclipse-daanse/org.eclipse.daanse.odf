
package org.eclipse.daanse.odf.xml.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.number.BooleanStyle;
import org.eclipse.daanse.odf.xml.number.CurrencyStyle;
import org.eclipse.daanse.odf.xml.number.DateStyle;
import org.eclipse.daanse.odf.xml.number.NumberStyle;
import org.eclipse.daanse.odf.xml.number.PercentageStyle;
import org.eclipse.daanse.odf.xml.number.TextStyle;
import org.eclipse.daanse.odf.xml.number.TimeStyle;
import org.eclipse.daanse.odf.xml.style.PageLayout;
import org.eclipse.daanse.odf.xml.style.Style;
import org.eclipse.daanse.odf.xml.text.ListStyle;


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
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}styles"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}page-layout"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "styleOrListStyleOrNumberStyle"
})
@XmlRootElement(name = "automatic-styles")
public class AutomaticStyles {

    @XmlElements({
        @XmlElement(name = "style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = Style.class),
        @XmlElement(name = "list-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ListStyle.class),
        @XmlElement(name = "number-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = NumberStyle.class),
        @XmlElement(name = "currency-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = CurrencyStyle.class),
        @XmlElement(name = "percentage-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = PercentageStyle.class),
        @XmlElement(name = "date-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = DateStyle.class),
        @XmlElement(name = "time-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = TimeStyle.class),
        @XmlElement(name = "boolean-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = BooleanStyle.class),
        @XmlElement(name = "text-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = TextStyle.class),
        @XmlElement(name = "page-layout", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = PageLayout.class)
    })
    protected List<Object> styleOrListStyleOrNumberStyle;

    /**
     * Gets the value of the styleOrListStyleOrNumberStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the styleOrListStyleOrNumberStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleOrListStyleOrNumberStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Style }
     * {@link ListStyle }
     * {@link NumberStyle }
     * {@link CurrencyStyle }
     * {@link PercentageStyle }
     * {@link DateStyle }
     * {@link TimeStyle }
     * {@link BooleanStyle }
     * {@link TextStyle }
     * {@link PageLayout }
     * 
     * 
     */
    public List<Object> getStyleOrListStyleOrNumberStyle() {
        if (styleOrListStyleOrNumberStyle == null) {
            styleOrListStyleOrNumberStyle = new ArrayList<Object>();
        }
        return this.styleOrListStyleOrNumberStyle;
    }

}
