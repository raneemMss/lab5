
# Task 1: Ask another app

## 1.1
The event parameters are:
- onWebsiteClick
- onCallClick
- onCoursesClick

## 1.4
University website:
- Action: Intent.ACTION_VIEW
- Data: https://www.iau.edu.sa
- Scheme: https
- App: Web browser

Call the department:
- Action: Intent.ACTION_DIAL
- Data: tel:0138000000
- Scheme: tel
- App: Phone dialer

## 1.5
The app shows a Toast message saying "No app can open this" because no installed app handles the custom csc402 scheme. The try/catch prevents a crash.

## 1.6
Without try/catch, the app may crash with ActivityNotFoundException when no app can handle the intent.
