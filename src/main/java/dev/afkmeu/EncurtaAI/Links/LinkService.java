package dev.afkmeu.EncurtaAI.Links;
import jdk.dynalink.linker.LinkerServices;
import org.antlr.v4.runtime.misc.LogManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public  LinkService  {
    private LinkService linkService;

    public LinkerService(LinkService linkService) {
        this.linkService = linkService;
    }

    public String gerarUrlAleatoria (){
        return RandomStringUtils.randomAlphanumeric(5,10);
    }

    public Link encurtarUrl(String urlOriginal) {
        Link link = new Link();
        link.setUrlLonga(urlOriginal);
        link.setUrlEncurtada(gerarUrlAleatoria());
        link.setUrlCriadaEm(LocalDateTime.now());
        link.setUrlQrCode("NaO DISPONiVEL");
        return linkRepository.save(link);
    }

    public Link obterUrlOriginal(String urlEncurtada){
        try {
            return linkRepository.findByUrlOriginal(urlEncurtada);
        } catch (Exception erro){
            throw new RuntimeException("url nao existe");
        }
    }


}
