package com.example.aulas.aulas4.controller;


import com.example.aulas.aulas4.model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public String inicio() {
        return "Bem-vinda ao Pet Shop Elas Tech!";
    }

    @GetMapping("/horario")
    public String horario() {
        return "Abrimos de segunda a sábado, das 8h às 18h.";
    }

    @GetMapping("/destaque")
    public Pet destaque() {
        return new Pet("Thor", "Cachorro", 3);
    }

    @GetMapping("/adotar/{nome}")
    public String adotar(@PathVariable String nome) {
        return "Parabéns! Você adotou " + nome + "!";
    }

    @GetMapping("/banho")
    public String banho(
            @RequestParam(defaultValue =  "Seu pet") String pet) {
        return pet + " está tomando banho!";

    }

    @GetMapping("/novo/{nome}")
    public Pet novoPet(@PathVariable String nome){
        return new Pet(nome, "Gato", 1);
    }

    @GetMapping("/idade-humana")
    public String idadeHumana(@RequestParam int anos) {
        int idadeHumana = anos * 7;

        return anos + " anos de pet equivale a " + idadeHumana + " anos humano!";
    }

    @GetMapping("/consulta")
    public String consulta(
            @RequestParam String pet,
            @RequestParam String vet) {
        return pet + " tem consulta com a DRA. " + vet + "!";
    }



}
