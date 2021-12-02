package subProj_861

import subProj_861.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_861")
    name = "subProj 861"

    buildType(subProj_bt_861_0)
    buildType(subProj_bt_861_4)
    buildType(subProj_bt_861_3)
    buildType(subProj_bt_861_2)
    buildType(subProj_bt_861_1)
    buildType(subProj_bt_861_5)
})
