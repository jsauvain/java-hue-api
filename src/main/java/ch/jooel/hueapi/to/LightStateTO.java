package ch.jooel.hueapi.to;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LightStateTO {

    @JsonProperty("bri")
    private Integer brightness;
    private String effect;
    @JsonProperty("sat")
    private Integer saturation;
    private String reachable;
    private String alert;
    private Integer hue;
    private String colormode;
    private boolean on;
    @JsonProperty("ct")
    private Integer colorTemparature;
    private List<Double> xy;
    private String mode;

}
