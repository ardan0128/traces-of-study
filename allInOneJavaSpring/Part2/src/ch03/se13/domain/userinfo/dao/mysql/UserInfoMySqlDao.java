package ch03.se13.domain.userinfo.dao.mysql;

import ch03.se13.domain.userinfo.UserInfo;
import ch03.se13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("Insert into MySQL DB userId = " + userInfo.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("Update into MySQL DB userId = " + userInfo.getUserId());
  }

  @Override
  public void deleteuserInfo(UserInfo userInfo) {
    System.out.println("Delete from MySQL DB userId = " + userInfo.getUserId());
  }
}
