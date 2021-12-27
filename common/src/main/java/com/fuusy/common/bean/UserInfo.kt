package com.fuusy.common.bean

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserInfo(
    val account: String,
    val deptId: Int,
    val deptName: String,
    val ico: String,
    val model: Int,
    val name: String,
    val nickName: String,
    val phone: String,
    val roleId: Int,
    val roleName: String,
    val sex: Int,
    val token: String,
    val userId: Int
):Parcelable