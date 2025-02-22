//package com.klkk.CMD.oauth.google.client;
//
//import com.klkk.CMD.oauth.google.dto.GoogleMemberResponse;
//import com.klkk.CMD.oauth.google.dto.GoogleToken;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.service.annotation.GetExchange;
//import org.springframework.web.service.annotation.PostExchange;
//
//import static org.springframework.http.HttpHeaders.AUTHORIZATION;
//
//public interface GoogleApiClient {
//
//    @PostExchange(url = "https://oauth2.googleapis.com/token")
//    GoogleToken fetchToken(@RequestParam MultiValueMap<String, String> params);
//
//    @GetExchange("https://www.googleapis.com/oauth2/v2/userinfo")
//    GoogleMemberResponse fetchMember(@RequestHeader(AUTHORIZATION) String bearerToken);
//}
//
