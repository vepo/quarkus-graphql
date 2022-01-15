package io.vepo.graphql.tiquetes;

import java.util.List;
import javax.validation.constraints.NotNull;

public record Tiquete (int id, 
                       @NotNull String titulo, 
                       String descricao,
                       @NotNull String projeto,
                       String epico,
                       List<String> tags,
                       Usuario responsavel,
                       @NotNull Usuario criador,
                       List<Usuario> observadores) {
   
}