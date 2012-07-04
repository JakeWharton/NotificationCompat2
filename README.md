NotificationCompat2
===================

An extension of the `NotificationCompat` helper in the support library which
actually supports all of the features of the Android 4.1 (Jelly Bean) release.

With the release of Jelly Bean came a [new notification API][api] which
provide much more dynamic and interactive notifications. The latest revision
of the [Android Support Library][support] (revision 9) contains some classes
to manage Android 3.x notifications but nothing for using the new Jelly Bean
features.

This library is meant as a standalone replacement and will let you use the new
notification API without crashing on devices with android versions previous to
Jelly Bean. Simple change your import from
`android.support.v4.app.NotificationCompat` to
`com.jakewharton.notificationcompat2.NotificationCompat2` and use the
`NotificatonCompat2.Builder` class.

Downloadable .jars can be found on the [GitHub download page][dl].



License
-------

    Copyright 2012 Jake Wharton
    Copyright 2012 The Android Open Source Project

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



 [dl]: http://github.com/JakeWharton/NotificationCompat2/downloads
 [api]: http://developer.android.com/about/versions/jelly-bean.html#ui
 [support]: http://developer.android.com/tools/extras/support-library.html
