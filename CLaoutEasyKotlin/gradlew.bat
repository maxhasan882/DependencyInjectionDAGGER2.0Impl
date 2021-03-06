<?xml version="1.0" encoding="utf-8"?>
<layout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools">
        <data>
                <variable name="name" type="String"/>
        </data>
        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center_horizontal"
                tools:context=".MainActivity"
                android:orientation="vertical">

                <EditText
                        android:id="@+id/firstName"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:hint="@string/fistName"
                        android:layout_marginBottom="30dp"/>
                <EditText
                        android:id="@+id/lastName"
                        android:hint="@string/lastName"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="30dp"/>
                <TextView
                        android:id="@+id/fullName"
                        android:hint="@string/fullName"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="30dp"/>

            <Button
                    android:id="@+id/doneButton"
                    android:text="@string/doneButton"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"/>


        </LinearLayout>
</layout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      