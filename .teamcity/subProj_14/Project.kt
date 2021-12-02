package subProj_14

import subProj_14.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_14")
    name = "subProj 14"

    buildType(subProj_bt_14_5)
    buildType(subProj_bt_14_4)
    buildType(subProj_bt_14_3)
    buildType(subProj_bt_14_2)
    buildType(subProj_bt_14_1)
    buildType(subProj_bt_14_0)
})
