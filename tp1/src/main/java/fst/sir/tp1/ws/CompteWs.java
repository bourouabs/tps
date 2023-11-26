package fst.sir.tp1.ws;

import fst.sir.tp1.bean.Compte;
import fst.sir.tp1.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/compte/")
public class CompteWs {
    @Autowired
    private CompteService compteService;

    public int crediter(String rib, double montant) {
        return compteService.crediter(rib, montant);
    }
    @PutMapping("rib/{rib}/montant/{montant}")
    public int debiter(@PathVariable String rib, @PathVariable double montant) {
        return compteService.debiter(rib, montant);
    }

    @PostMapping("")
    public int save(@RequestBody Compte compte) {
        return compteService.save(compte);
    }

    @GetMapping("")
    public List<Compte> findAll() {
        return compteService.findAll();
    }

    @GetMapping("rib/{rib}")
    public Compte findByRib(@PathVariable String rib) {
        return compteService.findByRib(rib);
    }

    @DeleteMapping("rib/{rib}")
    public int deleteByRib(@PathVariable String rib) {
        return compteService.deleteByRib(rib);
    }

}

