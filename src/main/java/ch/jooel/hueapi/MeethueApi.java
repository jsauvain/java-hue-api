package ch.jooel.hueapi;

import ch.jooel.hueapi.services.MeethueService;
import lombok.Builder;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.function.Consumer;

import static ch.jooel.hueapi.util.CallbackResolver.callback;

@Builder
public class MeethueApi {

    private Retrofit meethueRetrofit;

    private MeethueApi(Retrofit retrofit) {
        meethueRetrofit = retrofit;
    }

    public static MeethueApi newMeethueApi() {
        return MeethueApi
                .builder()
                .meethueRetrofit(new Retrofit.Builder()
                        .baseUrl(MeethueService.ENDPOINT)
                        .addConverterFactory(JacksonConverterFactory.create())
                        .build()
                )
                .build();
    }

    public void discoverBridges(Consumer<Bridge> bridgeConsumer) {
        MeethueService service = meethueRetrofit.create(MeethueService.class);
        service.getBridgeAddress().enqueue(
                callback(meethueTOS -> meethueTOS.forEach(meethueTO ->
                                bridgeConsumer.accept(new Bridge(meethueTO.getBridgeAddress()))),
                        Throwable::printStackTrace
                ));

    }


}
