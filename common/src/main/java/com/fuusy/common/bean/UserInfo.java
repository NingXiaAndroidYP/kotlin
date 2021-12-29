package com.fuusy.common.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * FileName: UserInfo
 * Created by zlx on 2020/9/21 15:04
 * Email: 1170762202@qq.com
 * Description: 用户信息
 */
public class UserInfo implements Parcelable {

    private String token;
    private int userId;
    private String name;
    private String nickName;
    private String phone;
    private String deptId;
    private String deptName;
    private int roleId;
    private String roleName;
    private String ico;
    private String password;
    private String account;
    private int sex;
    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.token);
        dest.writeInt(this.userId);
        dest.writeString(this.name);
        dest.writeString(this.nickName);
        dest.writeString(this.phone);
        dest.writeString(this.deptId);
        dest.writeString(this.deptName);
        dest.writeInt(this.roleId);
        dest.writeString(this.roleName);
        dest.writeString(this.ico);
        dest.writeString(this.password);
        dest.writeString(this.account);
        dest.writeInt(this.sex);
        dest.writeInt(this.model);
    }

    public void readFromParcel(Parcel source) {
        this.token = source.readString();
        this.userId = source.readInt();
        this.name = source.readString();
        this.nickName = source.readString();
        this.phone = source.readString();
        this.deptId = source.readString();
        this.deptName = source.readString();
        this.roleId = source.readInt();
        this.roleName = source.readString();
        this.ico = source.readString();
        this.password = source.readString();
        this.account = source.readString();
        this.sex = source.readInt();
        this.model = source.readInt();
    }

    public UserInfo() {
    }

    protected UserInfo(Parcel in) {
        this.token = in.readString();
        this.userId = in.readInt();
        this.name = in.readString();
        this.nickName = in.readString();
        this.phone = in.readString();
        this.deptId = in.readString();
        this.deptName = in.readString();
        this.roleId = in.readInt();
        this.roleName = in.readString();
        this.ico = in.readString();
        this.password = in.readString();
        this.account = in.readString();
        this.sex = in.readInt();
        this.model = in.readInt();
    }

    public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
        @Override
        public UserInfo createFromParcel(Parcel source) {
            return new UserInfo(source);
        }

        @Override
        public UserInfo[] newArray(int size) {
            return new UserInfo[size];
        }
    };
}
