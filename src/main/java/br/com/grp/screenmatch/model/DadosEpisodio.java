package br.com.grp.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Episode") Integer numero,
        @JsonAlias("imdbRating") String avaliacao,
        @JsonAlias("Released") String dataLancamento) {

    public DadosEpisodio(String titulo, Integer numero, String avaliacao, String dataLancamento) {
        this.titulo = titulo;
        this.numero = numero;
        if (avaliacao == null) {
            this.avaliacao = "";
        } else {
            this.avaliacao = avaliacao;
        }
        if (dataLancamento == null) {
            this.dataLancamento = "";
        } else {
            this.dataLancamento = dataLancamento;
        }
    }
}
