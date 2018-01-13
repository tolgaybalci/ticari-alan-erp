package com.tolgaybalci.webticarialan.ticarialanerp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Musteri extends BaseEntity{

    private String name;

    private String surname;

    private int age;

    @OneToMany
    private List<Teklifler> teklifler;
}
