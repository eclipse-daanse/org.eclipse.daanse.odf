
package org.eclipse.daanse.odf.xml.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.draw.FillImage;
import org.eclipse.daanse.odf.xml.draw.Gradient;
import org.eclipse.daanse.odf.xml.draw.Hatch;
import org.eclipse.daanse.odf.xml.draw.Marker;
import org.eclipse.daanse.odf.xml.draw.Opacity;
import org.eclipse.daanse.odf.xml.draw.StrokeDash;
import org.eclipse.daanse.odf.xml.number.BooleanStyle;
import org.eclipse.daanse.odf.xml.number.CurrencyStyle;
import org.eclipse.daanse.odf.xml.number.DateStyle;
import org.eclipse.daanse.odf.xml.number.NumberStyle;
import org.eclipse.daanse.odf.xml.number.PercentageStyle;
import org.eclipse.daanse.odf.xml.number.TextStyle;
import org.eclipse.daanse.odf.xml.number.TimeStyle;
import org.eclipse.daanse.odf.xml.style.PresentationPageLayout;
import org.eclipse.daanse.odf.xml.style.Style;
import org.eclipse.daanse.odf.xml.svg.LinearGradient;
import org.eclipse.daanse.odf.xml.svg.RadialGradient;
import org.eclipse.daanse.odf.xml.table.TableTemplate;
import org.eclipse.daanse.odf.xml.text.BibliographyConfiguration;
import org.eclipse.daanse.odf.xml.text.LinenumberingConfiguration;
import org.eclipse.daanse.odf.xml.text.ListStyle;
import org.eclipse.daanse.odf.xml.text.OutlineStyle;
import org.eclipse.daanse.odf.xml.text.StylePageLayoutContent;
import org.eclipse.daanse.odf.xml.text.StyleStyleContent;
import org.eclipse.daanse.odf.xml.text.TextNotesConfigurationContent;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}default-style"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}default-page-layout"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}outline-style"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}notes-configuration"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}bibliography-configuration"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}linenumbering-configuration"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}gradient"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}linearGradient"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0}radialGradient"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}hatch"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}fill-image"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}marker"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}stroke-dash"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}opacity"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}presentation-page-layout"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table-template"/&gt;
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
@XmlRootElement(name = "styles")
public class Styles {

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
        @XmlElement(name = "default-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = StyleStyleContent.class),
        @XmlElement(name = "default-page-layout", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = StylePageLayoutContent.class),
        @XmlElement(name = "outline-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = OutlineStyle.class),
        @XmlElement(name = "notes-configuration", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TextNotesConfigurationContent.class),
        @XmlElement(name = "bibliography-configuration", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = BibliographyConfiguration.class),
        @XmlElement(name = "linenumbering-configuration", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = LinenumberingConfiguration.class),
        @XmlElement(name = "gradient", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Gradient.class),
        @XmlElement(name = "linearGradient", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", type = LinearGradient.class),
        @XmlElement(name = "radialGradient", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", type = RadialGradient.class),
        @XmlElement(name = "hatch", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Hatch.class),
        @XmlElement(name = "fill-image", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = FillImage.class),
        @XmlElement(name = "marker", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Marker.class),
        @XmlElement(name = "stroke-dash", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = StrokeDash.class),
        @XmlElement(name = "opacity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Opacity.class),
        @XmlElement(name = "presentation-page-layout", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = PresentationPageLayout.class),
        @XmlElement(name = "table-template", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", type = TableTemplate.class)
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
     * {@link StyleStyleContent }
     * {@link StylePageLayoutContent }
     * {@link OutlineStyle }
     * {@link TextNotesConfigurationContent }
     * {@link BibliographyConfiguration }
     * {@link LinenumberingConfiguration }
     * {@link Gradient }
     * {@link LinearGradient }
     * {@link RadialGradient }
     * {@link Hatch }
     * {@link FillImage }
     * {@link Marker }
     * {@link StrokeDash }
     * {@link Opacity }
     * {@link PresentationPageLayout }
     * {@link TableTemplate }
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
