//package com.klkk.CMD.oauth.google.dto;
//
//import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
//import com.fasterxml.jackson.databind.annotation.JsonNaming;
//import com.klkk.CMD.oauth.domain.client.OauthMember;
//import com.klkk.CMD.oauth.domain.client.Provider;
//import com.klkk.CMD.oauth.domain.enums.Role;
//
//@JsonNaming(value = SnakeCaseStrategy.class)
//public record GoogleMemberResponse(
//        String id,
//        String name,
//        String email,
//        String picture
//) {
//
//    public OauthMember toDomain() {
//        return OauthMember.builder()
//                .provider(new Provider(id))
//                .name(name)
//                .email(email)
//                .picture(picture)
//                .role(Role.USER)
//                .build();
//    }
//}