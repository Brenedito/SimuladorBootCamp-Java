public class Cursos {
    private String titulo;
    private String descricao;
    private Integer cargahoraria;
    private Integer XPTotal;
    private Integer Estrelas;
    private Integer XpPorEstrela;

    public Cursos(String titulo, String descricao, Integer cargahoraria,Integer XPTotal){
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargahoraria = cargahoraria;
        this.XPTotal = XPTotal;
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

    public Integer getEstrelas(){
        return Estrelas;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public Integer getXPTotal() {
        return XPTotal;
    }

    //Setters

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public void setXPTotal(Integer XPTotal) {
        this.XPTotal = XPTotal;
    }



}
