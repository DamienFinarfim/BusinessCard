// Generated by view binder compiler. Do not edit!
package br.com.alexandre.businesscard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.com.alexandre.businesscard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddBusinessCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnClose;

  @NonNull
  public final MaterialButton btnConfirm;

  @NonNull
  public final TextInputLayout tilCor;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilEmpresa;

  @NonNull
  public final TextInputLayout tilNome;

  @NonNull
  public final TextInputLayout tilTelefone;

  @NonNull
  public final TextView tvTitle;

  private ActivityAddBusinessCardBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton btnClose, @NonNull MaterialButton btnConfirm,
      @NonNull TextInputLayout tilCor, @NonNull TextInputLayout tilEmail,
      @NonNull TextInputLayout tilEmpresa, @NonNull TextInputLayout tilNome,
      @NonNull TextInputLayout tilTelefone, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnClose = btnClose;
    this.btnConfirm = btnConfirm;
    this.tilCor = tilCor;
    this.tilEmail = tilEmail;
    this.tilEmpresa = tilEmpresa;
    this.tilNome = tilNome;
    this.tilTelefone = tilTelefone;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddBusinessCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddBusinessCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_business_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddBusinessCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_close;
      ImageButton btnClose = ViewBindings.findChildViewById(rootView, id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.btn_confirm;
      MaterialButton btnConfirm = ViewBindings.findChildViewById(rootView, id);
      if (btnConfirm == null) {
        break missingId;
      }

      id = R.id.til_cor;
      TextInputLayout tilCor = ViewBindings.findChildViewById(rootView, id);
      if (tilCor == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_empresa;
      TextInputLayout tilEmpresa = ViewBindings.findChildViewById(rootView, id);
      if (tilEmpresa == null) {
        break missingId;
      }

      id = R.id.til_nome;
      TextInputLayout tilNome = ViewBindings.findChildViewById(rootView, id);
      if (tilNome == null) {
        break missingId;
      }

      id = R.id.til_telefone;
      TextInputLayout tilTelefone = ViewBindings.findChildViewById(rootView, id);
      if (tilTelefone == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityAddBusinessCardBinding((ConstraintLayout) rootView, btnClose, btnConfirm,
          tilCor, tilEmail, tilEmpresa, tilNome, tilTelefone, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
