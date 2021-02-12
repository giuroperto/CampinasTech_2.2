package aula2

// nao precisa escrever constructor e nem chaves para criar o construtor
// data class e uma classe so para armazenar dados
data class Livro ( var titulo: String,
              var numeroPaginas: Int,
              var autor: String,
              var editora: String,
              var seEstaAlugado: Boolean = false)

// nao ha necessidade de metodos getter e setters, mas podem ser declarados se quiser

//class `Aula 2`.Livro {
//    private var titulo : String
//    private var numeroPaginas : Int
//    private var autor : String
//    private var editora : String
//    private var seEstaAlugado : Boolean
//
//    // como as variaveis sao privadas, deveriam ter o private na frente
//
//    // construtor nao deve aceitar null
//    // uma classe pode ter mais de um construtor, mas se tiver so uma
//    // construtor primario -> pode ser feito de outra maneira -> acima
//    constructor(tituloInserido: String,
//                numeroPaginasInserido: Int,
//                autorInserido: String,
//                editoraInserido: String,
//                seEstaAlugadoInserido: Boolean = false) {
//        // nao precisa usar o this, a nao ser que precise referenciar que e aquele de fora
////        this.titulo = tituloInserido
//        titulo = tituloInserido
//        numeroPaginas = numeroPaginasInserido
//        autor = autorInserido
//        editora = editoraInserido
//        seEstaAlugado = seEstaAlugadoInserido
//    }
//
//}

//Em Java
/*
* // classe publica pois outras classes podem acessar, ou por exemplo a fun `Aula 2`.main()
* public class `Aula 2`.Livro {
*   private String titulo;
*   private int paginas;
*   private String autor;
*   private String editora;
*   private bool seEstaAlugado;
*
*   // metodo construtor sempre vai ter nome da classe e vai ser publico
*
*   public `Aula 2`.Livro(String titulo, int Paginas, String autor, String editora) {
*       titulo = titulo;
*   }
*
*   public String getTitle() {
*       return titulo;
*   }
*
*   public void setTitle(String tituloInserido) {
*       this.titulo = tituloInserido
*   }
* }
* */