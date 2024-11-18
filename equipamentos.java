// Classe base que representa um Equipamento com valores e número total de equipamentos
public class Equipamento {
    int[] valor; // Array para armazenar os valores dos equipamentos
    int NumeroEquipamentos; // Total de equipamentos

    // Construtor da classe que inicializa o array e define o número de equipamentos
    public Equipamento(int size) {
        this.valor = new int[size]; // Inicializa o array de valores com o tamanho fornecido
        this.NumeroEquipamentos = size; // Define o número total de equipamentos
    }

    // Método para obter o número total de equipamentos
    public int getNumeroEquipamentos() {
        return this.NumeroEquipamentos;
    }

    // Método para obter o valor de um equipamento específico pelo índice
    public int getValor(int numero) {
        return this.valor[numero];
    }

    // Método para definir o valor de um equipamento específico pelo índice
    public void setValor(int numero, int valor) {
        this.valor[numero] = valor;
    }
}

// Classe derivada que adiciona funcionalidades para corrigir valores e gerenciar meses de compra
public class EquipamentoCorrigido extends Equipamento {
    int[] mesCompra; // Array para armazenar o mês de compra de cada equipamento [1-12]
    int mesCorrente; // Armazena o mês atual

    // Construtor que inicializa o número total de equipamentos e o mês corrente
    public EquipamentoCorrigido(int numeroTotal, int mesCorrente) {
        super(numeroTotal); // Chama o construtor da classe pai (Equipamento)
        this.mesCompra = new int[numeroTotal]; // Inicializa o array de meses de compra
        this.mesCorrente = mesCorrente; // Define o mês corrente
    }

    // Método para obter o mês de compra de um equipamento específico pelo índice
    public int getMesCompra(int numero) {
        return this.mesCompra[numero];
    }

    // Método para definir o mês de compra de um equipamento específico pelo índice
    public void setMesCompra(int numero, int mes) {
        this.mesCompra[numero] = mes;
    }

    // Método que corrige o valor dos equipamentos comprados no mês corrente aplicando um percentual
    public void corrigir(int percentual) {
        // Percorre todos os equipamentos
        for (int i = 0; i < this.getNumeroEquipamentos(); i++) {
            int corrigido = getValor(i); // Obtém o valor atual do equipamento
            // Verifica se o mês de compra coincide com o mês corrente
            if (this.mesCompra[i] == this.mesCorrente) {
                corrigido += corrigido * percentual / 100; // Aplica o percentual de ajuste
                setValor(i, corrigido); // Atualiza o valor corrigido
            }
        }
        this.mesCorrente++; // Incrementa o mês corrente após a correção
    }

    // Método para obter o mês corrente
    public int getMesCorrente() {
        return this.mesCorrente;
    }

    // Método para definir o mês corrente
    public void setMesCorrente(int mes) {
        this.mesCorrente = mes;
    }

    // Método que substitui os dados do equipamento atual pelos de outro objeto da mesma classe
    public void substituir(EquipamentoCorrigido ec) {
        // Verifica se o número total de equipamentos é o mesmo
        if (this.getNumeroEquipamentos() == ec.getNumeroEquipamentos()) {
            // Percorre todos os equipamentos
            for (int i = 0; i < this.getNumeroEquipamentos(); i++) {
                this.setMesCompra(i, ec.getMesCompra(i)); // Substitui o mês de compra
                this.setValor(i, ec.getValor(i)); // Substitui o valor do equipamento
            }
            this.setMesCorrente(ec.getMesCorrente()); // Atualiza o mês corrente
        }
    }
}
