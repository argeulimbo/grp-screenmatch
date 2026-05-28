package br.com.grp.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao,
        @JsonAlias("Genre") String genero,
        @JsonAlias("Actors") String atores,
        @JsonAlias("Poster") String poster,
        @JsonAlias("Plot") String sinopse) {

    public DadosSerie(String titulo, Integer totalTemporadas, String avaliacao, String genero, String atores, String poster, String sinopse) {
        this.titulo = titulo;
        if (totalTemporadas == null) {
            this.totalTemporadas = 0;
        }
        else {
            this.totalTemporadas = totalTemporadas;
        }
        this.avaliacao = avaliacao;
        this.genero = genero;
        this.atores = atores;
        this.poster = poster;
        this.sinopse = sinopse;
    }
}
