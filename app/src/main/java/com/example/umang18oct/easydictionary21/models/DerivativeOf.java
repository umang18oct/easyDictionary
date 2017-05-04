package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class DerivativeOf
{
    private String id;

    private String text;

    private String[] registers;

    private String[] domains;

    private String language;

    private String[] regions;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
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

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", text = "+text+", registers = "+registers+", domains = "+domains+", language = "+language+", regions = "+regions+"]";
    }
}

