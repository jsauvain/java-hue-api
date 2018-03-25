package ch.jooel.hueapi.services;

import ch.jooel.hueapi.to.LightStateTO;
import ch.jooel.hueapi.to.LightTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;
import java.util.Map;

public interface LightService {

    String BASE_PATH = "lights/";

    @GET(BASE_PATH)
    Call<Map<Integer, LightTO>> getLights();

    @GET(BASE_PATH + "{lightId}")
    Call<LightTO> getLight(@Path("lightId") Integer lightId);

    @PUT(BASE_PATH + "{lightId}/state")
    Call<List<Object>> updateLightState(@Path("lightId") Integer lightId, @Body LightStateTO lightStateTO);

}
