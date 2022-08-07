package br.com.alexandre.businesscard.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BusinessCardDao_Impl implements BusinessCardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BusinessCard> __insertionAdapterOfBusinessCard;

  public BusinessCardDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBusinessCard = new EntityInsertionAdapter<BusinessCard>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `BusinessCard` (`id`,`nome`,`empresa`,`telefone`,`email`,`fundoPersonalizado`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BusinessCard value) {
        stmt.bindLong(1, value.getId());
        if (value.getNome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNome());
        }
        if (value.getEmpresa() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmpresa());
        }
        if (value.getTelefone() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTelefone());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEmail());
        }
        if (value.getFundoPersonalizado() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFundoPersonalizado());
        }
      }
    };
  }

  @Override
  public Object insert(final BusinessCard businessCard, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBusinessCard.insert(businessCard);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<BusinessCard>> getAll() {
    final String _sql = "SELECT * FROM BusinessCard";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"BusinessCard"}, false, new Callable<List<BusinessCard>>() {
      @Override
      public List<BusinessCard> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfEmpresa = CursorUtil.getColumnIndexOrThrow(_cursor, "empresa");
          final int _cursorIndexOfTelefone = CursorUtil.getColumnIndexOrThrow(_cursor, "telefone");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfFundoPersonalizado = CursorUtil.getColumnIndexOrThrow(_cursor, "fundoPersonalizado");
          final List<BusinessCard> _result = new ArrayList<BusinessCard>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BusinessCard _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNome;
            if (_cursor.isNull(_cursorIndexOfNome)) {
              _tmpNome = null;
            } else {
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
            }
            final String _tmpEmpresa;
            if (_cursor.isNull(_cursorIndexOfEmpresa)) {
              _tmpEmpresa = null;
            } else {
              _tmpEmpresa = _cursor.getString(_cursorIndexOfEmpresa);
            }
            final String _tmpTelefone;
            if (_cursor.isNull(_cursorIndexOfTelefone)) {
              _tmpTelefone = null;
            } else {
              _tmpTelefone = _cursor.getString(_cursorIndexOfTelefone);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpFundoPersonalizado;
            if (_cursor.isNull(_cursorIndexOfFundoPersonalizado)) {
              _tmpFundoPersonalizado = null;
            } else {
              _tmpFundoPersonalizado = _cursor.getString(_cursorIndexOfFundoPersonalizado);
            }
            _item = new BusinessCard(_tmpId,_tmpNome,_tmpEmpresa,_tmpTelefone,_tmpEmail,_tmpFundoPersonalizado);
            _result.add(_item);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
