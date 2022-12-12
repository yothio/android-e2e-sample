package com.example.e2etest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.rules.activityScenarioRule

@RunWith(AndroidJUnit4::class)
@LargeTest
class HelloEspressoTest {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun fragmentChangeTest() {
        onView(withText("Hello first fragment")).check(matches(isDisplayed()))

        onView(withId(R.id.button_first)).check(matches(isDisplayed()))
        onView(withId(R.id.button_first)).perform(click())

        onView(withText("Second Fragment")).check(matches(isDisplayed()))
    }

    @Test
    fun floatingActionTest() {
        onView(withText("Hello first fragment")).check(matches(isDisplayed()))

        onView(withId(R.id.fab)).perform(click())

        onView(withText("Replace with your own action")).check(matches(isDisplayed()))
    }
}
