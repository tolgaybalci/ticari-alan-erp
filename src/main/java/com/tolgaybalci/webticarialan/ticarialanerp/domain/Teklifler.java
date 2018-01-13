package com.tolgaybalci.webticarialan.ticarialanerp.domain;

import com.sun.istack.internal.Interned;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static java.time.temporal.WeekFields.ISO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teklifler extends BaseEntity{

    private String reference;

    private String musteri_reference;

    @OneToMany
    private List<Musteri> musteri;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date tarih;

    private int gecerlilikSuresi;

    private OdemeKosullari odemeKosullari;

    private Kaynak kaynak;

    private OdemeTuru odemeTuru;

    private TeslimSuresi teslimSuresi;

    private SevkiyatYontemi sevkiyatYontemi;

    private Date teslimTarihi;

    private UluslararasiTicaretTerimleri uluslararasiTicaretTerimleri;

    private VarsayilanDokumanSablonu varsayilanDokumanSablonu;

    private ParaBirimi paraBirimi;

    @Lob
    private String not_genel;

    @Lob
    private String not_ozel;

}
