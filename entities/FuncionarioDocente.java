package entities;

public class FuncionarioDocente extends Funcionario{

    private String titulacao;


    public FuncionarioDocente( String titulacao) {
        super();
        this.titulacao = titulacao;
    }

    public FuncionarioDocente(){
        super();
    }
    public FuncionarioDocente(String codigo,String nome,double salario, String titulacao) {
        super(codigo,nome,salario);
        this.titulacao =  titulacao;
    }


    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    @Override
    public void exibirRelatorio(){
        System.out.println("========= Funcionário Docente =========");
        System.out.print("Nome: " + getNome());
        System.out.print("Salário: " + getSalario());
        System.out.print("Código: " + getCodigo());
        System.out.print("Titulação: " + getTitulacao());
        System.out.println("=============================================");


    }
}
