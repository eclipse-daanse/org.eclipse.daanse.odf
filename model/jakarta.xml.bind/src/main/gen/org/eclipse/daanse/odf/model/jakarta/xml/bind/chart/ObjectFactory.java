
package org.eclipse.daanse.odf.model.jakarta.xml.bind.chart;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.model.jakarta.xml.bind.chart package. 
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

    private final static QName _Chart_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:chart:1.0", "chart");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.model.jakarta.xml.bind.chart
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Axis }
     * 
     */
    public Axis createAxis() {
        return new Axis();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Categories }
     * 
     */
    public Categories createCategories() {
        return new Categories();
    }

    /**
     * Create an instance of {@link Grid }
     * 
     */
    public Grid createGrid() {
        return new Grid();
    }

    /**
     * Create an instance of {@link OfficeChartContentMain }
     * 
     */
    public OfficeChartContentMain createOfficeChartContentMain() {
        return new OfficeChartContentMain();
    }

    /**
     * Create an instance of {@link CoordinateRegion }
     * 
     */
    public CoordinateRegion createCoordinateRegion() {
        return new CoordinateRegion();
    }

    /**
     * Create an instance of {@link DataLabel }
     * 
     */
    public DataLabel createDataLabel() {
        return new DataLabel();
    }

    /**
     * Create an instance of {@link DataPoint }
     * 
     */
    public DataPoint createDataPoint() {
        return new DataPoint();
    }

    /**
     * Create an instance of {@link Domain }
     * 
     */
    public Domain createDomain() {
        return new Domain();
    }

    /**
     * Create an instance of {@link Equation }
     * 
     */
    public Equation createEquation() {
        return new Equation();
    }

    /**
     * Create an instance of {@link ErrorIndicator }
     * 
     */
    public ErrorIndicator createErrorIndicator() {
        return new ErrorIndicator();
    }

    /**
     * Create an instance of {@link Floor }
     * 
     */
    public Floor createFloor() {
        return new Floor();
    }

    /**
     * Create an instance of {@link Footer }
     * 
     */
    public Footer createFooter() {
        return new Footer();
    }

    /**
     * Create an instance of {@link Legend }
     * 
     */
    public Legend createLegend() {
        return new Legend();
    }

    /**
     * Create an instance of {@link MeanValue }
     * 
     */
    public MeanValue createMeanValue() {
        return new MeanValue();
    }

    /**
     * Create an instance of {@link PlotArea }
     * 
     */
    public PlotArea createPlotArea() {
        return new PlotArea();
    }

    /**
     * Create an instance of {@link Series }
     * 
     */
    public Series createSeries() {
        return new Series();
    }

    /**
     * Create an instance of {@link RegressionCurve }
     * 
     */
    public RegressionCurve createRegressionCurve() {
        return new RegressionCurve();
    }

    /**
     * Create an instance of {@link StockGainMarker }
     * 
     */
    public StockGainMarker createStockGainMarker() {
        return new StockGainMarker();
    }

    /**
     * Create an instance of {@link StockLossMarker }
     * 
     */
    public StockLossMarker createStockLossMarker() {
        return new StockLossMarker();
    }

    /**
     * Create an instance of {@link StockRangeLine }
     * 
     */
    public StockRangeLine createStockRangeLine() {
        return new StockRangeLine();
    }

    /**
     * Create an instance of {@link Wall }
     * 
     */
    public Wall createWall() {
        return new Wall();
    }

    /**
     * Create an instance of {@link Subtitle }
     * 
     */
    public Subtitle createSubtitle() {
        return new Subtitle();
    }

    /**
     * Create an instance of {@link SymbolImage }
     * 
     */
    public SymbolImage createSymbolImage() {
        return new SymbolImage();
    }

    /**
     * Create an instance of {@link LabelSeparator }
     * 
     */
    public LabelSeparator createLabelSeparator() {
        return new LabelSeparator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficeChartContentMain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficeChartContentMain }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0", name = "chart", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "office-chart-content-main")
    public JAXBElement<OfficeChartContentMain> createChart(OfficeChartContentMain value) {
        return new JAXBElement<OfficeChartContentMain>(_Chart_QNAME, OfficeChartContentMain.class, null, value);
    }

}
