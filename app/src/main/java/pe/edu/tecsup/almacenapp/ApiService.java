package pe.edu.tecsup.almacenapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Alumno on 4/05/2018.
 */

public interface ApiService {

    String API_BASE_URL = "https://productosapi-liset08.c9users.io/";

    @GET("api/v1/productos")
    Call<List<Producto>> getProductos();

}
