package subProj_360

import subProj_360.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_360")
    name = "subProj 360"

    buildType(subProj_bt_360_3)
    buildType(subProj_bt_360_4)
    buildType(subProj_bt_360_5)
    buildType(subProj_bt_360_0)
    buildType(subProj_bt_360_1)
    buildType(subProj_bt_360_2)
})
