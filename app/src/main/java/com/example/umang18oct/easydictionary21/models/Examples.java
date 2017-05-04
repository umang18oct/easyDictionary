package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class Examples
{
    private String[] senseIds;

    private String text;

    private String[] registers;

    private String[] domains;

    private Translations[] translations;

    private String[] definitions;

    private String[] regions;

    private Notes[] notes;

    public String[] getSenseIds ()
    {
        return senseIds;
    }

    public void setSenseIds (String[] senseIds)
    {
        this.senseIds = senseIds;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
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

    public String[] getDefinitions ()
    {
        return definitions;
    }

    public void setDefinitions (String[] definitions)
    {
        this.definitions = definitions;
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
        return "ClassPojo [senseIds = "+senseIds+", text = "+text+", registers = "+registers+", domains = "+domains+", translations = "+translations+", definitions = "+definitions+", regions = "+regions+", notes = "+notes+"]";
    }
}
