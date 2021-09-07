package com.dio.live.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class NivelDeAcesso {
    @Id
    private Long id;
    private String descricao;
}
