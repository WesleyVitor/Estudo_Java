package Static.Atividade1;

public class Livro {
   private String titulo;
   private String autor;
   private String editora;
   private int edicao;
   private String genero;
   public static String[] tipo_genero = {"FICCÃO", "CIÊNCIAS_NATURAIS", "LITERATURA", "CIÊNCIAS_HUMANAS"};

   public Livro(){
      super();
   }
   public Livro(String titulo, String autor, String editora, int edicao, String genero){
      this.titulo = titulo;
      this.autor = autor;
      this.editora = editora;
      this.edicao = edicao;
      this.genero = genero;
   }

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

   public String getEditora() {
      return editora;
   }

   public void setEditora(String editora) {
      this.editora = editora;
   }

   public int getEdicao() {
      return edicao;
   }

   public void setEdicao(int edicao) {
      this.edicao = edicao;
   }

   public String getGenero() {
      return this.genero;
   }

   public void setGenero(String genero) {
      this.genero = genero;
   }

   public static void main(String[] args) {
      Livro lv1 = new Livro("Viagens no tempo",
              "Chico aguiar", "Saraiva", 2000, "Ficcão");

      Livro lv2 = new Livro();

      System.out.println("Livro 1:");
      System.out.println(lv1.getGenero());
      System.out.println("Livro 2:");
      System.out.println(lv2.getGenero());
      System.out.println();
      System.out.println(Livro.tipo_genero[0]);
   }
}
