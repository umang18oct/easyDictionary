package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class Senses
{
    private String id;

    private Pronunciations[] pronunciations;

    private CrossReferences[] crossReferences;

    private String[] registers;

    private String[] domains;

    private Translations[] translations;

    private VariantForms[] variantForms;

    private String[] crossReferenceMarkers;

    private String[] definitions;

    private String[] subsenses;

    private String[] regions;

    private Notes[] notes;

    private Examples[] examples;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Pronunciations[] getPronunciations ()
    {
        return pronunciations;
    }

    public void setPronunciations (Pronunciations[] pronunciations)
    {
        this.pronunciations = pronunciations;
    }

    public CrossReferences[] getCrossReferences ()
    {
        return crossReferences;
    }

    public void setCrossReferences (CrossReferences[] crossReferences)
    {
        this.crossReferences = crossReferences;
    }

    public String[] getRegisters ()
    {
        return registers;
    }

    public void setRegisters (String[] registers)
    {
        this.registers = registers;
    }

    public String[] getDomains ()
    {
        return domains;
    }

    public void setDomains (String[] domains)
    {
        this.domains = domains;
    }

    public Translations[] getTranslations ()
    {
        return translations;
    }

    public void setTranslations (Translations[] translations)
    {
        this.translations = translations;
    }

    public VariantForms[] getVariantForms ()
    {
        return variantForms;
    }

    public void setVariantForms (VariantForms[] variantForms)
    {
        this.variantForms = variantForms;
    }

    public String[] getCrossReferenceMarkers ()
    {
        return crossReferenceMarkers;
    }

    public void setCrossReferenceMarkers (String[] crossReferenceMarkers)
    {
        this.crossReferenceMarkers = crossReferenceMarkers;
    }

    public String[] getDefinitions ()
    {
        return definitions;
    }

    public void setDefinitions (String[] definitions)
    {
        this.definitions = definitions;
    }

    public String[] getSubsenses ()
    {
        return subsenses;
    }

    public void setSubsenses (String[] subsenses)
    {
        this.subsenses = subsenses;
    }

    public String[] getRegions ()
    {
        return regions;
    }

    public void setRegions (String[] regions)
    {
        this.regions = regions;
    }

    public Notes[] getNotes ()
    {
        return notes;
    }

    public void setNotes (Notes[] notes)
    {
        this.notes = notes;
    }

    public Examples[] getExamples ()
    {
        return examples;
    }

    public void setExamples (Examples[] examples)
    {
        this.examples = examples;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", pronunciations = "+pronunciations+", crossReferences = "+crossReferences+", registers = "+registers+", domains = "+domains+", translations = "+translations+", variantForms = "+variantForms+", crossReferenceMarkers = "+crossReferenceMarkers+", definitions = "+definitions+", subsenses = "+subsenses+", regions = "+regions+", notes = "+notes+", examples = "+examples+"]";
    }
}
