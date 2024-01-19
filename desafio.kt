// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)


enum class State { Basic, Intermediate, Advanced }

  val state = State.Basic
    val message = when (state)
    {
        State.Basic -> "Basic!"
        State.Intermediate -> "Intermediate!"
        State.Advanced -> "Advanced!" }

data class User(val name: String)

data class EducationalContent(val name: String, val TimeStudying: Int) {          
    override fun equals(other: Any?) =
        other is EducationalContent && other.TimeStudying == this.TimeStudying  }           

data class Education(val name: String, var content: List<EducationalContent>) 

    val registered = mutableListOf<User>()
    
    fun enroll(user: User) {
        TODO("Utilize o parâmetro $user para simular uma matrícula (usar a lista de $registered).")
      registered.add(user)
    }

 {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")}

    fun main() {
    var educationalContents = mutableListOf( EducationalContent("Strings", 10), EducationalContent("Collections", 20))
    val education = Education("Kotlin", educationalContents)
    var thiago = User("Thiago")
   education.enroll(thiago)    } 