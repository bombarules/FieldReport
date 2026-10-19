# Field Reports

Two parts in one repository:

* `web/` : the Field Reports app as a normal website that installs on a phone like an app.
  No Claude account, no Claude header. Reports and photos are saved on the device that is using it.
* `app/` + the Gradle files : an optional Android shortcut app that opens the website.

## 1. Publish the web app (free, GitHub Pages)
1. Upload everything in this folder to your repository (drag in the CONTENTS, not the zip).
2. In the repository open **Settings > Pages**. Under **Build and deployment**, set **Source** to **GitHub Actions**.
3. Open the **Actions** tab. Run **Publish web app (GitHub Pages)** (or push any change).
4. When it is green, your app is at `https://bombarules.github.io/FieldReport/`.

## 2. Install it on a phone
* Android (Chrome or Edge): open the link, tap the menu, choose **Install app** (or **Add to Home screen**).
* iPhone (Safari): open the link, tap Share, choose **Add to Home Screen**.
It then opens full screen with its own icon and works without internet.

## 3. Optional Android APK
The **Build Android APK** workflow builds `app-debug.apk`, a shortcut that opens the website above.
Download it from the finished run under Artifacts. Uninstall any older copy first.

## Notes
* Data is stored on each device. Use **Export** on the Reports screen to save a CSV copy.
* Clearing the browser's site data erases the reports on that device.
