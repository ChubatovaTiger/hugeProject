package subProj_378

import subProj_378.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_378")
    name = "subProj 378"

    buildType(subProj_bt_378_5)
    buildType(subProj_bt_378_4)
    buildType(subProj_bt_378_1)
    buildType(subProj_bt_378_0)
    buildType(subProj_bt_378_3)
    buildType(subProj_bt_378_2)
})
