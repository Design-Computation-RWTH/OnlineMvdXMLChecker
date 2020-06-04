//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcSIUnitName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcSIUnitName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ampere"/>
 *     &lt;enumeration value="becquerel"/>
 *     &lt;enumeration value="candela"/>
 *     &lt;enumeration value="coulomb"/>
 *     &lt;enumeration value="cubic_metre"/>
 *     &lt;enumeration value="degree_celsius"/>
 *     &lt;enumeration value="farad"/>
 *     &lt;enumeration value="gram"/>
 *     &lt;enumeration value="gray"/>
 *     &lt;enumeration value="henry"/>
 *     &lt;enumeration value="hertz"/>
 *     &lt;enumeration value="joule"/>
 *     &lt;enumeration value="kelvin"/>
 *     &lt;enumeration value="lumen"/>
 *     &lt;enumeration value="lux"/>
 *     &lt;enumeration value="metre"/>
 *     &lt;enumeration value="mole"/>
 *     &lt;enumeration value="newton"/>
 *     &lt;enumeration value="ohm"/>
 *     &lt;enumeration value="pascal"/>
 *     &lt;enumeration value="radian"/>
 *     &lt;enumeration value="second"/>
 *     &lt;enumeration value="siemens"/>
 *     &lt;enumeration value="sievert"/>
 *     &lt;enumeration value="square_metre"/>
 *     &lt;enumeration value="steradian"/>
 *     &lt;enumeration value="tesla"/>
 *     &lt;enumeration value="volt"/>
 *     &lt;enumeration value="watt"/>
 *     &lt;enumeration value="weber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcSIUnitName")
@XmlEnum
public enum IfcSIUnitName {

    @XmlEnumValue("ampere")
    AMPERE("ampere"),
    @XmlEnumValue("becquerel")
    BECQUEREL("becquerel"),
    @XmlEnumValue("candela")
    CANDELA("candela"),
    @XmlEnumValue("coulomb")
    COULOMB("coulomb"),
    @XmlEnumValue("cubic_metre")
    CUBIC_METRE("cubic_metre"),
    @XmlEnumValue("degree_celsius")
    DEGREE_CELSIUS("degree_celsius"),
    @XmlEnumValue("farad")
    FARAD("farad"),
    @XmlEnumValue("gram")
    GRAM("gram"),
    @XmlEnumValue("gray")
    GRAY("gray"),
    @XmlEnumValue("henry")
    HENRY("henry"),
    @XmlEnumValue("hertz")
    HERTZ("hertz"),
    @XmlEnumValue("joule")
    JOULE("joule"),
    @XmlEnumValue("kelvin")
    KELVIN("kelvin"),
    @XmlEnumValue("lumen")
    LUMEN("lumen"),
    @XmlEnumValue("lux")
    LUX("lux"),
    @XmlEnumValue("metre")
    METRE("metre"),
    @XmlEnumValue("mole")
    MOLE("mole"),
    @XmlEnumValue("newton")
    NEWTON("newton"),
    @XmlEnumValue("ohm")
    OHM("ohm"),
    @XmlEnumValue("pascal")
    PASCAL("pascal"),
    @XmlEnumValue("radian")
    RADIAN("radian"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("siemens")
    SIEMENS("siemens"),
    @XmlEnumValue("sievert")
    SIEVERT("sievert"),
    @XmlEnumValue("square_metre")
    SQUARE_METRE("square_metre"),
    @XmlEnumValue("steradian")
    STERADIAN("steradian"),
    @XmlEnumValue("tesla")
    TESLA("tesla"),
    @XmlEnumValue("volt")
    VOLT("volt"),
    @XmlEnumValue("watt")
    WATT("watt"),
    @XmlEnumValue("weber")
    WEBER("weber");
    private final String value;

    IfcSIUnitName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcSIUnitName fromValue(String v) {
        for (IfcSIUnitName c: IfcSIUnitName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}