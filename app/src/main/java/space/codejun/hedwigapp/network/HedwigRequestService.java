package space.codejun.hedwigapp.network;

import com.google.common.util.concurrent.ListenableFuture;

import retrofit2.http.GET;
import space.codejun.hedwigapp.data.TestData;

public interface HedwigRequestService {
    @GET("test")
    ListenableFuture<TestData> getTestData();
}
