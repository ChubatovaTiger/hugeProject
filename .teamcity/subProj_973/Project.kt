package subProj_973

import subProj_973.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_973")
    name = "subProj 973"

    buildType(subProj_bt_973_1)
    buildType(subProj_bt_973_2)
    buildType(subProj_bt_973_0)
    buildType(subProj_bt_973_5)
    buildType(subProj_bt_973_3)
    buildType(subProj_bt_973_4)
})
