package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class VariantForms
{
    private String text;

    private String[] regions;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
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
        return "ClassPojo [text = "+text+", regions = "+regions+"]";
    }
}
