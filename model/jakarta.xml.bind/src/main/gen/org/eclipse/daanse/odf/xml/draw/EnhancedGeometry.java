
package org.eclipse.daanse.odf.xml.draw;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}equation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}handle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-enhanced-geometry-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equation",
    "handle"
})
@XmlRootElement(name = "enhanced-geometry")
public class EnhancedGeometry {

    protected List<Equation> equation;
    protected List<Handle> handle;
    @XmlAttribute(name = "viewBox", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0")
    protected List<String> viewBox;
    @XmlAttribute(name = "mirror-vertical", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean mirrorVertical;
    @XmlAttribute(name = "mirror-horizontal", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean mirrorHorizontal;
    @XmlAttribute(name = "text-rotate-angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String textRotateAngle;
    @XmlAttribute(name = "extrusion-allowed", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean extrusionAllowed;
    @XmlAttribute(name = "text-path-allowed", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean textPathAllowed;
    @XmlAttribute(name = "concentric-gradient-fill-allowed", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean concentricGradientFillAllowed;
    @XmlAttribute(name = "extrusion", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean extrusion;
    @XmlAttribute(name = "extrusion-brightness", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionBrightness;
    @XmlAttribute(name = "extrusion-depth", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> extrusionDepth;
    @XmlAttribute(name = "extrusion-diffusion", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionDiffusion;
    @XmlAttribute(name = "extrusion-number-of-line-segments", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger extrusionNumberOfLineSegments;
    @XmlAttribute(name = "extrusion-light-face", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean extrusionLightFace;
    @XmlAttribute(name = "extrusion-first-light-harsh", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean extrusionFirstLightHarsh;
    @XmlAttribute(name = "extrusion-second-light-harsh", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean extrusionSecondLightHarsh;
    @XmlAttribute(name = "extrusion-first-light-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionFirstLightLevel;
    @XmlAttribute(name = "extrusion-second-light-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionSecondLightLevel;
    @XmlAttribute(name = "extrusion-first-light-direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionFirstLightDirection;
    @XmlAttribute(name = "extrusion-second-light-direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionSecondLightDirection;
    @XmlAttribute(name = "extrusion-metal", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean extrusionMetal;
    @XmlAttribute(name = "shade-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shadeMode;
    @XmlAttribute(name = "extrusion-rotation-angle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> extrusionRotationAngle;
    @XmlAttribute(name = "extrusion-rotation-center", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionRotationCenter;
    @XmlAttribute(name = "extrusion-shininess", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionShininess;
    @XmlAttribute(name = "extrusion-skew", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> extrusionSkew;
    @XmlAttribute(name = "extrusion-specularity", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionSpecularity;
    @XmlAttribute(name = "projection", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String projection;
    @XmlAttribute(name = "extrusion-viewpoint", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String extrusionViewpoint;
    @XmlAttribute(name = "extrusion-origin", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> extrusionOrigin;
    @XmlAttribute(name = "extrusion-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean extrusionColor;
    @XmlAttribute(name = "enhanced-path", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String enhancedPath;
    @XmlAttribute(name = "path-stretchpoint-x", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Double pathStretchpointX;
    @XmlAttribute(name = "path-stretchpoint-y", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Double pathStretchpointY;
    @XmlAttribute(name = "text-areas", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String textAreas;
    @XmlAttribute(name = "glue-points", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String gluePoints;
    @XmlAttribute(name = "glue-point-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gluePointType;
    @XmlAttribute(name = "glue-point-leaving-directions", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String gluePointLeavingDirections;
    @XmlAttribute(name = "text-path", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean textPath;
    @XmlAttribute(name = "text-path-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textPathMode;
    @XmlAttribute(name = "text-path-scale", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textPathScale;
    @XmlAttribute(name = "text-path-same-letter-heights", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected Boolean textPathSameLetterHeights;
    @XmlAttribute(name = "modifiers", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String modifiers;
    @XmlAttribute(name = "type", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    protected String type;

    /**
     * Gets the value of the equation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the equation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equation }
     * 
     * 
     */
    public List<Equation> getEquation() {
        if (equation == null) {
            equation = new ArrayList<Equation>();
        }
        return this.equation;
    }

    /**
     * Gets the value of the handle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the handle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Handle }
     * 
     * 
     */
    public List<Handle> getHandle() {
        if (handle == null) {
            handle = new ArrayList<Handle>();
        }
        return this.handle;
    }

    /**
     * Gets the value of the viewBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the viewBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getViewBox() {
        if (viewBox == null) {
            viewBox = new ArrayList<String>();
        }
        return this.viewBox;
    }

    /**
     * Gets the value of the mirrorVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMirrorVertical() {
        return mirrorVertical;
    }

    /**
     * Sets the value of the mirrorVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMirrorVertical(Boolean value) {
        this.mirrorVertical = value;
    }

    /**
     * Gets the value of the mirrorHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMirrorHorizontal() {
        return mirrorHorizontal;
    }

    /**
     * Sets the value of the mirrorHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMirrorHorizontal(Boolean value) {
        this.mirrorHorizontal = value;
    }

    /**
     * Gets the value of the textRotateAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextRotateAngle() {
        return textRotateAngle;
    }

    /**
     * Sets the value of the textRotateAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextRotateAngle(String value) {
        this.textRotateAngle = value;
    }

    /**
     * Gets the value of the extrusionAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtrusionAllowed() {
        return extrusionAllowed;
    }

    /**
     * Sets the value of the extrusionAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusionAllowed(Boolean value) {
        this.extrusionAllowed = value;
    }

    /**
     * Gets the value of the textPathAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTextPathAllowed() {
        return textPathAllowed;
    }

    /**
     * Sets the value of the textPathAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextPathAllowed(Boolean value) {
        this.textPathAllowed = value;
    }

    /**
     * Gets the value of the concentricGradientFillAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getConcentricGradientFillAllowed() {
        return concentricGradientFillAllowed;
    }

    /**
     * Sets the value of the concentricGradientFillAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcentricGradientFillAllowed(Boolean value) {
        this.concentricGradientFillAllowed = value;
    }

    /**
     * Gets the value of the extrusion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtrusion() {
        return extrusion;
    }

    /**
     * Sets the value of the extrusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusion(Boolean value) {
        this.extrusion = value;
    }

    /**
     * Gets the value of the extrusionBrightness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionBrightness() {
        return extrusionBrightness;
    }

    /**
     * Sets the value of the extrusionBrightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionBrightness(String value) {
        this.extrusionBrightness = value;
    }

    /**
     * Gets the value of the extrusionDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extrusionDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrusionDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtrusionDepth() {
        if (extrusionDepth == null) {
            extrusionDepth = new ArrayList<String>();
        }
        return this.extrusionDepth;
    }

    /**
     * Gets the value of the extrusionDiffusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionDiffusion() {
        return extrusionDiffusion;
    }

    /**
     * Sets the value of the extrusionDiffusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionDiffusion(String value) {
        this.extrusionDiffusion = value;
    }

    /**
     * Gets the value of the extrusionNumberOfLineSegments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtrusionNumberOfLineSegments() {
        return extrusionNumberOfLineSegments;
    }

    /**
     * Sets the value of the extrusionNumberOfLineSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtrusionNumberOfLineSegments(BigInteger value) {
        this.extrusionNumberOfLineSegments = value;
    }

    /**
     * Gets the value of the extrusionLightFace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtrusionLightFace() {
        return extrusionLightFace;
    }

    /**
     * Sets the value of the extrusionLightFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusionLightFace(Boolean value) {
        this.extrusionLightFace = value;
    }

    /**
     * Gets the value of the extrusionFirstLightHarsh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtrusionFirstLightHarsh() {
        return extrusionFirstLightHarsh;
    }

    /**
     * Sets the value of the extrusionFirstLightHarsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusionFirstLightHarsh(Boolean value) {
        this.extrusionFirstLightHarsh = value;
    }

    /**
     * Gets the value of the extrusionSecondLightHarsh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtrusionSecondLightHarsh() {
        return extrusionSecondLightHarsh;
    }

    /**
     * Sets the value of the extrusionSecondLightHarsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusionSecondLightHarsh(Boolean value) {
        this.extrusionSecondLightHarsh = value;
    }

    /**
     * Gets the value of the extrusionFirstLightLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionFirstLightLevel() {
        return extrusionFirstLightLevel;
    }

    /**
     * Sets the value of the extrusionFirstLightLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionFirstLightLevel(String value) {
        this.extrusionFirstLightLevel = value;
    }

    /**
     * Gets the value of the extrusionSecondLightLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionSecondLightLevel() {
        return extrusionSecondLightLevel;
    }

    /**
     * Sets the value of the extrusionSecondLightLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionSecondLightLevel(String value) {
        this.extrusionSecondLightLevel = value;
    }

    /**
     * Gets the value of the extrusionFirstLightDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionFirstLightDirection() {
        return extrusionFirstLightDirection;
    }

    /**
     * Sets the value of the extrusionFirstLightDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionFirstLightDirection(String value) {
        this.extrusionFirstLightDirection = value;
    }

    /**
     * Gets the value of the extrusionSecondLightDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionSecondLightDirection() {
        return extrusionSecondLightDirection;
    }

    /**
     * Sets the value of the extrusionSecondLightDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionSecondLightDirection(String value) {
        this.extrusionSecondLightDirection = value;
    }

    /**
     * Gets the value of the extrusionMetal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtrusionMetal() {
        return extrusionMetal;
    }

    /**
     * Sets the value of the extrusionMetal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusionMetal(Boolean value) {
        this.extrusionMetal = value;
    }

    /**
     * Gets the value of the shadeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadeMode() {
        return shadeMode;
    }

    /**
     * Sets the value of the shadeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadeMode(String value) {
        this.shadeMode = value;
    }

    /**
     * Gets the value of the extrusionRotationAngle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extrusionRotationAngle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrusionRotationAngle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtrusionRotationAngle() {
        if (extrusionRotationAngle == null) {
            extrusionRotationAngle = new ArrayList<String>();
        }
        return this.extrusionRotationAngle;
    }

    /**
     * Gets the value of the extrusionRotationCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionRotationCenter() {
        return extrusionRotationCenter;
    }

    /**
     * Sets the value of the extrusionRotationCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionRotationCenter(String value) {
        this.extrusionRotationCenter = value;
    }

    /**
     * Gets the value of the extrusionShininess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionShininess() {
        return extrusionShininess;
    }

    /**
     * Sets the value of the extrusionShininess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionShininess(String value) {
        this.extrusionShininess = value;
    }

    /**
     * Gets the value of the extrusionSkew property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extrusionSkew property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrusionSkew().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtrusionSkew() {
        if (extrusionSkew == null) {
            extrusionSkew = new ArrayList<String>();
        }
        return this.extrusionSkew;
    }

    /**
     * Gets the value of the extrusionSpecularity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionSpecularity() {
        return extrusionSpecularity;
    }

    /**
     * Sets the value of the extrusionSpecularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionSpecularity(String value) {
        this.extrusionSpecularity = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjection(String value) {
        this.projection = value;
    }

    /**
     * Gets the value of the extrusionViewpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionViewpoint() {
        return extrusionViewpoint;
    }

    /**
     * Sets the value of the extrusionViewpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionViewpoint(String value) {
        this.extrusionViewpoint = value;
    }

    /**
     * Gets the value of the extrusionOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extrusionOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrusionOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtrusionOrigin() {
        if (extrusionOrigin == null) {
            extrusionOrigin = new ArrayList<String>();
        }
        return this.extrusionOrigin;
    }

    /**
     * Gets the value of the extrusionColor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExtrusionColor() {
        return extrusionColor;
    }

    /**
     * Sets the value of the extrusionColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusionColor(Boolean value) {
        this.extrusionColor = value;
    }

    /**
     * Gets the value of the enhancedPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedPath() {
        return enhancedPath;
    }

    /**
     * Sets the value of the enhancedPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedPath(String value) {
        this.enhancedPath = value;
    }

    /**
     * Gets the value of the pathStretchpointX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPathStretchpointX() {
        return pathStretchpointX;
    }

    /**
     * Sets the value of the pathStretchpointX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPathStretchpointX(Double value) {
        this.pathStretchpointX = value;
    }

    /**
     * Gets the value of the pathStretchpointY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPathStretchpointY() {
        return pathStretchpointY;
    }

    /**
     * Sets the value of the pathStretchpointY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPathStretchpointY(Double value) {
        this.pathStretchpointY = value;
    }

    /**
     * Gets the value of the textAreas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAreas() {
        return textAreas;
    }

    /**
     * Sets the value of the textAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAreas(String value) {
        this.textAreas = value;
    }

    /**
     * Gets the value of the gluePoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGluePoints() {
        return gluePoints;
    }

    /**
     * Sets the value of the gluePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGluePoints(String value) {
        this.gluePoints = value;
    }

    /**
     * Gets the value of the gluePointType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGluePointType() {
        return gluePointType;
    }

    /**
     * Sets the value of the gluePointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGluePointType(String value) {
        this.gluePointType = value;
    }

    /**
     * Gets the value of the gluePointLeavingDirections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGluePointLeavingDirections() {
        return gluePointLeavingDirections;
    }

    /**
     * Sets the value of the gluePointLeavingDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGluePointLeavingDirections(String value) {
        this.gluePointLeavingDirections = value;
    }

    /**
     * Gets the value of the textPath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTextPath() {
        return textPath;
    }

    /**
     * Sets the value of the textPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextPath(Boolean value) {
        this.textPath = value;
    }

    /**
     * Gets the value of the textPathMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextPathMode() {
        return textPathMode;
    }

    /**
     * Sets the value of the textPathMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextPathMode(String value) {
        this.textPathMode = value;
    }

    /**
     * Gets the value of the textPathScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextPathScale() {
        return textPathScale;
    }

    /**
     * Sets the value of the textPathScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextPathScale(String value) {
        this.textPathScale = value;
    }

    /**
     * Gets the value of the textPathSameLetterHeights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTextPathSameLetterHeights() {
        return textPathSameLetterHeights;
    }

    /**
     * Sets the value of the textPathSameLetterHeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextPathSameLetterHeights(Boolean value) {
        this.textPathSameLetterHeights = value;
    }

    /**
     * Gets the value of the modifiers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiers() {
        return modifiers;
    }

    /**
     * Sets the value of the modifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiers(String value) {
        this.modifiers = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
