package com.huh.BaekJoonSupporter.line;

import com.huh.BaekJoonSupporter.team.Team;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String token;

    @OneToOne(fetch = FetchType.LAZY)
    private Team team;

    @Builder
    public Line(Long id, String token, Team team) {
        this.id = id;
        this.token = token;
        this.team = team;
    }

}