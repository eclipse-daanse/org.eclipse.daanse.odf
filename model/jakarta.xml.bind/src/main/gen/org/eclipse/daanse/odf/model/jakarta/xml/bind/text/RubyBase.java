
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.dr3d.Scene;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Caption;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Circle;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Connector;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Control;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.CustomShape;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Ellipse;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Frame;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.G;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Line;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.PageThumbnail;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Path;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Polygon;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Polyline;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Rect;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.RegularPolygon;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Annotation;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.AnnotationEnd;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.presentation.DateTime;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.presentation.Footer;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.presentation.Header;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}paragraph-content-or-hyperlink" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement(name = "ruby-base")
public class RubyBase {

    @XmlElementRefs({
        @XmlElementRef(name = "s", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = S.class, required = false),
        @XmlElementRef(name = "tab", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Tab.class, required = false),
        @XmlElementRef(name = "line-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = LineBreak.class, required = false),
        @XmlElementRef(name = "soft-page-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SoftPageBreak.class, required = false),
        @XmlElementRef(name = "span", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Span.class, required = false),
        @XmlElementRef(name = "meta", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Meta.class, required = false),
        @XmlElementRef(name = "bookmark", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Bookmark.class, required = false),
        @XmlElementRef(name = "bookmark-start", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = BookmarkStart.class, required = false),
        @XmlElementRef(name = "bookmark-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = BookmarkEnd.class, required = false),
        @XmlElementRef(name = "reference-mark", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ReferenceMark.class, required = false),
        @XmlElementRef(name = "reference-mark-start", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ReferenceMarkStart.class, required = false),
        @XmlElementRef(name = "reference-mark-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ReferenceMarkEnd.class, required = false),
        @XmlElementRef(name = "note", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Note.class, required = false),
        @XmlElementRef(name = "ruby", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Ruby.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", type = Annotation.class, required = false),
        @XmlElementRef(name = "annotation-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", type = AnnotationEnd.class, required = false),
        @XmlElementRef(name = "change-marks", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rect", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Rect.class, required = false),
        @XmlElementRef(name = "line", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Line.class, required = false),
        @XmlElementRef(name = "polyline", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polyline.class, required = false),
        @XmlElementRef(name = "polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polygon.class, required = false),
        @XmlElementRef(name = "regular-polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = RegularPolygon.class, required = false),
        @XmlElementRef(name = "path", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Path.class, required = false),
        @XmlElementRef(name = "circle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Circle.class, required = false),
        @XmlElementRef(name = "ellipse", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Ellipse.class, required = false),
        @XmlElementRef(name = "g", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = G.class, required = false),
        @XmlElementRef(name = "page-thumbnail", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = PageThumbnail.class, required = false),
        @XmlElementRef(name = "frame", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Frame.class, required = false),
        @XmlElementRef(name = "measure", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Measure.class, required = false),
        @XmlElementRef(name = "caption", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Caption.class, required = false),
        @XmlElementRef(name = "connector", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Connector.class, required = false),
        @XmlElementRef(name = "control", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Control.class, required = false),
        @XmlElementRef(name = "scene", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "custom-shape", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = CustomShape.class, required = false),
        @XmlElementRef(name = "a", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.A.class, required = false),
        @XmlElementRef(name = "date", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Date.class, required = false),
        @XmlElementRef(name = "time", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Time.class, required = false),
        @XmlElementRef(name = "page-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PageNumber.class, required = false),
        @XmlElementRef(name = "page-continuation", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PageContinuation.class, required = false),
        @XmlElementRef(name = "sender-firstname", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderFirstname.class, required = false),
        @XmlElementRef(name = "sender-lastname", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderLastname.class, required = false),
        @XmlElementRef(name = "sender-initials", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderInitials.class, required = false),
        @XmlElementRef(name = "sender-title", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderTitle.class, required = false),
        @XmlElementRef(name = "sender-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderPosition.class, required = false),
        @XmlElementRef(name = "sender-email", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderEmail.class, required = false),
        @XmlElementRef(name = "sender-phone-private", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderPhonePrivate.class, required = false),
        @XmlElementRef(name = "sender-fax", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderFax.class, required = false),
        @XmlElementRef(name = "sender-company", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderCompany.class, required = false),
        @XmlElementRef(name = "sender-phone-work", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderPhoneWork.class, required = false),
        @XmlElementRef(name = "sender-street", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderStreet.class, required = false),
        @XmlElementRef(name = "sender-city", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderCity.class, required = false),
        @XmlElementRef(name = "sender-postal-code", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderPostalCode.class, required = false),
        @XmlElementRef(name = "sender-country", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderCountry.class, required = false),
        @XmlElementRef(name = "sender-state-or-province", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SenderStateOrProvince.class, required = false),
        @XmlElementRef(name = "author-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AuthorName.class, required = false),
        @XmlElementRef(name = "author-initials", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AuthorInitials.class, required = false),
        @XmlElementRef(name = "chapter", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Chapter.class, required = false),
        @XmlElementRef(name = "file-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = FileName.class, required = false),
        @XmlElementRef(name = "template-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TemplateName.class, required = false),
        @XmlElementRef(name = "sheet-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variable-set", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = VariableSet.class, required = false),
        @XmlElementRef(name = "variable-get", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = VariableGet.class, required = false),
        @XmlElementRef(name = "variable-input", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = VariableInput.class, required = false),
        @XmlElementRef(name = "user-field-get", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserFieldGet.class, required = false),
        @XmlElementRef(name = "user-field-input", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserFieldInput.class, required = false),
        @XmlElementRef(name = "sequence", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Sequence.class, required = false),
        @XmlElementRef(name = "expression", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Expression.class, required = false),
        @XmlElementRef(name = "text-input", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TextInput.class, required = false),
        @XmlElementRef(name = "drop-down", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = DropDown.class, required = false),
        @XmlElementRef(name = "initial-creator", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = InitialCreator.class, required = false),
        @XmlElementRef(name = "creation-date", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = CreationDate.class, required = false),
        @XmlElementRef(name = "creation-time", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = CreationTime.class, required = false),
        @XmlElementRef(name = "description", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Description.class, required = false),
        @XmlElementRef(name = "user-defined", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserDefined.class, required = false),
        @XmlElementRef(name = "print-time", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PrintTime.class, required = false),
        @XmlElementRef(name = "print-date", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PrintDate.class, required = false),
        @XmlElementRef(name = "printed-by", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PrintedBy.class, required = false),
        @XmlElementRef(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Title.class, required = false),
        @XmlElementRef(name = "subject", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Subject.class, required = false),
        @XmlElementRef(name = "keywords", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Keywords.class, required = false),
        @XmlElementRef(name = "editing-cycles", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = EditingCycles.class, required = false),
        @XmlElementRef(name = "editing-duration", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = EditingDuration.class, required = false),
        @XmlElementRef(name = "modification-time", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ModificationTime.class, required = false),
        @XmlElementRef(name = "modification-date", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ModificationDate.class, required = false),
        @XmlElementRef(name = "creator", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Creator.class, required = false),
        @XmlElementRef(name = "page-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PageCount.class, required = false),
        @XmlElementRef(name = "paragraph-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ParagraphCount.class, required = false),
        @XmlElementRef(name = "word-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = WordCount.class, required = false),
        @XmlElementRef(name = "character-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = CharacterCount.class, required = false),
        @XmlElementRef(name = "table-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableCount.class, required = false),
        @XmlElementRef(name = "image-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ImageCount.class, required = false),
        @XmlElementRef(name = "object-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ObjectCount.class, required = false),
        @XmlElementRef(name = "database-display", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "database-next", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "database-row-select", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "database-row-number", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = DatabaseRowNumber.class, required = false),
        @XmlElementRef(name = "database-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = DatabaseName.class, required = false),
        @XmlElementRef(name = "page-variable-set", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PageVariableSet.class, required = false),
        @XmlElementRef(name = "page-variable-get", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = PageVariableGet.class, required = false),
        @XmlElementRef(name = "placeholder", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Placeholder.class, required = false),
        @XmlElementRef(name = "conditional-text", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ConditionalText.class, required = false),
        @XmlElementRef(name = "hidden-text", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = HiddenText.class, required = false),
        @XmlElementRef(name = "reference-ref", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ReferenceRef.class, required = false),
        @XmlElementRef(name = "bookmark-ref", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = BookmarkRef.class, required = false),
        @XmlElementRef(name = "note-ref", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = NoteRef.class, required = false),
        @XmlElementRef(name = "sequence-ref", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SequenceRef.class, required = false),
        @XmlElementRef(name = "script", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Script.class, required = false),
        @XmlElementRef(name = "execute-macro", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ExecuteMacro.class, required = false),
        @XmlElementRef(name = "hidden-paragraph", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = HiddenParagraph.class, required = false),
        @XmlElementRef(name = "dde-connection", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = DdeConnection.class, required = false),
        @XmlElementRef(name = "measure", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Measure.class, required = false),
        @XmlElementRef(name = "table-formula", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableFormula.class, required = false),
        @XmlElementRef(name = "meta-field", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = MetaField.class, required = false),
        @XmlElementRef(name = "toc-mark-start", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TocMarkStart.class, required = false),
        @XmlElementRef(name = "toc-mark-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TocMarkEnd.class, required = false),
        @XmlElementRef(name = "toc-mark", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TocMark.class, required = false),
        @XmlElementRef(name = "user-index-mark-start", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserIndexMarkStart.class, required = false),
        @XmlElementRef(name = "user-index-mark-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserIndexMarkEnd.class, required = false),
        @XmlElementRef(name = "user-index-mark", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserIndexMark.class, required = false),
        @XmlElementRef(name = "alphabetical-index-mark-start", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AlphabeticalIndexMarkStart.class, required = false),
        @XmlElementRef(name = "alphabetical-index-mark-end", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AlphabeticalIndexMarkEnd.class, required = false),
        @XmlElementRef(name = "alphabetical-index-mark", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AlphabeticalIndexMark.class, required = false),
        @XmlElementRef(name = "bibliography-mark", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = BibliographyMark.class, required = false),
        @XmlElementRef(name = "header", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", type = Header.class, required = false),
        @XmlElementRef(name = "footer", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", type = Footer.class, required = false),
        @XmlElementRef(name = "date-time", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", type = DateTime.class, required = false),
        @XmlElementRef(name = "a", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.text.A.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S }
     * {@link Tab }
     * {@link LineBreak }
     * {@link SoftPageBreak }
     * {@link Span }
     * {@link Meta }
     * {@link Bookmark }
     * {@link BookmarkStart }
     * {@link BookmarkEnd }
     * {@link ReferenceMark }
     * {@link ReferenceMarkStart }
     * {@link ReferenceMarkEnd }
     * {@link Note }
     * {@link Ruby }
     * {@link Annotation }
     * {@link AnnotationEnd }
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link Rect }
     * {@link Line }
     * {@link Polyline }
     * {@link Polygon }
     * {@link RegularPolygon }
     * {@link Path }
     * {@link Circle }
     * {@link Ellipse }
     * {@link G }
     * {@link PageThumbnail }
     * {@link Frame }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Measure }
     * {@link Caption }
     * {@link Connector }
     * {@link Control }
     * {@link JAXBElement }{@code <}{@link Scene }{@code >}
     * {@link CustomShape }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.A }
     * {@link Date }
     * {@link Time }
     * {@link PageNumber }
     * {@link PageContinuation }
     * {@link SenderFirstname }
     * {@link SenderLastname }
     * {@link SenderInitials }
     * {@link SenderTitle }
     * {@link SenderPosition }
     * {@link SenderEmail }
     * {@link SenderPhonePrivate }
     * {@link SenderFax }
     * {@link SenderCompany }
     * {@link SenderPhoneWork }
     * {@link SenderStreet }
     * {@link SenderCity }
     * {@link SenderPostalCode }
     * {@link SenderCountry }
     * {@link SenderStateOrProvince }
     * {@link AuthorName }
     * {@link AuthorInitials }
     * {@link Chapter }
     * {@link FileName }
     * {@link TemplateName }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link VariableSet }
     * {@link VariableGet }
     * {@link VariableInput }
     * {@link UserFieldGet }
     * {@link UserFieldInput }
     * {@link Sequence }
     * {@link Expression }
     * {@link TextInput }
     * {@link DropDown }
     * {@link InitialCreator }
     * {@link CreationDate }
     * {@link CreationTime }
     * {@link Description }
     * {@link UserDefined }
     * {@link PrintTime }
     * {@link PrintDate }
     * {@link PrintedBy }
     * {@link Title }
     * {@link Subject }
     * {@link Keywords }
     * {@link EditingCycles }
     * {@link EditingDuration }
     * {@link ModificationTime }
     * {@link ModificationDate }
     * {@link Creator }
     * {@link PageCount }
     * {@link ParagraphCount }
     * {@link WordCount }
     * {@link CharacterCount }
     * {@link TableCount }
     * {@link ImageCount }
     * {@link ObjectCount }
     * {@link JAXBElement }{@code <}{@link TextDatabaseDisplayAttlist }{@code >}
     * {@link JAXBElement }{@code <}{@link TextDatabaseNextAttlist }{@code >}
     * {@link JAXBElement }{@code <}{@link TextDatabaseRowSelectAttlist }{@code >}
     * {@link DatabaseRowNumber }
     * {@link DatabaseName }
     * {@link PageVariableSet }
     * {@link PageVariableGet }
     * {@link Placeholder }
     * {@link ConditionalText }
     * {@link HiddenText }
     * {@link ReferenceRef }
     * {@link BookmarkRef }
     * {@link NoteRef }
     * {@link SequenceRef }
     * {@link Script }
     * {@link ExecuteMacro }
     * {@link HiddenParagraph }
     * {@link DdeConnection }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Measure }
     * {@link TableFormula }
     * {@link MetaField }
     * {@link TocMarkStart }
     * {@link TocMarkEnd }
     * {@link TocMark }
     * {@link UserIndexMarkStart }
     * {@link UserIndexMarkEnd }
     * {@link UserIndexMark }
     * {@link AlphabeticalIndexMarkStart }
     * {@link AlphabeticalIndexMarkEnd }
     * {@link AlphabeticalIndexMark }
     * {@link BibliographyMark }
     * {@link Header }
     * {@link Footer }
     * {@link DateTime }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.A }
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
