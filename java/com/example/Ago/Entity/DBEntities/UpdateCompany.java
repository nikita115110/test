package com.example.Ago.Entity.DBEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "UPDATECOMPANIES")
@NoArgsConstructor
public class UpdateCompany {

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

    @Column(name = "DATEUPDATEFILE")
    @Temporal(TemporalType.DATE)
    @Setter @Getter
    private Date dateUpdateFile;

    @Override
    public String toString() {
        return "UpdateCompany{" +
                "Id=" + Id +
                ", ticker='" + ticker + '\'' +
                ", dateUpdateRecord=" + dateUpdateRecord +
                ", dateUpdateFile=" + dateUpdateFile +
                '}';
    }
}
