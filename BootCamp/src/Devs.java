import java.util.ArrayList;

public class Devs {
    private String nome;
    private ArrayList<Mentorias> mentorias = new ArrayList<>();
    private ArrayList<Cursos> cursos = new ArrayList<>();
    private String BootCamp;
    private Integer TotalXp;

    public Devs(String nome){
        this.nome = nome;
        this.TotalXp = 0;
    }


    public void InscreverNoBootCamp(String NomeBootCamp){
        if(this.BootCamp == null){
            this.BootCamp = NomeBootCamp;
            System.out.println("Inscrito com sucesso no BootCamp: "+NomeBootCamp);
        } else{
            System.out.println("Você já está escrito em um BootCamp");
        }
        
    }

    public void InscreverMentoria(String titulo, String descricao, Integer XPTotal){
        mentorias.add(new Mentorias(titulo, descricao, XPTotal));
        System.out.println("Mentoria inscrita com sucesso!");
    }

    public void InscreverCurso(String titulo, String descricao, Integer cargahoraria, Integer XPTotal){
        cursos.add(new Cursos(titulo, descricao, cargahoraria, XPTotal));
        System.out.println("Curso inscrito com sucesso!");
    }


    public void Progredir(Integer MentoriaOuCurso, String titulo){
        switch (MentoriaOuCurso) {
            case 0:
                for(Mentorias mentoria : mentorias){
                    if(mentoria.getTitulo().equals(titulo)){
                        Mentorias mentoriaaprogredir = mentoria;
                        mentoriaaprogredir.ProgredirEstrela();
                        System.out.println("Você ganhou mais uma estrela na mentoria: "+ mentoria.getTitulo());
                    }
                }
                break;
            
            case 1:
            for(Cursos curso : cursos){
                if(curso.getTitulo().equals(titulo)){
                    Cursos cursoaprogredir = curso;
                    cursoaprogredir.ProgredirEstrela();
                    System.out.println("Você ganhou mais uma estrela no curso: "+ curso.getTitulo());
                }
            }
                break;
            

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public Integer CalcularTotalXp(){
        for(Mentorias mentoria : mentorias){
            TotalXp += mentoria.CalcularXP();
        }
        for(Cursos curso : cursos){
            TotalXp += curso.CalcularXP();
        }
        return TotalXp;
    }

    public void ExibirCursos(){
        System.out.println("Aqui estão os cursos que você possui: ");
        for(Cursos Curso : cursos){
            System.out.println("---------------------------------");
            System.out.println("Nome do Curso: ");
            System.out.println(Curso.getTitulo());
            System.out.println("XP Ganho do curso: ");
            System.out.println(Curso.CalcularXP());
            System.out.println("---------------------------------");
        }
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMentorias(ArrayList<Mentorias> mentorias) {
        this.mentorias = mentorias;
    }

    public void setCursos(ArrayList<Cursos> cursos) {
        this.cursos = cursos;
    }

    public void setBootCamp(String bootCamp) {
        BootCamp = bootCamp;
    }

    public void setTotalXp(Integer totalXp) {
        TotalXp = totalXp;
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public ArrayList<Mentorias> getMentorias() {
        return mentorias;
    }

    public ArrayList<Cursos> getCursos() {
        return cursos;
    }

    public String getBootCamp() {
        return BootCamp;
    }

    public Integer getTotalXp() {
        return TotalXp;
    }





}
