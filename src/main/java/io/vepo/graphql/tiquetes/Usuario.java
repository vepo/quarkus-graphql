package io.vepo.graphql.tiquetes;

import javax.validation.constraints.NotNull;

public record Usuario (int id, 
                       @NotNull String username, 
                       @NotNull String email, 
                       String nome, 
                       String sobrenome) {
    
}
