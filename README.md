<p align="center">
  <img src="https://user-images.githubusercontent.com/31899200/68417633-1c72b800-01da-11ea-9324-144d62e3518e.png">
  <img width="878" alt="Screenshot 2019-11-11 at 9 42 22 PM" src="https://user-images.githubusercontent.com/31899200/68588236-4d9a0380-04cc-11ea-9dad-941ab222b5dd.png">
  <img src="https://img.shields.io/badge/Made%20with-Kotlin-orange&?style=for-the-badge&?color=orange">
</p>

## About
Contacts Pro Kotlin is an Android Contacts App that allows you to efficiently manage your Contacts. It lets you view all the Contacts as a list, Add, Update, Delete and View the Contact Details. It is based on Model–View–Viewmodel (MVVM) Architecture.

![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg) ![forthebadge](https://forthebadge.com/images/badges/built-for-android.svg)

![cpk gif](https://user-images.githubusercontent.com/31899200/68538648-6cf53b80-03bb-11ea-801e-ba7ed998e422.gif)



## 🚩 Table of Contents	  ![HitCount](http://hits.dwyl.io/aishwarya-kamal/Contacts-Pro-Kotlin.svg)
* [About](#-about)
* [Features](#-features)
	* [Main Screen](#-main-screen)
	* [Add New Contact](#-add-new-contact)
	* [Contact Details](#contact-details)
	* [Edit Contact](#edit-contact)
* [Libraries Used](#-libraries-used)
* [Developed By](#-developed-by)
* [Show your support](#-show-your-support)


## 🎨  Features
Contacts Pro Kotlin is composed of 4 main screens - Contacts List, Add New Contact, Contact Details, Edit Contact


### 📄 Main Screen
The main screen displays the list of all the contacts with their profile picture along with a call button and an email button for each contact.

![main_screen](https://user-images.githubusercontent.com/31899200/68538636-2dc6ea80-03bb-11ea-8a3a-9ba1211a5465.PNG)


### 📝 Add New Contact
Add New Contact screen allows the user to add all the details of the contact such as their profile picture, name, phone number and email address. Save button saves all the details and displays the newly created contact on the main screen while cancel button navigates the user back to the main screen without saving any information.

<img width="361" alt="addcontact" src="https://user-images.githubusercontent.com/31899200/68586060-24c33f80-04c7-11ea-9afc-52cc3531bc28.png">

###  📜 Contact Details
Contact Details allows the user to view the contact's profile picture, name, phone number and email address. It also displays a trash icon on the bottom left to delete the contact and an extended edit floating action button to edit the contact details.

<img width="359" alt="detailscontact" src="https://user-images.githubusercontent.com/31899200/68586061-24c33f80-04c7-11ea-8c1b-a2e63dc9a398.png">

### 📝 Edit Contact
Edit Contact pre-populates the original details of the contact on the screen and allows the user to make necessary changes. Save button saves the contact's new details and cancel button discards the changes.

<img width="357" alt="editcontact" src="https://user-images.githubusercontent.com/31899200/68586062-24c33f80-04c7-11ea-9732-c28b3038d6e6.png">


## :mag: Libraries Used

* [Android Architecture Components][arch]
  * [Lifecycles][lifecycle] - for Creating a UI that automatically responds to lifecycle events.
  * [LiveData][liveData] - to Build data objects that notify views when the  database changes.
  * [Navigation][navigation] - to Handle everything needed for in-app navigation.
  * [Room][room] - Access app's SQLite database with in-app objects and compile-time checks.
  * [ViewModel][viewmodel] - Storing UI-related data that isn't destroyed on app rotations. Easily schedule asynchronous tasks for optimal execution.
* [Dagger 2][dagger2] for Dependency Injection
* [Android KTX][Android KTX] to Write more concise, idiomatic Kotlin code.
* [Android Data Binding][data-binding] to Bind observable data to UI elements
* [Espresso][espresso] for UI tests
* [Mockito][mockito] for mocking in tests
* [Glide][glide] for Image Loading
* [Timber][timber] for Logging
* [Animations & Transitions][animation] to move widgets and transition between screens.
* [AppCompat][AppCompat] to Degrade gracefully on older versions of Android.
* [Fragment][fragment] A basic unit of composable UI.
* [Layout][layout] Lay out widgets using different algorithms.


[AppCompat]: https://developer.android.com/topic/libraries/support-library/packages#v7-appcompat
[Android KTX]: https://developer.android.com/kotlin/ktx
[arch]: https://developer.android.com/arch
[data-binding]: https://developer.android.com/topic/libraries/data-binding/index.html
[dagger2]: https://google.github.io/dagger
[glide]: https://github.com/bumptech/glide
[timber]: https://github.com/JakeWharton/timber
[lifecycle]: https://developer.android.com/topic/libraries/architecture/lifecycle
[liveData]: https://developer.android.com/topic/libraries/architecture/livedata
[navigation]: https://developer.android.com/topic/libraries/architecture/navigation/
[room]: https://developer.android.com/topic/libraries/architecture/room
[viewmodel]: https://developer.android.com/topic/libraries/architecture/viewmodel
[animation]: https://developer.android.com/training/animation/
[fragment]: https://developer.android.com/guide/components/fragments
[layout]: https://developer.android.com/guide/topics/ui/declaring-layout
[espresso]: https://google.github.io/android-testing-support-library/docs/espresso/
[mockito]: http://site.mockito.org


## Developed By

👩 **Aishwarya Kamal**

- Github : [aishwarya-kamal](https://github.com/aishwarya-kamal)



## Show your support

Please ⭐️ this repository if this project helped you!



