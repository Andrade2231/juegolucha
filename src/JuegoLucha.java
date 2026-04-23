
class JuegoLucha {
    private Personaje p1, p2;

    public JuegoLucha(String n1, String n2) {
        this.p1 = new Personaje(n1);
        this.p2 = new Personaje(n2);
    }

    public void iniciarPelea() {
        System.out.println("¡Comienza el duelo!");
        while (p1.estaVivo() && p2.estaVivo()) {
            ejecutarTurno(p1, p2);
            if (p2.estaVivo()) ejecutarTurno(p2, p1);
        }
        System.out.println("Ganador: " + (p1.estaVivo() ? p1.getNombre() : p2.getNombre()));
    }

    private void ejecutarTurno(Personaje atk, Personaje def) {
        System.out.println("Turno de " + atk.getNombre() + " (HP Rival: " + def.getPuntosDeVida() + ")");
        atk.atacar(def);
    }
}