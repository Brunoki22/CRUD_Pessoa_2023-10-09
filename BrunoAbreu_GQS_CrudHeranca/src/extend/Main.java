package extend;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Joao", 20, "123.456.789-00");
        System.out.println("Pessoa Fisica:");
        System.out.println(pessoaFisica.toString());

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", 10, "12345/0001-67", "XYZ Ltda");
        System.out.println("\nPessoa Juridica:");
        System.out.println(pessoaJuridica.toString());

        Pessoa pessoa = new Pessoa("Pedro", 20);
        System.out.println("\nPessoa Comum:");
        System.out.println(pessoa.toString());

        PessoaPessoa pessoaPessoa = new PessoaPessoa("Gabriel", 20);
        System.out.println("\nPessoa Pessoa:");
        System.out.println(pessoaPessoa.toString());
    }
}
