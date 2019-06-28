/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class RemittanceOutcome extends Code {
    /**
     * Queued
     */
    public static final RemittanceOutcome QUEUED = RemittanceOutcome.of(ValueSet.QUEUED);

    /**
     * Processing Complete
     */
    public static final RemittanceOutcome COMPLETE = RemittanceOutcome.of(ValueSet.COMPLETE);

    /**
     * Error
     */
    public static final RemittanceOutcome ERROR = RemittanceOutcome.of(ValueSet.ERROR);

    /**
     * Partial Processing
     */
    public static final RemittanceOutcome PARTIAL = RemittanceOutcome.of(ValueSet.PARTIAL);

    private RemittanceOutcome(Builder builder) {
        super(builder);
    }

    public static RemittanceOutcome of(java.lang.String value) {
        return RemittanceOutcome.builder().value(value).build();
    }

    public static RemittanceOutcome of(ValueSet value) {
        return RemittanceOutcome.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return RemittanceOutcome.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return RemittanceOutcome.builder().value(value).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.extension.addAll(extension);
        builder.value = value;
        return builder;
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (Builder) super.value(ValueSet.from(value).value());
        }

        public Builder value(ValueSet value) {
            return (Builder) super.value(value.value());
        }

        @Override
        public RemittanceOutcome build() {
            return new RemittanceOutcome(this);
        }
    }

    public enum ValueSet {
        /**
         * Queued
         */
        QUEUED("queued"),

        /**
         * Processing Complete
         */
        COMPLETE("complete"),

        /**
         * Error
         */
        ERROR("error"),

        /**
         * Partial Processing
         */
        PARTIAL("partial");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}
