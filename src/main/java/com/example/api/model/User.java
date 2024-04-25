package com.example.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "이름을 입력하세요.")
    @Size(max = 50)
    private String name;  // 필드 이름을 userName으로 변경

    @NotBlank(message = "닉네임을 입력하세요")
    @Size(max = 50)
    private String nickName;

    @NotBlank(message = "비밀번호를 입력하세요.")
    @Size(max = 120)
    private String password;

    @NotBlank(message = "이메일을 입력하세요.")
    @Size(max = 50)
    @Email
    private String email;

    @Builder
    public User(String name, String nickName, String password, String email) {
        this.name = name;  // 생성자 및 빌더에서도 name으로 변경
        this.nickName = nickName;
        this.password = password;
        this.email = email;
    }
}