package kr.hs.dgsw.board_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String account;
    private String password;
    private String username;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
}
