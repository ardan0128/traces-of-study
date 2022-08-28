package ch03.se13.domain.userinfo.dao;

import ch03.se13.domain.userinfo.UserInfo;

public interface UserInfoDao {
  void insertUserInfo(UserInfo userInfo);

  void updateUserInfo(UserInfo userInfo);

  void deleteuserInfo(UserInfo userInfo);
}
