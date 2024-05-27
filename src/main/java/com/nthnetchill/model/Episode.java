package com.nthnetchill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "episode")
public class Episode extends Base{
    @ManyToOne
    @JoinColumn(name = "seasion_id")
    Seasion seasion;

    private String name;
    private String videoUrl;
}
