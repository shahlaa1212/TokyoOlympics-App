package com.example.tokyoolympicstask.data

import com.example.tokyoolympicstask.data.domain.Achievements


object DataManager {
    private  val achievementsList = mutableListOf<Achievements>()
    val achievement:List<Achievements>
        get()= achievementsList

    private  var achievementIndex = 0
    fun addCountry(country: Achievements) = achievementsList.add(country)

    fun getCurrentCountry(): Achievements = achievementsList[achievementIndex]

    fun getSearchedCountry(country: String)= achievementsList.filter {
        it.team.equals(country,ignoreCase = true)
    }.toList().sortedBy { (_,v) -> v }


}