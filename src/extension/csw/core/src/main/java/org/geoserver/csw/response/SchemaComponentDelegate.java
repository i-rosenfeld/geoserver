/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.csw.response;

import java.io.IOException;
import java.io.Writer;

import net.opengis.cat.csw20.DescribeRecordType;

import org.opengis.feature.type.AttributeDescriptor;

/**
 * Builds a portion of the DescribeRecord output, writing on the output a csw:SchemaComponent
 * section for the DescribeRecord response
 * 
 * @author Andrea Aime - GeoSolutions
 * 
 */
public interface SchemaComponentDelegate {

    /**
     * Tests whether this delegate can write the XSD for the specified schema, or not
     * 
     * @param schema
     * @return
     */
    public boolean canHandle(AttributeDescriptor descriptor);

    /**
     * Write on the output stream the csw:SchemaComponent section, assuming the
     * <csw:DescribeRecordResponse> has already been written out by the caller
     * 
     * @param writer
     * @param store
     * @throws IOException
     */
    public void writeSchemaComponent(DescribeRecordType request, Writer writer, AttributeDescriptor descriptor) throws IOException;
}
