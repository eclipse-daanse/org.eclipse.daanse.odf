
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.chart.LabelSeparator;
import org.eclipse.daanse.odf.xml.chart.SymbolImage;


/**
 * <p>Java class for style-chart-properties-attlist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-chart-properties-attlist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}symbol-image"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}label-separator"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-rotation-angle-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-style-direction-attlist"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}scale-text"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}three-dimensional"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}deep"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}right-angled-axes"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}symbol-type"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}symbol-name"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}symbol-width"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}symbol-height"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}sort-by-x-values"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}vertical"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}connect-bars"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}gap-width"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}overlap"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}group-bars-per-axis"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}japanese-candle-stick"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}interpolation"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}spline-order"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}spline-resolution"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}pie-offset"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}angle-offset"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}hole-size"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}lines"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}solid-type"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}stacked"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}percentage"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}treat-empty-cells"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}link-data-style-to-source"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}logarithmic"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}maximum"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}minimum"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}origin"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}interval-major"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}interval-minor-divisor"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}tick-marks-major-inner"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}tick-marks-major-outer"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}tick-marks-minor-inner"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}tick-marks-minor-outer"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}reverse-direction"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}display-label"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}text-overlap"/&gt;
 *       &lt;attribute name="line-break" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}boolean" /&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}label-arrangement"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}data-label-number"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}data-label-text"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}data-label-symbol"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}label-position"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}label-position-negative"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}visible"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}auto-position"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}auto-size"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}mean-value"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-category"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-percentage"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-margin"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-lower-limit"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-upper-limit"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-upper-indicator"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-lower-indicator"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-lower-range"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-upper-range"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}series-source"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-type"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-max-degree"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-force-intercept"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-intercept-value"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-name"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-period"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-moving-type"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}axis-position"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}axis-label-position"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}tick-mark-position"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}include-hidden-cells"/&gt;
 *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}data-label-series"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-chart-properties-attlist", propOrder = {
    "symbolImageOrLabelSeparator"
})
@XmlSeeAlso({
    StyleChartPropertiesContentStrict.class
})
public class StyleChartPropertiesAttlist {

    @XmlElements({
        @XmlElement(name = "symbol-image", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0", type = SymbolImage.class),
        @XmlElement(name = "label-separator", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0", type = LabelSeparator.class)
    })
    protected List<Object> symbolImageOrLabelSeparator;
    @XmlAttribute(name = "scale-text", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean scaleText;
    @XmlAttribute(name = "three-dimensional", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean threeDimensional;
    @XmlAttribute(name = "deep", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean deep;
    @XmlAttribute(name = "right-angled-axes", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean rightAngledAxes;
    @XmlAttribute(name = "symbol-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String symbolType;
    @XmlAttribute(name = "symbol-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String symbolName;
    @XmlAttribute(name = "symbol-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String symbolWidth;
    @XmlAttribute(name = "symbol-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String symbolHeight;
    @XmlAttribute(name = "sort-by-x-values", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean sortByXValues;
    @XmlAttribute(name = "vertical", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean vertical;
    @XmlAttribute(name = "connect-bars", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean connectBars;
    @XmlAttribute(name = "gap-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger gapWidth;
    @XmlAttribute(name = "overlap", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger overlap;
    @XmlAttribute(name = "group-bars-per-axis", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean groupBarsPerAxis;
    @XmlAttribute(name = "japanese-candle-stick", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean japaneseCandleStick;
    @XmlAttribute(name = "interpolation", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interpolation;
    @XmlAttribute(name = "spline-order", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger splineOrder;
    @XmlAttribute(name = "spline-resolution", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger splineResolution;
    @XmlAttribute(name = "pie-offset", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger pieOffset;
    @XmlAttribute(name = "angle-offset", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String angleOffset;
    @XmlAttribute(name = "hole-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String holeSize;
    @XmlAttribute(name = "lines", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean lines;
    @XmlAttribute(name = "solid-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String solidType;
    @XmlAttribute(name = "stacked", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean stacked;
    @XmlAttribute(name = "percentage", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean percentage;
    @XmlAttribute(name = "treat-empty-cells", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String treatEmptyCells;
    @XmlAttribute(name = "link-data-style-to-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean linkDataStyleToSource;
    @XmlAttribute(name = "logarithmic", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean logarithmic;
    @XmlAttribute(name = "maximum", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double maximum;
    @XmlAttribute(name = "minimum", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double minimum;
    @XmlAttribute(name = "origin", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double origin;
    @XmlAttribute(name = "interval-major", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double intervalMajor;
    @XmlAttribute(name = "interval-minor-divisor", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger intervalMinorDivisor;
    @XmlAttribute(name = "tick-marks-major-inner", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean tickMarksMajorInner;
    @XmlAttribute(name = "tick-marks-major-outer", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean tickMarksMajorOuter;
    @XmlAttribute(name = "tick-marks-minor-inner", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean tickMarksMinorInner;
    @XmlAttribute(name = "tick-marks-minor-outer", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean tickMarksMinorOuter;
    @XmlAttribute(name = "reverse-direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean reverseDirection;
    @XmlAttribute(name = "display-label", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean displayLabel;
    @XmlAttribute(name = "text-overlap", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean textOverlap;
    @XmlAttribute(name = "line-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean lineBreak;
    @XmlAttribute(name = "label-arrangement", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String labelArrangement;
    @XmlAttribute(name = "data-label-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataLabelNumber;
    @XmlAttribute(name = "data-label-text", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean dataLabelText;
    @XmlAttribute(name = "data-label-symbol", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean dataLabelSymbol;
    @XmlAttribute(name = "label-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected LabelPositions labelPosition;
    @XmlAttribute(name = "label-position-negative", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected LabelPositions labelPositionNegative;
    @XmlAttribute(name = "visible", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean visible;
    @XmlAttribute(name = "auto-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean autoPosition;
    @XmlAttribute(name = "auto-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean autoSize;
    @XmlAttribute(name = "mean-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean meanValue;
    @XmlAttribute(name = "error-category", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String errorCategory;
    @XmlAttribute(name = "error-percentage", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double errorPercentage;
    @XmlAttribute(name = "error-margin", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double errorMargin;
    @XmlAttribute(name = "error-lower-limit", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double errorLowerLimit;
    @XmlAttribute(name = "error-upper-limit", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double errorUpperLimit;
    @XmlAttribute(name = "error-upper-indicator", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean errorUpperIndicator;
    @XmlAttribute(name = "error-lower-indicator", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean errorLowerIndicator;
    @XmlAttribute(name = "error-lower-range", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String errorLowerRange;
    @XmlAttribute(name = "error-upper-range", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String errorUpperRange;
    @XmlAttribute(name = "series-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String seriesSource;
    @XmlAttribute(name = "regression-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String regressionType;
    @XmlAttribute(name = "regression-max-degree", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger regressionMaxDegree;
    @XmlAttribute(name = "regression-force-intercept", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean regressionForceIntercept;
    @XmlAttribute(name = "regression-intercept-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Double regressionInterceptValue;
    @XmlAttribute(name = "regression-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String regressionName;
    @XmlAttribute(name = "regression-period", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected BigInteger regressionPeriod;
    @XmlAttribute(name = "regression-moving-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String regressionMovingType;
    @XmlAttribute(name = "axis-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String axisPosition;
    @XmlAttribute(name = "axis-label-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String axisLabelPosition;
    @XmlAttribute(name = "tick-mark-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tickMarkPosition;
    @XmlAttribute(name = "include-hidden-cells", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean includeHiddenCells;
    @XmlAttribute(name = "data-label-series", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Boolean dataLabelSeries;
    @XmlAttribute(name = "rotation-angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String rotationAngle;
    @XmlAttribute(name = "direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String direction;

    /**
     * Gets the value of the symbolImageOrLabelSeparator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the symbolImageOrLabelSeparator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbolImageOrLabelSeparator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymbolImage }
     * {@link LabelSeparator }
     * 
     * 
     */
    public List<Object> getSymbolImageOrLabelSeparator() {
        if (symbolImageOrLabelSeparator == null) {
            symbolImageOrLabelSeparator = new ArrayList<Object>();
        }
        return this.symbolImageOrLabelSeparator;
    }

    /**
     * Gets the value of the scaleText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getScaleText() {
        return scaleText;
    }

    /**
     * Sets the value of the scaleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScaleText(Boolean value) {
        this.scaleText = value;
    }

    /**
     * Gets the value of the threeDimensional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getThreeDimensional() {
        return threeDimensional;
    }

    /**
     * Sets the value of the threeDimensional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThreeDimensional(Boolean value) {
        this.threeDimensional = value;
    }

    /**
     * Gets the value of the deep property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeep() {
        return deep;
    }

    /**
     * Sets the value of the deep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeep(Boolean value) {
        this.deep = value;
    }

    /**
     * Gets the value of the rightAngledAxes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRightAngledAxes() {
        return rightAngledAxes;
    }

    /**
     * Sets the value of the rightAngledAxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightAngledAxes(Boolean value) {
        this.rightAngledAxes = value;
    }

    /**
     * Gets the value of the symbolType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolType() {
        return symbolType;
    }

    /**
     * Sets the value of the symbolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolType(String value) {
        this.symbolType = value;
    }

    /**
     * Gets the value of the symbolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolName() {
        return symbolName;
    }

    /**
     * Sets the value of the symbolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolName(String value) {
        this.symbolName = value;
    }

    /**
     * Gets the value of the symbolWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolWidth() {
        return symbolWidth;
    }

    /**
     * Sets the value of the symbolWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolWidth(String value) {
        this.symbolWidth = value;
    }

    /**
     * Gets the value of the symbolHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolHeight() {
        return symbolHeight;
    }

    /**
     * Sets the value of the symbolHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolHeight(String value) {
        this.symbolHeight = value;
    }

    /**
     * Gets the value of the sortByXValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSortByXValues() {
        return sortByXValues;
    }

    /**
     * Sets the value of the sortByXValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortByXValues(Boolean value) {
        this.sortByXValues = value;
    }

    /**
     * Gets the value of the vertical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVertical() {
        return vertical;
    }

    /**
     * Sets the value of the vertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVertical(Boolean value) {
        this.vertical = value;
    }

    /**
     * Gets the value of the connectBars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getConnectBars() {
        return connectBars;
    }

    /**
     * Sets the value of the connectBars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectBars(Boolean value) {
        this.connectBars = value;
    }

    /**
     * Gets the value of the gapWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGapWidth() {
        return gapWidth;
    }

    /**
     * Sets the value of the gapWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGapWidth(BigInteger value) {
        this.gapWidth = value;
    }

    /**
     * Gets the value of the overlap property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverlap() {
        return overlap;
    }

    /**
     * Sets the value of the overlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverlap(BigInteger value) {
        this.overlap = value;
    }

    /**
     * Gets the value of the groupBarsPerAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGroupBarsPerAxis() {
        return groupBarsPerAxis;
    }

    /**
     * Sets the value of the groupBarsPerAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupBarsPerAxis(Boolean value) {
        this.groupBarsPerAxis = value;
    }

    /**
     * Gets the value of the japaneseCandleStick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getJapaneseCandleStick() {
        return japaneseCandleStick;
    }

    /**
     * Sets the value of the japaneseCandleStick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJapaneseCandleStick(Boolean value) {
        this.japaneseCandleStick = value;
    }

    /**
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpolation() {
        return interpolation;
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpolation(String value) {
        this.interpolation = value;
    }

    /**
     * Gets the value of the splineOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSplineOrder() {
        return splineOrder;
    }

    /**
     * Sets the value of the splineOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSplineOrder(BigInteger value) {
        this.splineOrder = value;
    }

    /**
     * Gets the value of the splineResolution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSplineResolution() {
        return splineResolution;
    }

    /**
     * Sets the value of the splineResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSplineResolution(BigInteger value) {
        this.splineResolution = value;
    }

    /**
     * Gets the value of the pieOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieOffset() {
        return pieOffset;
    }

    /**
     * Sets the value of the pieOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieOffset(BigInteger value) {
        this.pieOffset = value;
    }

    /**
     * Gets the value of the angleOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAngleOffset() {
        return angleOffset;
    }

    /**
     * Sets the value of the angleOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAngleOffset(String value) {
        this.angleOffset = value;
    }

    /**
     * Gets the value of the holeSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoleSize() {
        return holeSize;
    }

    /**
     * Sets the value of the holeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoleSize(String value) {
        this.holeSize = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLines(Boolean value) {
        this.lines = value;
    }

    /**
     * Gets the value of the solidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolidType() {
        return solidType;
    }

    /**
     * Sets the value of the solidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolidType(String value) {
        this.solidType = value;
    }

    /**
     * Gets the value of the stacked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStacked() {
        return stacked;
    }

    /**
     * Sets the value of the stacked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStacked(Boolean value) {
        this.stacked = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentage(Boolean value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the treatEmptyCells property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatEmptyCells() {
        return treatEmptyCells;
    }

    /**
     * Sets the value of the treatEmptyCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatEmptyCells(String value) {
        this.treatEmptyCells = value;
    }

    /**
     * Gets the value of the linkDataStyleToSource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLinkDataStyleToSource() {
        return linkDataStyleToSource;
    }

    /**
     * Sets the value of the linkDataStyleToSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkDataStyleToSource(Boolean value) {
        this.linkDataStyleToSource = value;
    }

    /**
     * Gets the value of the logarithmic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLogarithmic() {
        return logarithmic;
    }

    /**
     * Sets the value of the logarithmic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogarithmic(Boolean value) {
        this.logarithmic = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximum(Double value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimum(Double value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrigin(Double value) {
        this.origin = value;
    }

    /**
     * Gets the value of the intervalMajor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntervalMajor() {
        return intervalMajor;
    }

    /**
     * Sets the value of the intervalMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntervalMajor(Double value) {
        this.intervalMajor = value;
    }

    /**
     * Gets the value of the intervalMinorDivisor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntervalMinorDivisor() {
        return intervalMinorDivisor;
    }

    /**
     * Sets the value of the intervalMinorDivisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntervalMinorDivisor(BigInteger value) {
        this.intervalMinorDivisor = value;
    }

    /**
     * Gets the value of the tickMarksMajorInner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTickMarksMajorInner() {
        return tickMarksMajorInner;
    }

    /**
     * Sets the value of the tickMarksMajorInner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTickMarksMajorInner(Boolean value) {
        this.tickMarksMajorInner = value;
    }

    /**
     * Gets the value of the tickMarksMajorOuter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTickMarksMajorOuter() {
        return tickMarksMajorOuter;
    }

    /**
     * Sets the value of the tickMarksMajorOuter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTickMarksMajorOuter(Boolean value) {
        this.tickMarksMajorOuter = value;
    }

    /**
     * Gets the value of the tickMarksMinorInner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTickMarksMinorInner() {
        return tickMarksMinorInner;
    }

    /**
     * Sets the value of the tickMarksMinorInner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTickMarksMinorInner(Boolean value) {
        this.tickMarksMinorInner = value;
    }

    /**
     * Gets the value of the tickMarksMinorOuter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTickMarksMinorOuter() {
        return tickMarksMinorOuter;
    }

    /**
     * Sets the value of the tickMarksMinorOuter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTickMarksMinorOuter(Boolean value) {
        this.tickMarksMinorOuter = value;
    }

    /**
     * Gets the value of the reverseDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReverseDirection() {
        return reverseDirection;
    }

    /**
     * Sets the value of the reverseDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseDirection(Boolean value) {
        this.reverseDirection = value;
    }

    /**
     * Gets the value of the displayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisplayLabel() {
        return displayLabel;
    }

    /**
     * Sets the value of the displayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayLabel(Boolean value) {
        this.displayLabel = value;
    }

    /**
     * Gets the value of the textOverlap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTextOverlap() {
        return textOverlap;
    }

    /**
     * Sets the value of the textOverlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextOverlap(Boolean value) {
        this.textOverlap = value;
    }

    /**
     * Gets the value of the lineBreak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLineBreak() {
        return lineBreak;
    }

    /**
     * Sets the value of the lineBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineBreak(Boolean value) {
        this.lineBreak = value;
    }

    /**
     * Gets the value of the labelArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelArrangement() {
        return labelArrangement;
    }

    /**
     * Sets the value of the labelArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelArrangement(String value) {
        this.labelArrangement = value;
    }

    /**
     * Gets the value of the dataLabelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataLabelNumber() {
        return dataLabelNumber;
    }

    /**
     * Sets the value of the dataLabelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataLabelNumber(String value) {
        this.dataLabelNumber = value;
    }

    /**
     * Gets the value of the dataLabelText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDataLabelText() {
        return dataLabelText;
    }

    /**
     * Sets the value of the dataLabelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataLabelText(Boolean value) {
        this.dataLabelText = value;
    }

    /**
     * Gets the value of the dataLabelSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDataLabelSymbol() {
        return dataLabelSymbol;
    }

    /**
     * Sets the value of the dataLabelSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataLabelSymbol(Boolean value) {
        this.dataLabelSymbol = value;
    }

    /**
     * Gets the value of the labelPosition property.
     * 
     * @return
     *     possible object is
     *     {@link LabelPositions }
     *     
     */
    public LabelPositions getLabelPosition() {
        return labelPosition;
    }

    /**
     * Sets the value of the labelPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelPositions }
     *     
     */
    public void setLabelPosition(LabelPositions value) {
        this.labelPosition = value;
    }

    /**
     * Gets the value of the labelPositionNegative property.
     * 
     * @return
     *     possible object is
     *     {@link LabelPositions }
     *     
     */
    public LabelPositions getLabelPositionNegative() {
        return labelPositionNegative;
    }

    /**
     * Sets the value of the labelPositionNegative property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelPositions }
     *     
     */
    public void setLabelPositionNegative(LabelPositions value) {
        this.labelPositionNegative = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the autoPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoPosition() {
        return autoPosition;
    }

    /**
     * Sets the value of the autoPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPosition(Boolean value) {
        this.autoPosition = value;
    }

    /**
     * Gets the value of the autoSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoSize() {
        return autoSize;
    }

    /**
     * Sets the value of the autoSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSize(Boolean value) {
        this.autoSize = value;
    }

    /**
     * Gets the value of the meanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMeanValue() {
        return meanValue;
    }

    /**
     * Sets the value of the meanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeanValue(Boolean value) {
        this.meanValue = value;
    }

    /**
     * Gets the value of the errorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCategory() {
        return errorCategory;
    }

    /**
     * Sets the value of the errorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCategory(String value) {
        this.errorCategory = value;
    }

    /**
     * Gets the value of the errorPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getErrorPercentage() {
        return errorPercentage;
    }

    /**
     * Sets the value of the errorPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setErrorPercentage(Double value) {
        this.errorPercentage = value;
    }

    /**
     * Gets the value of the errorMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getErrorMargin() {
        return errorMargin;
    }

    /**
     * Sets the value of the errorMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setErrorMargin(Double value) {
        this.errorMargin = value;
    }

    /**
     * Gets the value of the errorLowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getErrorLowerLimit() {
        return errorLowerLimit;
    }

    /**
     * Sets the value of the errorLowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setErrorLowerLimit(Double value) {
        this.errorLowerLimit = value;
    }

    /**
     * Gets the value of the errorUpperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getErrorUpperLimit() {
        return errorUpperLimit;
    }

    /**
     * Sets the value of the errorUpperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setErrorUpperLimit(Double value) {
        this.errorUpperLimit = value;
    }

    /**
     * Gets the value of the errorUpperIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getErrorUpperIndicator() {
        return errorUpperIndicator;
    }

    /**
     * Sets the value of the errorUpperIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorUpperIndicator(Boolean value) {
        this.errorUpperIndicator = value;
    }

    /**
     * Gets the value of the errorLowerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getErrorLowerIndicator() {
        return errorLowerIndicator;
    }

    /**
     * Sets the value of the errorLowerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorLowerIndicator(Boolean value) {
        this.errorLowerIndicator = value;
    }

    /**
     * Gets the value of the errorLowerRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLowerRange() {
        return errorLowerRange;
    }

    /**
     * Sets the value of the errorLowerRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLowerRange(String value) {
        this.errorLowerRange = value;
    }

    /**
     * Gets the value of the errorUpperRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUpperRange() {
        return errorUpperRange;
    }

    /**
     * Sets the value of the errorUpperRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUpperRange(String value) {
        this.errorUpperRange = value;
    }

    /**
     * Gets the value of the seriesSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesSource() {
        return seriesSource;
    }

    /**
     * Sets the value of the seriesSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesSource(String value) {
        this.seriesSource = value;
    }

    /**
     * Gets the value of the regressionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegressionType() {
        return regressionType;
    }

    /**
     * Sets the value of the regressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegressionType(String value) {
        this.regressionType = value;
    }

    /**
     * Gets the value of the regressionMaxDegree property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegressionMaxDegree() {
        return regressionMaxDegree;
    }

    /**
     * Sets the value of the regressionMaxDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegressionMaxDegree(BigInteger value) {
        this.regressionMaxDegree = value;
    }

    /**
     * Gets the value of the regressionForceIntercept property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRegressionForceIntercept() {
        return regressionForceIntercept;
    }

    /**
     * Sets the value of the regressionForceIntercept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegressionForceIntercept(Boolean value) {
        this.regressionForceIntercept = value;
    }

    /**
     * Gets the value of the regressionInterceptValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRegressionInterceptValue() {
        return regressionInterceptValue;
    }

    /**
     * Sets the value of the regressionInterceptValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRegressionInterceptValue(Double value) {
        this.regressionInterceptValue = value;
    }

    /**
     * Gets the value of the regressionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegressionName() {
        return regressionName;
    }

    /**
     * Sets the value of the regressionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegressionName(String value) {
        this.regressionName = value;
    }

    /**
     * Gets the value of the regressionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegressionPeriod() {
        return regressionPeriod;
    }

    /**
     * Sets the value of the regressionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegressionPeriod(BigInteger value) {
        this.regressionPeriod = value;
    }

    /**
     * Gets the value of the regressionMovingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegressionMovingType() {
        return regressionMovingType;
    }

    /**
     * Sets the value of the regressionMovingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegressionMovingType(String value) {
        this.regressionMovingType = value;
    }

    /**
     * Gets the value of the axisPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisPosition() {
        return axisPosition;
    }

    /**
     * Sets the value of the axisPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisPosition(String value) {
        this.axisPosition = value;
    }

    /**
     * Gets the value of the axisLabelPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisLabelPosition() {
        return axisLabelPosition;
    }

    /**
     * Sets the value of the axisLabelPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisLabelPosition(String value) {
        this.axisLabelPosition = value;
    }

    /**
     * Gets the value of the tickMarkPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickMarkPosition() {
        return tickMarkPosition;
    }

    /**
     * Sets the value of the tickMarkPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickMarkPosition(String value) {
        this.tickMarkPosition = value;
    }

    /**
     * Gets the value of the includeHiddenCells property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIncludeHiddenCells() {
        return includeHiddenCells;
    }

    /**
     * Sets the value of the includeHiddenCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHiddenCells(Boolean value) {
        this.includeHiddenCells = value;
    }

    /**
     * Gets the value of the dataLabelSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDataLabelSeries() {
        return dataLabelSeries;
    }

    /**
     * Sets the value of the dataLabelSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataLabelSeries(Boolean value) {
        this.dataLabelSeries = value;
    }

    /**
     * Gets the value of the rotationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationAngle() {
        return rotationAngle;
    }

    /**
     * Sets the value of the rotationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationAngle(String value) {
        this.rotationAngle = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
