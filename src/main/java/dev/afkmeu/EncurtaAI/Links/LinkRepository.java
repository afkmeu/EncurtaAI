package dev.afkmeu.EncurtaAI.Links;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface LinkRepository extends JpaRepository<Link, Long>{

    Link findByUrlOriginal(String urlEncurtada);


}
