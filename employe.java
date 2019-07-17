classe  abstraite Employe {
     matricule de chaîne privée ;
     nom de chaîne privé ;
    private  String prenom;
     int int privé ;
     date de chaîne privée ;
     final  public int salairebase =  110000 ;
    
    publique  Employe ( chaîne  matricule , chaîne  prenom , chaîne  nom , int  âge , chaîne  Date ) {
        ceci . matricule = matricule;
        ceci . nom = nom;
        ceci . prenom = prenom;
        ceci . age = age;
        ceci . date = date;
    }
 
     résumé  public double  calculerSalaire ();
 
    public  String  getTitre ()
        {
            retourne  " L'employé " ;
        }
 
    public  String  getNom () {
        return getTitre () +  "  "  +   prenom +  "  "  + nom;
    }
}
// La classe commerciale (Vendeur et Représentant) //
 classe  abstraite Commercial  étend  Employe {
    privée  double chiffreAffaire;
 
    publique  commerciale ( chaîne  matricule , chaîne  nom , chaîne  prenom , int  âge , chaîne  Date ,
               double  chiffreAffaire ) {
        super (matricule, nom, prénom, âge, date);
        ceci . chiffreAffaire = chiffreAffaire;
    }
 
    public  double  getChiffreAffaire ()
        {
            retour chiffreAffaire;
        }
 
}
 
// La classe Vendeur //
classe  Vendeur  s'étend  Commercial {
     double statique final  privé POURCENT_VENDEUR = 0,2 ;    
    privé  finale  statique  int  BONUS_VENDEUR  =  100 ;
 
    public  Vendeur ( String  matricule , String  nom , String  prenom , int  age , String  date ,
            double  chiffreAffaire ) {
        super (matricule, nom, prénom, âge, date, chiffre aufaire);
    }
 
    public  double  calculerSalaire () {
        return ( POURCENT_VENDEUR  * getChiffreAffaire ()) + salairebase +  BONUS_VENDEUR ;
    }
 
    public  String  getTitre ()
        {
            retournez  " Le vendeur " ;
        }
 
}
 
// La classe Représentant //
 Représentant de  classe étend  Commercial {
     double statique final  privé POURCENT_REPRESENTANT = 0.2 ;    
    privé  finale  statique  int  BONUS_REPRESENTANT  =  200 ;
 
    publique  Representant ( chaîne  matricule , chaîne  nom , chaîne  prenom , int  âge , chaîne  Date , à double  chiffreAffaire ) {
        super (matricule, nom, prénom, âge, date, chiffre aufaire);
    }
 
    public  double  calculerSalaire () {
        return ( POURCENT_REPRESENTANT  * getChiffreAffaire ()) + salairebase +  BONUS_REPRESENTANT ;
    }
 
    public  String  getTitre ()
        {
            retournez  " Le représentant " ;
        }
}
// La classe Technicien (Production) //
classe  Technicien  étend  Employe {
    privé  finale  statique à  double  FACTEUR_UNITE  =  5,0 ;
    privé  int unit;
 
    publique  Technicien ( chaîne  matricule , chaîne  nom , chaîne  prenom , int  âge , chaîne  Date , int  unit ) {
        super (matricule, nom, prénom, âge, date);
        ceci . unit = unit;
    }
 
    public  double  calculerSalaire () {
        retour  FACTEUR_UNITE  * unites + salairebase;
    }
 
    public  String  getTitre ()
        {
            retourne  " Le technicien " ;
        }
}
 
// La classe Manutentionnaire //
classe  Manutentionnaire  étend  Employe {
    privé  finale  statique à  double  SALAIRE_HORAIRE  =  65,0 ;
    privé  int heures;
 
    public  Manutentionnaire ( Matricule String  , String prenom , String nom , int age , String date ,    
                     int  heures ) {
        super (matricule, prenom, nom, âge, date);
        ceci . heures = heures;
    }
 
    public  double  calculerSalaire () {
        retour  SALAIRE_HORAIRE  * heures + salairebase;
    }
 
    public  String  getTitre ()
        {
            retournez  " Le manut. " ;
        }
}
 
// L'interface d'employés à risque //
interface  ARisque {
    int  PRIME  =  25000 ;
}
 
// Une première sous-classe d'employé à risque //
classe  TechnARisque  s'étend  Technicien  implémente  ARisque {
 
    publique  TechnARisque ( chaîne  matricule , chaîne  prenom , chaîne  nom , int  âge , chaîne  Date , int  unit ) {
        super (matricule, prenom, nom, âge, date, unite);
    }
 
    public  double  calculerSalaire () {
        retour  super . calculerSalaire () +  PRIME ;
    }
}
 
// Une autre sous-classe d'employé à risque //
La classe  ManutARisque  étend  Manutentionnaire  implémente  ARisque {
 
    publique  ManutARisque ( chaîne  matricule , chaîne  prenom , chaîne  nom , int  âge , chaîne  Date , int  heures ) {
        super (matricule, prenom, nom, age, date, heures);
    }
 
    public  double  calculerSalaire () {
        retour  super . calculerSalaire () +  PRIME ;
    }
}
 
// La classe Personnel //
classe  Personnel {
    personnel privé  employé [];
    private  int nbreEmploye;
     statique finale  privée int MAXEMPLOYE = 200 ;    
 
     Personnel public () {
        staff =  new  Employe [ MAXEMPLOYE ];
        nbreEmploye =  0 ;
    }
 
    public  void  ajouterEmploye ( Employe  e ) {
        ++ nbreEmploye;
        if (nbreEmploye <=  MAXEMPLOYE ) {
            staff [nbreEmploye -  1 ] = e;
        } else {
            Système . out . println ( " Pas plus de "  +  MAXEMPLOYE  +  " employés " );
        }
    }
 
    public  double  salaireMoyen () {
        double somme =  0.0 ;
        pour ( int i =  0 ; i < nbreEmploye; i ++ ) {
            somme + = personnel [i] . calculerSalaire ();
        }
        retour somme / nbreEmploye;
    }
 
    public  void  afficherSalaires () {
        pour ( int i =  0 ; i < nbreEmploye; i ++ ) {
            Système . out . println (staff [i] . getNom () +  " gagne "
                    + personnel [i] . calculerSalaire () +  " francs. " );
        }
    }
}
 
// ============================================= =======================
 
classe  Salaire {
    public  static  void  main ( String [] args ) {
        Personnel p =  nouveau  personnel ();
        p . ajouterEmploye ( nouveau  Vendeur ( " de matricule 15A999FS " , " NGAMA " , " ANDRE " , 30 ans , " en service depuis le 12 février 2012 " , 30000.0 ));
        p . ajouterEmploye ( nouveau  représentant ( " 15A748FS " , " TATONTE " , " JEAN " , 25 ans , " en service depuis le 15 janvier 2001 " , 20000.0 ));
        p . ajouterEmploye ( nouveau  technicien ( " 15A747FS " , " HAYWA " , " CHLODE " , 21 , " en service depuis le 15 avril 1998 " , 1000 ));
        p . ajouterEmploye ( nouveau  Manutentionnaire ( " 15A746FS " , " michou " , " George " , 32 , " en fonction DEPUIS le 12 décembre 1998 " , 45 ));
        p . ajouterEmploye ( nouvelle  TechnARisque ( " 15A745FS " , " guogue " , " franois " , 28 , " en service depuis le 10 mai 2000 " , 1000 ));
        p . ajouterEmploye ( nouveau  ManutARisque ( " 15A744FS " , " DRADA " , " BLAISE " , 30 , " en service depuis le 15 novembre 2001 " , 45 ));
 
        p . afficherSalaires ();
        Système . out . println ( " Le salaire moyen dans l'entreprise est de "
                + p . salaireMoyen () +  " francs. " );
 
    }
 
}
