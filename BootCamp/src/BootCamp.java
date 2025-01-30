import java.time.LocalDate;


public class BootCamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public BootCamp(String nome, String descricao, LocalDate dataInicio){
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataInicio.plusMonths(2);
    }

    public String getNome(){
        return nome;
    }

    // public static void main(String[] args) throws Exception {
    //     BootCamp bootCamp = new BootCamp("Java Bootcamp", "Bootcamp de Java", LocalDate.now());

    //     // Criando cursos
    //     Cursos curso1 = new Cursos("Java Básico", "Curso de introdução ao Java", 8,150);
    //     System.out.println("---------------------------------");
    //     Cursos curso2 = new Cursos("Java Avançado", "Curso avançado de Java", 16,250);
    //     System.out.println("---------------------------------");

    //     // Criando mentorias
    //     Mentorias mentoria1 = new Mentorias("Mentoria de Java", "Mentoria sobre Java", 500);
    //     System.out.println("---------------------------------");

    //     // Criando desenvolvedores
    //     Devs dev1 = new Devs("João");
    //     Devs dev2 = new Devs("Maria");
    //     System.out.println("---------------------------------");

    //     // Inscrevendo desenvolvedores no bootcamp
    //     dev1.InscreverNoBootCamp(bootCamp.getNome());
    //     dev2.InscreverNoBootCamp(bootCamp.getNome());
    //     System.out.println("---------------------------------");


    //     // Inscrevendo desenvolvedores nos cursos
    //     dev1.InscreverCurso(curso1.getTitulo(), curso1.getDescricao(), curso1.getCargahoraria(), curso1.getXPTotal());
    //     dev2.InscreverCurso(curso1.getTitulo(), curso1.getDescricao(), curso1.getCargahoraria(), curso1.getXPTotal());
    //     System.out.println("---------------------------------");

    //     dev1.InscreverCurso(curso2.getTitulo(), curso2.getDescricao(), curso2.getCargahoraria(), curso2.getXPTotal());
    //     dev2.InscreverCurso(curso2.getTitulo(), curso2.getDescricao(), curso2.getCargahoraria(), curso2.getXPTotal());
    //     System.out.println("---------------------------------");

    //     // Inscrevendo desenvolvedores nas mentorias
    //     dev1.InscreverMentoria(mentoria1.getTitulo(), mentoria1.getDescricao(), mentoria1.getXPTotal());
    //     dev2.InscreverMentoria(mentoria1.getTitulo(), mentoria1.getDescricao(), mentoria1.getXPTotal());
    //     System.out.println("---------------------------------");


    //     // Progredindo nos conteúdos
    //     dev1.Progredir(1,"Java Avançado");
    //     dev2.Progredir(1,"Java Básico");
    //     dev2.Progredir(1, "Java Avançado");
    //     System.out.println("---------------------------------");

    //     // Exibindo informações dos desenvolvedores
    //     System.out.println("Cursos inscritos do João: " );
    //     dev1.ExibirCursos();
    //     System.out.println("XP João: " + dev1.CalcularTotalXp());
    //     System.out.println("---------------------------------");

    //     System.out.println("Cursos inscritos da Maria: ");
    //     dev2.ExibirCursos();
    //     System.out.println("XP Maria: " + dev2.CalcularTotalXp());
    // }
}
