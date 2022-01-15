package io.vepo.graphql.tiquetes;

import java.util.List;
import java.util.Arrays;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import io.vertx.core.cli.annotations.Description;

@GraphQLApi
public class TiqueteResource {

    private List<Tiquete> tiquetes = Arrays.asList(new Tiquete(6942, 
                                                               "Erro ao criar Tíquete", 
                                                               "A API de criação de tíquetes retorna erro 500 quando nenhuma tag é associada.",
                                                               "PRJ-001",
                                                               "CRIAR-TIQUETE",
                                                               Arrays.asList("Java", "REST", "CRUD"),
                                                               null,
                                                               new Usuario(124, 
                                                                           "vepo",
                                                                           "vepo@vepo.com.br",
                                                                           "Victor",
                                                                           "Osório"),
                                                               Arrays.asList()));

    @Query("listarTodosTiquetes")
    @Description("Listar todos os tíquetes")
    public List<Tiquete> listarTodosTiquetes() {
        return tiquetes;
    }
    
    @Query("encontrarTiquete")
    @Description("Find issue")
    public List<Tiquete> encontrarTiquete(@Name("titulo") String titulo) {
        return tiquetes;
    }
}