package ch.jooel.hueapi.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LightsTO {

    private Map<Integer, LightTO> lights;

}
