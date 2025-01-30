import java.util.Date;

public class Mentorias {
    
    private String titulo;
    private String descricao;
    private Date datamentoria;
    private Integer XPTotal;
    private Integer Estrelas;
    private Integer XpPorEstrela;


    public Mentorias(String titulo, String descricao, Integer XPTotal){
        this.titulo = titulo;
        this.descricao = descricao;
        this.XPTotal = XPTotal;
        this.datamentoria = new Date();
        this.Estrelas = 0;
        this.XpPorEstrela = XPTotal/5;
    }

    public Integer CalcularXP(){
        return XpPorEstrela * Estrelas;
    }

    public void ProgredirEstrela(){
        this.Estrelas += 1;
    }

    //Getters

    public Date getDatamentoria() {
        return datamentoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getXPTotal() {
        return XPTotal;
    }

  
    //Setters

    public void setDatamentoria(Date datamentoria) {
        this.datamentoria = datamentoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setXP(Integer XP) {
        this.XPTotal = XP;
    }

   


}
