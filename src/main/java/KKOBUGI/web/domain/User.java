package KKOBUGI.web.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@JsonAutoDetect
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    @NotNull
    private Long id;

    private String login_Id;
    private String login_Pw;
    private String nickname;

    public User(Long id, String login_Id, String login_Pw, String nickname) {
        this.id = id;
        this.login_Id = login_Id;
        this.login_Pw = login_Pw;
        this.nickname = nickname;
    }

    public User(){}
}
