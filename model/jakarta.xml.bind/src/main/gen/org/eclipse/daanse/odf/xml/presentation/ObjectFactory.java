
package org.eclipse.daanse.odf.xml.presentation;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.presentation package. 
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

    private final static QName _HeaderDecl_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "header-decl");
    private final static QName _FooterDecl_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "footer-decl");
    private final static QName _DateTimeDecl_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "date-time-decl");
    private final static QName _Dim_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "dim");
    private final static QName _HideShape_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "hide-shape");
    private final static QName _HideText_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "hide-text");
    private final static QName _Play_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "play");
    private final static QName _ShowShape_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "show-shape");
    private final static QName _ShowText_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", "show-text");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.presentation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventListener }
     * 
     */
    public EventListener createEventListener() {
        return new EventListener();
    }

    /**
     * Create an instance of {@link Sound }
     * 
     */
    public Sound createSound() {
        return new Sound();
    }

    /**
     * Create an instance of {@link Placeholder }
     * 
     */
    public Placeholder createPlaceholder() {
        return new Placeholder();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Footer }
     * 
     */
    public Footer createFooter() {
        return new Footer();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link Animations }
     * 
     */
    public Animations createAnimations() {
        return new Animations();
    }

    /**
     * Create an instance of {@link AnimationGroup }
     * 
     */
    public AnimationGroup createAnimationGroup() {
        return new AnimationGroup();
    }

    /**
     * Create an instance of {@link HeaderDecl }
     * 
     */
    public HeaderDecl createHeaderDecl() {
        return new HeaderDecl();
    }

    /**
     * Create an instance of {@link FooterDecl }
     * 
     */
    public FooterDecl createFooterDecl() {
        return new FooterDecl();
    }

    /**
     * Create an instance of {@link DateTimeDecl }
     * 
     */
    public DateTimeDecl createDateTimeDecl() {
        return new DateTimeDecl();
    }

    /**
     * Create an instance of {@link Dim }
     * 
     */
    public Dim createDim() {
        return new Dim();
    }

    /**
     * Create an instance of {@link HideShape }
     * 
     */
    public HideShape createHideShape() {
        return new HideShape();
    }

    /**
     * Create an instance of {@link HideText }
     * 
     */
    public HideText createHideText() {
        return new HideText();
    }

    /**
     * Create an instance of {@link Play }
     * 
     */
    public Play createPlay() {
        return new Play();
    }

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {
        return new Settings();
    }

    /**
     * Create an instance of {@link Show }
     * 
     */
    public Show createShow() {
        return new Show();
    }

    /**
     * Create an instance of {@link ShowShape }
     * 
     */
    public ShowShape createShowShape() {
        return new ShowShape();
    }

    /**
     * Create an instance of {@link ShowText }
     * 
     */
    public ShowText createShowText() {
        return new ShowText();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDecl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDecl }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "header-decl", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-decl")
    public JAXBElement<HeaderDecl> createHeaderDecl(HeaderDecl value) {
        return new JAXBElement<HeaderDecl>(_HeaderDecl_QNAME, HeaderDecl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FooterDecl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FooterDecl }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "footer-decl", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-decl")
    public JAXBElement<FooterDecl> createFooterDecl(FooterDecl value) {
        return new JAXBElement<FooterDecl>(_FooterDecl_QNAME, FooterDecl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeDecl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimeDecl }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "date-time-decl", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-decl")
    public JAXBElement<DateTimeDecl> createDateTimeDecl(DateTimeDecl value) {
        return new JAXBElement<DateTimeDecl>(_DateTimeDecl_QNAME, DateTimeDecl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Dim }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "dim", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-animation-elements")
    public JAXBElement<Dim> createDim(Dim value) {
        return new JAXBElement<Dim>(_Dim_QNAME, Dim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HideShape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HideShape }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "hide-shape", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-animation-elements")
    public JAXBElement<HideShape> createHideShape(HideShape value) {
        return new JAXBElement<HideShape>(_HideShape_QNAME, HideShape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HideText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HideText }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "hide-text", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-animation-elements")
    public JAXBElement<HideText> createHideText(HideText value) {
        return new JAXBElement<HideText>(_HideText_QNAME, HideText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Play }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Play }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "play", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-animation-elements")
    public JAXBElement<Play> createPlay(Play value) {
        return new JAXBElement<Play>(_Play_QNAME, Play.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowShape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowShape }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "show-shape", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-animation-elements")
    public JAXBElement<ShowShape> createShowShape(ShowShape value) {
        return new JAXBElement<ShowShape>(_ShowShape_QNAME, ShowShape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowText }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", name = "show-text", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "presentation-animation-elements")
    public JAXBElement<ShowText> createShowText(ShowText value) {
        return new JAXBElement<ShowText>(_ShowText_QNAME, ShowText.class, null, value);
    }

}
