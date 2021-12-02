package subProj_75

import subProj_75.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_75")
    name = "subProj 75"

    buildType(subProj_bt_75_2)
    buildType(subProj_bt_75_3)
    buildType(subProj_bt_75_0)
    buildType(subProj_bt_75_1)
    buildType(subProj_bt_75_4)
    buildType(subProj_bt_75_5)
})
