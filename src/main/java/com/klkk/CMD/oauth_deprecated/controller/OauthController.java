//package com.klkk.CMD.oauth.controller;
//
//import com.klkk.CMD.board.ResultVO;
//import com.klkk.CMD.friendShip.service.FriendShipService;
//import com.klkk.CMD.oauth.domain.client.OauthMember;
//import com.klkk.CMD.oauth.domain.client.OauthServerType;
//import com.klkk.CMD.oauth.google.dto.GoogleMemberDto;
//import com.klkk.CMD.oauth.service.OauthService;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;
//import lombok.SneakyThrows;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RequiredArgsConstructor
//@RequestMapping("/api/oauth")
//@RestController
//public class OauthController {
//
//    private final OauthService oauthService;
//    private final FriendShipService friendShipService;
//
//    @SneakyThrows
//    @GetMapping("/{oauthServerType}")
//    ResponseEntity<Void> redirectAuthCodeRequestUrl(
//            @PathVariable OauthServerType oauthServerType,
//            HttpServletResponse response
//    ) {
//        String redirectUrl = oauthService.getAuthCodeRequestUrl(oauthServerType);
//        response.sendRedirect(redirectUrl);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/login/{oauthServerType}")
//    ResponseEntity<GoogleMemberDto> login(@PathVariable OauthServerType oauthServerType, @RequestParam("code") String code) {
//        Long userId = oauthService.login(oauthServerType, code);
//        if (userId != null) {
//            OauthMember oauthMember = oauthService.findUserById(userId);
//            if (oauthMember != null) {
//                GoogleMemberDto googleMemberDto = new GoogleMemberDto();
//                googleMemberDto.setId(oauthMember.getId());
//                googleMemberDto.setEmail(oauthMember.getEmail());
//                googleMemberDto.setName(oauthMember.getName());
//                googleMemberDto.setPicture(oauthMember.getPicture());
//                googleMemberDto.setProvider(oauthMember.getProvider());
//                googleMemberDto.setRole(oauthMember.getRoleKey());
//                googleMemberDto.setComment(oauthMember.getComment());
//
//                return ResponseEntity.ok(googleMemberDto);
//            } else {
//                return ResponseEntity.notFound().build();
//            }
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping("/update-value")
//    public ResultVO updateValue(@RequestBody GoogleMemberDto requestData) {
//        ResultVO resultVO = new ResultVO(false, null);
//        Long id = requestData.getId();
//        String comment = requestData.getComment();
//        String name = requestData.getName();
//
//        oauthService.updateValue(id, comment, name);
//        resultVO.setSuccess(true);
//        OauthMember oauthMember = oauthService.findUserById(id);
//        if (oauthMember != null) {
//            GoogleMemberDto googleMemberDto = new GoogleMemberDto();
//            googleMemberDto.setId(oauthMember.getId());
//            googleMemberDto.setEmail(oauthMember.getEmail());
//            googleMemberDto.setName(oauthMember.getName());
//            googleMemberDto.setPicture(oauthMember.getPicture());
//            googleMemberDto.setProvider(oauthMember.getProvider());
//            googleMemberDto.setComment(oauthMember.getComment());
//            resultVO.setResult(googleMemberDto);
//        } else {
//            resultVO.setSuccess(false);
//        }
//
//        return resultVO;
//    }
//
//    @GetMapping("/get-user-name.do")
//    public ResultVO getRequest(@RequestParam Long userId) {
//        ResultVO resultVO = new ResultVO(false, null);
//        OauthMember oauthMember = oauthService.findUserById(userId);
//        resultVO.setResult(oauthMember.getName());
//        resultVO.setSuccess(true);
//        return resultVO;
//    }
//
//    @GetMapping("/get-user-data.do")
//    public ResultVO getUserData(@RequestParam Long userId) {
//        ResultVO resultVO = new ResultVO(false, null);
//        OauthMember oauthMember = oauthService.findUserById(userId);
//        if (oauthMember != null) {
//            GoogleMemberDto googleMemberDto = new GoogleMemberDto();
//            googleMemberDto.setId(oauthMember.getId());
//            googleMemberDto.setEmail(oauthMember.getEmail());
//            googleMemberDto.setName(oauthMember.getName());
//            googleMemberDto.setPicture(oauthMember.getPicture());
//            googleMemberDto.setProvider(oauthMember.getProvider());
//            googleMemberDto.setComment(oauthMember.getComment());
//            resultVO.setSuccess(true);
//            resultVO.setResult(googleMemberDto);
//        } else {
//            resultVO.setSuccess(false);
//        }
//        return resultVO;
//    }
//
//    @GetMapping("/getUserEmail")
//    public ResultVO getEmail(@RequestParam Long userId) {
//        ResultVO resultVO = new ResultVO(false, null);
//        OauthMember oauthMember = oauthService.findUserById(userId);
//        resultVO.setResult(oauthMember.getEmail());
//        resultVO.setSuccess(true);
//        return resultVO;
//    }
//}
