package subProj_1069

import subProj_1069.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1069")
    name = "subProj 1069"

    buildType(subProj_bt_1069_5)
    buildType(subProj_bt_1069_4)
    buildType(subProj_bt_1069_1)
    buildType(subProj_bt_1069_0)
    buildType(subProj_bt_1069_3)
    buildType(subProj_bt_1069_2)
})
