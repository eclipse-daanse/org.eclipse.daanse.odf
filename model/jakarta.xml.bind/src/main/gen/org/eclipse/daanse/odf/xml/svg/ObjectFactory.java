
package org.eclipse.daanse.odf.xml.svg;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.svg package. 
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

    private final static QName _Title_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", "title");
    private final static QName _Desc_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", "desc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.svg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FontFaceSrc }
     * 
     */
    public FontFaceSrc createFontFaceSrc() {
        return new FontFaceSrc();
    }

    /**
     * Create an instance of {@link FontFaceUri }
     * 
     */
    public FontFaceUri createFontFaceUri() {
        return new FontFaceUri();
    }

    /**
     * Create an instance of {@link FontFaceFormat }
     * 
     */
    public FontFaceFormat createFontFaceFormat() {
        return new FontFaceFormat();
    }

    /**
     * Create an instance of {@link FontFaceName }
     * 
     */
    public FontFaceName createFontFaceName() {
        return new FontFaceName();
    }

    /**
     * Create an instance of {@link DefinitionSrc }
     * 
     */
    public DefinitionSrc createDefinitionSrc() {
        return new DefinitionSrc();
    }

    /**
     * Create an instance of {@link LinearGradient }
     * 
     */
    public LinearGradient createLinearGradient() {
        return new LinearGradient();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link RadialGradient }
     * 
     */
    public RadialGradient createRadialGradient() {
        return new RadialGradient();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", name = "desc")
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

}
