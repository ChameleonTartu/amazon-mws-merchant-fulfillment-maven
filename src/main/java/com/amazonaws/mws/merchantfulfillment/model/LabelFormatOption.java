/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Label Format Option
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment.model;

import com.amazonservices.mws.client.*;

/**
 * LabelFormatOption complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="LabelFormatOption"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="IncludePackingSlipWithLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="LabelFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class LabelFormatOption extends AbstractMwsObject {

    private Boolean includePackingSlipWithLabel;

    private String labelFormat;

    /**
     * Check the value of IncludePackingSlipWithLabel.
     *
     * @return true if IncludePackingSlipWithLabel is set to true.
     */
    public boolean isIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel!=null && includePackingSlipWithLabel.booleanValue();
    }

    /**
     * Get the value of IncludePackingSlipWithLabel.
     *
     * @return The value of IncludePackingSlipWithLabel.
     */
    public Boolean getIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel;
    }

    /**
     * Set the value of IncludePackingSlipWithLabel.
     *
     * @param includePackingSlipWithLabel
     *            The new value to set.
     */
    public void setIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
    }

    /**
     * Check to see if IncludePackingSlipWithLabel is set.
     *
     * @return true if IncludePackingSlipWithLabel is set.
     */
    public boolean isSetIncludePackingSlipWithLabel() {
        return includePackingSlipWithLabel != null;
    }

    /**
     * Set the value of IncludePackingSlipWithLabel, return this.
     *
     * @param includePackingSlipWithLabel
     *             The new value to set.
     * @return This instance.
     */
    public LabelFormatOption withIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
        this.includePackingSlipWithLabel = includePackingSlipWithLabel;
        return this;
    }

    /**
     * Get the value of LabelFormat.
     *
     * @return The value of LabelFormat.
     */
    public String getLabelFormat() {
        return labelFormat;
    }

    /**
     * Set the value of LabelFormat.
     *
     * @param labelFormat
     *            The new value to set.
     */
    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
    }

    /**
     * Check to see if LabelFormat is set.
     *
     * @return true if LabelFormat is set.
     */
    public boolean isSetLabelFormat() {
        return labelFormat != null;
    }

    /**
     * Set the value of LabelFormat, return this.
     *
     * @param labelFormat
     *             The new value to set.
     * @return This instance.
     */
    public LabelFormatOption withLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        includePackingSlipWithLabel = r.read("IncludePackingSlipWithLabel", Boolean.class);
        labelFormat = r.read("LabelFormat", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("IncludePackingSlipWithLabel", includePackingSlipWithLabel);
        w.write("LabelFormat", labelFormat);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "LabelFormatOption",this);
    }


    /**
     * Default constructor.
     */
    public LabelFormatOption() {
        super();
    }

}
