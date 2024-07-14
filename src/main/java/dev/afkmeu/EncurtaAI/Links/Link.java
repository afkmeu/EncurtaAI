package dev.afkmeu.EncurtaAI.Links;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="links_dos_otarios")
public class Link {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlLonga;
    private String urlEncurtada;
    private String urlQrCode;
    private LocalDateTime urlCriadaEm;


    public Link(Long id, String urlLong, String urlEncurtada, String urlQrCode, LocalDateTime urlCriadaEm) {
        this.id = id;
        this.urlLonga = urlLong;
        this.urlEncurtada = urlEncurtada;
        this.urlQrCode = urlQrCode;
        this.urlCriadaEm = urlCriadaEm;
    }

    public Link() {
    }

    public Link(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlLonga() {
        return urlLonga;
    }

    public void setUrlLonga(String urlLonga) {
        this.urlLonga = urlLonga;
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    public String getUrlQrCode() {
        return urlQrCode;
    }

    public void setUrlQrCode(String urlQrCode) {
        this.urlQrCode = urlQrCode;
    }

    public LocalDateTime getUrlCriadaEm() {
        return urlCriadaEm;
    }

    public void setUrlCriadaEm(LocalDateTime urlCriadaEm) {
        this.urlCriadaEm = urlCriadaEm;
    }


}
