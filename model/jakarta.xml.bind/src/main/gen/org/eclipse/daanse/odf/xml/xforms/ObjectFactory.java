
package org.eclipse.daanse.odf.xml.xforms;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.eclipse.daanse.odf.xml.text.AnyAttListOrElements;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.xforms package. 
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

    private final static QName _Model_QNAME = new QName("http://www.w3.org/2002/xforms", "model");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.xforms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyAttListOrElements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnyAttListOrElements }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2002/xforms", name = "model")
    public JAXBElement<AnyAttListOrElements> createModel(AnyAttListOrElements value) {
        return new JAXBElement<AnyAttListOrElements>(_Model_QNAME, AnyAttListOrElements.class, null, value);
    }

}
