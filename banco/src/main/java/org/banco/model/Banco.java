package org.banco.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banco.service.Conta;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Banco<T> {

    private String nome;
    private List<T> contas;

}
