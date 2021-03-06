package com.example.popla.gorkhavidyutpowerpay.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "REGISTER".
*/
public class RegisterDao extends AbstractDao<Register, Long> {

    public static final String TABLENAME = "REGISTER";

    /**
     * Properties of entity Register.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property User_id = new Property(0, Long.class, "user_id", true, "USER_ID");
        public final static Property User_name = new Property(1, String.class, "user_name", false, "USER_NAME");
        public final static Property User_email = new Property(2, String.class, "user_email", false, "USER_EMAIL");
        public final static Property User_mobile = new Property(3, String.class, "user_mobile", false, "USER_MOBILE");
        public final static Property User_aadhar = new Property(4, String.class, "user_aadhar", false, "USER_AADHAR");
        public final static Property User_password = new Property(5, String.class, "user_password", false, "USER_PASSWORD");
        public final static Property User_kno = new Property(6, String.class, "user_kno", false, "USER_KNO");
    }


    public RegisterDao(DaoConfig config) {
        super(config);
    }
    
    public RegisterDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"REGISTER\" (" + //
                "\"USER_ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: user_id
                "\"USER_NAME\" TEXT," + // 1: user_name
                "\"USER_EMAIL\" TEXT," + // 2: user_email
                "\"USER_MOBILE\" TEXT," + // 3: user_mobile
                "\"USER_AADHAR\" TEXT," + // 4: user_aadhar
                "\"USER_PASSWORD\" TEXT," + // 5: user_password
                "\"USER_KNO\" TEXT);"); // 6: user_kno
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"REGISTER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Register entity) {
        stmt.clearBindings();
 
        Long user_id = entity.getUser_id();
        if (user_id != null) {
            stmt.bindLong(1, user_id);
        }
 
        String user_name = entity.getUser_name();
        if (user_name != null) {
            stmt.bindString(2, user_name);
        }
 
        String user_email = entity.getUser_email();
        if (user_email != null) {
            stmt.bindString(3, user_email);
        }
 
        String user_mobile = entity.getUser_mobile();
        if (user_mobile != null) {
            stmt.bindString(4, user_mobile);
        }
 
        String user_aadhar = entity.getUser_aadhar();
        if (user_aadhar != null) {
            stmt.bindString(5, user_aadhar);
        }
 
        String user_password = entity.getUser_password();
        if (user_password != null) {
            stmt.bindString(6, user_password);
        }
 
        String user_kno = entity.getUser_kno();
        if (user_kno != null) {
            stmt.bindString(7, user_kno);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Register entity) {
        stmt.clearBindings();
 
        Long user_id = entity.getUser_id();
        if (user_id != null) {
            stmt.bindLong(1, user_id);
        }
 
        String user_name = entity.getUser_name();
        if (user_name != null) {
            stmt.bindString(2, user_name);
        }
 
        String user_email = entity.getUser_email();
        if (user_email != null) {
            stmt.bindString(3, user_email);
        }
 
        String user_mobile = entity.getUser_mobile();
        if (user_mobile != null) {
            stmt.bindString(4, user_mobile);
        }
 
        String user_aadhar = entity.getUser_aadhar();
        if (user_aadhar != null) {
            stmt.bindString(5, user_aadhar);
        }
 
        String user_password = entity.getUser_password();
        if (user_password != null) {
            stmt.bindString(6, user_password);
        }
 
        String user_kno = entity.getUser_kno();
        if (user_kno != null) {
            stmt.bindString(7, user_kno);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Register readEntity(Cursor cursor, int offset) {
        Register entity = new Register( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // user_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // user_name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // user_email
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // user_mobile
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // user_aadhar
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // user_password
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // user_kno
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Register entity, int offset) {
        entity.setUser_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUser_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUser_email(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUser_mobile(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUser_aadhar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUser_password(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUser_kno(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Register entity, long rowId) {
        entity.setUser_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Register entity) {
        if(entity != null) {
            return entity.getUser_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Register entity) {
        return entity.getUser_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
