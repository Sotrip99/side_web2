package com.jellybean.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KdtMemberResponse {

        private boolean isExist;
        private String name;
        private String email;
        private String phone;
        private String phoneNumberText;
        private String birth;
        private LocalDate date;
        private boolean agreeCollect;
        private boolean agreeThirdParty;
        private String experience;
        private String experienceText;
        private String finalEducation;
        private String getCard;
        private String getEx;
        private String grade;
        private String pathText;
        private String paths;
        private String reason;
        private String recommend;
        private String id;

        public KdtMemberResponse(boolean isExist) {
                this.isExist = isExist;
        }
}
