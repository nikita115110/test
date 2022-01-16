package com.example.Ago.Entity.DBEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "COMPANIES")
@NoArgsConstructor
public class Company extends DBentity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    @Getter @Setter
    private Integer Id;

    @Column(name = "FULLNAME")
    @Getter @Setter
    private String fullname;

    @Column(name = "TICKER")
    @Getter @Setter
    private String ticker;

    @Column(name = "CURRENCY")
    @Getter @Setter
    private String currency;

    @Override
    public String toString() {
        return "Company{" +
                "Id=" + Id +
                ", fullname='" + fullname + '\'' +
                ", ticker='" + ticker + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
