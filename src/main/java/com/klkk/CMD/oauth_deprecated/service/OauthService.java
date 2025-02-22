//package com.klkk.CMD.oauth.service;
//
//import com.klkk.CMD.oauth.domain.authcode.AuthCodeRequestUrlProviderComposite;
//import com.klkk.CMD.oauth.domain.client.OauthMember;
//import com.klkk.CMD.oauth.domain.client.OauthMemberClientComposite;
//import com.klkk.CMD.oauth.domain.client.OauthMemberRepository;
//import com.klkk.CMD.oauth.domain.client.OauthServerType;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@RequiredArgsConstructor
//public class OauthService {
//
//    private final AuthCodeRequestUrlProviderComposite authCodeRequestUrlProviderComposite;
//    private final OauthMemberClientComposite oauthMemberClientComposite;
//    private final OauthMemberRepository oauthMemberRepository;
//
//    public String getAuthCodeRequestUrl(OauthServerType oauthServerType) {
//        return authCodeRequestUrlProviderComposite.provide(oauthServerType);
//    }
//
//    public Long login(OauthServerType oauthServerType, String authCode) {
//        OauthMember oauthMember = oauthMemberClientComposite.fetch(oauthServerType, authCode);
//        OauthMember saved = oauthMemberRepository.findByProvider(oauthMember.getProvider())
//                .orElseGet(() -> oauthMemberRepository.save(oauthMember));
//        return saved.getId();
//    }
//
//    @Transactional
//    public void updateValue(Long id, String comment, String name) {
//        OauthMember oauthMember = oauthMemberRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("사용자가 존재하지 않습니다."));
//        oauthMember.setComment(comment);
//        oauthMember.setName(name);
//        oauthMemberRepository.save(oauthMember);
//    }
//
//    public OauthMember findUserById(Long userId) {
//        return oauthMemberRepository.findById(userId)
//                .orElseThrow(() -> new IllegalArgumentException("User not found"));
//    }
//}
