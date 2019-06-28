/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class SortDirection extends Code {
    /**
     * Ascending
     */
    public static final SortDirection ASCENDING = SortDirection.of(ValueSet.ASCENDING);

    /**
     * Descending
     */
    public static final SortDirection DESCENDING = SortDirection.of(ValueSet.DESCENDING);

    private SortDirection(Builder builder) {
        super(builder);
    }

    public static SortDirection of(java.lang.String value) {
        return SortDirection.builder().value(value).build();
    }

    public static SortDirection of(ValueSet value) {
        return SortDirection.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return SortDirection.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return SortDirection.builder().value(value).build();
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
        public SortDirection build() {
            return new SortDirection(this);
        }
    }

    public enum ValueSet {
        /**
         * Ascending
         */
        ASCENDING("ascending"),

        /**
         * Descending
         */
        DESCENDING("descending");

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
