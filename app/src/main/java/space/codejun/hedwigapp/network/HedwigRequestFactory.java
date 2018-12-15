package space.codejun.hedwigapp.network;

import retrofit.converter.guava.GuavaOptionalConverterFactory;
import retrofit2.Retrofit;
import retrofit2.adapter.guava.GuavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HedwigRequestFactory {

    public static final String urlEndPoint = "http://test.test.test";

    private static  HedwigRequestService hedwigAPI = new Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(GuavaCallAdapterFactory.create())
            .addConverterFactory(GuavaOptionalConverterFactory.create())
            .build()
            .create(HedwigRequestService.class);

    private HedwigRequestFactory() {

    }

    public static HedwigRequestService getHedwigAPI() {
        return hedwigAPI;
    }
}
