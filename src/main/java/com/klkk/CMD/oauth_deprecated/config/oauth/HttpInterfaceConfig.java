//package com.klkk.CMD.oauth.config.oauth;
//
//import com.klkk.CMD.oauth.google.client.GoogleApiClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.client.support.WebClientAdapter;
//import org.springframework.web.service.invoker.HttpServiceProxyFactory;
//
//@Configuration
//public class HttpInterfaceConfig {
//
//    @Bean
//    public GoogleApiClient googleApiClient() {
//        return createHttpInterface(GoogleApiClient.class);
//    }
//
//    private <T> T createHttpInterface(Class<T> clazz) {
//        WebClient webClient = WebClient.create();
//        HttpServiceProxyFactory build = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient)).build();
//        return build.createClient(clazz);
//    }
//}