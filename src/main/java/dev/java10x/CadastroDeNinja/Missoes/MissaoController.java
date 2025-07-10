package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.GetMapping;

public class MissaoController {
  
  @GetMapping("/missoes")
  public String index() {
    return "Dale missoes";
  }
}
