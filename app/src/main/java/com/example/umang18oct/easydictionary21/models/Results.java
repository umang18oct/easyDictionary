package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class Results
{
    private String id;

    private Pronunciations[] pronunciations;

    private LexicalEntries[] lexicalEntries;

    private String word;

    private String language;

    private String type;

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

    public LexicalEntries[] getLexicalEntries ()
    {
        return lexicalEntries;
    }

    public void setLexicalEntries (LexicalEntries[] lexicalEntries)
    {
        this.lexicalEntries = lexicalEntries;
    }

    public String getWord ()
    {
        return word;
    }

    public void setWord (String word)
    {
        this.word = word;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", pronunciations = "+pronunciations+", lexicalEntries = "+lexicalEntries+", word = "+word+", language = "+language+", type = "+type+"]";
    }
}