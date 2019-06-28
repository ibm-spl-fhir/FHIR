/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class ResponseType extends Code {
    /**
     * OK
     */
    public static final ResponseType OK = ResponseType.of(ValueSet.OK);

    /**
     * Transient Error
     */
    public static final ResponseType TRANSIENT_ERROR = ResponseType.of(ValueSet.TRANSIENT_ERROR);

    /**
     * Fatal Error
     */
    public static final ResponseType FATAL_ERROR = ResponseType.of(ValueSet.FATAL_ERROR);

    private ResponseType(Builder builder) {
        super(builder);
    }

    public static ResponseType of(java.lang.String value) {
        return ResponseType.builder().value(value).build();
    }

    public static ResponseType of(ValueSet value) {
        return ResponseType.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return ResponseType.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return ResponseType.builder().value(value).build();
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
        public ResponseType build() {
            return new ResponseType(this);
        }
    }

    public enum ValueSet {
        /**
         * OK
         */
        OK("ok"),

        /**
         * Transient Error
         */
        TRANSIENT_ERROR("transient-error"),

        /**
         * Fatal Error
         */
        FATAL_ERROR("fatal-error");

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
