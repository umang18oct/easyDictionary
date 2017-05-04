package com.example.umang18oct.easydictionary21.models;

/**
 * Created by umang18oct on 02-05-2017.
 */

public class MyPojo {
        private Results[] results;

        private String metadata;

        public Results[] getResults () {
        return results;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "ClassPojo [results = " + results + ", metadata = " + metadata + "]";
    }
}
