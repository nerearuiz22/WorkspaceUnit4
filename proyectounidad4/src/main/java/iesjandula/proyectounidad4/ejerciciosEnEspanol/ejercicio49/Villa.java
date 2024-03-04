package iesjandula.proyectounidad4.ejerciciosEnEspanol.ejercicio49;

import java.util.Objects;

public class Villa extends Municipio implements Comparable<Municipio>, IAlcalde {

   public Villa(String nombre, int poblacion, double temperatura, double altitud, Alcalde alcalde) {
       super(nombre, poblacion, temperatura, altitud, alcalde);
       // TODO Auto-generated constructor stub

   }

   @Override
   public boolean esPedania() {
       // TODO Auto-generated method stub
       return false;
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = super.hashCode();
       result = prime * result + Objects.hash(this.getAlcalde());
       return result;
   }

   @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (!super.equals(obj))
           return false;
       if (getClass() != obj.getClass())
           return false;
       Villa other = (Villa) obj;
       return Objects.equals(this.getAlcalde(), other.getAlcalde());
   }

   @Override
   public String infoAlcalde() {
       // TODO Auto-generated method stub
       return this.getAlcalde().infoAlcalde();
   }

   @Override
   public int compareTo(Municipio o) {

       int compare;

       if (this.getPoblacion() == o.getPoblacion()) {

           compare = this.getNombre().compareTo(o.getNombre());

       } else {

           compare = this.getAlcalde().compareTo(o.getAlcalde());
       }

       return compare;
   }
}