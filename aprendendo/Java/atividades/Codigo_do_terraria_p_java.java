package java_aulas;

public class Codigo_do_terraria_p_java {
    public static void main(String[] args) {
        // 
        BestiaryEntryUnlockState estado = BestiaryEntryUnlockState.CanShowStats;
        System.out.println("Estado atual: " + estado);
    }
    //enum é um conjunto de constantes 
    // Enum do bestiario (originalmente escrito em C#)
    // convertido p/java)
    public enum BestiaryEntryUnlockState {
        NotKnownAtAll_0,//constante 
        CanShowPortraitOnly_1,//constante
        CanShowStats_2,//constante
        CanShowDropsWithoutDropRates_3,//constante
        CanShowDropsWithDropRates_4//constante
    }
}
