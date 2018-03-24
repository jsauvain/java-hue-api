package ch.jooel.hueapi.to;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LightStateTO {

    @JsonProperty("bri")
    private String brightness;
    private String effect;
    @JsonProperty("sat")
    private String saturation;
    private String reachable;
    private String alert;
    private String hue;
    private String colormode;
    private String on;
    @JsonProperty("ct")
    private String colorTemparature;
    private List<String> xy;

}
