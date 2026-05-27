package br.com.grp.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao) {

    public DadosSerie(String titulo, Integer totalTemporadas, String avaliacao) {
        this.titulo = titulo;
        if (totalTemporadas == null) {
            this.totalTemporadas = 0;
        }
        else {
            this.totalTemporadas = totalTemporadas;
        }
        this.avaliacao = avaliacao;
    }
        ;
}
