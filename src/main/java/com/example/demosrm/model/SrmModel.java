package com.example.demosrm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class SrmModel {
    @Id
    private String locIndentId;

    private String locCode;

    private String divCode;

    private String zCode;

    private String iType;

    private String sType;
}
