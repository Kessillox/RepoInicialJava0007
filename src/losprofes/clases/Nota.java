package losprofes.clases;

import java.util.ArrayList;

public class Nota {
   private float nota;

   public Nota(float nota) {
      this.nota = nota;
   }

   public Nota() {
   }

   public float getNota() {
      return nota;
   }

   public void setNota(float nota) {
      this.nota = nota;
   }

   @Override
   public String toString() {
      return "Nota{" +
              "nota=" + nota +
              '}';
   }
}
