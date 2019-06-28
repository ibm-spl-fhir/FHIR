/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class ContactPointSystem extends Code {
    /**
     * Phone
     */
    public static final ContactPointSystem PHONE = ContactPointSystem.of(ValueSet.PHONE);

    /**
     * Fax
     */
    public static final ContactPointSystem FAX = ContactPointSystem.of(ValueSet.FAX);

    /**
     * Email
     */
    public static final ContactPointSystem EMAIL = ContactPointSystem.of(ValueSet.EMAIL);

    /**
     * Pager
     */
    public static final ContactPointSystem PAGER = ContactPointSystem.of(ValueSet.PAGER);

    /**
     * URL
     */
    public static final ContactPointSystem URL = ContactPointSystem.of(ValueSet.URL);

    /**
     * SMS
     */
    public static final ContactPointSystem SMS = ContactPointSystem.of(ValueSet.SMS);

    /**
     * Other
     */
    public static final ContactPointSystem OTHER = ContactPointSystem.of(ValueSet.OTHER);

    private ContactPointSystem(Builder builder) {
        super(builder);
    }

    public static ContactPointSystem of(java.lang.String value) {
        return ContactPointSystem.builder().value(value).build();
    }

    public static ContactPointSystem of(ValueSet value) {
        return ContactPointSystem.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return ContactPointSystem.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return ContactPointSystem.builder().value(value).build();
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
        public ContactPointSystem build() {
            return new ContactPointSystem(this);
        }
    }

    public enum ValueSet {
        /**
         * Phone
         */
        PHONE("phone"),

        /**
         * Fax
         */
        FAX("fax"),

        /**
         * Email
         */
        EMAIL("email"),

        /**
         * Pager
         */
        PAGER("pager"),

        /**
         * URL
         */
        URL("url"),

        /**
         * SMS
         */
        SMS("sms"),

        /**
         * Other
         */
        OTHER("other");

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
