package ch.jooel.hueapi.services;

import ch.jooel.hueapi.to.LightsTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface LightService {

    String BASE_PATH = "lights";

    @GET(BASE_PATH)
    Call<LightsTO> getLights();


}
