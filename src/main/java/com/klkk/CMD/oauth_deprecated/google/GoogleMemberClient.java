//package com.klkk.CMD.oauth.google;
//
//import com.klkk.CMD.oauth.config.oauth.GoogleOauthConfig;
//import com.klkk.CMD.oauth.domain.client.OauthMember;
//import com.klkk.CMD.oauth.domain.client.OauthMemberClient;
//import com.klkk.CMD.oauth.domain.client.OauthServerType;
//import com.klkk.CMD.oauth.google.client.GoogleApiClient;
//import com.klkk.CMD.oauth.google.dto.GoogleMemberResponse;
//import com.klkk.CMD.oauth.google.dto.GoogleToken;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//
//@Component
//@RequiredArgsConstructor
//public class GoogleMemberClient implements OauthMemberClient {
//
//    private final GoogleApiClient googleApiClient;
//    private final GoogleOauthConfig googleOauthConfig;
//
//    @Override
//    public OauthServerType supportServer() {
//        return OauthServerType.GOOGLE;
//    }
//
//    @Override
//    public OauthMember fetch(String authCode) {
//        GoogleToken tokenInfo = googleApiClient.fetchToken(tokenRequestParams(authCode));
//        GoogleMemberResponse googleMemberResponse =
//                googleApiClient.fetchMember("Bearer " + tokenInfo.accessToken());
//        return googleMemberResponse.toDomain();
//    }
//
//    private MultiValueMap<String, String> tokenRequestParams(String authCode) {
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("grant_type", "authorization_code");
//        params.add("client_id", googleOauthConfig.clientId());
//        params.add("client_secret", googleOauthConfig.clientSecret());
//        params.add("code", authCode);
//        params.add("redirect_uri", googleOauthConfig.redirectUri());
//        return params;
//    }
//}
