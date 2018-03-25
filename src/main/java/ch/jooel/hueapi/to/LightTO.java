package ch.jooel.hueapi.to;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LightTO {

    private String name;
    private LightStateTO state;
    private String modelid;
    private String swversion;
    private String type;

}
