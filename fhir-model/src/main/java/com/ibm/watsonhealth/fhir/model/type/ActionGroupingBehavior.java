/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class ActionGroupingBehavior extends Code {
    /**
     * Visual Group
     */
    public static final ActionGroupingBehavior VISUAL_GROUP = ActionGroupingBehavior.of(ValueSet.VISUAL_GROUP);

    /**
     * Logical Group
     */
    public static final ActionGroupingBehavior LOGICAL_GROUP = ActionGroupingBehavior.of(ValueSet.LOGICAL_GROUP);

    /**
     * Sentence Group
     */
    public static final ActionGroupingBehavior SENTENCE_GROUP = ActionGroupingBehavior.of(ValueSet.SENTENCE_GROUP);

    private ActionGroupingBehavior(Builder builder) {
        super(builder);
    }

    public static ActionGroupingBehavior of(java.lang.String value) {
        return ActionGroupingBehavior.builder().value(value).build();
    }

    public static ActionGroupingBehavior of(ValueSet value) {
        return ActionGroupingBehavior.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return ActionGroupingBehavior.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return ActionGroupingBehavior.builder().value(value).build();
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
        public ActionGroupingBehavior build() {
            return new ActionGroupingBehavior(this);
        }
    }

    public enum ValueSet {
        /**
         * Visual Group
         */
        VISUAL_GROUP("visual-group"),

        /**
         * Logical Group
         */
        LOGICAL_GROUP("logical-group"),

        /**
         * Sentence Group
         */
        SENTENCE_GROUP("sentence-group");

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
