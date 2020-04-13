
package livraria;

public class Livraria {

    public static void main(String[] args) {
        
        // Instânciar:
        Pessoa[] p = new Pessoa[2];
        
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Felipe", 31, "M");
        p[1] = new Pessoa("Keytty", 30, "F");
        
        l[0] = new Livro("Aprendendo java", "José da silva", 300, p[0]);
        l[1] = new Livro("Aprendendo C#", "Maria da silva", 200, p[1]);
        l[2] = new Livro("Inteligencia emocional", "Keytty da silva", 800, p[1]);
        
        l[0].abri();
        l[0].folhear(10);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
    }
    
}
