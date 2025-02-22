//package com.klkk.CMD.oauth.domain.client;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface OauthMemberRepository extends JpaRepository<OauthMember, Long> {
//    Optional<OauthMember> findByProvider(Provider provider);
//
//    List<OauthMember> findByNameContaining(String name);
//}