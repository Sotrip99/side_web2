package com.jellybean.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "kdtapp")     //kdt 신청
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KdtAppEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kdtappNo", nullable = false)
    private Long kdtappNo;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "phone", length = 100, nullable = false)
    private String phone;

    @Column(name = "phoneNumberText", length = 100, nullable = false)
    private String phoneNumberText;

    @Column(name = "date", length = 100, nullable = false)
    private LocalDate date;

    @Column(name = "birth", length = 100, nullable = false)
    private String birth;

    @Column(name = "agreeCollect", nullable = false)
    private boolean agreeCollect;

    @Column(name = "agreeThirdParty", nullable = false)
    private boolean agreeThirdParty;

    @Column(name = "experience", length = 100, nullable = false)
    private String experience;

    @Column(name = "experienceText", length = 200, nullable = false)
    private String experienceText;

    @Column(name = "finalEducation", length = 200, nullable = false)
    private String finalEducation;

    @Column(name = "getCard", length = 100, nullable = false)
    private String getCard;

    @Column(name = "getEx", length = 100, nullable = false)
    private String getEx;

    @Column(name = "grade", length = 100, nullable = false)
    private String grade;

    @Column(name = "pathText", length = 200, nullable = false)
    private String pathText;

    @Column(name = "paths", length = 200, nullable = false)
    private String paths;

    @Column(name = "reason", length = 400, nullable = false)
    private String reason;

    @Column(name = "recommend", length = 200, nullable = false)
    private String recommend;

    @Column(name = "id", length = 200, nullable = true)
    private String id;
}
