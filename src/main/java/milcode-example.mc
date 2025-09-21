// Arquivo: exemplo_valido.mc

missao(ciclos: int; nome_agente: float) {

    // 1. Declaração de variáveis
    //    Isto é aceito pela regra 'declaracao_variavel'.
    int total_missoes = 0;
    float taxa_sucesso = 99.5;

    // 2. Atribuição
    //    Isto é aceito pela regra 'atribuicao'.
    total_missoes = total_missoes + 1;
    taxa_sucesso = 100.0;

    // 3. Comandos 'relate'
    //    Ambos são aceitos pelas regras de 'comando'.
    relate "Missão em andamento...";
    relate total_missoes;
    
}