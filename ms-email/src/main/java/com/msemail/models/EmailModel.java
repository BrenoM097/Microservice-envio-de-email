package com.msemail.models;

import com.msemail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT") //para inserir mais caracteres do que o limite dos campos String(255 caracteres)
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
