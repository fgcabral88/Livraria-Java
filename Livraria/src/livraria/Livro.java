
package livraria;

public class Livro implements Publicacao{
    
    // Atributos:
    private String titulo;
    private String autor;
    private int totalpagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Construtor:

    public Livro(String titulo, String autor, int totalpagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalpagina = totalpagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
 

    // Gets e Sets:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpagina() {
        return totalpagina;
    }

    public void setTotalpagina(int totalpagina) {
        this.totalpagina = totalpagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //--------------------------------------------------------------------------
    
    // Método detalhes:
    public String detalhes() {
        return "======== LIVRO ========" + "\nTÍTULO: " + titulo 
                + "\nAUTOR: " + autor 
                + "\nTOTAL DE PÀGINA: " + totalpagina 
                + "\nPAGINA ATUAL: " + pagAtual 
                + "\nABERTO: " + aberto
                + "\nLEITOR: " + leitor.getNome()
                + "\nIDADE: " + leitor.getIdade()
                + "\nSEXO: " + leitor.getSexo();
    }
    
    //--------------------------------------------------------------------------
    
    @Override
    public void abri() {
        aberto = true;
    }

    @Override
    public void fechar() {
        aberto = false;
    }

    @Override
    public void folhear(int p) {
        if( p > totalpagina){
            pagAtual = 0;
        } else {
            pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        pagAtual ++;
    }

    @Override
    public void voltarPag() {
        pagAtual --;
    }
    
    
}
