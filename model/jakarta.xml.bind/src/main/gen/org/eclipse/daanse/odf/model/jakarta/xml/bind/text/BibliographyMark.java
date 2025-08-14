
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="bibliography-type" use="required" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-bibliography-types" /&gt;
 *       &lt;attribute name="identifier" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="address" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="annote" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="author" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="booktitle" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="chapter" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="edition" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="editor" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="howpublished" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="institution" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="journal" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="month" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="note" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="number" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="organizations" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="pages" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="publisher" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="school" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="series" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="title" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="report-type" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="volume" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="year" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="url" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="custom1" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="custom2" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="custom3" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="custom4" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="custom5" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="isbn" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *       &lt;attribute name="issn" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "bibliography-mark")
public class BibliographyMark {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "bibliography-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected TextBibliographyTypes bibliographyType;
    @XmlAttribute(name = "identifier", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String identifier;
    @XmlAttribute(name = "address", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String address;
    @XmlAttribute(name = "annote", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String annote;
    @XmlAttribute(name = "author", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String author;
    @XmlAttribute(name = "booktitle", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String booktitle;
    @XmlAttribute(name = "chapter", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String chapter;
    @XmlAttribute(name = "edition", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String edition;
    @XmlAttribute(name = "editor", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String editor;
    @XmlAttribute(name = "howpublished", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String howpublished;
    @XmlAttribute(name = "institution", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String institution;
    @XmlAttribute(name = "journal", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String journal;
    @XmlAttribute(name = "month", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String month;
    @XmlAttribute(name = "note", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String note;
    @XmlAttribute(name = "number", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String number;
    @XmlAttribute(name = "organizations", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String organizations;
    @XmlAttribute(name = "pages", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String pages;
    @XmlAttribute(name = "publisher", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String publisher;
    @XmlAttribute(name = "school", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String school;
    @XmlAttribute(name = "series", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String series;
    @XmlAttribute(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String title;
    @XmlAttribute(name = "report-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String reportType;
    @XmlAttribute(name = "volume", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String volume;
    @XmlAttribute(name = "year", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String year;
    @XmlAttribute(name = "url", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String url;
    @XmlAttribute(name = "custom1", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String custom1;
    @XmlAttribute(name = "custom2", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String custom2;
    @XmlAttribute(name = "custom3", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String custom3;
    @XmlAttribute(name = "custom4", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String custom4;
    @XmlAttribute(name = "custom5", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String custom5;
    @XmlAttribute(name = "isbn", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String isbn;
    @XmlAttribute(name = "issn", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String issn;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the bibliographyType property.
     * 
     * @return
     *     possible object is
     *     {@link TextBibliographyTypes }
     *     
     */
    public TextBibliographyTypes getBibliographyType() {
        return bibliographyType;
    }

    /**
     * Sets the value of the bibliographyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextBibliographyTypes }
     *     
     */
    public void setBibliographyType(TextBibliographyTypes value) {
        this.bibliographyType = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the annote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnote() {
        return annote;
    }

    /**
     * Sets the value of the annote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnote(String value) {
        this.annote = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the booktitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooktitle() {
        return booktitle;
    }

    /**
     * Sets the value of the booktitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooktitle(String value) {
        this.booktitle = value;
    }

    /**
     * Gets the value of the chapter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * Sets the value of the chapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapter(String value) {
        this.chapter = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the editor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditor() {
        return editor;
    }

    /**
     * Sets the value of the editor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditor(String value) {
        this.editor = value;
    }

    /**
     * Gets the value of the howpublished property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowpublished() {
        return howpublished;
    }

    /**
     * Sets the value of the howpublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowpublished(String value) {
        this.howpublished = value;
    }

    /**
     * Gets the value of the institution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * Sets the value of the institution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitution(String value) {
        this.institution = value;
    }

    /**
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournal(String value) {
        this.journal = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizations(String value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPages(String value) {
        this.pages = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool(String value) {
        this.school = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the custom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * Sets the value of the custom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom1(String value) {
        this.custom1 = value;
    }

    /**
     * Gets the value of the custom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * Sets the value of the custom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom2(String value) {
        this.custom2 = value;
    }

    /**
     * Gets the value of the custom3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * Sets the value of the custom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom3(String value) {
        this.custom3 = value;
    }

    /**
     * Gets the value of the custom4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom4() {
        return custom4;
    }

    /**
     * Sets the value of the custom4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom4(String value) {
        this.custom4 = value;
    }

    /**
     * Gets the value of the custom5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom5() {
        return custom5;
    }

    /**
     * Sets the value of the custom5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom5(String value) {
        this.custom5 = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssn() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssn(String value) {
        this.issn = value;
    }

}
