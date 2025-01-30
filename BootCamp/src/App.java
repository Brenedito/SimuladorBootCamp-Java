import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Teste 1: Inscrição no BootCamp
        BootCamp bootCamp = new BootCamp("Java Bootcamp", "Bootcamp de Java", LocalDate.now());
        Devs dev1 = new Devs("João");
        dev1.InscreverNoBootCamp(bootCamp.getNome());
        // Esperado: Inscrito com sucesso no BootCamp: Java Bootcamp

        // Teste 2: Inscrição em cursos
        Cursos curso1 = new Cursos("Java Básico", "Curso de introdução ao Java", 8, 150);
        dev1.InscreverCurso(curso1.getTitulo(), curso1.getDescricao(), curso1.getCargahoraria(), curso1.getXPTotal());
        // Esperado: Curso inscrito com sucesso!

        // Teste 3: Inscrição em mentorias
        Mentorias mentoria1 = new Mentorias("Mentoria de Java", "Mentoria sobre Java", 500);
        dev1.InscreverMentoria(mentoria1.getTitulo(), mentoria1.getDescricao(), mentoria1.getXPTotal());
        // Esperado: Mentoria inscrita com sucesso!

        // Teste 4: Progredir em curso
        dev1.Progredir(1, "Java Básico");
        // Esperado: Você ganhou mais uma estrela no curso: Java Básico

        // Teste 5: Progredir em mentoria
        dev1.Progredir(0, "Mentoria de Java");
        // Esperado: Você ganhou mais uma estrela na mentoria: Mentoria de Java

        // Teste 6: Calcular XP total
        Integer xpTotal = dev1.CalcularTotalXp();
        System.out.println("XP Total João: " + xpTotal);
        // Esperado: XP Total João: (XP calculado com base nas estrelas ganhas)

        // Teste 7: Exibir cursos inscritos
        System.out.println("Cursos inscritos do João: ");
        dev1.ExibirCursos();
        // Esperado: Listagem dos cursos inscritos com detalhes e XP ganho

        // Teste 8: Inscrição de outro desenvolvedor no BootCamp
        Devs dev2 = new Devs("Maria");
        dev2.InscreverNoBootCamp(bootCamp.getNome());
        // Esperado: Inscrito com sucesso no BootCamp: Java Bootcamp

        // Teste 9: Inscrição de outro desenvolvedor em cursos
        dev2.InscreverCurso(curso1.getTitulo(), curso1.getDescricao(), curso1.getCargahoraria(), curso1.getXPTotal());
        // Esperado: Curso inscrito com sucesso!

        // Teste 10: Inscrição de outro desenvolvedor em mentorias
        dev2.InscreverMentoria(mentoria1.getTitulo(), mentoria1.getDescricao(), mentoria1.getXPTotal());
        // Esperado: Mentoria inscrita com sucesso!

        // Teste 11: Progredir em curso para outro desenvolvedor
        dev2.Progredir(1, "Java Básico");
        // Esperado: Você ganhou mais uma estrela no curso: Java Básico

        // Teste 12: Progredir em mentoria para outro desenvolvedor
        dev2.Progredir(0, "Mentoria de Java");
        // Esperado: Você ganhou mais uma estrela na mentoria: Mentoria de Java

        // Teste 13: Calcular XP total para outro desenvolvedor
        Integer xpTotalMaria = dev2.CalcularTotalXp();
        System.out.println("XP Total Maria: " + xpTotalMaria);
        // Esperado: XP Total Maria: (XP calculado com base nas estrelas ganhas)

        // Teste 14: Exibir cursos inscritos para outro desenvolvedor
        System.out.println("Cursos inscritos da Maria: ");
        dev2.ExibirCursos();
        // Esperado: Listagem dos cursos inscritos com detalhes e XP ganho

        // Teste 15: Inscrição em múltiplos cursos e mentorias
        Cursos curso2 = new Cursos("Java Avançado", "Curso avançado de Java", 16, 250);
        dev1.InscreverCurso(curso2.getTitulo(), curso2.getDescricao(), curso2.getCargahoraria(), curso2.getXPTotal());
        dev2.InscreverCurso(curso2.getTitulo(), curso2.getDescricao(), curso2.getCargahoraria(), curso2.getXPTotal());
        // Esperado: Curso inscrito com sucesso! (para ambos os desenvolvedores)

        // Teste 16: Progredir em múltiplos cursos e mentorias
        dev1.Progredir(1, "Java Avançado");
        dev2.Progredir(1, "Java Avançado");
        // Esperado: Você ganhou mais uma estrela no curso: Java Avançado (para ambos os desenvolvedores)

        // Teste 17: Calcular XP total após múltiplos progressos
        Integer xpTotalJoaoAposProgresso = dev1.CalcularTotalXp();
        Integer xpTotalMariaAposProgresso = dev2.CalcularTotalXp();
        System.out.println("XP Total João após progresso: " + xpTotalJoaoAposProgresso);
        System.out.println("XP Total Maria após progresso: " + xpTotalMariaAposProgresso);
        // Esperado: XP Total João após progresso: (XP calculado com base nas estrelas ganhas)
        // Esperado: XP Total Maria após progresso: (XP calculado com base nas estrelas ganhas)

        // Teste 18: Exibir cursos inscritos após múltiplos progressos
        System.out.println("Cursos inscritos do João após progresso: ");
        dev1.ExibirCursos();
        System.out.println("Cursos inscritos da Maria após progresso: ");
        dev2.ExibirCursos();
        // Esperado: Listagem dos cursos inscritos com detalhes e XP ganho (para ambos os desenvolvedores)
    }
}
