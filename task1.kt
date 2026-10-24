
package sa.edu.iau.cshj.lab05.ui

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun HomeRoute(onCoursesClick: () -> Unit) {
    val context = LocalContext.current

    HomeScreen(
        onWebsiteClick = {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.iau.edu.sa")
            )
            try {
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(
                    context,
                    "No app can open this",
                    Toast.LENGTH_SHORT
                ).show()
            }
        },
        onCallClick = {
            val intent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:0138000000")
            )
            try {
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(
                    context,
                    "No app can open this",
                    Toast.LENGTH_SHORT
                ).show()
            }
        },
        onCoursesClick = onCoursesClick
    )
}
