fun main() {
    //Imprime no console a mensagem de boas-vindas e o status de carregamento do sistema
    println("Sistema de Criação de personagens RPG \nCarregando sistema... [OK]");

    val anoNascimento = 1800;
    // anoNascimento = 1900; Simulação de maldição temporal

    var idadePersonagem: Int = 20;

    println("O personagem tem $idadePersonagem anos de idade, e nasceu no ano de $anoNascimento.");
    println("Um ano se passa...");
    idadePersonagem++;
    println("O personagem tem $idadePersonagem anos de idade, e nasceu no ano de $anoNascimento.");

    var nivelPersonagem: Double = 1.0;

    val classePersonagem = "Melee";
    var manaPersonagem = 50.5;
    // manaPersonagem = "Muita mana!"; erro de inferição de tipo

    // inferições explicitas:

    var pontosDeVida: Int = 100;
    var ouroAcumulado: Long = 5_000_000_000L;
    var taxaDeAcerto: Float = 95.5f;
    var multiplicadorDeDano: Double = 1.5555;

    var estaVivo: Boolean = true;

    var nomePersonagem: String = "Argo";

    println("Personagem 1: \nNome: $nomePersonagem Classe: $classePersonagem\nIdade: ${idadePersonagem + 5} anos\nPontos de Vida: $pontosDeVida\nMana: $manaPersonagem\nNivel: $nivelPersonagem\nOuro Acumulado: ${ouroAcumulado / 1000}\nTaxa de Acerto: $taxaDeAcerto%\nMultiplicador de Dano: $multiplicadorDeDano\nEstá Vivo? $estaVivo");

    var novoOuro = ouroAcumulado + 500;
    var comprarPocao = novoOuro - 50;
    var feiticoVida = pontosDeVida * 2;
    var xpPar = nivelPersonagem / 2;
    println("Após comprar uma poção de vida, o personagem tem $comprarPocao de ouro e a poção de vida tem um poder de cura de $feiticoVida pontos de vida. com o nivel $xpPar");

    idadePersonagem+=10;
    println("O $nomePersonagem derrotou Cyclope e ganhou 1 nivel de experiencia!\nNovo nível: ${nivelPersonagem++}, Mas isso lhe amaldiçoou com a maldição da velhice\nIdade atual: $idadePersonagem anos\nVida restante: ${pontosDeVida - 15}.");

    println("Funções externas")
    mostrarStatus();
    registrarDano(15);
    calcularPoderTotal(20, 1.5);
    calcularPoderTotal(multiplicador = 2.5, nivel = 5);

    isNivelAlto(11);
    usarHabilidade("Golpe Flamejante", custoMana = 20);
    usarHabilidade("Golpe de Gelo");
    salvarJogo();


}

fun mostrarStatus() {
    println("---Status do Personagem---");
}

fun registrarDano(dano: Int) {
    println("O personagem sofreu $dano pontos de dano!");
}

fun calcularPoderTotal(nivel: Int, multiplicador: Double): Double {
    return nivel * multiplicador;
}

fun isNivelAlto(nivel: Int): Boolean {
    return nivel >= 10;
}

fun usarHabilidade(nomeHabilidade: String, custoMana: Int = 10){
    return println("Usou $nomeHabilidade (custo: $custoMana mana)")
}

// Unit é opcional, pois é o tipo de retorno padrão para funções que não retornam um valor específico
fun salvarJogo(): Unit{
    return println("Progresso Salvo, obrigado pelo jogo!");
}