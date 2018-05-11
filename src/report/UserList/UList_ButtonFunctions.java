package report.UserList;

import static report.UserList.Generate_UList.date_DListFrom;
import static report.UserList.Generate_UList.date_DListTo;
import static report.UserList.Generate_UList.lbl_FromDList;
import static report.UserList.Generate_UList.lbl_ToDList;
import static report.UserList.Generate_UList.radio_AllDList;
import static report.UserList.Generate_UList.radio_DRegisterDList;
import static report.UserList.UList_1stLayer.cbo_UserSort;
import static report.UserList.UList_1stLayer.lbl_InvStatTotal;
import static report.UserList.UList_1stLayer.lbl_InvStatTotal1;
import static report.UserList.UList_1stLayer.lbl_InvStatTotal2;
import static report.UserList.UList_1stLayer.lbl_NewDealerMName;
import static report.UserList.UList_1stLayer.lbl_UListDate;
import static report.UserList.UList_1stLayer.lbl_ULNoOfAdmin;
import static report.UserList.UList_1stLayer.lbl_ULNoOfAccount;
import static report.UserList.UList_1stLayer.lbl_ULNoOfUser;

public class UList_ButtonFunctions {
   
    
   public void generateUserList(){
       lbl_NewDealerMName.setVisible(true);
       lbl_UListDate.setVisible(true);
       lbl_InvStatTotal.setVisible(true);
       lbl_ULNoOfAccount.setVisible(true);
       lbl_InvStatTotal1.setVisible(true);
       lbl_ULNoOfAdmin.setVisible(true);
       lbl_InvStatTotal2.setVisible(true);
       lbl_ULNoOfUser.setVisible(true);
   }
  
   protected void generateUserListForm(){
       Generate_UList UList = new Generate_UList(null, true);
       UList.pack();
       UList.setLocationRelativeTo(null);
       UList.setVisible(true);
   }
   
   protected void radioAllSelected(){
       if(radio_AllDList.isSelected()){
            lbl_FromDList.setEnabled(false);
            lbl_ToDList.setEnabled(false);
            date_DListFrom.setEnabled(false);
            date_DListTo.setEnabled(false);
        }
   }
   
   protected void radioDateRegistered(){
       if(radio_DRegisterDList.isSelected()){
            lbl_FromDList.setEnabled(true);
            lbl_ToDList.setEnabled(true);
            date_DListFrom.setEnabled(true);
            date_DListTo.setEnabled(true);
        }
   }
   
   protected void accountTypeSort(){}
    
   protected void regDateSort(){}
    
   protected void refresh_UserList(){
       lbl_NewDealerMName.setVisible(false);
       lbl_UListDate.setVisible(false);
       lbl_InvStatTotal.setVisible(false);
       lbl_ULNoOfAccount.setVisible(false);
       lbl_InvStatTotal1.setVisible(false);
       lbl_ULNoOfAdmin.setVisible(false);
       lbl_InvStatTotal2.setVisible(false);
       lbl_ULNoOfUser.setVisible(false);
       cbo_UserSort.setSelectedIndex(0);
   }
   
   protected void printUList(){}
    
}
