public class BoletimEstudantil {
    public static String aprovaReprova(double notaFinal) {
        if(notaFinal > 7.0)
            return "APROVADO";
        else if(notaFinal < 4.0)
            return "REPROVADO";
        else
            return "PROVA FINAL";
    }
}
