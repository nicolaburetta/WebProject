/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

/**
 * Questo bean lo utilizzo per raccogliere tutte le notifiche dell'amministratore in tre diversi arraylist dei tre diversi tipi di notifica,
 * e che mi permette di accedere alle notifiche dell'amministratore utilizzando un solo bean
 * @author Marco
 */
public class NotificationBean implements java.io.Serializable {
   private ArrayList replies = new ArrayList();
   private ArrayList chowner = new ArrayList();;
   private ArrayList delphotos = new ArrayList();

   public void addReplies(NotificationRepliesBean rep){
       replies.add(rep);
   }
   public void addChowner(ChangeOwnerNotificationBean rep){
       chowner.add(rep);
   }
    public void addDelPhotos(DeletePhotoNotificationBean rep){
       delphotos.add(rep);
   }

    public ArrayList getReplies() {
        return replies;
    }

    public ArrayList getChowner() {
        return chowner;
    }

    public ArrayList getDelphotos() {
        return delphotos;
    }
        
   public NotificationRepliesBean getReplies(int i){
       return (NotificationRepliesBean)replies.get(i);
   }
   
   public ChangeOwnerNotificationBean getChOwner(int i){
       return (ChangeOwnerNotificationBean)chowner.get(i);
   }
   
   public DeletePhotoNotificationBean getDeletePhoto(int i){
       return (DeletePhotoNotificationBean)delphotos.get(i);
   }
   
   public int getRepliesSize(){
       return replies.size();
   }
   public int getChOwnerSize(){
       return chowner.size();
   }
   public int getDeletePhotoSize(){
       return delphotos.size();
   }

    public void setReplies(ArrayList replies) {
        this.replies = replies;
    }

    public void setChowner(ArrayList chowner) {
        this.chowner = chowner;
    }

    public void setDelphotos(ArrayList delphotos) {
        this.delphotos = delphotos;
    }
}   
