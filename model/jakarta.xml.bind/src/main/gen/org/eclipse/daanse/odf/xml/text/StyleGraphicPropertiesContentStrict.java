
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for style-graphic-properties-content-strict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-graphic-properties-content-strict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-graphic-properties-elements"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-graphic-fill-properties-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-graphic-properties-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-graphic-properties-content-strict")
public class StyleGraphicPropertiesContentStrict
    extends StyleGraphicPropertiesElements
{

    @XmlAttribute(name = "fill", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fill;
    @XmlAttribute(name = "fill-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillColor;
    @XmlAttribute(name = "secondary-fill-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String secondaryFillColor;
    @XmlAttribute(name = "fill-gradient-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillGradientName;
    @XmlAttribute(name = "gradient-step-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger gradientStepCount;
    @XmlAttribute(name = "fill-hatch-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillHatchName;
    @XmlAttribute(name = "fill-hatch-solid", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean fillHatchSolid;
    @XmlAttribute(name = "fill-image-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageName;
    @XmlAttribute(name = "repeat", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String repeat;
    @XmlAttribute(name = "fill-image-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageWidth;
    @XmlAttribute(name = "fill-image-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageHeight;
    @XmlAttribute(name = "fill-image-ref-point-x", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageRefPointX;
    @XmlAttribute(name = "fill-image-ref-point-y", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String fillImageRefPointY;
    @XmlAttribute(name = "fill-image-ref-point", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillImageRefPoint;
    @XmlAttribute(name = "tile-repeat-offset", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> tileRepeatOffset;
    @XmlAttribute(name = "opacity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String opacity;
    @XmlAttribute(name = "opacity-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String opacityName;
    @XmlAttribute(name = "fill-rule", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillRule;
    @XmlAttribute(name = "stroke", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stroke;
    @XmlAttribute(name = "stroke-dash", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String strokeDash;
    @XmlAttribute(name = "stroke-dash-names", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> strokeDashNames;
    @XmlAttribute(name = "stroke-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String strokeWidth;
    @XmlAttribute(name = "stroke-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String strokeColor;
    @XmlAttribute(name = "marker-start", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String markerStart;
    @XmlAttribute(name = "marker-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String markerEnd;
    @XmlAttribute(name = "marker-start-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String markerStartWidth;
    @XmlAttribute(name = "marker-end-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String markerEndWidth;
    @XmlAttribute(name = "marker-start-center", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean markerStartCenter;
    @XmlAttribute(name = "marker-end-center", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean markerEndCenter;
    @XmlAttribute(name = "stroke-opacity", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected String strokeOpacity;
    @XmlAttribute(name = "stroke-linejoin", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strokeLinejoin;
    @XmlAttribute(name = "stroke-linecap", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strokeLinecap;
    @XmlAttribute(name = "symbol-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String symbolColor;
    @XmlAttribute(name = "animation", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String animation;
    @XmlAttribute(name = "animation-direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String animationDirection;
    @XmlAttribute(name = "animation-start-inside", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean animationStartInside;
    @XmlAttribute(name = "animation-stop-inside", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean animationStopInside;
    @XmlAttribute(name = "animation-repeat", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger animationRepeat;
    @XmlAttribute(name = "animation-delay", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Duration animationDelay;
    @XmlAttribute(name = "animation-steps", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String animationSteps;
    @XmlAttribute(name = "auto-grow-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean autoGrowWidth;
    @XmlAttribute(name = "auto-grow-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean autoGrowHeight;
    @XmlAttribute(name = "fit-to-size", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean fitToSize;
    @XmlAttribute(name = "fit-to-contour", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean fitToContour;
    @XmlAttribute(name = "textarea-vertical-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textareaVerticalAlign;
    @XmlAttribute(name = "textarea-horizontal-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textareaHorizontalAlign;
    @XmlAttribute(name = "wrap-option", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wrapOption;
    @XmlAttribute(name = "shrink-to-fit", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean shrinkToFit;
    @XmlAttribute(name = "color-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorMode;
    @XmlAttribute(name = "color-inversion", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean colorInversion;
    @XmlAttribute(name = "luminance", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String luminance;
    @XmlAttribute(name = "contrast", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String contrast;
    @XmlAttribute(name = "gamma", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String gamma;
    @XmlAttribute(name = "red", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String red;
    @XmlAttribute(name = "green", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String green;
    @XmlAttribute(name = "blue", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String blue;
    @XmlAttribute(name = "image-opacity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String imageOpacity;
    @XmlAttribute(name = "shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String drawShadow;
    @XmlAttribute(name = "shadow-offset-x", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String shadowOffsetX;
    @XmlAttribute(name = "shadow-offset-y", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String shadowOffsetY;
    @XmlAttribute(name = "shadow-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String shadowColor;
    @XmlAttribute(name = "shadow-opacity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String shadowOpacity;
    @XmlAttribute(name = "start-line-spacing-horizontal", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String startLineSpacingHorizontal;
    @XmlAttribute(name = "start-line-spacing-vertical", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String startLineSpacingVertical;
    @XmlAttribute(name = "end-line-spacing-horizontal", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String endLineSpacingHorizontal;
    @XmlAttribute(name = "end-line-spacing-vertical", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String endLineSpacingVertical;
    @XmlAttribute(name = "line-distance", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String lineDistance;
    @XmlAttribute(name = "guide-overhang", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String guideOverhang;
    @XmlAttribute(name = "guide-distance", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String guideDistance;
    @XmlAttribute(name = "start-guide", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String startGuide;
    @XmlAttribute(name = "end-guide", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String endGuide;
    @XmlAttribute(name = "placing", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String placing;
    @XmlAttribute(name = "parallel", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean parallel;
    @XmlAttribute(name = "measure-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String measureAlign;
    @XmlAttribute(name = "measure-vertical-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String measureVerticalAlign;
    @XmlAttribute(name = "unit", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;
    @XmlAttribute(name = "show-unit", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean showUnit;
    @XmlAttribute(name = "decimal-places", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "caption-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String captionType;
    @XmlAttribute(name = "caption-angle-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String captionAngleType;
    @XmlAttribute(name = "caption-angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String captionAngle;
    @XmlAttribute(name = "caption-gap", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String captionGap;
    @XmlAttribute(name = "caption-escape-direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String captionEscapeDirection;
    @XmlAttribute(name = "caption-escape", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String captionEscape;
    @XmlAttribute(name = "caption-line-length", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String captionLineLength;
    @XmlAttribute(name = "caption-fit-line-length", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean captionFitLineLength;
    @XmlAttribute(name = "horizontal-segments", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected BigInteger horizontalSegments;
    @XmlAttribute(name = "vertical-segments", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected BigInteger verticalSegments;
    @XmlAttribute(name = "edge-rounding", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String edgeRounding;
    @XmlAttribute(name = "edge-rounding-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String edgeRoundingMode;
    @XmlAttribute(name = "back-scale", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String backScale;
    @XmlAttribute(name = "depth", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String depth;
    @XmlAttribute(name = "backface-culling", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String backfaceCulling;
    @XmlAttribute(name = "end-angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String endAngle;
    @XmlAttribute(name = "close-front", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected Boolean closeFront;
    @XmlAttribute(name = "close-back", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected Boolean closeBack;
    @XmlAttribute(name = "normals-kind", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String normalsKind;
    @XmlAttribute(name = "normals-direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String normalsDirection;
    @XmlAttribute(name = "texture-generation-mode-x", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textureGenerationModeX;
    @XmlAttribute(name = "texture-generation-mode-y", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textureGenerationModeY;
    @XmlAttribute(name = "texture-kind", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textureKind;
    @XmlAttribute(name = "texture-filter", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textureFilter;
    @XmlAttribute(name = "texture-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textureMode;
    @XmlAttribute(name = "ambient-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String ambientColor;
    @XmlAttribute(name = "emissive-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String emissiveColor;
    @XmlAttribute(name = "specular-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String specularColor;
    @XmlAttribute(name = "diffuse-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String diffuseColor;
    @XmlAttribute(name = "shininess", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String shininess;
    @XmlAttribute(name = "shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dr3DShadow;
    @XmlAttribute(name = "min-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String minWidth;
    @XmlAttribute(name = "max-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String maxHeight;
    @XmlAttribute(name = "max-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String maxWidth;
    @XmlAttribute(name = "print-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean printContent;
    @XmlAttribute(name = "horizontal-pos", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String horizontalPos;
    @XmlAttribute(name = "horizontal-rel", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String horizontalRel;
    @XmlAttribute(name = "wrap", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wrap;
    @XmlAttribute(name = "wrap-dynamic-threshold", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String wrapDynamicThreshold;
    @XmlAttribute(name = "number-wrapped-paragraphs", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numberWrappedParagraphs;
    @XmlAttribute(name = "wrap-contour", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean wrapContour;
    @XmlAttribute(name = "wrap-contour-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wrapContourMode;
    @XmlAttribute(name = "run-through", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String runThrough;
    @XmlAttribute(name = "flow-with-text", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean flowWithText;
    @XmlAttribute(name = "overflow-behavior", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String overflowBehavior;
    @XmlAttribute(name = "mirror", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> mirror;
    @XmlAttribute(name = "clip", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String clip;
    @XmlAttribute(name = "wrap-influence-on-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wrapInfluenceOnPosition;
    @XmlAttribute(name = "frame-display-scrollbar", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean frameDisplayScrollbar;
    @XmlAttribute(name = "frame-display-border", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean frameDisplayBorder;
    @XmlAttribute(name = "frame-margin-horizontal", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String frameMarginHorizontal;
    @XmlAttribute(name = "frame-margin-vertical", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String frameMarginVertical;
    @XmlAttribute(name = "visible-area-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String visibleAreaLeft;
    @XmlAttribute(name = "visible-area-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String visibleAreaTop;
    @XmlAttribute(name = "visible-area-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String visibleAreaWidth;
    @XmlAttribute(name = "visible-area-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String visibleAreaHeight;
    @XmlAttribute(name = "draw-aspect", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String drawAspect;
    @XmlAttribute(name = "ole-draw-aspect", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger oleDrawAspect;
    @XmlAttribute(name = "editable", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean editable;
    @XmlAttribute(name = "shadow", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String shadow;
    @XmlAttribute(name = "rel-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String relHeight;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String width;
    @XmlAttribute(name = "rel-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String relWidth;
    @XmlAttribute(name = "protect", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected List<String> protect;
    @XmlAttribute(name = "vertical-pos", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verticalPos;
    @XmlAttribute(name = "y", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y;
    @XmlAttribute(name = "background-transparency", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String backgroundTransparency;
    @XmlAttribute(name = "margin-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginRight;
    @XmlAttribute(name = "margin-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String marginLeft;
    @XmlAttribute(name = "vertical-rel", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verticalRel;
    @XmlAttribute(name = "anchor-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String anchorType;
    @XmlAttribute(name = "anchor-page-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger anchorPageNumber;
    @XmlAttribute(name = "margin-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginTop;
    @XmlAttribute(name = "margin-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String marginBottom;
    @XmlAttribute(name = "border-line-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidth;
    @XmlAttribute(name = "border-line-width-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthTop;
    @XmlAttribute(name = "border-line-width-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthBottom;
    @XmlAttribute(name = "border-line-width-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthLeft;
    @XmlAttribute(name = "border-line-width-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> borderLineWidthRight;
    @XmlAttribute(name = "writing-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String writingMode;
    @XmlAttribute(name = "padding", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String padding;
    @XmlAttribute(name = "padding-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingTop;
    @XmlAttribute(name = "padding-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingBottom;
    @XmlAttribute(name = "padding-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingLeft;
    @XmlAttribute(name = "padding-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String paddingRight;
    @XmlAttribute(name = "lighting-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lightingMode;
    @XmlAttribute(name = "min-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String minHeight;
    @XmlAttribute(name = "border", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String border;
    @XmlAttribute(name = "border-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderTop;
    @XmlAttribute(name = "border-bottom", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderBottom;
    @XmlAttribute(name = "border-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderLeft;
    @XmlAttribute(name = "border-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String borderRight;
    @XmlAttribute(name = "x", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String x;
    @XmlAttribute(name = "background-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String backgroundColor;
    @XmlAttribute(name = "margin", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String margin;

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the fillColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Sets the value of the fillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillColor(String value) {
        this.fillColor = value;
    }

    /**
     * Gets the value of the secondaryFillColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryFillColor() {
        return secondaryFillColor;
    }

    /**
     * Sets the value of the secondaryFillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryFillColor(String value) {
        this.secondaryFillColor = value;
    }

    /**
     * Gets the value of the fillGradientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillGradientName() {
        return fillGradientName;
    }

    /**
     * Sets the value of the fillGradientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillGradientName(String value) {
        this.fillGradientName = value;
    }

    /**
     * Gets the value of the gradientStepCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGradientStepCount() {
        return gradientStepCount;
    }

    /**
     * Sets the value of the gradientStepCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGradientStepCount(BigInteger value) {
        this.gradientStepCount = value;
    }

    /**
     * Gets the value of the fillHatchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillHatchName() {
        return fillHatchName;
    }

    /**
     * Sets the value of the fillHatchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillHatchName(String value) {
        this.fillHatchName = value;
    }

    /**
     * Gets the value of the fillHatchSolid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFillHatchSolid() {
        return fillHatchSolid;
    }

    /**
     * Sets the value of the fillHatchSolid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFillHatchSolid(Boolean value) {
        this.fillHatchSolid = value;
    }

    /**
     * Gets the value of the fillImageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageName() {
        return fillImageName;
    }

    /**
     * Sets the value of the fillImageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageName(String value) {
        this.fillImageName = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeat(String value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the fillImageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageWidth() {
        return fillImageWidth;
    }

    /**
     * Sets the value of the fillImageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageWidth(String value) {
        this.fillImageWidth = value;
    }

    /**
     * Gets the value of the fillImageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageHeight() {
        return fillImageHeight;
    }

    /**
     * Sets the value of the fillImageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageHeight(String value) {
        this.fillImageHeight = value;
    }

    /**
     * Gets the value of the fillImageRefPointX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageRefPointX() {
        return fillImageRefPointX;
    }

    /**
     * Sets the value of the fillImageRefPointX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageRefPointX(String value) {
        this.fillImageRefPointX = value;
    }

    /**
     * Gets the value of the fillImageRefPointY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageRefPointY() {
        return fillImageRefPointY;
    }

    /**
     * Sets the value of the fillImageRefPointY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageRefPointY(String value) {
        this.fillImageRefPointY = value;
    }

    /**
     * Gets the value of the fillImageRefPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillImageRefPoint() {
        return fillImageRefPoint;
    }

    /**
     * Sets the value of the fillImageRefPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillImageRefPoint(String value) {
        this.fillImageRefPoint = value;
    }

    /**
     * Gets the value of the tileRepeatOffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tileRepeatOffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTileRepeatOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTileRepeatOffset() {
        if (tileRepeatOffset == null) {
            tileRepeatOffset = new ArrayList<String>();
        }
        return this.tileRepeatOffset;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacity(String value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the opacityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacityName() {
        return opacityName;
    }

    /**
     * Sets the value of the opacityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacityName(String value) {
        this.opacityName = value;
    }

    /**
     * Gets the value of the fillRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillRule() {
        return fillRule;
    }

    /**
     * Sets the value of the fillRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillRule(String value) {
        this.fillRule = value;
    }

    /**
     * Gets the value of the stroke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStroke() {
        return stroke;
    }

    /**
     * Sets the value of the stroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStroke(String value) {
        this.stroke = value;
    }

    /**
     * Gets the value of the strokeDash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeDash() {
        return strokeDash;
    }

    /**
     * Sets the value of the strokeDash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeDash(String value) {
        this.strokeDash = value;
    }

    /**
     * Gets the value of the strokeDashNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the strokeDashNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrokeDashNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStrokeDashNames() {
        if (strokeDashNames == null) {
            strokeDashNames = new ArrayList<String>();
        }
        return this.strokeDashNames;
    }

    /**
     * Gets the value of the strokeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Sets the value of the strokeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeWidth(String value) {
        this.strokeWidth = value;
    }

    /**
     * Gets the value of the strokeColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeColor() {
        return strokeColor;
    }

    /**
     * Sets the value of the strokeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeColor(String value) {
        this.strokeColor = value;
    }

    /**
     * Gets the value of the markerStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerStart() {
        return markerStart;
    }

    /**
     * Sets the value of the markerStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerStart(String value) {
        this.markerStart = value;
    }

    /**
     * Gets the value of the markerEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerEnd() {
        return markerEnd;
    }

    /**
     * Sets the value of the markerEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerEnd(String value) {
        this.markerEnd = value;
    }

    /**
     * Gets the value of the markerStartWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerStartWidth() {
        return markerStartWidth;
    }

    /**
     * Sets the value of the markerStartWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerStartWidth(String value) {
        this.markerStartWidth = value;
    }

    /**
     * Gets the value of the markerEndWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerEndWidth() {
        return markerEndWidth;
    }

    /**
     * Sets the value of the markerEndWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerEndWidth(String value) {
        this.markerEndWidth = value;
    }

    /**
     * Gets the value of the markerStartCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMarkerStartCenter() {
        return markerStartCenter;
    }

    /**
     * Sets the value of the markerStartCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkerStartCenter(Boolean value) {
        this.markerStartCenter = value;
    }

    /**
     * Gets the value of the markerEndCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMarkerEndCenter() {
        return markerEndCenter;
    }

    /**
     * Sets the value of the markerEndCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkerEndCenter(Boolean value) {
        this.markerEndCenter = value;
    }

    /**
     * Gets the value of the strokeOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeOpacity() {
        return strokeOpacity;
    }

    /**
     * Sets the value of the strokeOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeOpacity(String value) {
        this.strokeOpacity = value;
    }

    /**
     * Gets the value of the strokeLinejoin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeLinejoin() {
        return strokeLinejoin;
    }

    /**
     * Sets the value of the strokeLinejoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeLinejoin(String value) {
        this.strokeLinejoin = value;
    }

    /**
     * Gets the value of the strokeLinecap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeLinecap() {
        return strokeLinecap;
    }

    /**
     * Sets the value of the strokeLinecap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeLinecap(String value) {
        this.strokeLinecap = value;
    }

    /**
     * Gets the value of the symbolColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolColor() {
        return symbolColor;
    }

    /**
     * Sets the value of the symbolColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolColor(String value) {
        this.symbolColor = value;
    }

    /**
     * Gets the value of the animation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimation() {
        return animation;
    }

    /**
     * Sets the value of the animation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimation(String value) {
        this.animation = value;
    }

    /**
     * Gets the value of the animationDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimationDirection() {
        return animationDirection;
    }

    /**
     * Sets the value of the animationDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimationDirection(String value) {
        this.animationDirection = value;
    }

    /**
     * Gets the value of the animationStartInside property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAnimationStartInside() {
        return animationStartInside;
    }

    /**
     * Sets the value of the animationStartInside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnimationStartInside(Boolean value) {
        this.animationStartInside = value;
    }

    /**
     * Gets the value of the animationStopInside property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAnimationStopInside() {
        return animationStopInside;
    }

    /**
     * Sets the value of the animationStopInside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnimationStopInside(Boolean value) {
        this.animationStopInside = value;
    }

    /**
     * Gets the value of the animationRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnimationRepeat() {
        return animationRepeat;
    }

    /**
     * Sets the value of the animationRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnimationRepeat(BigInteger value) {
        this.animationRepeat = value;
    }

    /**
     * Gets the value of the animationDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAnimationDelay() {
        return animationDelay;
    }

    /**
     * Sets the value of the animationDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAnimationDelay(Duration value) {
        this.animationDelay = value;
    }

    /**
     * Gets the value of the animationSteps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimationSteps() {
        return animationSteps;
    }

    /**
     * Sets the value of the animationSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimationSteps(String value) {
        this.animationSteps = value;
    }

    /**
     * Gets the value of the autoGrowWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoGrowWidth() {
        return autoGrowWidth;
    }

    /**
     * Sets the value of the autoGrowWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGrowWidth(Boolean value) {
        this.autoGrowWidth = value;
    }

    /**
     * Gets the value of the autoGrowHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoGrowHeight() {
        return autoGrowHeight;
    }

    /**
     * Sets the value of the autoGrowHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGrowHeight(Boolean value) {
        this.autoGrowHeight = value;
    }

    /**
     * Gets the value of the fitToSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFitToSize() {
        return fitToSize;
    }

    /**
     * Sets the value of the fitToSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFitToSize(Boolean value) {
        this.fitToSize = value;
    }

    /**
     * Gets the value of the fitToContour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFitToContour() {
        return fitToContour;
    }

    /**
     * Sets the value of the fitToContour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFitToContour(Boolean value) {
        this.fitToContour = value;
    }

    /**
     * Gets the value of the textareaVerticalAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextareaVerticalAlign() {
        return textareaVerticalAlign;
    }

    /**
     * Sets the value of the textareaVerticalAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextareaVerticalAlign(String value) {
        this.textareaVerticalAlign = value;
    }

    /**
     * Gets the value of the textareaHorizontalAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextareaHorizontalAlign() {
        return textareaHorizontalAlign;
    }

    /**
     * Sets the value of the textareaHorizontalAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextareaHorizontalAlign(String value) {
        this.textareaHorizontalAlign = value;
    }

    /**
     * Gets the value of the wrapOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapOption() {
        return wrapOption;
    }

    /**
     * Sets the value of the wrapOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapOption(String value) {
        this.wrapOption = value;
    }

    /**
     * Gets the value of the shrinkToFit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShrinkToFit() {
        return shrinkToFit;
    }

    /**
     * Sets the value of the shrinkToFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrinkToFit(Boolean value) {
        this.shrinkToFit = value;
    }

    /**
     * Gets the value of the colorMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorMode() {
        return colorMode;
    }

    /**
     * Sets the value of the colorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorMode(String value) {
        this.colorMode = value;
    }

    /**
     * Gets the value of the colorInversion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getColorInversion() {
        return colorInversion;
    }

    /**
     * Sets the value of the colorInversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorInversion(Boolean value) {
        this.colorInversion = value;
    }

    /**
     * Gets the value of the luminance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuminance() {
        return luminance;
    }

    /**
     * Sets the value of the luminance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuminance(String value) {
        this.luminance = value;
    }

    /**
     * Gets the value of the contrast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrast() {
        return contrast;
    }

    /**
     * Sets the value of the contrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrast(String value) {
        this.contrast = value;
    }

    /**
     * Gets the value of the gamma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGamma() {
        return gamma;
    }

    /**
     * Sets the value of the gamma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGamma(String value) {
        this.gamma = value;
    }

    /**
     * Gets the value of the red property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRed() {
        return red;
    }

    /**
     * Sets the value of the red property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRed(String value) {
        this.red = value;
    }

    /**
     * Gets the value of the green property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreen() {
        return green;
    }

    /**
     * Sets the value of the green property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreen(String value) {
        this.green = value;
    }

    /**
     * Gets the value of the blue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlue() {
        return blue;
    }

    /**
     * Sets the value of the blue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlue(String value) {
        this.blue = value;
    }

    /**
     * Gets the value of the imageOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageOpacity() {
        return imageOpacity;
    }

    /**
     * Sets the value of the imageOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageOpacity(String value) {
        this.imageOpacity = value;
    }

    /**
     * Gets the value of the drawShadow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawShadow() {
        return drawShadow;
    }

    /**
     * Sets the value of the drawShadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawShadow(String value) {
        this.drawShadow = value;
    }

    /**
     * Gets the value of the shadowOffsetX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowOffsetX() {
        return shadowOffsetX;
    }

    /**
     * Sets the value of the shadowOffsetX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowOffsetX(String value) {
        this.shadowOffsetX = value;
    }

    /**
     * Gets the value of the shadowOffsetY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowOffsetY() {
        return shadowOffsetY;
    }

    /**
     * Sets the value of the shadowOffsetY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowOffsetY(String value) {
        this.shadowOffsetY = value;
    }

    /**
     * Gets the value of the shadowColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowColor() {
        return shadowColor;
    }

    /**
     * Sets the value of the shadowColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowColor(String value) {
        this.shadowColor = value;
    }

    /**
     * Gets the value of the shadowOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowOpacity() {
        return shadowOpacity;
    }

    /**
     * Sets the value of the shadowOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowOpacity(String value) {
        this.shadowOpacity = value;
    }

    /**
     * Gets the value of the startLineSpacingHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLineSpacingHorizontal() {
        return startLineSpacingHorizontal;
    }

    /**
     * Sets the value of the startLineSpacingHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLineSpacingHorizontal(String value) {
        this.startLineSpacingHorizontal = value;
    }

    /**
     * Gets the value of the startLineSpacingVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLineSpacingVertical() {
        return startLineSpacingVertical;
    }

    /**
     * Sets the value of the startLineSpacingVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLineSpacingVertical(String value) {
        this.startLineSpacingVertical = value;
    }

    /**
     * Gets the value of the endLineSpacingHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLineSpacingHorizontal() {
        return endLineSpacingHorizontal;
    }

    /**
     * Sets the value of the endLineSpacingHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLineSpacingHorizontal(String value) {
        this.endLineSpacingHorizontal = value;
    }

    /**
     * Gets the value of the endLineSpacingVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLineSpacingVertical() {
        return endLineSpacingVertical;
    }

    /**
     * Sets the value of the endLineSpacingVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLineSpacingVertical(String value) {
        this.endLineSpacingVertical = value;
    }

    /**
     * Gets the value of the lineDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDistance() {
        return lineDistance;
    }

    /**
     * Sets the value of the lineDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDistance(String value) {
        this.lineDistance = value;
    }

    /**
     * Gets the value of the guideOverhang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuideOverhang() {
        return guideOverhang;
    }

    /**
     * Sets the value of the guideOverhang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuideOverhang(String value) {
        this.guideOverhang = value;
    }

    /**
     * Gets the value of the guideDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuideDistance() {
        return guideDistance;
    }

    /**
     * Sets the value of the guideDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuideDistance(String value) {
        this.guideDistance = value;
    }

    /**
     * Gets the value of the startGuide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartGuide() {
        return startGuide;
    }

    /**
     * Sets the value of the startGuide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartGuide(String value) {
        this.startGuide = value;
    }

    /**
     * Gets the value of the endGuide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndGuide() {
        return endGuide;
    }

    /**
     * Sets the value of the endGuide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndGuide(String value) {
        this.endGuide = value;
    }

    /**
     * Gets the value of the placing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacing() {
        return placing;
    }

    /**
     * Sets the value of the placing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacing(String value) {
        this.placing = value;
    }

    /**
     * Gets the value of the parallel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getParallel() {
        return parallel;
    }

    /**
     * Sets the value of the parallel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallel(Boolean value) {
        this.parallel = value;
    }

    /**
     * Gets the value of the measureAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureAlign() {
        return measureAlign;
    }

    /**
     * Sets the value of the measureAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureAlign(String value) {
        this.measureAlign = value;
    }

    /**
     * Gets the value of the measureVerticalAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureVerticalAlign() {
        return measureVerticalAlign;
    }

    /**
     * Sets the value of the measureVerticalAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureVerticalAlign(String value) {
        this.measureVerticalAlign = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the showUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowUnit() {
        return showUnit;
    }

    /**
     * Sets the value of the showUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowUnit(Boolean value) {
        this.showUnit = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the captionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionType() {
        return captionType;
    }

    /**
     * Sets the value of the captionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionType(String value) {
        this.captionType = value;
    }

    /**
     * Gets the value of the captionAngleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionAngleType() {
        return captionAngleType;
    }

    /**
     * Sets the value of the captionAngleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionAngleType(String value) {
        this.captionAngleType = value;
    }

    /**
     * Gets the value of the captionAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionAngle() {
        return captionAngle;
    }

    /**
     * Sets the value of the captionAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionAngle(String value) {
        this.captionAngle = value;
    }

    /**
     * Gets the value of the captionGap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionGap() {
        return captionGap;
    }

    /**
     * Sets the value of the captionGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionGap(String value) {
        this.captionGap = value;
    }

    /**
     * Gets the value of the captionEscapeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionEscapeDirection() {
        return captionEscapeDirection;
    }

    /**
     * Sets the value of the captionEscapeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionEscapeDirection(String value) {
        this.captionEscapeDirection = value;
    }

    /**
     * Gets the value of the captionEscape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionEscape() {
        return captionEscape;
    }

    /**
     * Sets the value of the captionEscape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionEscape(String value) {
        this.captionEscape = value;
    }

    /**
     * Gets the value of the captionLineLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionLineLength() {
        return captionLineLength;
    }

    /**
     * Sets the value of the captionLineLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionLineLength(String value) {
        this.captionLineLength = value;
    }

    /**
     * Gets the value of the captionFitLineLength property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCaptionFitLineLength() {
        return captionFitLineLength;
    }

    /**
     * Sets the value of the captionFitLineLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaptionFitLineLength(Boolean value) {
        this.captionFitLineLength = value;
    }

    /**
     * Gets the value of the horizontalSegments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHorizontalSegments() {
        return horizontalSegments;
    }

    /**
     * Sets the value of the horizontalSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHorizontalSegments(BigInteger value) {
        this.horizontalSegments = value;
    }

    /**
     * Gets the value of the verticalSegments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVerticalSegments() {
        return verticalSegments;
    }

    /**
     * Sets the value of the verticalSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVerticalSegments(BigInteger value) {
        this.verticalSegments = value;
    }

    /**
     * Gets the value of the edgeRounding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeRounding() {
        return edgeRounding;
    }

    /**
     * Sets the value of the edgeRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeRounding(String value) {
        this.edgeRounding = value;
    }

    /**
     * Gets the value of the edgeRoundingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeRoundingMode() {
        return edgeRoundingMode;
    }

    /**
     * Sets the value of the edgeRoundingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeRoundingMode(String value) {
        this.edgeRoundingMode = value;
    }

    /**
     * Gets the value of the backScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackScale() {
        return backScale;
    }

    /**
     * Sets the value of the backScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackScale(String value) {
        this.backScale = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepth(String value) {
        this.depth = value;
    }

    /**
     * Gets the value of the backfaceCulling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackfaceCulling() {
        return backfaceCulling;
    }

    /**
     * Sets the value of the backfaceCulling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackfaceCulling(String value) {
        this.backfaceCulling = value;
    }

    /**
     * Gets the value of the endAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAngle() {
        return endAngle;
    }

    /**
     * Sets the value of the endAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAngle(String value) {
        this.endAngle = value;
    }

    /**
     * Gets the value of the closeFront property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCloseFront() {
        return closeFront;
    }

    /**
     * Sets the value of the closeFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloseFront(Boolean value) {
        this.closeFront = value;
    }

    /**
     * Gets the value of the closeBack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCloseBack() {
        return closeBack;
    }

    /**
     * Sets the value of the closeBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloseBack(Boolean value) {
        this.closeBack = value;
    }

    /**
     * Gets the value of the normalsKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalsKind() {
        return normalsKind;
    }

    /**
     * Sets the value of the normalsKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalsKind(String value) {
        this.normalsKind = value;
    }

    /**
     * Gets the value of the normalsDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalsDirection() {
        return normalsDirection;
    }

    /**
     * Sets the value of the normalsDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalsDirection(String value) {
        this.normalsDirection = value;
    }

    /**
     * Gets the value of the textureGenerationModeX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextureGenerationModeX() {
        return textureGenerationModeX;
    }

    /**
     * Sets the value of the textureGenerationModeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextureGenerationModeX(String value) {
        this.textureGenerationModeX = value;
    }

    /**
     * Gets the value of the textureGenerationModeY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextureGenerationModeY() {
        return textureGenerationModeY;
    }

    /**
     * Sets the value of the textureGenerationModeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextureGenerationModeY(String value) {
        this.textureGenerationModeY = value;
    }

    /**
     * Gets the value of the textureKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextureKind() {
        return textureKind;
    }

    /**
     * Sets the value of the textureKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextureKind(String value) {
        this.textureKind = value;
    }

    /**
     * Gets the value of the textureFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextureFilter() {
        return textureFilter;
    }

    /**
     * Sets the value of the textureFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextureFilter(String value) {
        this.textureFilter = value;
    }

    /**
     * Gets the value of the textureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextureMode() {
        return textureMode;
    }

    /**
     * Sets the value of the textureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextureMode(String value) {
        this.textureMode = value;
    }

    /**
     * Gets the value of the ambientColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbientColor() {
        return ambientColor;
    }

    /**
     * Sets the value of the ambientColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbientColor(String value) {
        this.ambientColor = value;
    }

    /**
     * Gets the value of the emissiveColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissiveColor() {
        return emissiveColor;
    }

    /**
     * Sets the value of the emissiveColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissiveColor(String value) {
        this.emissiveColor = value;
    }

    /**
     * Gets the value of the specularColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecularColor() {
        return specularColor;
    }

    /**
     * Sets the value of the specularColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecularColor(String value) {
        this.specularColor = value;
    }

    /**
     * Gets the value of the diffuseColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffuseColor() {
        return diffuseColor;
    }

    /**
     * Sets the value of the diffuseColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffuseColor(String value) {
        this.diffuseColor = value;
    }

    /**
     * Gets the value of the shininess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShininess() {
        return shininess;
    }

    /**
     * Sets the value of the shininess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShininess(String value) {
        this.shininess = value;
    }

    /**
     * Gets the value of the dr3DShadow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDr3DShadow() {
        return dr3DShadow;
    }

    /**
     * Sets the value of the dr3DShadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDr3DShadow(String value) {
        this.dr3DShadow = value;
    }

    /**
     * Gets the value of the minWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinWidth() {
        return minWidth;
    }

    /**
     * Sets the value of the minWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinWidth(String value) {
        this.minWidth = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxHeight(String value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWidth(String value) {
        this.maxWidth = value;
    }

    /**
     * Gets the value of the printContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrintContent() {
        return printContent;
    }

    /**
     * Sets the value of the printContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintContent(Boolean value) {
        this.printContent = value;
    }

    /**
     * Gets the value of the horizontalPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalPos() {
        return horizontalPos;
    }

    /**
     * Sets the value of the horizontalPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalPos(String value) {
        this.horizontalPos = value;
    }

    /**
     * Gets the value of the horizontalRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalRel() {
        return horizontalRel;
    }

    /**
     * Sets the value of the horizontalRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalRel(String value) {
        this.horizontalRel = value;
    }

    /**
     * Gets the value of the wrap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrap() {
        return wrap;
    }

    /**
     * Sets the value of the wrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrap(String value) {
        this.wrap = value;
    }

    /**
     * Gets the value of the wrapDynamicThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapDynamicThreshold() {
        return wrapDynamicThreshold;
    }

    /**
     * Sets the value of the wrapDynamicThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapDynamicThreshold(String value) {
        this.wrapDynamicThreshold = value;
    }

    /**
     * Gets the value of the numberWrappedParagraphs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberWrappedParagraphs() {
        return numberWrappedParagraphs;
    }

    /**
     * Sets the value of the numberWrappedParagraphs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberWrappedParagraphs(String value) {
        this.numberWrappedParagraphs = value;
    }

    /**
     * Gets the value of the wrapContour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWrapContour() {
        return wrapContour;
    }

    /**
     * Sets the value of the wrapContour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrapContour(Boolean value) {
        this.wrapContour = value;
    }

    /**
     * Gets the value of the wrapContourMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapContourMode() {
        return wrapContourMode;
    }

    /**
     * Sets the value of the wrapContourMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapContourMode(String value) {
        this.wrapContourMode = value;
    }

    /**
     * Gets the value of the runThrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunThrough() {
        return runThrough;
    }

    /**
     * Sets the value of the runThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunThrough(String value) {
        this.runThrough = value;
    }

    /**
     * Gets the value of the flowWithText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFlowWithText() {
        return flowWithText;
    }

    /**
     * Sets the value of the flowWithText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlowWithText(Boolean value) {
        this.flowWithText = value;
    }

    /**
     * Gets the value of the overflowBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverflowBehavior() {
        return overflowBehavior;
    }

    /**
     * Sets the value of the overflowBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverflowBehavior(String value) {
        this.overflowBehavior = value;
    }

    /**
     * Gets the value of the mirror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mirror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMirror().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMirror() {
        if (mirror == null) {
            mirror = new ArrayList<String>();
        }
        return this.mirror;
    }

    /**
     * Gets the value of the clip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClip() {
        return clip;
    }

    /**
     * Sets the value of the clip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClip(String value) {
        this.clip = value;
    }

    /**
     * Gets the value of the wrapInfluenceOnPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapInfluenceOnPosition() {
        return wrapInfluenceOnPosition;
    }

    /**
     * Sets the value of the wrapInfluenceOnPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapInfluenceOnPosition(String value) {
        this.wrapInfluenceOnPosition = value;
    }

    /**
     * Gets the value of the frameDisplayScrollbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFrameDisplayScrollbar() {
        return frameDisplayScrollbar;
    }

    /**
     * Sets the value of the frameDisplayScrollbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrameDisplayScrollbar(Boolean value) {
        this.frameDisplayScrollbar = value;
    }

    /**
     * Gets the value of the frameDisplayBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFrameDisplayBorder() {
        return frameDisplayBorder;
    }

    /**
     * Sets the value of the frameDisplayBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrameDisplayBorder(Boolean value) {
        this.frameDisplayBorder = value;
    }

    /**
     * Gets the value of the frameMarginHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameMarginHorizontal() {
        return frameMarginHorizontal;
    }

    /**
     * Sets the value of the frameMarginHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameMarginHorizontal(String value) {
        this.frameMarginHorizontal = value;
    }

    /**
     * Gets the value of the frameMarginVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameMarginVertical() {
        return frameMarginVertical;
    }

    /**
     * Sets the value of the frameMarginVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameMarginVertical(String value) {
        this.frameMarginVertical = value;
    }

    /**
     * Gets the value of the visibleAreaLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleAreaLeft() {
        return visibleAreaLeft;
    }

    /**
     * Sets the value of the visibleAreaLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleAreaLeft(String value) {
        this.visibleAreaLeft = value;
    }

    /**
     * Gets the value of the visibleAreaTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleAreaTop() {
        return visibleAreaTop;
    }

    /**
     * Sets the value of the visibleAreaTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleAreaTop(String value) {
        this.visibleAreaTop = value;
    }

    /**
     * Gets the value of the visibleAreaWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleAreaWidth() {
        return visibleAreaWidth;
    }

    /**
     * Sets the value of the visibleAreaWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleAreaWidth(String value) {
        this.visibleAreaWidth = value;
    }

    /**
     * Gets the value of the visibleAreaHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleAreaHeight() {
        return visibleAreaHeight;
    }

    /**
     * Sets the value of the visibleAreaHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleAreaHeight(String value) {
        this.visibleAreaHeight = value;
    }

    /**
     * Gets the value of the drawAspect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawAspect() {
        return drawAspect;
    }

    /**
     * Sets the value of the drawAspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawAspect(String value) {
        this.drawAspect = value;
    }

    /**
     * Gets the value of the oleDrawAspect property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOleDrawAspect() {
        return oleDrawAspect;
    }

    /**
     * Sets the value of the oleDrawAspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOleDrawAspect(BigInteger value) {
        this.oleDrawAspect = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the shadow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadow() {
        return shadow;
    }

    /**
     * Sets the value of the shadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadow(String value) {
        this.shadow = value;
    }

    /**
     * Gets the value of the relHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelHeight() {
        return relHeight;
    }

    /**
     * Sets the value of the relHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelHeight(String value) {
        this.relHeight = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the relWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelWidth() {
        return relWidth;
    }

    /**
     * Sets the value of the relWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelWidth(String value) {
        this.relWidth = value;
    }

    /**
     * Gets the value of the protect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the protect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProtect() {
        if (protect == null) {
            protect = new ArrayList<String>();
        }
        return this.protect;
    }

    /**
     * Gets the value of the verticalPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalPos() {
        return verticalPos;
    }

    /**
     * Sets the value of the verticalPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalPos(String value) {
        this.verticalPos = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the backgroundTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundTransparency() {
        return backgroundTransparency;
    }

    /**
     * Sets the value of the backgroundTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundTransparency(String value) {
        this.backgroundTransparency = value;
    }

    /**
     * Gets the value of the marginRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginRight() {
        return marginRight;
    }

    /**
     * Sets the value of the marginRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginRight(String value) {
        this.marginRight = value;
    }

    /**
     * Gets the value of the marginLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginLeft() {
        return marginLeft;
    }

    /**
     * Sets the value of the marginLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginLeft(String value) {
        this.marginLeft = value;
    }

    /**
     * Gets the value of the verticalRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalRel() {
        return verticalRel;
    }

    /**
     * Sets the value of the verticalRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalRel(String value) {
        this.verticalRel = value;
    }

    /**
     * Gets the value of the anchorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorType() {
        return anchorType;
    }

    /**
     * Sets the value of the anchorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorType(String value) {
        this.anchorType = value;
    }

    /**
     * Gets the value of the anchorPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnchorPageNumber() {
        return anchorPageNumber;
    }

    /**
     * Sets the value of the anchorPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnchorPageNumber(BigInteger value) {
        this.anchorPageNumber = value;
    }

    /**
     * Gets the value of the marginTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginTop() {
        return marginTop;
    }

    /**
     * Sets the value of the marginTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginTop(String value) {
        this.marginTop = value;
    }

    /**
     * Gets the value of the marginBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginBottom() {
        return marginBottom;
    }

    /**
     * Sets the value of the marginBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginBottom(String value) {
        this.marginBottom = value;
    }

    /**
     * Gets the value of the borderLineWidth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidth() {
        if (borderLineWidth == null) {
            borderLineWidth = new ArrayList<String>();
        }
        return this.borderLineWidth;
    }

    /**
     * Gets the value of the borderLineWidthTop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthTop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthTop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthTop() {
        if (borderLineWidthTop == null) {
            borderLineWidthTop = new ArrayList<String>();
        }
        return this.borderLineWidthTop;
    }

    /**
     * Gets the value of the borderLineWidthBottom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthBottom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthBottom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthBottom() {
        if (borderLineWidthBottom == null) {
            borderLineWidthBottom = new ArrayList<String>();
        }
        return this.borderLineWidthBottom;
    }

    /**
     * Gets the value of the borderLineWidthLeft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthLeft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthLeft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthLeft() {
        if (borderLineWidthLeft == null) {
            borderLineWidthLeft = new ArrayList<String>();
        }
        return this.borderLineWidthLeft;
    }

    /**
     * Gets the value of the borderLineWidthRight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderLineWidthRight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderLineWidthRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderLineWidthRight() {
        if (borderLineWidthRight == null) {
            borderLineWidthRight = new ArrayList<String>();
        }
        return this.borderLineWidthRight;
    }

    /**
     * Gets the value of the writingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritingMode() {
        return writingMode;
    }

    /**
     * Sets the value of the writingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritingMode(String value) {
        this.writingMode = value;
    }

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Gets the value of the paddingTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingTop() {
        return paddingTop;
    }

    /**
     * Sets the value of the paddingTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingTop(String value) {
        this.paddingTop = value;
    }

    /**
     * Gets the value of the paddingBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingBottom() {
        return paddingBottom;
    }

    /**
     * Sets the value of the paddingBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingBottom(String value) {
        this.paddingBottom = value;
    }

    /**
     * Gets the value of the paddingLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingLeft() {
        return paddingLeft;
    }

    /**
     * Sets the value of the paddingLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingLeft(String value) {
        this.paddingLeft = value;
    }

    /**
     * Gets the value of the paddingRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingRight() {
        return paddingRight;
    }

    /**
     * Sets the value of the paddingRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingRight(String value) {
        this.paddingRight = value;
    }

    /**
     * Gets the value of the lightingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightingMode() {
        return lightingMode;
    }

    /**
     * Sets the value of the lightingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightingMode(String value) {
        this.lightingMode = value;
    }

    /**
     * Gets the value of the minHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHeight() {
        return minHeight;
    }

    /**
     * Sets the value of the minHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHeight(String value) {
        this.minHeight = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the borderTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTop() {
        return borderTop;
    }

    /**
     * Sets the value of the borderTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTop(String value) {
        this.borderTop = value;
    }

    /**
     * Gets the value of the borderBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottom() {
        return borderBottom;
    }

    /**
     * Sets the value of the borderBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottom(String value) {
        this.borderBottom = value;
    }

    /**
     * Gets the value of the borderLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeft() {
        return borderLeft;
    }

    /**
     * Sets the value of the borderLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeft(String value) {
        this.borderLeft = value;
    }

    /**
     * Gets the value of the borderRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRight() {
        return borderRight;
    }

    /**
     * Sets the value of the borderRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRight(String value) {
        this.borderRight = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMargin(String value) {
        this.margin = value;
    }

}
