package efrain;
public class projecto {
    
    String[] texto = new String[28];
    int[] creencias = new int[28];
   {
    texto[0]="1. Las Sagradas Escrituras  ";
    texto[1]=" 2. La Trinidad";
    texto[2]=" 3. Dios Padre";
    texto[3]=" 4. Dios Hijo";
    texto[4]=" 5. Dios Espíritu Santo";
    texto[5]=" 6. Dios es el Creador";
    texto[6]=" 7. La Naturaleza del Hombre";
    texto[7]=" 8. El Gran Conflicto";
    texto[8]=" 9. Vida, Muerte y Ressurrección de Cristo";
    texto[9]=" 10. La Experiencia de la Salvación";
    texto[10]=" 11. El crecimiento en Cristo";
    texto[11]=" 12. La Iglesia";
    texto[12]=" 13. El Remaneciente y su Misión";
    texto[13]=" 14. Unidad en el Cuerpo de Cristo";
    texto[14]=" 15. El Bautismo";
    texto[14]=" 16. La Cena del Señor";
    texto[16]=" 17. Dones y Ministerios Espirituales";
    texto[17]=" 18. El Don de Profecía";
    texto[18]=" 19. La Ley de Dios";
    texto[19]=" 20. El Sábado";
    texto[20]=" 21. Mayordomía";
    texto[21]=" 22. Conducta Cristiana";
    texto[22]=" 23. Matrimonio y Familia";
    texto[23]=" 24. El Ministerio de Cristo en el Santuario Celestial";
    texto[24]=" 25. La Segunda Venida de Cristo";
    texto[25]=" 26. Muerte y Resurrección";
    texto[26]=" 27. El Milenio y el Fin del Pecado";
    texto[27]=" 28. La Nueva Tierra";
    }
    
    {
    creencias[0]=1;
    creencias[1]= 2;
    creencias[2]= 3;
    creencias[3]= 4;
    creencias[4]= 5;
    creencias[5]= 6;
    creencias[6]= 7;
    creencias[7]=8;
    creencias[8]=9;
    creencias[9]=10;
    creencias[10]= 11;
    creencias[11]=12;
    creencias[12]=13;
    creencias[13]=14;
    creencias[14]=15;
    creencias[14]=16;
    creencias[16]=17;
    creencias[17]=18;
    creencias[18]=19;
    creencias[19]=20;
    creencias[20]=21;
    creencias[21]=22;
    creencias[22]=23;
    creencias[23]=24;
    creencias[24]=25;
    creencias[25]=26;
    creencias[26]=27;
    creencias[27]=28;
    }
    
    String ordenar(int i)
    {
        for (int j = 0; j < 27; j++) {
            for (int k = j+1; k < 28; k++) {
                if(creencias[j] > creencias[k])
                {
                    int valores;
                    valores = creencias[j];
                    creencias[j] = creencias[k];
                    creencias[k]= valores;
                    
                    String textos;
                    textos = texto[j];
                    texto[j] = texto[k];
                    texto[k]= textos;
                }
            }
        }
        return texto[i];
    }
    
    String desordenar(int i)
    {
        for (int j = 0; j < 13; j++) {
            for (int k = j+1; k < 14; k++) {
                if(creencias[j] < creencias[k])
                {
                    int valores;
                    valores = creencias[j];
                    creencias[j] = creencias[k];
                    creencias[k]= valores;
                    
                    String textos;
                    textos = texto[j];
                    texto[j] = texto[k];
                    texto[k]= textos;
                }
            }
        }
        
        for (int j = 15; j < 27; j++) {
            for (int k = j+1; k < 28; k++) {
                if(creencias[j] < creencias[k])
                {
                    int valores;
                    valores = creencias[j];
                    creencias[j] = creencias[k];
                    creencias[k]= valores;
                    
                    String textos;
                    textos = texto[j];
                    texto[j] = texto[k];
                    texto[k]= textos;
                }
            }
        }
        return texto[i];
    }
}
