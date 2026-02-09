public class EquipoFutbol 
{
    private String nombre;
    private String entrenador;
    private String equipo[];

    public EquipoFutbol(String nombre,String entrenador)
    {
        this.nombre=new String(nombre);
        this.entrenador=new String(entrenador);
        equipo=new String[11];
    }

    public String getNombre()
    {
        return new String(this.nombre);
    }

    public String getEntrenador()
    {
        return new String(this.entrenador);
    }

    public void setEntrenador(String nuevoEntrenador)
    {
        entrenador=new String(nuevoEntrenador);
    }

    public void agregaJugador(int index, String nombre)
    {
        if(index>=1 && index<=11)
        {
            equipo[index-1]=new String(nombre);
        }
    }

    public String getJugador(int index)
    {
        if((index>=1 && index<=11)&&(equipo[index-1]!=null))
        {
            return new String(equipo[index-1]);
        }
        else
        {
            return null;
        }
    }

    public static void main(String args[])
    {
        EquipoFutbol equipoFu1 = new EquipoFutbol("Los Masacotes de Chicontepec", "Horacio Cascarin");
        System.out.println(equipoFu1.getNombre());
        System.out.println(equipoFu1.getEntrenador());
        equipoFu1.setEntrenador("Horacio");
        System.out.println(equipoFu1.getEntrenador());
        equipoFu1.agregaJugador(3, "El jalapeño");
        System.out.println(equipoFu1.getJugador(7));
        System.out.println(equipoFu1.getJugador(3));
    }
}
