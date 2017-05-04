package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class Entries
{
    private Pronunciations[] pronunciations;

    private GrammaticalFeatures[] grammaticalFeatures;

    private String[] etymologies;

    private VariantForms[] variantForms;

    private Notes[] notes;

    private Senses[] senses;

    private String homographNumber;

    public Pronunciations[] getPronunciations ()
    {
        return pronunciations;
    }

    public void setPronunciations (Pronunciations[] pronunciations)
    {
        this.pronunciations = pronunciations;
    }

    public GrammaticalFeatures[] getGrammaticalFeatures ()
    {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures (GrammaticalFeatures[] grammaticalFeatures)
    {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String[] getEtymologies ()
    {
        return etymologies;
    }

    public void setEtymologies (String[] etymologies)
    {
        this.etymologies = etymologies;
    }

    public VariantForms[] getVariantForms ()
    {
        return variantForms;
    }

    public void setVariantForms (VariantForms[] variantForms)
    {
        this.variantForms = variantForms;
    }

    public Notes[] getNotes ()
    {
        return notes;
    }

    public void setNotes (Notes[] notes)
    {
        this.notes = notes;
    }

    public Senses[] getSenses ()
    {
        return senses;
    }

    public void setSenses (Senses[] senses)
    {
        this.senses = senses;
    }

    public String getHomographNumber ()
    {
        return homographNumber;
    }

    public void setHomographNumber (String homographNumber)
    {
        this.homographNumber = homographNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pronunciations = "+pronunciations+", grammaticalFeatures = "+grammaticalFeatures+", etymologies = "+etymologies+", variantForms = "+variantForms+", notes = "+notes+", senses = "+senses+", homographNumber = "+homographNumber+"]";
    }
}
