
package org.eclipse.daanse.odf.xml.form;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.form package. 
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

    private final static QName _Text_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "text");
    private final static QName _Textarea_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "textarea");
    private final static QName _FormattedText_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "formatted-text");
    private final static QName _Number_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "number");
    private final static QName _Date_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "date");
    private final static QName _Time_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "time");
    private final static QName _Combobox_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "combobox");
    private final static QName _Listbox_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "listbox");
    private final static QName _Checkbox_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "checkbox");
    private final static QName _Password_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "password");
    private final static QName _File_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "file");
    private final static QName _FixedText_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "fixed-text");
    private final static QName _Button_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "button");
    private final static QName _Image_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "image");
    private final static QName _Radio_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "radio");
    private final static QName _Frame_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "frame");
    private final static QName _ImageFrame_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "image-frame");
    private final static QName _Hidden_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "hidden");
    private final static QName _Grid_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "grid");
    private final static QName _ValueRange_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "value-range");
    private final static QName _GenericControl_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "generic-control");
    private final static QName _Property_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "property");
    private final static QName _ListProperty_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:form:1.0", "list-property");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.form
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Form }
     * 
     */
    public Form createForm() {
        return new Form();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link ConnectionResource }
     * 
     */
    public ConnectionResource createConnectionResource() {
        return new ConnectionResource();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Textarea }
     * 
     */
    public Textarea createTextarea() {
        return new Textarea();
    }

    /**
     * Create an instance of {@link FormattedText }
     * 
     */
    public FormattedText createFormattedText() {
        return new FormattedText();
    }

    /**
     * Create an instance of {@link Number }
     * 
     */
    public Number createNumber() {
        return new Number();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Combobox }
     * 
     */
    public Combobox createCombobox() {
        return new Combobox();
    }

    /**
     * Create an instance of {@link Listbox }
     * 
     */
    public Listbox createListbox() {
        return new Listbox();
    }

    /**
     * Create an instance of {@link Checkbox }
     * 
     */
    public Checkbox createCheckbox() {
        return new Checkbox();
    }

    /**
     * Create an instance of {@link Password }
     * 
     */
    public Password createPassword() {
        return new Password();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link FixedText }
     * 
     */
    public FixedText createFixedText() {
        return new FixedText();
    }

    /**
     * Create an instance of {@link Button }
     * 
     */
    public Button createButton() {
        return new Button();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Radio }
     * 
     */
    public Radio createRadio() {
        return new Radio();
    }

    /**
     * Create an instance of {@link Frame }
     * 
     */
    public Frame createFrame() {
        return new Frame();
    }

    /**
     * Create an instance of {@link ImageFrame }
     * 
     */
    public ImageFrame createImageFrame() {
        return new ImageFrame();
    }

    /**
     * Create an instance of {@link Hidden }
     * 
     */
    public Hidden createHidden() {
        return new Hidden();
    }

    /**
     * Create an instance of {@link Grid }
     * 
     */
    public Grid createGrid() {
        return new Grid();
    }

    /**
     * Create an instance of {@link ValueRange }
     * 
     */
    public ValueRange createValueRange() {
        return new ValueRange();
    }

    /**
     * Create an instance of {@link GenericControl }
     * 
     */
    public GenericControl createGenericControl() {
        return new GenericControl();
    }

    /**
     * Create an instance of {@link Column }
     * 
     */
    public Column createColumn() {
        return new Column();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link ListProperty }
     * 
     */
    public ListProperty createListProperty() {
        return new ListProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Text }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "text", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Text> createText(Text value) {
        return new JAXBElement<Text>(_Text_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Textarea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Textarea }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "textarea", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Textarea> createTextarea(Textarea value) {
        return new JAXBElement<Textarea>(_Textarea_QNAME, Textarea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormattedText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormattedText }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "formatted-text", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<FormattedText> createFormattedText(FormattedText value) {
        return new JAXBElement<FormattedText>(_FormattedText_QNAME, FormattedText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Number }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Number }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "number", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Number> createNumber(Number value) {
        return new JAXBElement<Number>(_Number_QNAME, Number.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Date }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "date", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "time", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Time> createTime(Time value) {
        return new JAXBElement<Time>(_Time_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Combobox }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Combobox }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "combobox", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Combobox> createCombobox(Combobox value) {
        return new JAXBElement<Combobox>(_Combobox_QNAME, Combobox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listbox }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listbox }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "listbox", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Listbox> createListbox(Listbox value) {
        return new JAXBElement<Listbox>(_Listbox_QNAME, Listbox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checkbox }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Checkbox }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "checkbox", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "column-controls")
    public JAXBElement<Checkbox> createCheckbox(Checkbox value) {
        return new JAXBElement<Checkbox>(_Checkbox_QNAME, Checkbox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Password }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Password }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "password", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<Password> createPassword(Password value) {
        return new JAXBElement<Password>(_Password_QNAME, Password.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "file", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<File> createFile(File value) {
        return new JAXBElement<File>(_File_QNAME, File.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FixedText }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "fixed-text", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<FixedText> createFixedText(FixedText value) {
        return new JAXBElement<FixedText>(_FixedText_QNAME, FixedText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Button }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Button }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "button", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<Button> createButton(Button value) {
        return new JAXBElement<Button>(_Button_QNAME, Button.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Image }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "image", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<Image> createImage(Image value) {
        return new JAXBElement<Image>(_Image_QNAME, Image.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Radio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Radio }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "radio", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<Radio> createRadio(Radio value) {
        return new JAXBElement<Radio>(_Radio_QNAME, Radio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Frame }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Frame }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "frame", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<Frame> createFrame(Frame value) {
        return new JAXBElement<Frame>(_Frame_QNAME, Frame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageFrame }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageFrame }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "image-frame", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<ImageFrame> createImageFrame(ImageFrame value) {
        return new JAXBElement<ImageFrame>(_ImageFrame_QNAME, ImageFrame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hidden }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hidden }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "hidden", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<Hidden> createHidden(Hidden value) {
        return new JAXBElement<Hidden>(_Hidden_QNAME, Hidden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Grid }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "grid", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<Grid> createGrid(Grid value) {
        return new JAXBElement<Grid>(_Grid_QNAME, Grid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueRange }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValueRange }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "value-range", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<ValueRange> createValueRange(ValueRange value) {
        return new JAXBElement<ValueRange>(_ValueRange_QNAME, ValueRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericControl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenericControl }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "generic-control", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "controls")
    public JAXBElement<GenericControl> createGenericControl(GenericControl value) {
        return new JAXBElement<GenericControl>(_GenericControl_QNAME, GenericControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "property", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "form-property")
    public JAXBElement<Property> createProperty(Property value) {
        return new JAXBElement<Property>(_Property_QNAME, Property.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListProperty }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", name = "list-property", substitutionHeadNamespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", substitutionHeadName = "form-property")
    public JAXBElement<ListProperty> createListProperty(ListProperty value) {
        return new JAXBElement<ListProperty>(_ListProperty_QNAME, ListProperty.class, null, value);
    }

}
