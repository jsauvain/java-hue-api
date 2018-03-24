package ch.jooel.hueapi.services;

import ch.jooel.hueapi.to.MeethueTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface MeethueService {

    public static String ENDPOINT = "https://www.meethue.com/";

    @GET("api/nupnp")
    Call<List<MeethueTO>> getBridgeAddress();

}
