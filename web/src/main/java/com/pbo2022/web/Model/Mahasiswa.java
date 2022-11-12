package com.pbo2022.web.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String alamat;
    private String noHp;
}
