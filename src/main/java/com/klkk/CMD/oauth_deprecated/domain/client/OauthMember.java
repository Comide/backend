//package com.klkk.CMD.oauth.domain.client;
//
//import static lombok.AccessLevel.PROTECTED;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import com.klkk.CMD.chat.entity.Chat;
//import com.klkk.CMD.friendShip.entity.FriendShip;
//import com.klkk.CMD.group.entity.GroupMember;
//import com.klkk.CMD.oauth.domain.enums.Role;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Builder
//@AllArgsConstructor
//@Getter
//@Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Table(name = "Users",
//        uniqueConstraints = {
//                @UniqueConstraint(
//                        name = "oauth_id_unique",
//                        columnNames = {
//                                "provider_id"
//                                //"provider"
//                        }
//                ),
//        }
//)
//public class OauthMember {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Embedded
//    private Provider provider;
//    private String name;
//    private String email;
//    private String picture;
//    private String comment;
//
//    @Enumerated(EnumType.STRING)
//    private Role role;
//
//    public String getRoleKey() {
//        return this.role.getKey();
//    }
//
//    @OneToMany(mappedBy = "sender")
//    @JsonManagedReference
//    private List<FriendShip> sentFriendRequests = new ArrayList<>();
//
//    @OneToMany(mappedBy = "receiver")
//    @JsonManagedReference
//    private List<FriendShip> receivedFriendRequests = new ArrayList<>();
//
//    @OneToMany(mappedBy = "chatSender")
//    @JsonManagedReference
//    private List<Chat> messages = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    @JsonManagedReference
//    private List<GroupMember> groupMembers = new ArrayList<>();
//}
