package dev.java10x.CadastroDeNinja.Missoes;

public enum RankEnum {
  RANK_S("Rank S"),
  RANK_A("Rank A"), 
  RANK_B("Rank B"),
  RANK_C("Rank C"),
  RANK_D("Rank D");

  private String rank;

  private RankEnum(String rank) {
    this.rank = rank;
  }

  public String getRank() {
    return this.rank;
  }
}
