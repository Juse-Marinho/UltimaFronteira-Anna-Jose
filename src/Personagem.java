public class Personagem {

    private String nome;
    private int vida = 20;
    private int fome = 20;
    private int sede = 20;
    private int energia = 50;
    private int sanidade = 50;
    private Inventario inventario;
    private int xPos = 0;
    private int yPos = 0;


    public void andar(String direcao){

        if(direcao.equals("n")){
            this.yPos++;
        } else if(direcao.equals("s")){
            this.yPos--;
        } else if(direcao.equals("l")){
            this.xPos++;
        } else if(direcao.equals("o")){
            this.xPos--;
        } else{
            System.out.println("direção inválida");
        }

        if (xPos < 1){
            xPos = 1;
            System.out.println("Não é possível ir mais para o oeste");
        } else if (xPos > 5) {
            xPos = 5;
            System.out.println("Não é possível ir mais para o leste");
        } else if (yPos < 1) {
            yPos = 1;
            System.out.println("Não é possível ir mais para o sul");
        } else if (yPos > 5) {
            yPos = 5;
            System.out.println("Não é possível ir mais para o norte");
        }

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFome() {
        return fome;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getSede() {
        return sede;
    }
    public void setSede(int sede) {
        this.sede = sede;
    }

    public int getSanidade() {
        return sanidade;
    }
    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public int getxPos() {
        return xPos;
    }
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Inventario getInventario() {
        return inventario;
    }
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }


}
