/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.type.Code;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Period;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.ResearchSubjectStatus;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * A physical entity which is the primary unit of operational and/or administrative interest in a study.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class ResearchSubject extends DomainResource {
    private final List<Identifier> identifier;
    private final ResearchSubjectStatus status;
    private final Period period;
    private final Reference study;
    private final Reference individual;
    private final String assignedArm;
    private final String actualArm;
    private final Reference consent;

    private volatile int hashCode;

    private ResearchSubject(Builder builder) {
        super(builder);
        identifier = Collections.unmodifiableList(builder.identifier);
        status = ValidationSupport.requireNonNull(builder.status, "status");
        period = builder.period;
        study = ValidationSupport.requireNonNull(builder.study, "study");
        individual = ValidationSupport.requireNonNull(builder.individual, "individual");
        assignedArm = builder.assignedArm;
        actualArm = builder.actualArm;
        consent = builder.consent;
    }

    /**
     * <p>
     * Identifiers assigned to this research subject for a study.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Identifier}.
     */
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * The current state of the subject.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link ResearchSubjectStatus}.
     */
    public ResearchSubjectStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The dates the subject began and ended their participation in the study.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Period}.
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * <p>
     * Reference to the study the subject is participating in.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getStudy() {
        return study;
    }

    /**
     * <p>
     * The record of the person or animal who is involved in the study.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getIndividual() {
        return individual;
    }

    /**
     * <p>
     * The name of the arm in the study the subject is expected to follow as part of this study.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getAssignedArm() {
        return assignedArm;
    }

    /**
     * <p>
     * The name of the arm in the study the subject actually followed as part of this study.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getActualArm() {
        return actualArm;
    }

    /**
     * <p>
     * A record of the patient's informed agreement to participate in the study.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getConsent() {
        return consent;
    }

    @Override
    public void accept(java.lang.String elementName, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, this);
            if (visitor.visit(elementName, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(meta, "meta", visitor);
                accept(implicitRules, "implicitRules", visitor);
                accept(language, "language", visitor);
                accept(text, "text", visitor);
                accept(contained, "contained", visitor, Resource.class);
                accept(extension, "extension", visitor, Extension.class);
                accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                accept(identifier, "identifier", visitor, Identifier.class);
                accept(status, "status", visitor);
                accept(period, "period", visitor);
                accept(study, "study", visitor);
                accept(individual, "individual", visitor);
                accept(assignedArm, "assignedArm", visitor);
                accept(actualArm, "actualArm", visitor);
                accept(consent, "consent", visitor);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ResearchSubject other = (ResearchSubject) obj;
        return Objects.equals(id, other.id) && 
            Objects.equals(meta, other.meta) && 
            Objects.equals(implicitRules, other.implicitRules) && 
            Objects.equals(language, other.language) && 
            Objects.equals(text, other.text) && 
            Objects.equals(contained, other.contained) && 
            Objects.equals(extension, other.extension) && 
            Objects.equals(modifierExtension, other.modifierExtension) && 
            Objects.equals(identifier, other.identifier) && 
            Objects.equals(status, other.status) && 
            Objects.equals(period, other.period) && 
            Objects.equals(study, other.study) && 
            Objects.equals(individual, other.individual) && 
            Objects.equals(assignedArm, other.assignedArm) && 
            Objects.equals(actualArm, other.actualArm) && 
            Objects.equals(consent, other.consent);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, 
                meta, 
                implicitRules, 
                language, 
                text, 
                contained, 
                extension, 
                modifierExtension, 
                identifier, 
                status, 
                period, 
                study, 
                individual, 
                assignedArm, 
                actualArm, 
                consent);
            hashCode = result;
        }
        return result;
    }

    @Override
    public Builder toBuilder() {
        return new Builder(status, study, individual).from(this);
    }

    public Builder toBuilder(ResearchSubjectStatus status, Reference study, Reference individual) {
        return new Builder(status, study, individual).from(this);
    }

    public static Builder builder(ResearchSubjectStatus status, Reference study, Reference individual) {
        return new Builder(status, study, individual);
    }

    public static class Builder extends DomainResource.Builder {
        // required
        private final ResearchSubjectStatus status;
        private final Reference study;
        private final Reference individual;

        // optional
        private List<Identifier> identifier = new ArrayList<>();
        private Period period;
        private String assignedArm;
        private String actualArm;
        private Reference consent;

        private Builder(ResearchSubjectStatus status, Reference study, Reference individual) {
            super();
            this.status = status;
            this.study = study;
            this.individual = individual;
        }

        /**
         * <p>
         * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
         * </p>
         * 
         * @param id
         *     Logical id of this artifact
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder id(Id id) {
            return (Builder) super.id(id);
        }

        /**
         * <p>
         * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content 
         * might not always be associated with version changes to the resource.
         * </p>
         * 
         * @param meta
         *     Metadata about the resource
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder meta(Meta meta) {
            return (Builder) super.meta(meta);
        }

        /**
         * <p>
         * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when 
         * processing the content. Often, this is a reference to an implementation guide that defines the special rules along 
         * with other profiles etc.
         * </p>
         * 
         * @param implicitRules
         *     A set of rules under which this content was created
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder implicitRules(Uri implicitRules) {
            return (Builder) super.implicitRules(implicitRules);
        }

        /**
         * <p>
         * The base language in which the resource is written.
         * </p>
         * 
         * @param language
         *     Language of the resource content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder language(Code language) {
            return (Builder) super.language(language);
        }

        /**
         * <p>
         * A human-readable narrative that contains a summary of the resource and can be used to represent the content of the 
         * resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient 
         * detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what 
         * content should be represented in the narrative to ensure clinical safety.
         * </p>
         * 
         * @param text
         *     Text summary of the resource, for human interpretation
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder text(Narrative text) {
            return (Builder) super.text(text);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Resource... contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Collection<Resource> contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Extension... modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Collection<Extension> modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * Identifiers assigned to this research subject for a study.
         * </p>
         * 
         * @param identifier
         *     Business Identifier for research subject in a study
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Identifier... identifier) {
            for (Identifier value : identifier) {
                this.identifier.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Identifiers assigned to this research subject for a study.
         * </p>
         * 
         * @param identifier
         *     Business Identifier for research subject in a study
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Collection<Identifier> identifier) {
            this.identifier.addAll(identifier);
            return this;
        }

        /**
         * <p>
         * The dates the subject began and ended their participation in the study.
         * </p>
         * 
         * @param period
         *     Start and end of participation
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder period(Period period) {
            this.period = period;
            return this;
        }

        /**
         * <p>
         * The name of the arm in the study the subject is expected to follow as part of this study.
         * </p>
         * 
         * @param assignedArm
         *     What path should be followed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder assignedArm(String assignedArm) {
            this.assignedArm = assignedArm;
            return this;
        }

        /**
         * <p>
         * The name of the arm in the study the subject actually followed as part of this study.
         * </p>
         * 
         * @param actualArm
         *     What path was followed
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder actualArm(String actualArm) {
            this.actualArm = actualArm;
            return this;
        }

        /**
         * <p>
         * A record of the patient's informed agreement to participate in the study.
         * </p>
         * 
         * @param consent
         *     Agreement to participate in study
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder consent(Reference consent) {
            this.consent = consent;
            return this;
        }

        @Override
        public ResearchSubject build() {
            return new ResearchSubject(this);
        }

        private Builder from(ResearchSubject researchSubject) {
            id = researchSubject.id;
            meta = researchSubject.meta;
            implicitRules = researchSubject.implicitRules;
            language = researchSubject.language;
            text = researchSubject.text;
            contained.addAll(researchSubject.contained);
            extension.addAll(researchSubject.extension);
            modifierExtension.addAll(researchSubject.modifierExtension);
            identifier.addAll(researchSubject.identifier);
            period = researchSubject.period;
            assignedArm = researchSubject.assignedArm;
            actualArm = researchSubject.actualArm;
            consent = researchSubject.consent;
            return this;
        }
    }
}