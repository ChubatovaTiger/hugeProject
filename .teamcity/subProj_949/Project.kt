package subProj_949

import subProj_949.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_949")
    name = "subProj 949"

    buildType(subProj_bt_949_0)
    buildType(subProj_bt_949_1)
    buildType(subProj_bt_949_2)
    buildType(subProj_bt_949_3)
    buildType(subProj_bt_949_4)
    buildType(subProj_bt_949_5)
})
