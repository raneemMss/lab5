
# Task 4: Share a course and trace the back stack

## 4.2
Two possible apps in the share sheet are Messages and Gmail, depending on installed apps. No try/catch is normally needed because Android's chooser handles the available sharing targets.

## 4.3 Back stack
1. App opens: Home
2. Tap Browse courses: Home → CourseList
3. Tap CSC 402: Home → CourseList → CourseDetail(CSC 402)
4. Tap on-screen Back: Home → CourseList
5. Tap CSC 231: Home → CourseList → CourseDetail(CSC 231)

## 4.4
Removing @Serializable from CourseDetail causes a compile-time error because the typed Navigation route is not serializable. The app may not build or run until the annotation is restored.
