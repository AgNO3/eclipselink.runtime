/*******************************************************************************
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *  - rbarkhouse - 28 February 2013 - 2.4.2 - Initial implementation
 ******************************************************************************/

package org.eclipse.persistence.testing.jaxb.jaxbcontext.xlink;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "typeType")
@XmlEnum
public enum TypeType {

    @XmlEnumValue("title") TITLE("title"), 
    @XmlEnumValue("locator") LOCATOR("locator");
    private final String value;

    TypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeType fromValue(String v) {
        for (TypeType c : TypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}