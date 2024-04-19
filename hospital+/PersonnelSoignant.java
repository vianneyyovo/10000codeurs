
import java.util.*;

/**
 * 
 */
public abstract class PersonnelSoignant extends Infirmier {

    /**
     * Default constructor
     */
    public PersonnelSoignant() {
    }

    /**
     * 
     */
    private str nom;

    /**
     * 
     */
    private str prenom;

    /**
     * 
     */
    private int numId;

    /**
     * 
     */
    private str fonction;

    /**
     * 
     */
    private str motPass;

    /**
     * 
     */
    private str sexe;

    /**
     * 
     */
    private int dateNaissance;

    /**
     * 
     */
    private str adresseElectronique;

    /**
     * 
     */
    private int tel;

    /**
     * @param adressElectronique 
     * @param motPass 
     * @return
     */
    public boolen authentifier(str adressElectronique, str motPass) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Liste<Patient> imprimerListePatient() {
        // TODO implement here
        return null;
    }

    /**
     * @param patient 
     * @return
     */
    public array consulterDossierMedical(str patient) {
        // TODO implement here
        return null;
    }

    /**
     * @param patient 
     * @return
     */
    public Date programmerRendezVous(str patient) {
        // TODO implement here
        return null;
    }

    /**
     * @param patient 
     * @return
     */
    public array modifierDossierMedical(str patient) {
        // TODO implement here
        return null;
    }

    /**
     * @param acte 
     * @param patient 
     * @return
     */
    public boolen ajouterActeMedical(str acte, str patient) {
        // TODO implement here
        return null;
    }

}