package com.mobile.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SuperHero(
    val imageSuperHero : Int,
    val nameSuperHero: String,
    val descSuperHero: String
) : Parcelable
