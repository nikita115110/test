package com.example.Ago.Entity.DBEntities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "UPDATEQUOTES")
@NoArgsConstructor
public class UpdateQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    @Setter @Getter
    private Integer Id;

    @Column(name = "TICKER")
    @Setter @Getter
    private String ticker;

    @Column(name = "DATEUPDATERECORD")
    @Temporal(TemporalType.DATE)
    @Setter @Getter
    private Date dateUpdateRecord;

    @Column(name = "DATEUPDATEJSONFILE")
    @Temporal(TemporalType.DATE)
    @Setter @Getter
    private Date dateUpdateJsonFile;

    @Override
    public String toString() {
        return "UpdateQuote{" +
                "Id=" + Id +
                ", dateUpdateRecord=" + dateUpdateRecord +
                ", dateUpdateJsonFile=" + dateUpdateJsonFile +
                '}';
    }
}
