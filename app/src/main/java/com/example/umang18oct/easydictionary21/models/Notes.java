package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class Notes
{
    private String id;

    private String text;

    private String type;

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
        return "ClassPojo [id = "+id+", text = "+text+", type = "+type+"]";
    }
}
