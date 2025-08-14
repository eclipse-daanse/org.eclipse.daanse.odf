
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-font-face-decls"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-styles"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-automatic-styles"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-master-styles"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-document-common-attrs"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fontFaceDecls",
    "styles",
    "automaticStyles",
    "masterStyles"
})
@XmlRootElement(name = "document-styles")
public class DocumentStyles {

    @XmlElement(name = "font-face-decls")
    protected FontFaceDecls fontFaceDecls;
    protected Styles styles;
    @XmlElement(name = "automatic-styles")
    protected AutomaticStyles automaticStyles;
    @XmlElement(name = "master-styles")
    protected MasterStyles masterStyles;
    @XmlAttribute(name = "version", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "transformation", namespace = "http://www.w3.org/2003/g/data-view#")
    protected List<String> transformation;

    /**
     * Gets the value of the fontFaceDecls property.
     * 
     * @return
     *     possible object is
     *     {@link FontFaceDecls }
     *     
     */
    public FontFaceDecls getFontFaceDecls() {
        return fontFaceDecls;
    }

    /**
     * Sets the value of the fontFaceDecls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFaceDecls }
     *     
     */
    public void setFontFaceDecls(FontFaceDecls value) {
        this.fontFaceDecls = value;
    }

    /**
     * Gets the value of the styles property.
     * 
     * @return
     *     possible object is
     *     {@link Styles }
     *     
     */
    public Styles getStyles() {
        return styles;
    }

    /**
     * Sets the value of the styles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Styles }
     *     
     */
    public void setStyles(Styles value) {
        this.styles = value;
    }

    /**
     * Gets the value of the automaticStyles property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticStyles }
     *     
     */
    public AutomaticStyles getAutomaticStyles() {
        return automaticStyles;
    }

    /**
     * Sets the value of the automaticStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticStyles }
     *     
     */
    public void setAutomaticStyles(AutomaticStyles value) {
        this.automaticStyles = value;
    }

    /**
     * Gets the value of the masterStyles property.
     * 
     * @return
     *     possible object is
     *     {@link MasterStyles }
     *     
     */
    public MasterStyles getMasterStyles() {
        return masterStyles;
    }

    /**
     * Sets the value of the masterStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterStyles }
     *     
     */
    public void setMasterStyles(MasterStyles value) {
        this.masterStyles = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the transformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransformation() {
        if (transformation == null) {
            transformation = new ArrayList<String>();
        }
        return this.transformation;
    }

}
