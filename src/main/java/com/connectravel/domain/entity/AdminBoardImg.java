package com.connectravel.domain.entity;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "adminBoard")
public class AdminBoardImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ino;

    @Column(length = 200)
    private String imgFile;

    /* 연관 관계 */
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AdminBoard adminBoard;

}