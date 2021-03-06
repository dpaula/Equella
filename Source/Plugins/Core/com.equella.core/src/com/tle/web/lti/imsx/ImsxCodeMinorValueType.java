/*
 * Copyright 2017 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.07.10 at 02:09:22 PM EST
//

package com.tle.web.lti.imsx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for imsx_CodeMinorValue.Type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="imsx_CodeMinorValue.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fullsuccess"/>
 *     &lt;enumeration value="createsuccess"/>
 *     &lt;enumeration value="nosourcedids"/>
 *     &lt;enumeration value="idallocfail"/>
 *     &lt;enumeration value="overflowfail"/>
 *     &lt;enumeration value="idallocinusefail"/>
 *     &lt;enumeration value="invaliddata"/>
 *     &lt;enumeration value="incompletedata"/>
 *     &lt;enumeration value="partialdatastorage"/>
 *     &lt;enumeration value="unknownobject"/>
 *     &lt;enumeration value="unknownquery"/>
 *     &lt;enumeration value="deletefailure"/>
 *     &lt;enumeration value="targetreadfailure"/>
 *     &lt;enumeration value="savepointerror"/>
 *     &lt;enumeration value="savepointsyncerror"/>
 *     &lt;enumeration value="toomuchdata"/>
 *     &lt;enumeration value="unsupportedlineitemtype"/>
 *     &lt;enumeration value="unknowncontext"/>
 *     &lt;enumeration value="unauthorizedresultreplace"/>
 *     &lt;enumeration value="unknownperson"/>
 *     &lt;enumeration value="gradingnotpermitted"/>
 *     &lt;enumeration value="invalidresult"/>
 *     &lt;enumeration value="resultalreadyposted"/>
 *     &lt;enumeration value="unknownextension"/>
 *     &lt;enumeration value="unknownvocabulary"/>
 *     &lt;enumeration value="unknownmdvocabulary"/>
 *     &lt;enumeration value="targetisbusy"/>
 *     &lt;enumeration value="linkfailure"/>
 *     &lt;enumeration value="unauthorizedrequest"/>
 *     &lt;enumeration value="unsupportedLIS"/>
 *     &lt;enumeration value="unsupportedLISoperation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "imsx_CodeMinorValue.Type")
@XmlEnum
public enum ImsxCodeMinorValueType {
  @XmlEnumValue("fullsuccess")
  FULLSUCCESS("fullsuccess"),
  @XmlEnumValue("createsuccess")
  CREATESUCCESS("createsuccess"),
  @XmlEnumValue("nosourcedids")
  NOSOURCEDIDS("nosourcedids"),
  @XmlEnumValue("idallocfail")
  IDALLOCFAIL("idallocfail"),
  @XmlEnumValue("overflowfail")
  OVERFLOWFAIL("overflowfail"),
  @XmlEnumValue("idallocinusefail")
  IDALLOCINUSEFAIL("idallocinusefail"),
  @XmlEnumValue("invaliddata")
  INVALIDDATA("invaliddata"),
  @XmlEnumValue("incompletedata")
  INCOMPLETEDATA("incompletedata"),
  @XmlEnumValue("partialdatastorage")
  PARTIALDATASTORAGE("partialdatastorage"),
  @XmlEnumValue("unknownobject")
  UNKNOWNOBJECT("unknownobject"),
  @XmlEnumValue("unknownquery")
  UNKNOWNQUERY("unknownquery"),
  @XmlEnumValue("deletefailure")
  DELETEFAILURE("deletefailure"),
  @XmlEnumValue("targetreadfailure")
  TARGETREADFAILURE("targetreadfailure"),
  @XmlEnumValue("savepointerror")
  SAVEPOINTERROR("savepointerror"),
  @XmlEnumValue("savepointsyncerror")
  SAVEPOINTSYNCERROR("savepointsyncerror"),
  @XmlEnumValue("toomuchdata")
  TOOMUCHDATA("toomuchdata"),
  @XmlEnumValue("unsupportedlineitemtype")
  UNSUPPORTEDLINEITEMTYPE("unsupportedlineitemtype"),
  @XmlEnumValue("unknowncontext")
  UNKNOWNCONTEXT("unknowncontext"),
  @XmlEnumValue("unauthorizedresultreplace")
  UNAUTHORIZEDRESULTREPLACE("unauthorizedresultreplace"),
  @XmlEnumValue("unknownperson")
  UNKNOWNPERSON("unknownperson"),
  @XmlEnumValue("gradingnotpermitted")
  GRADINGNOTPERMITTED("gradingnotpermitted"),
  @XmlEnumValue("invalidresult")
  INVALIDRESULT("invalidresult"),
  @XmlEnumValue("resultalreadyposted")
  RESULTALREADYPOSTED("resultalreadyposted"),
  @XmlEnumValue("unknownextension")
  UNKNOWNEXTENSION("unknownextension"),
  @XmlEnumValue("unknownvocabulary")
  UNKNOWNVOCABULARY("unknownvocabulary"),
  @XmlEnumValue("unknownmdvocabulary")
  UNKNOWNMDVOCABULARY("unknownmdvocabulary"),
  @XmlEnumValue("targetisbusy")
  TARGETISBUSY("targetisbusy"),
  @XmlEnumValue("linkfailure")
  LINKFAILURE("linkfailure"),
  @XmlEnumValue("unauthorizedrequest")
  UNAUTHORIZEDREQUEST("unauthorizedrequest"),
  @XmlEnumValue("unsupportedLIS")
  UNSUPPORTED_LIS("unsupportedLIS"),
  @XmlEnumValue("unsupportedLISoperation")
  UNSUPPORTED_LI_SOPERATION("unsupportedLISoperation");
  private final String value;

  ImsxCodeMinorValueType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ImsxCodeMinorValueType fromValue(String v) {
    for (ImsxCodeMinorValueType c : ImsxCodeMinorValueType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
