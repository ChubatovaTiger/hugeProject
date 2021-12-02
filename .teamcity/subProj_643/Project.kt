package subProj_643

import subProj_643.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_643")
    name = "subProj 643"

    buildType(subProj_bt_643_5)
    buildType(subProj_bt_643_3)
    buildType(subProj_bt_643_4)
    buildType(subProj_bt_643_1)
    buildType(subProj_bt_643_2)
    buildType(subProj_bt_643_0)
})
