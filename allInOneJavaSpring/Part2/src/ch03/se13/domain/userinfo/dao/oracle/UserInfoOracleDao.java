package ch03.se13.domain.userinfo.dao.oracle;

import ch03.se13.domain.userinfo.UserInfo;
import ch03.se13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("Insert into ORACLE DB userId = " + userInfo.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("Update into ORACLE DB userId = " + userInfo.getUserId());
  }

  @Override
  public void deleteuserInfo(UserInfo userInfo) {
    System.out.println("Delete from ORACLE DB userId = " + userInfo.getUserId());
  }

}
