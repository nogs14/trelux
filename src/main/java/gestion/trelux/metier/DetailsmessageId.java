package gestion.trelux.metier;
// Generated 9 juin 2018 15:16:10 by Hibernate Tools 4.3.1



/**
 * DetailsmessageId generated by hbm2java
 */
public class DetailsmessageId  implements java.io.Serializable {


     private String idpersonne;
     private String codemsg;

    public DetailsmessageId() {
    }

    public DetailsmessageId(String idpersonne, String codemsg) {
       this.idpersonne = idpersonne;
       this.codemsg = codemsg;
    }
   
    public String getIdpersonne() {
        return this.idpersonne;
    }
    
    public void setIdpersonne(String idpersonne) {
        this.idpersonne = idpersonne;
    }
    public String getCodemsg() {
        return this.codemsg;
    }
    
    public void setCodemsg(String codemsg) {
        this.codemsg = codemsg;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetailsmessageId) ) return false;
		 DetailsmessageId castOther = ( DetailsmessageId ) other; 
         
		 return ( (this.getIdpersonne()==castOther.getIdpersonne()) || ( this.getIdpersonne()!=null && castOther.getIdpersonne()!=null && this.getIdpersonne().equals(castOther.getIdpersonne()) ) )
 && ( (this.getCodemsg()==castOther.getCodemsg()) || ( this.getCodemsg()!=null && castOther.getCodemsg()!=null && this.getCodemsg().equals(castOther.getCodemsg()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdpersonne() == null ? 0 : this.getIdpersonne().hashCode() );
         result = 37 * result + ( getCodemsg() == null ? 0 : this.getCodemsg().hashCode() );
         return result;
   }   


}


