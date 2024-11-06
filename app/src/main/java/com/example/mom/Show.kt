import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Show(viewModel: ChatModel = viewModel()) {
    var inputText by remember { mutableStateOf("") }
    val socketStatus by viewModel.socketStatus.observeAsState(false)
    val messages by viewModel.messages.observeAsState("")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 20.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(
            text = "Messages: $messages",
            modifier = Modifier.padding(top =100.dp),
            color = Color.Black
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(80.dp)) {
                Button(
                    onClick = { viewModel.connect() },
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.padding(start = 30.dp)
                ) {
                    Text(text = if (socketStatus) "Connected" else "Connect")
                }
                Button(
                    onClick = { viewModel.disconnect() },
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(text = "Disconnect")
                }




            }



            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(bottom = 30.dp)
            ) {
                TextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    label = { Text("Enter your text here") },
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(250.dp)
                )
                Button(
                    onClick = { viewModel.sendMessage(inputText) },
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text("Send")
                }
            }


        }
    }
}
