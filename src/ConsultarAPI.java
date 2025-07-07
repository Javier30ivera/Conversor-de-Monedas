import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI {

    public double convertir(String base,String destino) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/6dbc7b4f786e9846cf226620/latest/" +base))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String jsonBody = response.body();
            Gson gson= new Gson();
            JsonObject rootObject = gson.fromJson(jsonBody,JsonObject.class);
            JsonObject conversiones = rootObject.getAsJsonObject("conversion_rates");

            if (conversiones != null && conversiones.has(destino)) {
                return conversiones.get(destino).getAsDouble();
            } else {
                throw new RuntimeException("No se encontró la tasa de conversión para " + destino);
            }

        } catch (Exception e) {
            throw new RuntimeException("No se encontro la moneda: "+e.getMessage());
        }
    }

}
