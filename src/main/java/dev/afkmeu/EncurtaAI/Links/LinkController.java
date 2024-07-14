package dev.afkmeu.EncurtaAI.Links;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LinkController extends Link{
 private LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping("/encurta-ai")
    public ResponseEntity<LinkResponse> gerarUrlEncurtada(@RequestBody Map<String, String> request){
        String urlOriginal = request.get("urlOriginal");
        Link link = linkService.encurtarUrl(urlOriginal);

        String gerarUrlDeRedirecionamentoDoUsuario = "http://localhost:8080/r/r" + link.getUrlEncurtada();

        LinkResponse response = new LinkResponse(
                link.getId(),
                link.getUrlLonga(),
                gerarUrlDeRedirecionamentoDoUsuario,
                link.getUrlQrCode(),
                link.getUrlCriadaEm()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
