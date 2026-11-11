# NAHID AI — Android starter project

A starter Android app for a Bengali voice assistant.

## Current prototype features
- Foreground microphone service with a persistent notification.
- Speech recognition configured for Bengali (Bangladesh).
- Wake phrase detection attempt for “Hey Nahid” / “হেই নাহিদ”.
- Alarm Clock intent.
- YouTube search/open.
- Contact lookup and direct call when exactly one matching number is found and CALL_PHONE permission is granted.

## Important limitations
- This is a starter prototype, not a finished always-on assistant.
- Android and the device's speech-recognition provider control whether background recognition works. SpeechRecognizer is not a dedicated wake-word engine; it may stop, restart, require internet, or be restricted by battery settings.
- The current demo recognizes the wake phrase and command only when they arrive in the same speech-recognition result. For reliable wake-word detection, integrate a dedicated on-device wake-word SDK/model and test it on the target phone.
- The app does not secretly record audio. The user must start the service, grant microphone permission, and see the persistent foreground notification.
- Direct calls require Android CALL_PHONE permission and a single unambiguous contact match. Do not use this for emergency calling.
- Some Android settings and apps cannot be controlled by third-party apps. There is no universal permission that grants control over every app.
- Speech may be processed by the device's configured speech recognition service. Review its privacy settings.

## Build
1. Install Android Studio and Android SDK Platform 35.
2. Open this folder in Android Studio.
3. Use JDK 17.
4. Let Gradle sync, then Build > Build Bundle(s) / APK(s) > Build APK(s).
5. Install `app/build/outputs/apk/debug/app-debug.apk` on your Android phone.

If Android Studio reports an SDK or plugin version issue, install SDK 35 and update Android Studio/Gradle as prompted.
