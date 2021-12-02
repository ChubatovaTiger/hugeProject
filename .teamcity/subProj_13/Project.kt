package subProj_13

import subProj_13.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_13")
    name = "subProj 13"

    buildType(subProj_bt_13_5)
    buildType(subProj_bt_13_4)
    buildType(subProj_bt_13_3)
    buildType(subProj_bt_13_2)
    buildType(subProj_bt_13_1)
    buildType(subProj_bt_13_0)
})
