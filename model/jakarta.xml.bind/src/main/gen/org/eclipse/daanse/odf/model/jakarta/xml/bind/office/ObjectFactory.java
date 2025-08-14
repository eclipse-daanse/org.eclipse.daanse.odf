
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.OfficeBodyContent;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.OfficeImageContentMain;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.OfficeMetaContentStrict;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.model.jakarta.xml.bind.office package. 
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

    private final static QName _DdeSource_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "dde-source");
    private final static QName _BinaryData_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "binary-data");
    private final static QName _Meta_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "meta");
    private final static QName _Body_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "body");
    private final static QName _Text_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "text");
    private final static QName _Drawing_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "drawing");
    private final static QName _Presentation_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "presentation");
    private final static QName _Spreadsheet_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "spreadsheet");
    private final static QName _Chart_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "chart");
    private final static QName _Image_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "image");
    private final static QName _Database_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:office:1.0", "database");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.model.jakarta.xml.bind.office
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link AnnotationEnd }
     * 
     */
    public AnnotationEnd createAnnotationEnd() {
        return new AnnotationEnd();
    }

    /**
     * Create an instance of {@link EventListeners }
     * 
     */
    public EventListeners createEventListeners() {
        return new EventListeners();
    }

    /**
     * Create an instance of {@link TextSectionSourceDde }
     * 
     */
    public TextSectionSourceDde createTextSectionSourceDde() {
        return new TextSectionSourceDde();
    }

    /**
     * Create an instance of {@link Forms }
     * 
     */
    public Forms createForms() {
        return new Forms();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {
        return new Settings();
    }

    /**
     * Create an instance of {@link Scripts }
     * 
     */
    public Scripts createScripts() {
        return new Scripts();
    }

    /**
     * Create an instance of {@link Script }
     * 
     */
    public Script createScript() {
        return new Script();
    }

    /**
     * Create an instance of {@link FontFaceDecls }
     * 
     */
    public FontFaceDecls createFontFaceDecls() {
        return new FontFaceDecls();
    }

    /**
     * Create an instance of {@link Styles }
     * 
     */
    public Styles createStyles() {
        return new Styles();
    }

    /**
     * Create an instance of {@link AutomaticStyles }
     * 
     */
    public AutomaticStyles createAutomaticStyles() {
        return new AutomaticStyles();
    }

    /**
     * Create an instance of {@link MasterStyles }
     * 
     */
    public MasterStyles createMasterStyles() {
        return new MasterStyles();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Drawing }
     * 
     */
    public Drawing createDrawing() {
        return new Drawing();
    }

    /**
     * Create an instance of {@link Presentation }
     * 
     */
    public Presentation createPresentation() {
        return new Presentation();
    }

    /**
     * Create an instance of {@link Spreadsheet }
     * 
     */
    public Spreadsheet createSpreadsheet() {
        return new Spreadsheet();
    }

    /**
     * Create an instance of {@link Chart }
     * 
     */
    public Chart createChart() {
        return new Chart();
    }

    /**
     * Create an instance of {@link ChangeInfo }
     * 
     */
    public ChangeInfo createChangeInfo() {
        return new ChangeInfo();
    }

    /**
     * Create an instance of {@link Database }
     * 
     */
    public Database createDatabase() {
        return new Database();
    }

    /**
     * Create an instance of {@link DocumentContent }
     * 
     */
    public DocumentContent createDocumentContent() {
        return new DocumentContent();
    }

    /**
     * Create an instance of {@link DocumentMeta }
     * 
     */
    public DocumentMeta createDocumentMeta() {
        return new DocumentMeta();
    }

    /**
     * Create an instance of {@link DocumentSettings }
     * 
     */
    public DocumentSettings createDocumentSettings() {
        return new DocumentSettings();
    }

    /**
     * Create an instance of {@link DocumentStyles }
     * 
     */
    public DocumentStyles createDocumentStyles() {
        return new DocumentStyles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSectionSourceDde }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextSectionSourceDde }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "dde-source", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "text-section-source-dde")
    public JAXBElement<TextSectionSourceDde> createDdeSource(TextSectionSourceDde value) {
        return new JAXBElement<TextSectionSourceDde>(_DdeSource_QNAME, TextSectionSourceDde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "binary-data")
    public JAXBElement<byte[]> createBinaryData(byte[] value) {
        return new JAXBElement<byte[]>(_BinaryData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficeMetaContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficeMetaContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "meta")
    public JAXBElement<OfficeMetaContentStrict> createMeta(OfficeMetaContentStrict value) {
        return new JAXBElement<OfficeMetaContentStrict>(_Meta_QNAME, OfficeMetaContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficeBodyContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficeBodyContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "body")
    public JAXBElement<OfficeBodyContent> createBody(OfficeBodyContent value) {
        return new JAXBElement<OfficeBodyContent>(_Body_QNAME, OfficeBodyContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Text }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "text", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-body-content")
    public JAXBElement<Text> createText(Text value) {
        return new JAXBElement<Text>(_Text_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Drawing }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Drawing }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "drawing", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-body-content")
    public JAXBElement<Drawing> createDrawing(Drawing value) {
        return new JAXBElement<Drawing>(_Drawing_QNAME, Drawing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Presentation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Presentation }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "presentation", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-body-content")
    public JAXBElement<Presentation> createPresentation(Presentation value) {
        return new JAXBElement<Presentation>(_Presentation_QNAME, Presentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Spreadsheet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Spreadsheet }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "spreadsheet", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-body-content")
    public JAXBElement<Spreadsheet> createSpreadsheet(Spreadsheet value) {
        return new JAXBElement<Spreadsheet>(_Spreadsheet_QNAME, Spreadsheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Chart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Chart }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "chart", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-body-content")
    public JAXBElement<Chart> createChart(Chart value) {
        return new JAXBElement<Chart>(_Chart_QNAME, Chart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficeImageContentMain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficeImageContentMain }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "image", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-body-content")
    public JAXBElement<OfficeImageContentMain> createImage(OfficeImageContentMain value) {
        return new JAXBElement<OfficeImageContentMain>(_Image_QNAME, OfficeImageContentMain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Database }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Database }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", name = "database", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-body-content")
    public JAXBElement<Database> createDatabase(Database value) {
        return new JAXBElement<Database>(_Database_QNAME, Database.class, null, value);
    }

}
