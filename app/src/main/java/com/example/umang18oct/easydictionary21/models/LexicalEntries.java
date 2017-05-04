package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class LexicalEntries
{
    private Pronunciations[] pronunciations;

    private String text;

    private GrammaticalFeatures[] grammaticalFeatures;

    private VariantForms[] variantForms;

    private Entries[] entries;

    private String language;

    private Notes[] notes;

    private String lexicalCategory;

    private DerivativeOf[] derivativeOf;

    public Pronunciations[] getPronunciations ()
    {
        return pronunciations;
    }

    public void setPronunciations (Pronunciations[] pronunciations)
    {
        this.pronunciations = pronunciations;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public GrammaticalFeatures[] getGrammaticalFeatures ()
    {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures (GrammaticalFeatures[] grammaticalFeatures)
    {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public VariantForms[] getVariantForms ()
    {
        return variantForms;
    }

    public void setVariantForms (VariantForms[] variantForms)
    {
        this.variantForms = variantForms;
    }

    public Entries[] getEntries ()
    {
        return entries;
    }

    public void setEntries (Entries[] entries)
    {
        this.entries = entries;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public Notes[] getNotes ()
    {
        return notes;
    }

    public void setNotes (Notes[] notes)
    {
        this.notes = notes;
    }

    public String getLexicalCategory ()
    {
        return lexicalCategory;
    }

    public void setLexicalCategory (String lexicalCategory)
    {
        this.lexicalCategory = lexicalCategory;
    }

    public DerivativeOf[] getDerivativeOf ()
    {
        return derivativeOf;
    }

    public void setDerivativeOf (DerivativeOf[] derivativeOf)
    {
        this.derivativeOf = derivativeOf;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pronunciations = "+pronunciations+", text = "+text+", grammaticalFeatures = "+grammaticalFeatures+", variantForms = "+variantForms+", entries = "+entries+", language = "+language+", notes = "+notes+", lexicalCategory = "+lexicalCategory+", derivativeOf = "+derivativeOf+"]";
    }
}
