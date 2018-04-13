package com.mainserver.project.fromBook;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
    public void perform() {

        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public OneManBand(){

    }


    private Map<String,Instrument> instruments;
    private Properties propInstrument;

    public void setPropInstrument(Properties propInstrument) {
        this.propInstrument = propInstrument; /*for using it we need to change perform method to appropriate type */
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
