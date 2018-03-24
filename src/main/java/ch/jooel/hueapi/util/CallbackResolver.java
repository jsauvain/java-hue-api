package ch.jooel.hueapi.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CallbackResolver {


    public static <T> Callback<T> callback(Consumer<T> success, Consumer<Throwable> error) {
        return new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                success.accept(response.body());
            }

            @Override
            public void onFailure(Call<T> call, Throwable throwable) {
                error.accept(throwable);
            }
        };
    }

    public static <T> Callback<T> callback(Consumer<T> success) {
        return callback(success, any -> {});
    }
}