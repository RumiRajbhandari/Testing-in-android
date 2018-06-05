package com.example.rumi.uitesting

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, for user login.
 *
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentedTest {
    @Rule
    @JvmField
    val mainActivity: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun validUserLoginTest() {
        onView(withId(R.id.et_name))
                .perform(typeText(Constant.USER_NAME), closeSoftKeyboard())
        onView(withId(R.id.et_password))
                .perform(typeText(Constant.USER_PASSWORD), closeSoftKeyboard())
        onView(withId(R.id.btn_login))
                .perform(click())
        onView(withId(R.id.text_user))
                .check(matches(isDisplayed()))

    }
}
