package entities;

public class FuncionarioTecnico extends Funcionario{

    private String nivel;

    public FuncionarioTecnico(){
        super();
    }
    public FuncionarioTecnico(String codigo,String nome,double salario, String nivel) {
        super(codigo,nome,salario);
        this.nivel = nivel;
     }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    @Override
    public void exibirRelatorio() {
        System.out.println("========== Funcionário Tecnico ==============");
        System.out.print("Nome: " + getNome());
        System.out.print("Salário: " + getSalario());
        System.out.print("Código: " + getCodigo());
        System.out.print("Nível: " + getNivel());
        System.out.println("=============================================");
    }
}
