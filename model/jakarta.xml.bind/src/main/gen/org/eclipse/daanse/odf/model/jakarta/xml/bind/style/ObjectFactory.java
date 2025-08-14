
package org.eclipse.daanse.odf.model.jakarta.xml.bind.style;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.RegionContent;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleChartPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleDrawingPagePropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleGraphicPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleHeaderFooterPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleListLevelPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StylePageLayoutContent;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StylePageLayoutPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleParagraphPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleSectionPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleStyleContent;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleTableCellPropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleTablePropertiesContentStrict;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.StyleTableRowPropertiesContentStrict;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.model.jakarta.xml.bind.style package. 
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

    private final static QName _ChartProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "chart-properties");
    private final static QName _DrawingPageProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "drawing-page-properties");
    private final static QName _GraphicProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "graphic-properties");
    private final static QName _ParagraphProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "paragraph-properties");
    private final static QName _SectionProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "section-properties");
    private final static QName _TableCellProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "table-cell-properties");
    private final static QName _TableProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "table-properties");
    private final static QName _TableRowProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "table-row-properties");
    private final static QName _DefaultStyle_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "default-style");
    private final static QName _DefaultPageLayout_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "default-page-layout");
    private final static QName _ListLevelProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "list-level-properties");
    private final static QName _PageLayoutProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "page-layout-properties");
    private final static QName _HeaderFooterProperties_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "header-footer-properties");
    private final static QName _RegionLeft_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "region-left");
    private final static QName _RegionCenter_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "region-center");
    private final static QName _RegionRight_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:style:1.0", "region-right");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.model.jakarta.xml.bind.style
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FontFace }
     * 
     */
    public FontFace createFontFace() {
        return new FontFace();
    }

    /**
     * Create an instance of {@link Style }
     * 
     */
    public Style createStyle() {
        return new Style();
    }

    /**
     * Create an instance of {@link TextProperties }
     * 
     */
    public TextProperties createTextProperties() {
        return new TextProperties();
    }

    /**
     * Create an instance of {@link RubyProperties }
     * 
     */
    public RubyProperties createRubyProperties() {
        return new RubyProperties();
    }

    /**
     * Create an instance of {@link TableColumnProperties }
     * 
     */
    public TableColumnProperties createTableColumnProperties() {
        return new TableColumnProperties();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link PresentationPageLayout }
     * 
     */
    public PresentationPageLayout createPresentationPageLayout() {
        return new PresentationPageLayout();
    }

    /**
     * Create an instance of {@link PageLayout }
     * 
     */
    public PageLayout createPageLayout() {
        return new PageLayout();
    }

    /**
     * Create an instance of {@link HeaderStyle }
     * 
     */
    public HeaderStyle createHeaderStyle() {
        return new HeaderStyle();
    }

    /**
     * Create an instance of {@link FooterStyle }
     * 
     */
    public FooterStyle createFooterStyle() {
        return new FooterStyle();
    }

    /**
     * Create an instance of {@link MasterPage }
     * 
     */
    public MasterPage createMasterPage() {
        return new MasterPage();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link HeaderLeft }
     * 
     */
    public HeaderLeft createHeaderLeft() {
        return new HeaderLeft();
    }

    /**
     * Create an instance of {@link HeaderFirst }
     * 
     */
    public HeaderFirst createHeaderFirst() {
        return new HeaderFirst();
    }

    /**
     * Create an instance of {@link Footer }
     * 
     */
    public Footer createFooter() {
        return new Footer();
    }

    /**
     * Create an instance of {@link FooterLeft }
     * 
     */
    public FooterLeft createFooterLeft() {
        return new FooterLeft();
    }

    /**
     * Create an instance of {@link FooterFirst }
     * 
     */
    public FooterFirst createFooterFirst() {
        return new FooterFirst();
    }

    /**
     * Create an instance of {@link HandoutMaster }
     * 
     */
    public HandoutMaster createHandoutMaster() {
        return new HandoutMaster();
    }

    /**
     * Create an instance of {@link BackgroundImage }
     * 
     */
    public BackgroundImage createBackgroundImage() {
        return new BackgroundImage();
    }

    /**
     * Create an instance of {@link Column }
     * 
     */
    public Column createColumn() {
        return new Column();
    }

    /**
     * Create an instance of {@link ColumnSep }
     * 
     */
    public ColumnSep createColumnSep() {
        return new ColumnSep();
    }

    /**
     * Create an instance of {@link Columns }
     * 
     */
    public Columns createColumns() {
        return new Columns();
    }

    /**
     * Create an instance of {@link DropCap }
     * 
     */
    public DropCap createDropCap() {
        return new DropCap();
    }

    /**
     * Create an instance of {@link FootnoteSep }
     * 
     */
    public FootnoteSep createFootnoteSep() {
        return new FootnoteSep();
    }

    /**
     * Create an instance of {@link ListLevelLabelAlignment }
     * 
     */
    public ListLevelLabelAlignment createListLevelLabelAlignment() {
        return new ListLevelLabelAlignment();
    }

    /**
     * Create an instance of {@link TabStop }
     * 
     */
    public TabStop createTabStop() {
        return new TabStop();
    }

    /**
     * Create an instance of {@link TabStops }
     * 
     */
    public TabStops createTabStops() {
        return new TabStops();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleChartPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleChartPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "chart-properties")
    public JAXBElement<StyleChartPropertiesContentStrict> createChartProperties(StyleChartPropertiesContentStrict value) {
        return new JAXBElement<StyleChartPropertiesContentStrict>(_ChartProperties_QNAME, StyleChartPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleDrawingPagePropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleDrawingPagePropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "drawing-page-properties")
    public JAXBElement<StyleDrawingPagePropertiesContentStrict> createDrawingPageProperties(StyleDrawingPagePropertiesContentStrict value) {
        return new JAXBElement<StyleDrawingPagePropertiesContentStrict>(_DrawingPageProperties_QNAME, StyleDrawingPagePropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleGraphicPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleGraphicPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "graphic-properties")
    public JAXBElement<StyleGraphicPropertiesContentStrict> createGraphicProperties(StyleGraphicPropertiesContentStrict value) {
        return new JAXBElement<StyleGraphicPropertiesContentStrict>(_GraphicProperties_QNAME, StyleGraphicPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleParagraphPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleParagraphPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "paragraph-properties")
    public JAXBElement<StyleParagraphPropertiesContentStrict> createParagraphProperties(StyleParagraphPropertiesContentStrict value) {
        return new JAXBElement<StyleParagraphPropertiesContentStrict>(_ParagraphProperties_QNAME, StyleParagraphPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleSectionPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleSectionPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "section-properties")
    public JAXBElement<StyleSectionPropertiesContentStrict> createSectionProperties(StyleSectionPropertiesContentStrict value) {
        return new JAXBElement<StyleSectionPropertiesContentStrict>(_SectionProperties_QNAME, StyleSectionPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleTableCellPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleTableCellPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "table-cell-properties")
    public JAXBElement<StyleTableCellPropertiesContentStrict> createTableCellProperties(StyleTableCellPropertiesContentStrict value) {
        return new JAXBElement<StyleTableCellPropertiesContentStrict>(_TableCellProperties_QNAME, StyleTableCellPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleTablePropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleTablePropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "table-properties")
    public JAXBElement<StyleTablePropertiesContentStrict> createTableProperties(StyleTablePropertiesContentStrict value) {
        return new JAXBElement<StyleTablePropertiesContentStrict>(_TableProperties_QNAME, StyleTablePropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleTableRowPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleTableRowPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "table-row-properties")
    public JAXBElement<StyleTableRowPropertiesContentStrict> createTableRowProperties(StyleTableRowPropertiesContentStrict value) {
        return new JAXBElement<StyleTableRowPropertiesContentStrict>(_TableRowProperties_QNAME, StyleTableRowPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleStyleContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleStyleContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "default-style")
    public JAXBElement<StyleStyleContent> createDefaultStyle(StyleStyleContent value) {
        return new JAXBElement<StyleStyleContent>(_DefaultStyle_QNAME, StyleStyleContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StylePageLayoutContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StylePageLayoutContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "default-page-layout")
    public JAXBElement<StylePageLayoutContent> createDefaultPageLayout(StylePageLayoutContent value) {
        return new JAXBElement<StylePageLayoutContent>(_DefaultPageLayout_QNAME, StylePageLayoutContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleListLevelPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleListLevelPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "list-level-properties")
    public JAXBElement<StyleListLevelPropertiesContentStrict> createListLevelProperties(StyleListLevelPropertiesContentStrict value) {
        return new JAXBElement<StyleListLevelPropertiesContentStrict>(_ListLevelProperties_QNAME, StyleListLevelPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StylePageLayoutPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StylePageLayoutPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "page-layout-properties")
    public JAXBElement<StylePageLayoutPropertiesContentStrict> createPageLayoutProperties(StylePageLayoutPropertiesContentStrict value) {
        return new JAXBElement<StylePageLayoutPropertiesContentStrict>(_PageLayoutProperties_QNAME, StylePageLayoutPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleHeaderFooterPropertiesContentStrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StyleHeaderFooterPropertiesContentStrict }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "header-footer-properties")
    public JAXBElement<StyleHeaderFooterPropertiesContentStrict> createHeaderFooterProperties(StyleHeaderFooterPropertiesContentStrict value) {
        return new JAXBElement<StyleHeaderFooterPropertiesContentStrict>(_HeaderFooterProperties_QNAME, StyleHeaderFooterPropertiesContentStrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegionContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "region-left")
    public JAXBElement<RegionContent> createRegionLeft(RegionContent value) {
        return new JAXBElement<RegionContent>(_RegionLeft_QNAME, RegionContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegionContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "region-center")
    public JAXBElement<RegionContent> createRegionCenter(RegionContent value) {
        return new JAXBElement<RegionContent>(_RegionCenter_QNAME, RegionContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegionContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", name = "region-right")
    public JAXBElement<RegionContent> createRegionRight(RegionContent value) {
        return new JAXBElement<RegionContent>(_RegionRight_QNAME, RegionContent.class, null, value);
    }

}
