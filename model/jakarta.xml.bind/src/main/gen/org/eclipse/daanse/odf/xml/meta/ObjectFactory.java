
package org.eclipse.daanse.odf.xml.meta;

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.meta package. 
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

    private final static QName _DateString_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "date-string");
    private final static QName _CreatorInitials_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "creator-initials");
    private final static QName _Generator_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "generator");
    private final static QName _Keyword_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "keyword");
    private final static QName _InitialCreator_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "initial-creator");
    private final static QName _PrintedBy_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "printed-by");
    private final static QName _CreationDate_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "creation-date");
    private final static QName _PrintDate_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "print-date");
    private final static QName _Template_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "template");
    private final static QName _AutoReload_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "auto-reload");
    private final static QName _HyperlinkBehaviour_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "hyperlink-behaviour");
    private final static QName _EditingCycles_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "editing-cycles");
    private final static QName _EditingDuration_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "editing-duration");
    private final static QName _DocumentStatistic_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "document-statistic");
    private final static QName _UserDefined_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:meta:1.0", "user-defined");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.meta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Template }
     * 
     */
    public Template createTemplate() {
        return new Template();
    }

    /**
     * Create an instance of {@link AutoReload }
     * 
     */
    public AutoReload createAutoReload() {
        return new AutoReload();
    }

    /**
     * Create an instance of {@link HyperlinkBehaviour }
     * 
     */
    public HyperlinkBehaviour createHyperlinkBehaviour() {
        return new HyperlinkBehaviour();
    }

    /**
     * Create an instance of {@link DocumentStatistic }
     * 
     */
    public DocumentStatistic createDocumentStatistic() {
        return new DocumentStatistic();
    }

    /**
     * Create an instance of {@link UserDefined }
     * 
     */
    public UserDefined createUserDefined() {
        return new UserDefined();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "date-string")
    public JAXBElement<String> createDateString(String value) {
        return new JAXBElement<String>(_DateString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "creator-initials")
    public JAXBElement<String> createCreatorInitials(String value) {
        return new JAXBElement<String>(_CreatorInitials_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "generator", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<String> createGenerator(String value) {
        return new JAXBElement<String>(_Generator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "keyword", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<String> createKeyword(String value) {
        return new JAXBElement<String>(_Keyword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "initial-creator", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<String> createInitialCreator(String value) {
        return new JAXBElement<String>(_InitialCreator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "printed-by", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<String> createPrintedBy(String value) {
        return new JAXBElement<String>(_PrintedBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "creation-date", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<XMLGregorianCalendar> createCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "print-date", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<XMLGregorianCalendar> createPrintDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrintDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Template }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Template }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "template", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<Template> createTemplate(Template value) {
        return new JAXBElement<Template>(_Template_QNAME, Template.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoReload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoReload }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "auto-reload", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<AutoReload> createAutoReload(AutoReload value) {
        return new JAXBElement<AutoReload>(_AutoReload_QNAME, AutoReload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HyperlinkBehaviour }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HyperlinkBehaviour }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "hyperlink-behaviour", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<HyperlinkBehaviour> createHyperlinkBehaviour(HyperlinkBehaviour value) {
        return new JAXBElement<HyperlinkBehaviour>(_HyperlinkBehaviour_QNAME, HyperlinkBehaviour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "editing-cycles", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<BigInteger> createEditingCycles(BigInteger value) {
        return new JAXBElement<BigInteger>(_EditingCycles_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "editing-duration", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<Duration> createEditingDuration(Duration value) {
        return new JAXBElement<Duration>(_EditingDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentStatistic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentStatistic }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "document-statistic", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<DocumentStatistic> createDocumentStatistic(DocumentStatistic value) {
        return new JAXBElement<DocumentStatistic>(_DocumentStatistic_QNAME, DocumentStatistic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefined }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDefined }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0", name = "user-defined", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-meta-data")
    public JAXBElement<UserDefined> createUserDefined(UserDefined value) {
        return new JAXBElement<UserDefined>(_UserDefined_QNAME, UserDefined.class, null, value);
    }

}
