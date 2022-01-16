package com.example.Ago.Entity.DBEntities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "QUOTES")
@NoArgsConstructor
public class Quote extends DBentity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    @Setter @Getter
    private Integer Id;

    @Column(name = "OPEN")
    @Setter @Getter
    private float open ;

    @Column(name = "HIGT")
    @Setter @Getter
    private float higt;

    @Column(name = "LOW")
    @Setter @Getter
    private float low;

    @Column(name = "CLOSE")
    @Setter @Getter
    private float close;

    @Column(name = "VOLUME")
    @Setter @Getter
    private int volume;

    @Column(name = "DAY")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    @Setter @Getter
    private Date day;

    @Column(name = "TICKER")
    @Setter @Getter
    private String ticker;


    @Override
    public String toString() {
        return "Quote{" +
                "Id=" + Id +
                ", open=" + open +
                ", higt=" + higt +
                ", low=" + low +
                ", close=" + close +
                ", volume=" + volume +
                ", date='" + day + '\'' +
                ", ticker='" + ticker + '\'' +
                '}';
    }
}
