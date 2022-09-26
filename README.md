# Notifications
A Simple App using 'Alerter' - An Android Alerter Library in Kotlin.

This library aims to overcome the limitations of Toasts and Snackbars, while reducing the complexity of layouts.

# Install

Include the JitPack.io Maven repo in your project's build.gradle file

```
allprojects {
 repositories {
    maven { url "https://jitpack.io" }
 }
}
```


Then add this dependency to your app's build.gradle file

```
dependencies {
    implementation 'com.github.tapadoo:alerter:7.2.4'
}
```

# Screenshot of Normal Alert

![NormalAlert](https://user-images.githubusercontent.com/91545371/192360548-f36d67db-8d5e-4c92-8d56-4a5fd19ffc2c.jpeg)

### Code

```
normalalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }
```

# Screenshot of Customized Alert

![Customized Alert](https://user-images.githubusercontent.com/91545371/192361538-ac8b10ef-45a3-4cdd-95ac-9bad7e2ff4b4.jpeg)

### Code

```
customizedalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setBackgroundColorInt(Color.GREEN)
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }
```

# Screenshot of Swipe Alert

![Swipe Alert](https://user-images.githubusercontent.com/91545371/192361933-9d80dd7c-cf33-4549-b227-71b66cb879be.jpeg)

### Code

```
swipealert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .enableSwipeToDismiss()
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }
```

# Screenshot of Progress Alert

![Progress Bar Alert](https://user-images.githubusercontent.com/91545371/192362230-d3852a5a-b1f2-4093-a972-330c1abcd21a.jpeg)

### Code

```
progressalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .enableProgress(true)
                .setProgressColorInt(Color.CYAN)
                .setOnClickListener(View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .show()
        }

```

# Screenshot of Button Alert

![Button Alert](https://user-images.githubusercontent.com/91545371/192362370-8e2c29b2-661f-4329-ba78-91525ac6e003.jpeg)

### Code

```
buttonalert.setOnClickListener {
            Alerter.Companion.create(this)
                .setTitle("Normal Alert !")
                .setText("This is just a demo alert.")
                .setIcon(R.drawable.ic_baseline_notifications_active_24)
                .setDuration(3000)
                .addButton("YES", com.tapadoo.alerter.R.style.AlertButton, View.OnClickListener {
                    Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show()
                })
                .addButton("NO",com.tapadoo.alerter.R.style.AlertButton,View.OnClickListener {
                    Toast.makeText(this,"OOPS",Toast.LENGTH_SHORT).show()
                })
                .show()
        }
```


# Demonstration Video

![Notifications](https://user-images.githubusercontent.com/91545371/192362722-e232291a-27d5-4ef7-8341-a7a9d40038f1.gif)



# Connect

-> https://www.linkedin.com/in/samik-pandit-417a4521b
-> panditsamik25@gmail.com
