package subProj_50

import subProj_50.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_50")
    name = "subProj 50"

    buildType(subProj_bt_50_0)
    buildType(subProj_bt_50_2)
    buildType(subProj_bt_50_1)
    buildType(subProj_bt_50_4)
    buildType(subProj_bt_50_3)
    buildType(subProj_bt_50_5)
})
