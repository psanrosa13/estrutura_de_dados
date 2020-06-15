package vetor;

public class Vetor {

    private Object[] array = new Object[100];

    private int totalDeElementos = 0;

    public void adiciona(Object object) {
        this.garantaEspaco();
        this.array[this.totalDeElementos] = object;
        this.totalDeElementos++;
    }
    public void adiciona(int posicao, Object object) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDeElementos - 1; i >= posicao; i-=1) {
            this.array[i + 1] = this.array[i];
        }
        this.array[posicao] = object;
        this.totalDeElementos++;
    }
    public Object pega(int posicao) {
        if (!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.array[posicao];
    }
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeElementos - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.totalDeElementos--;
    }
    public boolean contem(Object object) {
        for (int i = 0; i < this.totalDeElementos; i++) {
            if (array.equals(this.array[i])) {
                return true;
            }
        }
        return false;
    }
    public int tamanho() {
        return this.totalDeElementos;
    }
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(this.array[i]);
            builder.append(", ");
        }

        builder.append(this.array[this.totalDeElementos - 1]);
        builder.append("]");
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeElementos;
    }

    private void garantaEspaco() {
        if (this.totalDeElementos == this.array.length) {
            Object[] novaArray = new Object[this.array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                novaArray[i] = this.array[i];
            }
            this.array = novaArray;
        }
    }

}
