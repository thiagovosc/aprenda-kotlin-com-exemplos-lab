// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class State { Basic, Intermediate, Advanced }

fun main() {
    val state = State.Basic
    val message = when (state)
    {                     
        State.Basic -> "Basic!"
        State.Intermediate -> "Intermediate!"
        State.Advanced -> "Advanced!" }
 
    println(message)
 
}

class Usuario

data class EducationalContent(val name: String, val TimeStudying: Int) {          
    override fun equals(other: Any?) =
        other is EducationalContent && other.TimeStudying == this.TimeStudying             
}
fun main() {
    val EducationalContent = EducationalContent("Philip", 24)
    println(EducationalContent)                                          }




data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
