/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class ConsentState extends Code {
    /**
     * Pending
     */
    public static final ConsentState DRAFT = ConsentState.of(ValueSet.DRAFT);

    /**
     * Proposed
     */
    public static final ConsentState PROPOSED = ConsentState.of(ValueSet.PROPOSED);

    /**
     * Active
     */
    public static final ConsentState ACTIVE = ConsentState.of(ValueSet.ACTIVE);

    /**
     * Rejected
     */
    public static final ConsentState REJECTED = ConsentState.of(ValueSet.REJECTED);

    /**
     * Inactive
     */
    public static final ConsentState INACTIVE = ConsentState.of(ValueSet.INACTIVE);

    /**
     * Entered in Error
     */
    public static final ConsentState ENTERED_IN_ERROR = ConsentState.of(ValueSet.ENTERED_IN_ERROR);

    private ConsentState(Builder builder) {
        super(builder);
    }

    public static ConsentState of(java.lang.String value) {
        return ConsentState.builder().value(value).build();
    }

    public static ConsentState of(ValueSet value) {
        return ConsentState.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return ConsentState.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return ConsentState.builder().value(value).build();
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
        public ConsentState build() {
            return new ConsentState(this);
        }
    }

    public enum ValueSet {
        /**
         * Pending
         */
        DRAFT("draft"),

        /**
         * Proposed
         */
        PROPOSED("proposed"),

        /**
         * Active
         */
        ACTIVE("active"),

        /**
         * Rejected
         */
        REJECTED("rejected"),

        /**
         * Inactive
         */
        INACTIVE("inactive"),

        /**
         * Entered in Error
         */
        ENTERED_IN_ERROR("entered-in-error");

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
