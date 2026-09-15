package cl.andesstay.bff.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class CatalogoService {

    private final RestClient restClient;

    public CatalogoService(
            RestClient.Builder restClientBuilder,
            @Value("${services.catalog.url}") String catalogUrl
    ) {
        this.restClient = restClientBuilder
                .baseUrl(catalogUrl)
                .build();
    }

    public String obtenerCatalogo() {
        return restClient
                .get()
                .uri("/api/catalog")
                .retrieve()
                .body(String.class);
    }
}