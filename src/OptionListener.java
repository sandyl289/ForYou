import java.util.EventListener;

public interface OptionListener extends EventListener{
	// public void choisirFichier(Niveaux niveauCree);
		/**
		 * Methode servant a retourner dans la fenetre d'introduction
		 * 
		 * @param modeAccueil l'apparence en mode Accueil
		 */
		public void modeHome(boolean modeHome);
}
