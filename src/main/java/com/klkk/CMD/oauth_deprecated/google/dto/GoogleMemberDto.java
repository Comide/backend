//package com.klkk.CMD.oauth.google.dto;
//
//import com.klkk.CMD.oauth.domain.client.OauthMember;
//import com.klkk.CMD.oauth.domain.client.Provider;
//import lombok.*;
//
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//public class GoogleMemberDto {
//    private Long id;
//    private String email;
//    private String name;
//    private String picture;
//    private Provider provider;
//    private String comment;
//    private String role;
//
//    public OauthMember toEntity() {
//        OauthMember oauthMember = OauthMember.builder()
//                .id(id)
//                .email(email)
//                .name(name)
//                .provider(provider)
//                .picture(picture)
//                .comment(comment)
//                .build();
//        return oauthMember;
//    }
//
//    @Builder
//    public GoogleMemberDto(Long id, Provider provider, String name, String email, String picture, String comment) {
//        this.id = id;
//        this.provider = provider;
//        this.name = name;
//        this.email = email;
//        this.picture = picture;
//        this.comment = comment;
//    }
//}
//
