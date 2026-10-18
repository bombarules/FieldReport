# Field Reports (Android app)

A small Android app that opens the Field Reports page from the home screen.

## Build the APK on GitHub
1. Unzip this folder first. In your GitHub repository choose **Add file > Upload files** and drag in the CONTENTS (settings.gradle, build.gradle, app, .github, and the other files), not the zip itself.
2. Open the repository's **Actions** tab. The "Build Android APK" workflow runs on every push,
   or press **Run workflow**.
3. When it finishes (about 3 to 5 minutes), open the run and download **FieldReports-debug-apk**
   from the Artifacts section. Unzip it to get `app-debug.apk`.

## Install on a phone
Send `app-debug.apk` to the phone, tap it, and allow "Install unknown apps" when asked.

## Notes
- The app opens the page in the phone's default browser. Change the default in
  Android Settings > Apps > Default apps > Browser app.
- Everyone still signs in to Claude, because the reports are stored in Claude.
- To change the page link, edit `app/src/main/res/values/strings.xml` (`app_url`).
- This is a debug build for sideloading. Publishing in Google Play needs a signed release build.
