package eu.kanade.tachiyomi.ui.manga.chapter

import android.app.Dialog
import android.os.Bundle
import com.afollestad.materialdialogs.MaterialDialog
import com.bluelinelabs.conductor.Router
import eu.kanade.tachiyomi.R
import eu.kanade.tachiyomi.ui.base.controller.DialogController

class DeletingChaptersDialog(bundle: Bundle? = null) : DialogController(bundle) {

    companion object {
        const val TAG = "deleting_dialog"
    }

    override fun onCreateDialog(savedState: Bundle?): Dialog {
        return MaterialDialog.Builder(activity!!)
                .progress(true, 0)
                .content(R.string.deleting)
                .build()
    }

    override fun showDialog(router: Router) {
        showDialog(router, TAG)
    }

}