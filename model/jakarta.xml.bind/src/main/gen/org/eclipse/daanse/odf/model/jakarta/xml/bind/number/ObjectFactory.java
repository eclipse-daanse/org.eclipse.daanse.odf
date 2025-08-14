
package org.eclipse.daanse.odf.model.jakarta.xml.bind.number;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.model.jakarta.xml.bind.number package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Text_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", "text");
    private final static QName _FillCharacter_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", "fill-character");
    private final static QName _Number_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", "number");
    private final static QName _Fraction_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", "fraction");
    private final static QName _ScientificNumber_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", "scientific-number");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.model.jakarta.xml.bind.number
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumberStyle }
     * 
     */
    public NumberStyle createNumberStyle() {
        return new NumberStyle();
    }

    /**
     * Create an instance of {@link CurrencyStyle }
     * 
     */
    public CurrencyStyle createCurrencyStyle() {
        return new CurrencyStyle();
    }

    /**
     * Create an instance of {@link Number }
     * 
     */
    public Number createNumber() {
        return new Number();
    }

    /**
     * Create an instance of {@link CurrencySymbol }
     * 
     */
    public CurrencySymbol createCurrencySymbol() {
        return new CurrencySymbol();
    }

    /**
     * Create an instance of {@link PercentageStyle }
     * 
     */
    public PercentageStyle createPercentageStyle() {
        return new PercentageStyle();
    }

    /**
     * Create an instance of {@link DateStyle }
     * 
     */
    public DateStyle createDateStyle() {
        return new DateStyle();
    }

    /**
     * Create an instance of {@link Day }
     * 
     */
    public Day createDay() {
        return new Day();
    }

    /**
     * Create an instance of {@link Month }
     * 
     */
    public Month createMonth() {
        return new Month();
    }

    /**
     * Create an instance of {@link Year }
     * 
     */
    public Year createYear() {
        return new Year();
    }

    /**
     * Create an instance of {@link Era }
     * 
     */
    public Era createEra() {
        return new Era();
    }

    /**
     * Create an instance of {@link DayOfWeek }
     * 
     */
    public DayOfWeek createDayOfWeek() {
        return new DayOfWeek();
    }

    /**
     * Create an instance of {@link WeekOfYear }
     * 
     */
    public WeekOfYear createWeekOfYear() {
        return new WeekOfYear();
    }

    /**
     * Create an instance of {@link Quarter }
     * 
     */
    public Quarter createQuarter() {
        return new Quarter();
    }

    /**
     * Create an instance of {@link Hours }
     * 
     */
    public Hours createHours() {
        return new Hours();
    }

    /**
     * Create an instance of {@link AmPm }
     * 
     */
    public AmPm createAmPm() {
        return new AmPm();
    }

    /**
     * Create an instance of {@link Minutes }
     * 
     */
    public Minutes createMinutes() {
        return new Minutes();
    }

    /**
     * Create an instance of {@link Seconds }
     * 
     */
    public Seconds createSeconds() {
        return new Seconds();
    }

    /**
     * Create an instance of {@link TimeStyle }
     * 
     */
    public TimeStyle createTimeStyle() {
        return new TimeStyle();
    }

    /**
     * Create an instance of {@link BooleanStyle }
     * 
     */
    public BooleanStyle createBooleanStyle() {
        return new BooleanStyle();
    }

    /**
     * Create an instance of {@link Boolean }
     * 
     */
    public Boolean createBoolean() {
        return new Boolean();
    }

    /**
     * Create an instance of {@link TextStyle }
     * 
     */
    public TextStyle createTextStyle() {
        return new TextStyle();
    }

    /**
     * Create an instance of {@link TextContent }
     * 
     */
    public TextContent createTextContent() {
        return new TextContent();
    }

    /**
     * Create an instance of {@link EmbeddedText }
     * 
     */
    public EmbeddedText createEmbeddedText() {
        return new EmbeddedText();
    }

    /**
     * Create an instance of {@link Fraction }
     * 
     */
    public Fraction createFraction() {
        return new Fraction();
    }

    /**
     * Create an instance of {@link ScientificNumber }
     * 
     */
    public ScientificNumber createScientificNumber() {
        return new ScientificNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", name = "fill-character")
    public JAXBElement<String> createFillCharacter(String value) {
        return new JAXBElement<String>(_FillCharacter_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Number }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Number }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", name = "number", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "any-number")
    public JAXBElement<Number> createNumber(Number value) {
        return new JAXBElement<Number>(_Number_QNAME, Number.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Fraction }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", name = "fraction", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "any-number")
    public JAXBElement<Fraction> createFraction(Fraction value) {
        return new JAXBElement<Fraction>(_Fraction_QNAME, Fraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScientificNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScientificNumber }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", name = "scientific-number", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "any-number")
    public JAXBElement<ScientificNumber> createScientificNumber(ScientificNumber value) {
        return new JAXBElement<ScientificNumber>(_ScientificNumber_QNAME, ScientificNumber.class, null, value);
    }

}
