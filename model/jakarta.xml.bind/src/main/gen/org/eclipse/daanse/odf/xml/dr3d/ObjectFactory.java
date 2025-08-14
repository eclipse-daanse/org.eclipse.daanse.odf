
package org.eclipse.daanse.odf.xml.dr3d;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.dr3d package. 
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

    private final static QName _Scene_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", "scene");
    private final static QName _Cube_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", "cube");
    private final static QName _Extrude_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", "extrude");
    private final static QName _Rotate_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", "rotate");
    private final static QName _Sphere_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", "sphere");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.dr3d
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Scene }
     * 
     */
    public Scene createScene() {
        return new Scene();
    }

    /**
     * Create an instance of {@link Light }
     * 
     */
    public Light createLight() {
        return new Light();
    }

    /**
     * Create an instance of {@link Cube }
     * 
     */
    public Cube createCube() {
        return new Cube();
    }

    /**
     * Create an instance of {@link Extrude }
     * 
     */
    public Extrude createExtrude() {
        return new Extrude();
    }

    /**
     * Create an instance of {@link Rotate }
     * 
     */
    public Rotate createRotate() {
        return new Rotate();
    }

    /**
     * Create an instance of {@link Sphere }
     * 
     */
    public Sphere createSphere() {
        return new Sphere();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Scene }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Scene }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", name = "scene", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "shapes3d")
    public JAXBElement<Scene> createScene(Scene value) {
        return new JAXBElement<Scene>(_Scene_QNAME, Scene.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cube }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cube }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", name = "cube", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "shapes3d")
    public JAXBElement<Cube> createCube(Cube value) {
        return new JAXBElement<Cube>(_Cube_QNAME, Cube.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extrude }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Extrude }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", name = "extrude", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "shapes3d")
    public JAXBElement<Extrude> createExtrude(Extrude value) {
        return new JAXBElement<Extrude>(_Extrude_QNAME, Extrude.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rotate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Rotate }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", name = "rotate", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "shapes3d")
    public JAXBElement<Rotate> createRotate(Rotate value) {
        return new JAXBElement<Rotate>(_Rotate_QNAME, Rotate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sphere }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sphere }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", name = "sphere", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "shapes3d")
    public JAXBElement<Sphere> createSphere(Sphere value) {
        return new JAXBElement<Sphere>(_Sphere_QNAME, Sphere.class, null, value);
    }

}
