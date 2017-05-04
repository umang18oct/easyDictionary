package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class Pronunciations
{
    private String phoneticSpelling;

    private String phoneticNotation;

    private String[] dialects;

    private String[] regions;

    private String audioFile;

    public String getPhoneticSpelling ()
    {
        return phoneticSpelling;
    }

    public void setPhoneticSpelling (String phoneticSpelling)
    {
        this.phoneticSpelling = phoneticSpelling;
    }

    public String getPhoneticNotation ()
    {
        return phoneticNotation;
    }

    public void setPhoneticNotation (String phoneticNotation)
    {
        this.phoneticNotation = phoneticNotation;
    }

    public String[] getDialects ()
    {
        return dialects;
    }

    public void setDialects (String[] dialects)
    {
        this.dialects = dialects;
    }

    public String[] getRegions ()
    {
        return regions;
    }

    public void setRegions (String[] regions)
    {
        this.regions = regions;
    }

    public String getAudioFile ()
    {
        return audioFile;
    }

    public void setAudioFile (String audioFile)
    {
        this.audioFile = audioFile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [phoneticSpelling = "+phoneticSpelling+", phoneticNotation = "+phoneticNotation+", dialects = "+dialects+", regions = "+regions+", audioFile = "+audioFile+"]";
    }
}
