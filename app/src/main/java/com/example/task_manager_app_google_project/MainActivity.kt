package com.example.task_manager_app_google_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task_manager_app_google_project.ui.theme.TaskmanagerappgoogleprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskmanagerappgoogleprojectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManager(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun TaskManager(modifier: Modifier){

    Column(modifier = modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        // image
         val image = painterResource(id = R.drawable.ic_task_completed)
        Image(image, contentDescription = null)

        // status
        val status = stringResource(id = R.string.task_status)
        Text(status, textAlign = TextAlign.Justify ,
            modifier = modifier.padding(top = 20.dp),
            fontWeight = FontWeight.SemiBold
        )


        //remark

        val remark = stringResource(id = R.string.remark)
        Text(remark )


    }


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TaskManagerPreview(){
    TaskmanagerappgoogleprojectTheme {
        TaskManager(modifier = Modifier)
    }
}