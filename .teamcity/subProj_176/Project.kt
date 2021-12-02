package subProj_176

import subProj_176.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_176")
    name = "subProj 176"

    buildType(subProj_bt_176_1)
    buildType(subProj_bt_176_0)
    buildType(subProj_bt_176_3)
    buildType(subProj_bt_176_2)
    buildType(subProj_bt_176_5)
    buildType(subProj_bt_176_4)
})
