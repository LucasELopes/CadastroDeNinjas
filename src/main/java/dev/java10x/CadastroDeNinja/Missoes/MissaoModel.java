package dev.java10x.CadastroDeNinja.Missoes;

import java.util.List;

import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Missoes")
public class MissaoModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private RankEnum rank;

  // @OneToMany uma missão pode ter muitos ninjas
  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninja;
  
  public MissaoModel(Long id, String nome, RankEnum rank) {
    this.id = id;
    this.nome = nome;
    this.rank = rank;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public RankEnum getRank() {
    return rank;
  }

  public void setRank(RankEnum rank) {
    this.rank = rank;
  }
}
