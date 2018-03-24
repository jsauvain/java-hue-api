package ch.jooel.hueapi;

import ch.jooel.hueapi.services.*;
import lombok.Getter;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Getter
public class HueApi {

    private final Bridge bridge;
    private final String username;

    private final LightService lightService;
    private final GroupService groupService;
    private final SchedulerService schedulerService;
    private final SceneService sceneService;
    private final SensorService sensorService;
    private final RuleService ruleService;
    private final ConfigurationService configurationService;
    private final ResourcelinkService resourcelinkService;
    private final CapabilityService capabilityService;


    public HueApi(Bridge bridge, String username) {
        this.bridge = bridge;
        this.username = username;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://" + bridge.getAddress() + "/api/" + username + "/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        lightService = retrofit.create(LightService.class);
        groupService = retrofit.create(GroupService.class);
        schedulerService = retrofit.create(SchedulerService.class);
        sceneService = retrofit.create(SceneService.class);
        sensorService = retrofit.create(SensorService.class);
        ruleService = retrofit.create(RuleService.class);
        configurationService = retrofit.create(ConfigurationService.class);
        resourcelinkService = retrofit.create(ResourcelinkService.class);
        capabilityService = retrofit.create(CapabilityService.class);
    }
}
