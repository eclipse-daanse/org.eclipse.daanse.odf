
package org.eclipse.daanse.odf.xml.anim;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.anim package. 
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

    private final static QName _Animate_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "animate");
    private final static QName _Set_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "set");
    private final static QName _AnimateMotion_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "animateMotion");
    private final static QName _AnimateColor_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "animateColor");
    private final static QName _AnimateTransform_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "animateTransform");
    private final static QName _TransitionFilter_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "transitionFilter");
    private final static QName _Par_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "par");
    private final static QName _Seq_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "seq");
    private final static QName _Iterate_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "iterate");
    private final static QName _Audio_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "audio");
    private final static QName _Command_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:animation:1.0", "command");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.anim
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Animate }
     * 
     */
    public Animate createAnimate() {
        return new Animate();
    }

    /**
     * Create an instance of {@link Set }
     * 
     */
    public Set createSet() {
        return new Set();
    }

    /**
     * Create an instance of {@link AnimateMotion }
     * 
     */
    public AnimateMotion createAnimateMotion() {
        return new AnimateMotion();
    }

    /**
     * Create an instance of {@link AnimateColor }
     * 
     */
    public AnimateColor createAnimateColor() {
        return new AnimateColor();
    }

    /**
     * Create an instance of {@link AnimateTransform }
     * 
     */
    public AnimateTransform createAnimateTransform() {
        return new AnimateTransform();
    }

    /**
     * Create an instance of {@link TransitionFilter }
     * 
     */
    public TransitionFilter createTransitionFilter() {
        return new TransitionFilter();
    }

    /**
     * Create an instance of {@link Par }
     * 
     */
    public Par createPar() {
        return new Par();
    }

    /**
     * Create an instance of {@link Seq }
     * 
     */
    public Seq createSeq() {
        return new Seq();
    }

    /**
     * Create an instance of {@link Iterate }
     * 
     */
    public Iterate createIterate() {
        return new Iterate();
    }

    /**
     * Create an instance of {@link Audio }
     * 
     */
    public Audio createAudio() {
        return new Audio();
    }

    /**
     * Create an instance of {@link Command }
     * 
     */
    public Command createCommand() {
        return new Command();
    }

    /**
     * Create an instance of {@link Param }
     * 
     */
    public Param createParam() {
        return new Param();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Animate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Animate }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "animate", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<Animate> createAnimate(Animate value) {
        return new JAXBElement<Animate>(_Animate_QNAME, Animate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Set }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Set }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "set", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<Set> createSet(Set value) {
        return new JAXBElement<Set>(_Set_QNAME, Set.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnimateMotion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnimateMotion }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "animateMotion", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<AnimateMotion> createAnimateMotion(AnimateMotion value) {
        return new JAXBElement<AnimateMotion>(_AnimateMotion_QNAME, AnimateMotion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnimateColor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnimateColor }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "animateColor", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<AnimateColor> createAnimateColor(AnimateColor value) {
        return new JAXBElement<AnimateColor>(_AnimateColor_QNAME, AnimateColor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnimateTransform }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnimateTransform }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "animateTransform", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<AnimateTransform> createAnimateTransform(AnimateTransform value) {
        return new JAXBElement<AnimateTransform>(_AnimateTransform_QNAME, AnimateTransform.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitionFilter }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "transitionFilter", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<TransitionFilter> createTransitionFilter(TransitionFilter value) {
        return new JAXBElement<TransitionFilter>(_TransitionFilter_QNAME, TransitionFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Par }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Par }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "par", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<Par> createPar(Par value) {
        return new JAXBElement<Par>(_Par_QNAME, Par.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Seq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Seq }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "seq", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<Seq> createSeq(Seq value) {
        return new JAXBElement<Seq>(_Seq_QNAME, Seq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Iterate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Iterate }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "iterate", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<Iterate> createIterate(Iterate value) {
        return new JAXBElement<Iterate>(_Iterate_QNAME, Iterate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Audio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Audio }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "audio", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<Audio> createAudio(Audio value) {
        return new JAXBElement<Audio>(_Audio_QNAME, Audio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Command }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Command }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:animation:1.0", name = "command", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "animation-element")
    public JAXBElement<Command> createCommand(Command value) {
        return new JAXBElement<Command>(_Command_QNAME, Command.class, null, value);
    }

}
