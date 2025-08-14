
package org.eclipse.daanse.odf.xml.text;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}note-citation"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}note-body"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-note-class"/&gt;
 *       &lt;attribute name="id" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "noteCitation",
    "noteBody"
})
@XmlRootElement(name = "note")
public class Note {

    @XmlElement(name = "note-citation", required = true)
    protected NoteCitation noteCitation;
    @XmlElement(name = "note-body", required = true)
    protected NoteBody noteBody;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String id;
    @XmlAttribute(name = "note-class", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String noteClass;

    /**
     * Gets the value of the noteCitation property.
     * 
     * @return
     *     possible object is
     *     {@link NoteCitation }
     *     
     */
    public NoteCitation getNoteCitation() {
        return noteCitation;
    }

    /**
     * Sets the value of the noteCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteCitation }
     *     
     */
    public void setNoteCitation(NoteCitation value) {
        this.noteCitation = value;
    }

    /**
     * Gets the value of the noteBody property.
     * 
     * @return
     *     possible object is
     *     {@link NoteBody }
     *     
     */
    public NoteBody getNoteBody() {
        return noteBody;
    }

    /**
     * Sets the value of the noteBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteBody }
     *     
     */
    public void setNoteBody(NoteBody value) {
        this.noteBody = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the noteClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteClass() {
        return noteClass;
    }

    /**
     * Sets the value of the noteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteClass(String value) {
        this.noteClass = value;
    }

}
