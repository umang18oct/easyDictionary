package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class Translations
{
    private String text;

    private GrammaticalFeatures[] grammaticalFeatures;

    private String[] registers;

    private String[] domains;

    private String language;

    private String[] regions;

    private Notes[] notes;

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

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
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

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", grammaticalFeatures = "+grammaticalFeatures+", registers = "+registers+", domains = "+domains+", language = "+language+", regions = "+regions+", notes = "+notes+"]";
    }
}
