package com.fuusy.service.repo;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LoginResp> __insertionAdapterOfLoginResp;

  private final EntityDeletionOrUpdateAdapter<LoginResp> __deletionAdapterOfLoginResp;

  private final EntityDeletionOrUpdateAdapter<LoginResp> __updateAdapterOfLoginResp;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLoginResp = new EntityInsertionAdapter<LoginResp>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tb_user` (`admin`,`coinCount`,`email`,`icon`,`id`,`nickname`,`password`,`publicName`,`token`,`type`,`username`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoginResp value) {
        final int _tmp;
        _tmp = value.getAdmin() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        stmt.bindLong(2, value.getCoinCount());
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIcon());
        }
        stmt.bindLong(5, value.getId());
        if (value.getNickname() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getNickname());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPassword());
        }
        if (value.getPublicName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPublicName());
        }
        if (value.getToken() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getToken());
        }
        stmt.bindLong(10, value.getType());
        if (value.getUsername() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUsername());
        }
      }
    };
    this.__deletionAdapterOfLoginResp = new EntityDeletionOrUpdateAdapter<LoginResp>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tb_user` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoginResp value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfLoginResp = new EntityDeletionOrUpdateAdapter<LoginResp>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `tb_user` SET `admin` = ?,`coinCount` = ?,`email` = ?,`icon` = ?,`id` = ?,`nickname` = ?,`password` = ?,`publicName` = ?,`token` = ?,`type` = ?,`username` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoginResp value) {
        final int _tmp;
        _tmp = value.getAdmin() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        stmt.bindLong(2, value.getCoinCount());
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIcon());
        }
        stmt.bindLong(5, value.getId());
        if (value.getNickname() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getNickname());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPassword());
        }
        if (value.getPublicName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPublicName());
        }
        if (value.getToken() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getToken());
        }
        stmt.bindLong(10, value.getType());
        if (value.getUsername() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUsername());
        }
        stmt.bindLong(12, value.getId());
      }
    };
  }

  @Override
  public void insertUser(final LoginResp info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLoginResp.insert(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser(final LoginResp info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfLoginResp.handle(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUser(final LoginResp info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfLoginResp.handle(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<LoginResp> queryLiveUser(final int id) {
    final String _sql = "select * from tb_user where id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tb_user"}, false, new Callable<LoginResp>() {
      @Override
      public LoginResp call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAdmin = CursorUtil.getColumnIndexOrThrow(_cursor, "admin");
          final int _cursorIndexOfCoinCount = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCount");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "nickname");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfPublicName = CursorUtil.getColumnIndexOrThrow(_cursor, "publicName");
          final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final LoginResp _result;
          if(_cursor.moveToFirst()) {
            final boolean _tmpAdmin;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdmin);
            _tmpAdmin = _tmp != 0;
            final int _tmpCoinCount;
            _tmpCoinCount = _cursor.getInt(_cursorIndexOfCoinCount);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpIcon;
            _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNickname;
            _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpPublicName;
            _tmpPublicName = _cursor.getString(_cursorIndexOfPublicName);
            final String _tmpToken;
            _tmpToken = _cursor.getString(_cursorIndexOfToken);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _result = new LoginResp(_tmpAdmin,_tmpCoinCount,_tmpEmail,_tmpIcon,_tmpId,_tmpNickname,_tmpPassword,_tmpPublicName,_tmpToken,_tmpType,_tmpUsername);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LoginResp queryUser(final int id) {
    final String _sql = "select * from tb_user where id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAdmin = CursorUtil.getColumnIndexOrThrow(_cursor, "admin");
      final int _cursorIndexOfCoinCount = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCount");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "nickname");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
      final int _cursorIndexOfPublicName = CursorUtil.getColumnIndexOrThrow(_cursor, "publicName");
      final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
      final LoginResp _result;
      if(_cursor.moveToFirst()) {
        final boolean _tmpAdmin;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAdmin);
        _tmpAdmin = _tmp != 0;
        final int _tmpCoinCount;
        _tmpCoinCount = _cursor.getInt(_cursorIndexOfCoinCount);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpIcon;
        _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNickname;
        _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        final String _tmpPublicName;
        _tmpPublicName = _cursor.getString(_cursorIndexOfPublicName);
        final String _tmpToken;
        _tmpToken = _cursor.getString(_cursorIndexOfToken);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _result = new LoginResp(_tmpAdmin,_tmpCoinCount,_tmpEmail,_tmpIcon,_tmpId,_tmpNickname,_tmpPassword,_tmpPublicName,_tmpToken,_tmpType,_tmpUsername);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
