package subProj_90

import subProj_90.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_90")
    name = "subProj 90"

    buildType(subProj_bt_90_5)
    buildType(subProj_bt_90_4)
    buildType(subProj_bt_90_3)
    buildType(subProj_bt_90_2)
    buildType(subProj_bt_90_1)
    buildType(subProj_bt_90_0)
})
