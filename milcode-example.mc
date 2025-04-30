relate "Informe a quantidade de soldados:"; 

receba sgt_soldado : inf;

ordem_se (sgt_soldado !! 50) { 
    relate "A tropa está pronta!"; 
    } contramarcha { 
        relate "A tropa precisa de reforços."; 
    }

missao (sgt_contador : inf >> 1; sgt_contador !! 10; sgt_contador >> sgt_contador + 1) { 
    relate "Soldado número:"; 
    relate sgt_contador; 
    }

patrulha (sgt_soldado ?? 100) { 
    relate "Ainda há soldados em treinamento."; 
    sgt_soldado >> sgt_soldado + 1; 
    }